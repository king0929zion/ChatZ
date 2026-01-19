package com.vladsch.flexmark.util.format;

import com.vladsch.flexmark.ext.wikilink.WikiNode;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.TextCollectingVisitor;
import com.vladsch.flexmark.util.collection.MaxAggregator;
import com.vladsch.flexmark.util.collection.MinAggregator;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.format.options.DiscretionaryText;
import com.vladsch.flexmark.util.format.options.TableCaptionHandling;
import com.vladsch.flexmark.util.html.CellAlignment;
import com.vladsch.flexmark.util.misc.ArrayUtils;
import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.misc.Ref;
import com.vladsch.flexmark.util.misc.Utils;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.LineAppendable;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import j1.AbstractC1135a;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public class MarkdownTable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final NumericSuffixPredicate ALL_SUFFIXES_SORT;
    public static final NumericSuffixPredicate NO_SUFFIXES;
    private final TableSection[] ALL_BODY_ROWS;
    private final TableSection[] ALL_CONTENT_ROWS;
    private final TableSection[] ALL_HEADER_ROWS;
    private final TableSection[] ALL_SECTIONS;
    private final TableSection[] ALL_TABLE_ROWS;
    private CellAlignment[] alignments;
    public final TableSection body;
    public final TableSection caption;
    private int[] columnWidths;
    CharSequence formatTableIndentPrefix;
    public final TableSection header;
    private boolean isHeading;
    private boolean isSeparator;
    public TableFormatOptions options;
    public final TableSection separator;
    private final CharSequence tableChars;
    private final ArrayList<TrackedOffset> trackedOffsets;
    public static final CharPredicate COLON_TRIM_CHARS = CharPredicate.anyOf(':');
    public static final NumericSuffixPredicate ALL_SUFFIXES_NO_SORT = new NumericSuffixPredicate() { // from class: com.vladsch.flexmark.util.format.MarkdownTable.1
        @Override // com.vladsch.flexmark.util.format.NumericSuffixPredicate
        public boolean sortSuffix(String str) {
            return false;
        }

        @Override // java.util.function.Predicate
        public boolean test(String str) {
            return true;
        }
    };

    /* renamed from: com.vladsch.flexmark.util.format.MarkdownTable$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$vladsch$flexmark$util$format$options$DiscretionaryText;
        static final /* synthetic */ int[] $SwitchMap$com$vladsch$flexmark$util$format$options$TableCaptionHandling;
        static final /* synthetic */ int[] $SwitchMap$com$vladsch$flexmark$util$html$CellAlignment;

        static {
            int[] iArr = new int[CellAlignment.values().length];
            $SwitchMap$com$vladsch$flexmark$util$html$CellAlignment = iArr;
            try {
                iArr[CellAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$html$CellAlignment[CellAlignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$html$CellAlignment[CellAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[TableCaptionHandling.values().length];
            $SwitchMap$com$vladsch$flexmark$util$format$options$TableCaptionHandling = iArr2;
            try {
                iArr2[TableCaptionHandling.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$TableCaptionHandling[TableCaptionHandling.REMOVE_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$TableCaptionHandling[TableCaptionHandling.REMOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$TableCaptionHandling[TableCaptionHandling.AS_IS.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[DiscretionaryText.values().length];
            $SwitchMap$com$vladsch$flexmark$util$format$options$DiscretionaryText = iArr3;
            try {
                iArr3[DiscretionaryText.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$DiscretionaryText[DiscretionaryText.REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$DiscretionaryText[DiscretionaryText.AS_IS.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class ColumnSpan {
        int additionalWidth = 0;
        final int columnSpan;
        final int startColumn;
        final int width;

        public ColumnSpan(int i6, int i7, int i8) {
            this.startColumn = i6;
            this.columnSpan = i7;
            this.width = i8;
        }
    }

    /* loaded from: classes.dex */
    public static class IndexSpanOffset {
        public final int index;
        public final int spanOffset;

        public IndexSpanOffset(int i6, int i7) {
            this.index = i6;
            this.spanOffset = i7;
        }

        public String toString() {
            return B3.e.i(this.index, "IndexSpanOffset{index=", this.spanOffset, ", spanOffset=", "}");
        }
    }

    static {
        final int i6 = 1;
        final int i7 = 0;
        NO_SUFFIXES = new NumericSuffixPredicate() { // from class: com.vladsch.flexmark.util.format.e
            @Override // java.util.function.Predicate
            public final boolean test(String str) {
                boolean lambda$static$0;
                boolean lambda$static$1;
                String str2 = str;
                switch (i7) {
                    case 0:
                        lambda$static$0 = MarkdownTable.lambda$static$0(str2);
                        return lambda$static$0;
                    default:
                        lambda$static$1 = MarkdownTable.lambda$static$1(str2);
                        return lambda$static$1;
                }
            }
        };
        ALL_SUFFIXES_SORT = new NumericSuffixPredicate() { // from class: com.vladsch.flexmark.util.format.e
            @Override // java.util.function.Predicate
            public final boolean test(String str) {
                boolean lambda$static$0;
                boolean lambda$static$1;
                String str2 = str;
                switch (i6) {
                    case 0:
                        lambda$static$0 = MarkdownTable.lambda$static$0(str2);
                        return lambda$static$0;
                    default:
                        lambda$static$1 = MarkdownTable.lambda$static$1(str2);
                        return lambda$static$1;
                }
            }
        };
    }

    public MarkdownTable(CharSequence charSequence, DataHolder dataHolder) {
        this(charSequence, new TableFormatOptions(dataHolder));
    }

    private CellAlignment adjustCellAlignment(CellAlignment cellAlignment) {
        int i6 = AnonymousClass2.$SwitchMap$com$vladsch$flexmark$util$format$options$DiscretionaryText[this.options.leftAlignMarker.ordinal()];
        if (i6 != 1) {
            if (i6 == 2 && cellAlignment == CellAlignment.LEFT) {
                return CellAlignment.NONE;
            }
        } else if (cellAlignment == null || cellAlignment == CellAlignment.NONE) {
            return CellAlignment.LEFT;
        }
        return cellAlignment;
    }

    private int aggregateTotalColumnsWithoutColumns(TableSection[] tableSectionArr, BiFunction<Integer, Integer, Integer> biFunction, int... iArr) {
        Integer[] numArr = {null};
        forAllSectionsRows(0, TableCell.NOT_TRACKED, tableSectionArr, new f(iArr, numArr, biFunction, 1));
        Integer num = numArr[0];
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private int aggregateTotalColumnsWithoutRows(TableSection[] tableSectionArr, BiFunction<Integer, Integer, Integer> biFunction, int... iArr) {
        Integer[] numArr = {null};
        forAllSectionsRows(0, TableCell.NOT_TRACKED, tableSectionArr, new f(iArr, numArr, biFunction, 0));
        Integer num = numArr[0];
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private void appendColumnSpan(LineAppendable lineAppendable, int i6, int i7, int i8) {
        if (i8 == Integer.MAX_VALUE) {
            lineAppendable.append(WikiNode.SEPARATOR_CHAR, i6);
            return;
        }
        if (i8 == 0) {
            setTrackedOffsetIndex(i7 + i8, lineAppendable.offsetWithPending());
            lineAppendable.append(WikiNode.SEPARATOR_CHAR, i6);
        } else if (i8 >= i6) {
            lineAppendable.append(WikiNode.SEPARATOR_CHAR, i6);
            setTrackedOffsetIndex(i7 + i8, lineAppendable.offsetWithPending());
        } else {
            lineAppendable.append(WikiNode.SEPARATOR_CHAR, i8);
            setTrackedOffsetIndex(i7 + i8, lineAppendable.offsetWithPending());
            lineAppendable.append(WikiNode.SEPARATOR_CHAR, i6 - i8);
        }
    }

    public static void appendFormattedCaption(LineAppendable lineAppendable, BasedSequence basedSequence, TableFormatOptions tableFormatOptions) {
        String formattedCaption = formattedCaption(basedSequence, tableFormatOptions);
        if (formattedCaption != null) {
            lineAppendable.line().append('[').append((CharSequence) formattedCaption).append(']').line();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void appendRows(com.vladsch.flexmark.util.sequence.LineAppendable r20, java.util.List<com.vladsch.flexmark.util.format.TableRow> r21, boolean r22, java.lang.CharSequence r23) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.util.format.MarkdownTable.appendRows(com.vladsch.flexmark.util.sequence.LineAppendable, java.util.List, boolean, java.lang.CharSequence):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018d  */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, java.lang.Integer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.vladsch.flexmark.util.sequence.BasedSequence cellText(java.util.List<com.vladsch.flexmark.util.format.TableCell> r17, int r18, boolean r19, boolean r20, int r21, com.vladsch.flexmark.util.html.CellAlignment r22, com.vladsch.flexmark.util.misc.Ref<java.lang.Integer> r23) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.util.format.MarkdownTable.cellText(java.util.List, int, boolean, boolean, int, com.vladsch.flexmark.util.html.CellAlignment, com.vladsch.flexmark.util.misc.Ref):com.vladsch.flexmark.util.sequence.BasedSequence");
    }

    private TrackedOffset findTrackedOffset(int i6) {
        ArrayList<TrackedOffset> arrayList = this.trackedOffsets;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TrackedOffset trackedOffset = arrayList.get(i7);
            i7++;
            TrackedOffset trackedOffset2 = trackedOffset;
            if (trackedOffset2.getOffset() == i6) {
                return trackedOffset2;
            }
            if (trackedOffset2.getOffset() > i6) {
                return null;
            }
        }
        return null;
    }

    private void forAllSectionsRows(int i6, int i7, TableSection[] tableSectionArr, TableRowManipulator tableRowManipulator) {
        if (i7 <= 0) {
            return;
        }
        int i8 = i7;
        int i9 = i6;
        for (TableSection tableSection : tableSectionArr) {
            if (i6 >= tableSection.rows.size()) {
                i6 -= tableSection.rows.size();
            } else {
                while (i6 < tableSection.rows.size()) {
                    int apply = tableRowManipulator.apply(tableSection.rows.get(i6), i9, tableSection.rows, i6);
                    if (apply == Integer.MIN_VALUE) {
                        return;
                    }
                    if (apply < 0) {
                        i9 -= apply;
                        i8 += apply;
                    } else {
                        i8--;
                        i6 = apply + 1 + i6;
                    }
                    if (i8 <= 0) {
                        return;
                    } else {
                        i9++;
                    }
                }
                i6 = 0;
            }
        }
    }

    public static String formattedCaption(BasedSequence basedSequence, TableFormatOptions tableFormatOptions) {
        boolean isNotNull = basedSequence.isNotNull();
        int i6 = AnonymousClass2.$SwitchMap$com$vladsch$flexmark$util$format$options$TableCaptionHandling[tableFormatOptions.formatTableCaption.ordinal()];
        if (i6 == 1) {
            isNotNull = true;
        } else if (i6 == 2) {
            isNotNull = !basedSequence.isBlank();
        } else if (i6 == 3) {
            isNotNull = false;
        }
        if (!isNotNull) {
            return null;
        }
        String str = AnonymousClass2.$SwitchMap$com$vladsch$flexmark$util$format$options$DiscretionaryText[tableFormatOptions.formatTableCaptionSpaces.ordinal()] != 1 ? FlexmarkHtmlConverter.DEFAULT_NODE : SequenceUtils.SPACE;
        return AbstractC1135a.g(str, basedSequence.toString(), str);
    }

    private List<TableRow> getAllSectionsRows(TableSection... tableSectionArr) {
        ArrayList arrayList = new ArrayList(this.body.rows.size() + this.header.rows.size());
        for (TableSection tableSection : tableSectionArr) {
            arrayList.addAll(tableSection.rows);
        }
        return arrayList;
    }

    private boolean isEmptyRowAt(int i6, TableSection[] tableSectionArr) {
        boolean[] zArr = {false};
        forAllSectionsRows(i6, 1, tableSectionArr, new h(zArr, 1));
        return zArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$addTrackedOffset$2(int i6, TrackedOffset trackedOffset) {
        return trackedOffset.getOffset() == i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$aggregateTotalColumnsWithoutColumns$11(int[] iArr, Integer[] numArr, BiFunction biFunction, TableRow tableRow, int i6, ArrayList arrayList, int i7) {
        int size = tableRow.cells.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            if (!ArrayUtils.contained(i9, iArr)) {
                i8 += tableRow.cells.get(i9).columnSpan;
            }
        }
        if (i8 != 0) {
            numArr[0] = (Integer) biFunction.apply(numArr[0], Integer.valueOf(i8));
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$aggregateTotalColumnsWithoutRows$12(int[] iArr, Integer[] numArr, BiFunction biFunction, TableRow tableRow, int i6, ArrayList arrayList, int i7) {
        int totalColumns;
        if (!ArrayUtils.contained(i6, iArr) && (totalColumns = tableRow.getTotalColumns()) > 0) {
            numArr[0] = (Integer) biFunction.apply(numArr[0], Integer.valueOf(totalColumns));
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$deleteColumns$4(int i6, int i7, TableRow tableRow, int i8, ArrayList arrayList, int i9) {
        ((TableRow) arrayList.get(i9)).deleteColumns(i6, i7);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$insertColumns$3(int i6, int i7, TableRow tableRow, int i8, ArrayList arrayList, int i9) {
        ((TableRow) arrayList.get(i9)).insertColumns(i6, i7);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$isEmptyColumn$6(int i6, boolean[] zArr, TableRow tableRow, int i7, ArrayList arrayList, int i8) {
        if (tableRow.isEmptyColumn(i6)) {
            return 0;
        }
        zArr[0] = false;
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$isEmptyRowAt$7(boolean[] zArr, TableRow tableRow, int i6, ArrayList arrayList, int i7) {
        if (!tableRow.isEmpty()) {
            return Integer.MIN_VALUE;
        }
        zArr[0] = true;
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$moveColumn$5(int i6, int i7, TableRow tableRow, int i8, ArrayList arrayList, int i9) {
        ((TableRow) arrayList.get(i9)).moveColumn(i6, i7);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0113, code lost:
    
        if (r9 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0129, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012c, code lost:
    
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0122, code lost:
    
        if (r9 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0127, code lost:
    
        if (r9 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0133, code lost:
    
        if (r9 != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ int lambda$sorted$10(com.vladsch.flexmark.util.format.ColumnSort[] r18, int r19, int[] r20, com.vladsch.flexmark.util.ast.TextCollectingVisitor r21, int r22, com.vladsch.flexmark.util.html.CellAlignment[] r23, com.vladsch.flexmark.util.format.NumericSuffixPredicate r24, com.vladsch.flexmark.util.format.TableRow r25, com.vladsch.flexmark.util.format.TableRow r26) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.util.format.MarkdownTable.lambda$sorted$10(com.vladsch.flexmark.util.format.ColumnSort[], int, int[], com.vladsch.flexmark.util.ast.TextCollectingVisitor, int, com.vladsch.flexmark.util.html.CellAlignment[], com.vladsch.flexmark.util.format.NumericSuffixPredicate, com.vladsch.flexmark.util.format.TableRow, com.vladsch.flexmark.util.format.TableRow):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sorted$9(MarkdownTable markdownTable, TableRow tableRow, int i6, ArrayList arrayList, int i7) {
        int size = tableRow.cells.size();
        for (int i8 = 0; i8 < size; i8++) {
            TableCell tableCell = tableRow.cells.get(i8);
            if (tableCell != TableCell.DEFAULT_CELL) {
                tableCell = new TableCell(tableCell, true, tableCell.rowSpan, tableCell.columnSpan, tableCell.alignment);
            }
            markdownTable.addCell(tableCell);
        }
        markdownTable.nextRow();
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(String str) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$1(String str) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$transposed$8(TableCell[][] tableCellArr, TableRow tableRow, int i6, ArrayList arrayList, int i7) {
        TableCell[] tableCellArr2 = tableCellArr[i6];
        int size = tableRow.cells.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            TableCell tableCell = tableRow.cells.get(i9);
            int i10 = 0;
            while (i10 < tableCell.columnSpan) {
                int i11 = i8 + 1;
                tableCellArr2[i8] = new TableCell(tableCell, i10 == 0, 1, 1, (CellAlignment) null);
                i10++;
                i8 = i11;
            }
        }
        return 0;
    }

    private boolean pipeNeedsSpaceAfter(TableCell tableCell) {
        return tableCell.text.equals(SequenceUtils.SPACE) || !tableCell.text.startsWith(SequenceUtils.SPACE);
    }

    private boolean pipeNeedsSpaceBefore(TableCell tableCell) {
        return tableCell.text.equals(SequenceUtils.SPACE) || !tableCell.text.endsWith(SequenceUtils.SPACE);
    }

    private boolean setTrackedOffsetIndex(int i6, int i7) {
        TrackedOffset findTrackedOffset = findTrackedOffset(i6);
        if (findTrackedOffset == null) {
            return false;
        }
        findTrackedOffset.setIndex(i7);
        return true;
    }

    private int spanFixedWidth(BitSet bitSet, int i6, int i7) {
        if (i7 <= 1) {
            if (bitSet.get(i6)) {
                return 0;
            }
            return this.columnWidths[i6];
        }
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            if (!bitSet.get(i9)) {
                i8 += this.columnWidths[i9 + i6];
            }
        }
        return i8;
    }

    private int spanWidth(int i6, int i7) {
        if (i7 <= 1) {
            return this.columnWidths[i6];
        }
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += this.columnWidths[i9 + i6];
        }
        return i8;
    }

    public void addCell(TableCell tableCell) {
        boolean z5 = this.isSeparator;
        TableSection tableSection = z5 ? this.separator : this.isHeading ? this.header : this.body;
        if (z5 && (tableCell.columnSpan != 1 || tableCell.rowSpan != 1)) {
            throw new IllegalStateException("Separator columns cannot span rows/columns");
        }
        TableRow tableRow = tableSection.get(tableSection.row);
        while (tableSection.column < tableRow.cells.size() && tableRow.cells.get(tableSection.column) != null) {
            tableSection.column++;
        }
        for (int i6 = 0; i6 < tableCell.rowSpan; i6++) {
            tableSection.get(tableSection.row + i6).set(tableSection.column, tableCell);
            for (int i7 = 1; i7 < tableCell.columnSpan; i7++) {
                tableSection.expandTo(tableSection.row + i6, tableSection.column + i7);
                if (tableSection.get(tableSection.row + i6).cells.get(tableSection.column + i7) != null) {
                    break;
                }
                tableSection.rows.get(tableSection.row + i6).set(tableSection.column + i7, TableCell.NULL);
            }
        }
        tableSection.column += tableCell.columnSpan;
    }

    @Deprecated
    public boolean addTrackedOffset(int i6) {
        return addTrackedOffset(TrackedOffset.track(i6, null, false));
    }

    public int appendDashes(LineAppendable lineAppendable, int i6, BasedSequence basedSequence, int i7) {
        int length = basedSequence.length();
        int i8 = 0;
        int max = Math.max(0, length - i7);
        if (max >= i6) {
            lineAppendable.append((CharSequence) basedSequence.subSequence(i7, i7 + i6));
            i8 = max - i6;
        } else {
            int i9 = 1;
            if (max > 1) {
                lineAppendable.append((CharSequence) basedSequence.subSequence(i7, i7 + 1));
                max--;
            } else {
                i9 = 0;
            }
            lineAppendable.append('-', i6 - Math.max(0, i9 + max));
            if (max > 0) {
                lineAppendable.append((CharSequence) basedSequence.subSequence(i7, max + i7));
            } else {
                i8 = max;
            }
        }
        return length - i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0206 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0288  */
    /* JADX WARN: Type inference failed for: r6v19, types: [T, java.lang.Integer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void appendTable(com.vladsch.flexmark.util.sequence.LineAppendable r26) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.util.format.MarkdownTable.appendTable(com.vladsch.flexmark.util.sequence.LineAppendable):void");
    }

    public void deleteColumns(int i6, int i7) {
        forAllContentRows(new c(i6, i7, 1));
        ArrayList<TableRow> arrayList = this.separator.rows;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            TableRow tableRow = arrayList.get(i8);
            i8++;
            tableRow.deleteColumns(i6, i7);
        }
    }

    public void deleteRows(int i6, int i7) {
        if (i6 <= this.header.rows.size()) {
            while (true) {
                int i8 = i7 - 1;
                if (i7 <= 0 || i6 >= this.header.rows.size()) {
                    return;
                }
                this.header.rows.remove(i6);
                i7 = i8;
            }
        } else {
            if (i6 < this.separator.rows.size() + this.header.rows.size()) {
                return;
            }
            int size = (i6 - this.header.rows.size()) - this.separator.rows.size();
            while (true) {
                int i9 = i7 - 1;
                if (i7 <= 0 || size >= this.body.rows.size()) {
                    return;
                }
                this.body.rows.remove(size);
                i7 = i9;
            }
        }
    }

    public void fillMissingColumns() {
        fillMissingColumns(null);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [T, java.lang.Object, java.lang.Integer] */
    public void finalizeTable() {
        CellAlignment cellAlignment;
        CellAlignment cellAlignment2;
        int i6 = 0;
        normalize();
        TableFormatOptions tableFormatOptions = this.options;
        if (tableFormatOptions.fillMissingColumns) {
            fillMissingColumns(tableFormatOptions.formatTableFillMissingMinColumn);
        }
        int maxColumns = getMaxColumns();
        this.alignments = new CellAlignment[maxColumns];
        this.columnWidths = new int[maxColumns];
        BitSet bitSet = new BitSet(maxColumns);
        ArrayList arrayList = new ArrayList();
        Ref<Integer> ref = new Ref<>(0);
        int i7 = 1;
        if (this.separator.rows.size() > 0) {
            TableRow tableRow = this.separator.rows.get(0);
            ref.value = 0;
            int i8 = 0;
            for (TableCell tableCell : tableRow.cells) {
                if ((this.alignments[i8] == null || (tableCell.columnSpan == 1 && bitSet.get(i8))) && (cellAlignment2 = tableCell.alignment) != CellAlignment.NONE) {
                    this.alignments[i8] = cellAlignment2;
                    if (tableCell.columnSpan > 1) {
                        bitSet.set(i8);
                    }
                }
                i8 += tableCell.columnSpan;
            }
        }
        if (this.header.rows.size() > 0) {
            ArrayList<TableRow> arrayList2 = this.header.rows;
            int size = arrayList2.size();
            int i9 = 0;
            while (i9 < size) {
                int i10 = i9 + 1;
                TableRow tableRow2 = arrayList2.get(i9);
                int size2 = tableRow2.cells.size();
                int i11 = i6;
                int i12 = i11;
                int i13 = i12;
                while (i11 < size2) {
                    TableCell tableCell2 = tableRow2.cells.get(i11);
                    if ((this.alignments[i12] == null || (tableCell2.columnSpan == i7 && bitSet.get(i12))) && (cellAlignment = tableCell2.alignment) != CellAlignment.NONE) {
                        this.alignments[i12] = cellAlignment;
                        if (tableCell2.columnSpan > 1) {
                            bitSet.set(i12);
                        }
                    }
                    ref.value = 0;
                    TableRow tableRow3 = tableRow2;
                    int i14 = i13;
                    int i15 = size2;
                    int i16 = i11;
                    int i17 = i12;
                    int stringWidth = this.options.charWidthProvider.getStringWidth(cellText(tableRow3.cells, i16, false, true, 0, null, ref));
                    TableFormatOptions tableFormatOptions2 = this.options;
                    int i18 = stringWidth + tableFormatOptions2.spacePad;
                    int i19 = tableFormatOptions2.pipeWidth;
                    int i20 = tableCell2.columnSpan;
                    int i21 = (i19 * i20) + i18;
                    if (i20 > 1) {
                        arrayList.add(new ColumnSpan(i14, i20, i21));
                    } else {
                        int[] iArr = this.columnWidths;
                        if (iArr[i17] < i21) {
                            iArr[i17] = i21;
                        }
                    }
                    i13 = i14 + 1;
                    i12 = i17 + tableCell2.columnSpan;
                    i11 = i16 + 1;
                    tableRow2 = tableRow3;
                    size2 = i15;
                    i6 = 0;
                    i7 = 1;
                }
                i9 = i10;
            }
        }
        if (this.body.rows.size() > 0) {
            ArrayList<TableRow> arrayList3 = this.body.rows;
            int size3 = arrayList3.size();
            int i22 = 0;
            while (i22 < size3) {
                int i23 = i22 + 1;
                TableRow tableRow4 = arrayList3.get(i22);
                int size4 = tableRow4.cells.size();
                int i24 = 0;
                int i25 = 0;
                while (i25 < size4) {
                    TableCell tableCell3 = tableRow4.cells.get(i25);
                    ref.value = 0;
                    int i26 = i24;
                    int i27 = size3;
                    ArrayList<TableRow> arrayList4 = arrayList3;
                    int stringWidth2 = this.options.charWidthProvider.getStringWidth(cellText(tableRow4.cells, i25, false, false, 0, null, ref));
                    TableFormatOptions tableFormatOptions3 = this.options;
                    int i28 = stringWidth2 + tableFormatOptions3.spacePad;
                    int i29 = tableFormatOptions3.pipeWidth;
                    int i30 = tableCell3.columnSpan;
                    int i31 = (i29 * i30) + i28;
                    if (i30 > 1) {
                        arrayList.add(new ColumnSpan(i26, i30, i31));
                    } else {
                        int[] iArr2 = this.columnWidths;
                        if (iArr2[i26] < i31) {
                            iArr2[i26] = i31;
                        }
                    }
                    i24 = tableCell3.columnSpan + i26;
                    i25++;
                    size3 = i27;
                    arrayList3 = arrayList4;
                }
                i22 = i23;
            }
        }
        if (this.separator.rows.size() == 0 || this.body.rows.size() > 0 || this.header.rows.size() > 0) {
            ref.value = 0;
            int i32 = 0;
            for (CellAlignment cellAlignment3 : this.alignments) {
                CellAlignment adjustCellAlignment = adjustCellAlignment(cellAlignment3);
                int i33 = (adjustCellAlignment == CellAlignment.LEFT || adjustCellAlignment == CellAlignment.RIGHT) ? 1 : adjustCellAlignment == CellAlignment.CENTER ? 2 : 0;
                TableFormatOptions tableFormatOptions4 = this.options;
                int minLimit = Utils.minLimit(0, tableFormatOptions4.minSeparatorColumnWidth - i33, tableFormatOptions4.minSeparatorDashes);
                if (minLimit <= 0) {
                    minLimit = 0;
                }
                TableFormatOptions tableFormatOptions5 = this.options;
                int i34 = (i33 * tableFormatOptions5.colonWidth) + (minLimit * tableFormatOptions5.dashWidth) + tableFormatOptions5.pipeWidth;
                int[] iArr3 = this.columnWidths;
                if (iArr3[i32] < i34) {
                    iArr3[i32] = i34;
                }
                i32++;
            }
        } else {
            ref.value = 0;
            int i35 = 0;
            for (TableCell tableCell4 : this.separator.rows.get(0).cells) {
                CellAlignment adjustCellAlignment2 = adjustCellAlignment(tableCell4.alignment);
                int i36 = (adjustCellAlignment2 == CellAlignment.LEFT || adjustCellAlignment2 == CellAlignment.RIGHT) ? 1 : adjustCellAlignment2 == CellAlignment.CENTER ? 2 : 0;
                int length = tableCell4.text.trim(COLON_TRIM_CHARS).length();
                TableFormatOptions tableFormatOptions6 = this.options;
                int minLimit2 = Utils.minLimit(length, tableFormatOptions6.minSeparatorColumnWidth - i36, tableFormatOptions6.minSeparatorDashes);
                if (length < minLimit2) {
                    length = minLimit2;
                }
                TableFormatOptions tableFormatOptions7 = this.options;
                int i37 = (i36 * tableFormatOptions7.colonWidth) + (length * tableFormatOptions7.dashWidth) + tableFormatOptions7.pipeWidth;
                int[] iArr4 = this.columnWidths;
                if (iArr4[i35] < i37) {
                    iArr4[i35] = i37;
                }
                i35++;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        BitSet bitSet2 = new BitSet(maxColumns);
        ArrayList arrayList5 = new ArrayList(arrayList.size());
        int size5 = arrayList.size();
        int i38 = 0;
        while (i38 < size5) {
            Object obj = arrayList.get(i38);
            i38++;
            ColumnSpan columnSpan = (ColumnSpan) obj;
            if (spanWidth(columnSpan.startColumn, columnSpan.columnSpan) < columnSpan.width) {
                int i39 = columnSpan.startColumn;
                bitSet2.set(i39, columnSpan.columnSpan + i39);
                arrayList5.add(columnSpan);
            }
        }
        while (!arrayList5.isEmpty()) {
            BitSet bitSet3 = new BitSet(maxColumns);
            arrayList5.clear();
            int size6 = arrayList5.size();
            int i40 = 0;
            while (i40 < size6) {
                Object obj2 = arrayList5.get(i40);
                i40++;
                ColumnSpan columnSpan2 = (ColumnSpan) obj2;
                if (spanWidth(columnSpan2.startColumn, columnSpan2.columnSpan) <= spanFixedWidth(bitSet2, columnSpan2.startColumn, columnSpan2.columnSpan)) {
                    int i41 = columnSpan2.startColumn;
                    bitSet3.set(i41, columnSpan2.columnSpan + i41);
                } else {
                    arrayList5.add(columnSpan2);
                }
            }
            bitSet2.andNot(bitSet3);
            arrayList5.clear();
            int size7 = arrayList5.size();
            int i42 = 0;
            while (i42 < size7) {
                Object obj3 = arrayList5.get(i42);
                i42++;
                ColumnSpan columnSpan3 = (ColumnSpan) obj3;
                int spanWidth = spanWidth(columnSpan3.startColumn, columnSpan3.columnSpan);
                int spanFixedWidth = spanFixedWidth(bitSet2, columnSpan3.startColumn, columnSpan3.columnSpan);
                if (spanWidth > spanFixedWidth) {
                    int i43 = spanWidth - spanFixedWidth;
                    int i44 = columnSpan3.startColumn;
                    int cardinality = bitSet2.get(i44, columnSpan3.columnSpan + i44).cardinality();
                    int i45 = i43 / cardinality;
                    int i46 = i43 - (cardinality * i45);
                    for (int i47 = 0; i47 < columnSpan3.columnSpan; i47++) {
                        if (bitSet2.get(columnSpan3.startColumn + i47)) {
                            int[] iArr5 = this.columnWidths;
                            int i48 = columnSpan3.startColumn;
                            int i49 = i48 + i47;
                            iArr5[i49] = iArr5[i49] + i45;
                            if (i46 > 0) {
                                int i50 = i48 + i47;
                                iArr5[i50] = iArr5[i50] + 1;
                                i46--;
                            }
                        }
                    }
                    arrayList5.add(columnSpan3);
                }
            }
        }
    }

    public void forAllBodyRows(TableRowManipulator tableRowManipulator) {
        forAllSectionsRows(0, TableCell.NOT_TRACKED, this.ALL_BODY_ROWS, tableRowManipulator);
    }

    public void forAllContentRows(TableRowManipulator tableRowManipulator) {
        forAllSectionsRows(0, TableCell.NOT_TRACKED, this.ALL_CONTENT_ROWS, tableRowManipulator);
    }

    public void forAllHeaderRows(TableRowManipulator tableRowManipulator) {
        forAllSectionsRows(0, TableCell.NOT_TRACKED, this.ALL_HEADER_ROWS, tableRowManipulator);
    }

    public void forAllRows(TableRowManipulator tableRowManipulator) {
        forAllSectionsRows(0, TableCell.NOT_TRACKED, this.ALL_TABLE_ROWS, tableRowManipulator);
    }

    public void forAllSectionRows(TableRowManipulator tableRowManipulator) {
        forAllSectionsRows(0, TableCell.NOT_TRACKED, this.ALL_SECTIONS, tableRowManipulator);
    }

    public List<TableRow> getAllContentRows() {
        return getAllSectionsRows(this.ALL_CONTENT_ROWS);
    }

    public int getAllContentRowsCount() {
        return this.body.rows.size() + this.header.rows.size();
    }

    public List<TableRow> getAllRows() {
        return getAllSectionsRows(this.ALL_TABLE_ROWS);
    }

    public int getAllRowsCount() {
        return this.body.rows.size() + this.separator.rows.size() + this.header.rows.size();
    }

    public TableSection getAllRowsSection(int i6) {
        for (TableSection tableSection : this.ALL_SECTIONS) {
            if (i6 < tableSection.rows.size()) {
                return tableSection;
            }
            i6 -= tableSection.rows.size();
        }
        return null;
    }

    public List<TableRow> getAllSectionRows() {
        return getAllSectionsRows(this.ALL_SECTIONS);
    }

    public int getAllSectionsRowsCount() {
        return this.caption.rows.size() + this.body.rows.size() + this.separator.rows.size() + this.header.rows.size();
    }

    public int getBodyRowCount() {
        return this.body.rows.size();
    }

    public BasedSequence getCaption() {
        return getCaptionCell().text;
    }

    public TableCell getCaptionCell() {
        return (this.caption.rows.size() <= 0 || this.caption.rows.get(0).cells.size() <= 0) ? TableCaptionSection.NULL_CELL : this.caption.rows.get(0).cells.get(0);
    }

    public int getCaptionRowCount() {
        return this.caption.rows.size();
    }

    public TableCellOffsetInfo getCellOffsetInfo(int i6) {
        int i7 = 0;
        for (TableRow tableRow : getAllSectionRows()) {
            tableRow.normalizeIfNeeded();
            TableCell tableCell = tableRow.cells.get(r2.size() - 1);
            BasedSequence lastSegment = tableCell.getLastSegment();
            int baseEndOfLineAnyEOL = lastSegment.baseEndOfLineAnyEOL();
            if (baseEndOfLineAnyEOL == -1) {
                baseEndOfLineAnyEOL = lastSegment.getEndOffset();
            }
            if (i6 <= baseEndOfLineAnyEOL) {
                TableCell tableCell2 = null;
                int i8 = 0;
                for (TableCell tableCell3 : tableRow.cells) {
                    if (tableCell3.closeMarker.isEmpty()) {
                        if (i6 <= tableCell3.text.getEndOffset()) {
                            if (i6 >= tableCell3.getInsideStartOffset(tableCell2)) {
                            }
                            return new TableCellOffsetInfo(i6, this, getAllRowsSection(i7), tableRow, tableCell3, i7, i8, null, null);
                        }
                        tableCell2 = tableCell3;
                        i8++;
                        i6 = i6;
                    } else {
                        if (i6 < tableCell3.closeMarker.getEndOffset()) {
                            if (i6 >= tableCell3.getInsideStartOffset(tableCell2) || i6 > tableCell3.getInsideEndOffset()) {
                                return new TableCellOffsetInfo(i6, this, getAllRowsSection(i7), tableRow, tableCell3, i7, i8, null, null);
                            }
                            return new TableCellOffsetInfo(i6, this, getAllRowsSection(i7), tableRow, tableCell3, i7, i8, Integer.valueOf(i8), Integer.valueOf(i6 - tableCell3.getInsideStartOffset(tableCell2)));
                        }
                        tableCell2 = tableCell3;
                        i8++;
                        i6 = i6;
                    }
                }
                return new TableCellOffsetInfo(i6, this, getAllRowsSection(i7), tableRow, tableCell, i7, i8, null, null);
            }
            i7++;
        }
        return new TableCellOffsetInfo(i6, this, getAllRowsSection(i7 - 1), null, null, i7, 0, null, null);
    }

    public CharSequence getFormatTableIndentPrefix() {
        return this.formatTableIndentPrefix;
    }

    public boolean getHaveCaption() {
        return this.caption.rows.size() > 0 && this.caption.rows.get(0).cells.size() > 0 && this.caption.rows.get(0).cells.get(0).columnSpan != 0;
    }

    public boolean getHeader() {
        return this.isHeading;
    }

    public int getHeadingRowCount() {
        return this.header.rows.size();
    }

    public int getMaxBodyColumns() {
        return this.body.getMaxColumns();
    }

    public int getMaxColumns() {
        return Utils.max(this.header.getMaxColumns(), this.separator.getMaxColumns(), this.body.getMaxColumns());
    }

    public int getMaxColumnsWithoutColumns(boolean z5, int... iArr) {
        return aggregateTotalColumnsWithoutColumns(z5 ? this.ALL_TABLE_ROWS : this.ALL_CONTENT_ROWS, MaxAggregator.INSTANCE, iArr);
    }

    public int getMaxColumnsWithoutRows(boolean z5, int... iArr) {
        return aggregateTotalColumnsWithoutRows(z5 ? this.ALL_TABLE_ROWS : this.ALL_CONTENT_ROWS, MaxAggregator.INSTANCE, iArr);
    }

    public int getMaxHeadingColumns() {
        return this.header.getMaxColumns();
    }

    public int getMaxSeparatorColumns() {
        return this.separator.getMaxColumns();
    }

    public int getMinColumns() {
        int minColumns = this.header.getMinColumns();
        int minColumns2 = this.separator.getMinColumns();
        int minColumns3 = this.body.getMinColumns();
        if (minColumns == 0) {
            minColumns = Integer.MAX_VALUE;
        }
        if (minColumns3 == 0) {
            minColumns3 = Integer.MAX_VALUE;
        }
        return Utils.min(minColumns, minColumns2, minColumns3);
    }

    public int getMinColumnsWithoutColumns(boolean z5, int... iArr) {
        return aggregateTotalColumnsWithoutColumns(z5 ? this.ALL_TABLE_ROWS : this.ALL_CONTENT_ROWS, MinAggregator.INSTANCE, iArr);
    }

    public int getMinColumnsWithoutRows(boolean z5, int... iArr) {
        return aggregateTotalColumnsWithoutRows(z5 ? this.ALL_TABLE_ROWS : this.ALL_CONTENT_ROWS, MinAggregator.INSTANCE, iArr);
    }

    public int getSeparatorRowCount() {
        return this.separator.rows.size();
    }

    public CharSequence getTableChars() {
        return this.tableChars;
    }

    public int getTableStartOffset() {
        List<TableRow> allRows = getAllRows();
        if (!allRows.isEmpty()) {
            TableRow tableRow = allRows.get(0);
            tableRow.normalizeIfNeeded();
            if (tableRow.cells.size() > 0) {
                return tableRow.cells.get(0).getStartOffset(null);
            }
        }
        return 0;
    }

    public TrackedOffset getTrackedOffset(int i6) {
        return findTrackedOffset(i6);
    }

    public int getTrackedOffsetIndex(int i6) {
        TrackedOffset findTrackedOffset = findTrackedOffset(i6);
        return findTrackedOffset == null ? i6 : findTrackedOffset.getIndex();
    }

    public List<TrackedOffset> getTrackedOffsets() {
        return this.trackedOffsets;
    }

    public void insertColumns(int i6, int i7) {
        forAllContentRows(new c(i6, i7, 2));
        ArrayList<TableRow> arrayList = this.separator.rows;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            TableRow tableRow = arrayList.get(i8);
            i8++;
            tableRow.insertColumns(i6, i7);
        }
    }

    public void insertRows(int i6, int i7) {
        int maxColumns = getMaxColumns();
        if (i6 <= this.header.rows.size()) {
            insertRows(this.header.rows, i6, i7, maxColumns);
        } else {
            insertRows(this.body.rows, Utils.rangeLimit((i6 - this.header.rows.size()) - this.separator.rows.size(), 0, this.body.rows.size()), i7, maxColumns);
        }
    }

    public boolean isAllRowsEmptyAt(int i6) {
        return isEmptyRowAt(i6, this.ALL_TABLE_ROWS);
    }

    public boolean isAllRowsSeparator(int i6) {
        if (i6 >= this.header.rows.size()) {
            return i6 < this.separator.rows.size() + this.header.rows.size();
        }
        return false;
    }

    public boolean isContentRowsEmptyAt(int i6) {
        return isEmptyRowAt(i6, this.ALL_CONTENT_ROWS);
    }

    public boolean isEmptyColumn(final int i6) {
        final boolean[] zArr = {true};
        forAllContentRows(new TableRowManipulator() { // from class: com.vladsch.flexmark.util.format.i
            @Override // com.vladsch.flexmark.util.format.TableRowManipulator
            public final int apply(TableRow tableRow, int i7, ArrayList arrayList, int i8) {
                int lambda$isEmptyColumn$6;
                lambda$isEmptyColumn$6 = MarkdownTable.lambda$isEmptyColumn$6(i6, zArr, tableRow, i7, arrayList, i8);
                return lambda$isEmptyColumn$6;
            }
        });
        return zArr[0];
    }

    public boolean isSeparator() {
        return this.isSeparator;
    }

    public void moveColumn(int i6, int i7) {
        forAllContentRows(new c(i6, i7, 0));
        ArrayList<TableRow> arrayList = this.separator.rows;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            TableRow tableRow = arrayList.get(i8);
            i8++;
            tableRow.moveColumn(i6, i7);
        }
    }

    public void nextRow() {
        if (this.isSeparator) {
            throw new IllegalStateException("Only one separator row allowed");
        }
        if (this.isHeading) {
            this.header.nextRow();
        } else {
            this.body.nextRow();
        }
    }

    public void normalize() {
        this.header.normalize();
        this.separator.normalize();
        this.body.normalize();
    }

    public void setBody() {
        this.isSeparator = false;
        this.isHeading = false;
    }

    public void setCaption(CharSequence charSequence) {
        TableCell captionCell = getCaptionCell();
        setCaptionCell(captionCell.withText(captionCell.openMarker.isEmpty() ? "[" : captionCell.openMarker, charSequence, captionCell.closeMarker.isEmpty() ? "]" : captionCell.closeMarker));
    }

    public void setCaptionCell(TableCell tableCell) {
        if (this.caption.rows.size() == 0) {
            TableSection tableSection = this.caption;
            tableSection.rows.add(tableSection.defaultRow());
        }
        this.caption.rows.get(0).cells.clear();
        this.caption.rows.get(0).cells.add(tableCell);
    }

    public void setCaptionWithMarkers(Node node, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        if (this.options.formatTableCaptionSpaces != DiscretionaryText.AS_IS) {
            charSequence2 = BasedSequence.of(charSequence2).trim();
        }
        setCaptionCell(new TableCell(node, charSequence, charSequence2, charSequence3, 1, 1));
    }

    public void setFormatTableIndentPrefix(CharSequence charSequence) {
        this.formatTableIndentPrefix = charSequence;
    }

    public void setHeader(boolean z5) {
        this.isHeading = z5;
    }

    public void setSeparator(boolean z5) {
        this.isSeparator = z5;
    }

    public MarkdownTable sorted(final ColumnSort[] columnSortArr, final int i6, NumericSuffixPredicate numericSuffixPredicate) {
        MarkdownTable markdownTable = new MarkdownTable(this.tableChars, this.options);
        markdownTable.trackedOffsets.addAll(this.trackedOffsets);
        markdownTable.setHeader();
        forAllSectionsRows(0, TableCell.NOT_TRACKED, this.ALL_HEADER_ROWS, new h(markdownTable, 2));
        markdownTable.setSeparator();
        TableRow tableRow = this.separator.rows.get(0);
        int size = tableRow.cells.size();
        final CellAlignment[] cellAlignmentArr = new CellAlignment[size];
        for (int i7 = 0; i7 < size; i7++) {
            TableCell tableCell = tableRow.cells.get(i7);
            markdownTable.addCell(tableCell == TableCell.DEFAULT_CELL ? tableCell : new TableCell(tableCell, true, tableCell.rowSpan, tableCell.columnSpan, tableCell.alignment));
            cellAlignmentArr[i7] = tableCell.alignment;
        }
        List<TableRow> allSectionsRows = getAllSectionsRows(this.body);
        final int[] iArr = new int[size];
        int size2 = allSectionsRows.size();
        final int maxBodyColumns = getMaxBodyColumns();
        for (int i8 = 0; i8 < size2; i8++) {
            for (ColumnSort columnSort : columnSortArr) {
                int i9 = columnSort.column;
                if (i9 >= 0 && i9 < maxBodyColumns) {
                    IndexSpanOffset indexOf = allSectionsRows.get(i8).indexOf(i9);
                    TableCell tableCell2 = allSectionsRows.get(i8).cells.get(indexOf.index);
                    if (indexOf.index == i9 && tableCell2 != null) {
                        iArr[i9] = Math.max(iArr[i9], tableCell2.text.length());
                    }
                }
            }
        }
        final TextCollectingVisitor textCollectingVisitor = new TextCollectingVisitor();
        final NumericSuffixPredicate numericSuffixPredicate2 = numericSuffixPredicate == null ? ALL_SUFFIXES_SORT : numericSuffixPredicate;
        allSectionsRows.sort(new Comparator() { // from class: com.vladsch.flexmark.util.format.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$sorted$10;
                lambda$sorted$10 = MarkdownTable.lambda$sorted$10(columnSortArr, maxBodyColumns, iArr, textCollectingVisitor, i6, cellAlignmentArr, numericSuffixPredicate2, (TableRow) obj, (TableRow) obj2);
                return lambda$sorted$10;
            }
        });
        markdownTable.setBody();
        int size3 = allSectionsRows.size();
        for (int i10 = 0; i10 < size3; i10++) {
            TableRow tableRow2 = allSectionsRows.get(i10);
            int size4 = tableRow2.cells.size();
            for (int i11 = 0; i11 < size4; i11++) {
                TableCell tableCell3 = tableRow2.cells.get(i11);
                if (tableCell3 != TableCell.DEFAULT_CELL) {
                    tableCell3 = new TableCell(tableCell3, true, tableCell3.rowSpan, tableCell3.columnSpan, tableCell3.alignment);
                }
                markdownTable.addCell(tableCell3);
            }
            markdownTable.nextRow();
        }
        markdownTable.setCaptionCell(getCaptionCell());
        return markdownTable;
    }

    public String toString() {
        return getClass().getName().substring(getClass().getPackage().getName().length() + 1) + "{header=" + this.header + ",\nseparator=" + this.separator + ",\nbody=" + this.body + ",\ncaption=" + this.caption + ",\noptions=" + this.options + ",\ntrackedOffsets=" + this.trackedOffsets + "}";
    }

    public MarkdownTable transposed(int i6) {
        MarkdownTable markdownTable = new MarkdownTable(this.tableChars, this.options);
        markdownTable.trackedOffsets.addAll(this.trackedOffsets);
        int allRowsCount = getAllRowsCount() - 1;
        int maxColumns = getMaxColumns();
        TableCell[][] tableCellArr = new TableCell[allRowsCount];
        for (int i7 = 0; i7 < allRowsCount; i7++) {
            tableCellArr[i7] = new TableCell[maxColumns];
        }
        forAllSectionsRows(0, TableCell.NOT_TRACKED, this.ALL_CONTENT_ROWS, new h(tableCellArr, 0));
        markdownTable.setHeader();
        int min = Math.min(Math.max(0, i6), maxColumns);
        for (int i8 = 0; i8 < min; i8++) {
            for (int i9 = 0; i9 < allRowsCount; i9++) {
                TableCell tableCell = tableCellArr[i9][i8];
                if (tableCell == null) {
                    tableCell = TableCell.DEFAULT_CELL;
                }
                markdownTable.addCell(tableCell);
            }
            markdownTable.nextRow();
        }
        TableRow tableRow = this.separator.rows.get(0);
        markdownTable.setSeparator();
        int size = tableRow.cells.size();
        for (int i10 = 0; i10 < allRowsCount; i10++) {
            if (i10 < size) {
                markdownTable.addCell(new TableCell(tableRow.cells.get(i10), true, 1, 1, (CellAlignment) null));
            } else {
                markdownTable.addCell(new TableCell("---", 1, 1));
            }
        }
        markdownTable.setBody();
        while (min < maxColumns) {
            for (int i11 = 0; i11 < allRowsCount; i11++) {
                TableCell tableCell2 = tableCellArr[i11][min];
                if (tableCell2 == null) {
                    tableCell2 = TableCell.DEFAULT_CELL;
                }
                markdownTable.addCell(tableCell2);
            }
            markdownTable.nextRow();
            min++;
        }
        markdownTable.setCaptionCell(getCaptionCell());
        return markdownTable;
    }

    public MarkdownTable(CharSequence charSequence, TableFormatOptions tableFormatOptions) {
        this.trackedOffsets = new ArrayList<>();
        this.tableChars = charSequence;
        this.formatTableIndentPrefix = tableFormatOptions == null ? FlexmarkHtmlConverter.DEFAULT_NODE : tableFormatOptions.formatTableIndentPrefix;
        TableSection tableSection = new TableSection(TableSectionType.HEADER);
        this.header = tableSection;
        TableSeparatorSection tableSeparatorSection = new TableSeparatorSection(TableSectionType.SEPARATOR);
        this.separator = tableSeparatorSection;
        TableSection tableSection2 = new TableSection(TableSectionType.BODY);
        this.body = tableSection2;
        TableCaptionSection tableCaptionSection = new TableCaptionSection(TableSectionType.CAPTION);
        this.caption = tableCaptionSection;
        this.isHeading = true;
        this.isSeparator = false;
        this.options = tableFormatOptions == null ? new TableFormatOptions(null) : tableFormatOptions;
        this.ALL_SECTIONS = new TableSection[]{tableSection, tableSeparatorSection, tableSection2, tableCaptionSection};
        this.ALL_TABLE_ROWS = new TableSection[]{tableSection, tableSeparatorSection, tableSection2};
        this.ALL_CONTENT_ROWS = new TableSection[]{tableSection, tableSection2};
        this.ALL_HEADER_ROWS = new TableSection[]{tableSection};
        this.ALL_BODY_ROWS = new TableSection[]{tableSection2};
    }

    @Deprecated
    public boolean addTrackedOffset(int i6, boolean z5) {
        return addTrackedOffset(TrackedOffset.track(i6, z5 ? Character.valueOf(SequenceUtils.SPC) : null, false));
    }

    public void fillMissingColumns(Integer num) {
        int minColumns = getMinColumns();
        int maxColumns = getMaxColumns();
        if (minColumns < maxColumns) {
            ArrayList<TableRow> arrayList = this.header.rows;
            int size = arrayList.size();
            int i6 = 0;
            int i7 = 0;
            while (i7 < size) {
                TableRow tableRow = arrayList.get(i7);
                i7++;
                tableRow.fillMissingColumns(num, maxColumns);
            }
            ArrayList<TableRow> arrayList2 = this.body.rows;
            int size2 = arrayList2.size();
            while (i6 < size2) {
                TableRow tableRow2 = arrayList2.get(i6);
                i6++;
                tableRow2.fillMissingColumns(num, maxColumns);
            }
        }
    }

    public void forAllBodyRows(int i6, TableRowManipulator tableRowManipulator) {
        forAllSectionsRows(i6, TableCell.NOT_TRACKED, this.ALL_HEADER_ROWS, tableRowManipulator);
    }

    public void forAllContentRows(int i6, TableRowManipulator tableRowManipulator) {
        forAllSectionsRows(i6, TableCell.NOT_TRACKED, this.ALL_CONTENT_ROWS, tableRowManipulator);
    }

    public void forAllHeaderRows(int i6, TableRowManipulator tableRowManipulator) {
        forAllSectionsRows(i6, TableCell.NOT_TRACKED, this.ALL_HEADER_ROWS, tableRowManipulator);
    }

    public void forAllRows(int i6, TableRowManipulator tableRowManipulator) {
        forAllSectionsRows(i6, TableCell.NOT_TRACKED, this.ALL_TABLE_ROWS, tableRowManipulator);
    }

    public void forAllSectionRows(int i6, TableRowManipulator tableRowManipulator) {
        forAllSectionsRows(i6, TableCell.NOT_TRACKED, this.ALL_SECTIONS, tableRowManipulator);
    }

    public void setHeader() {
        this.isHeading = true;
        this.isSeparator = false;
    }

    public void setSeparator() {
        this.isSeparator = true;
        this.isHeading = false;
    }

    @Deprecated
    public boolean addTrackedOffset(int i6, boolean z5, boolean z6) {
        return addTrackedOffset(TrackedOffset.track(i6, z5 ? Character.valueOf(SequenceUtils.SPC) : null, z6));
    }

    public void forAllBodyRows(int i6, int i7, TableRowManipulator tableRowManipulator) {
        forAllSectionsRows(i6, i7, this.ALL_HEADER_ROWS, tableRowManipulator);
    }

    public void forAllContentRows(int i6, int i7, TableRowManipulator tableRowManipulator) {
        forAllSectionsRows(i6, i7, this.ALL_CONTENT_ROWS, tableRowManipulator);
    }

    public void forAllHeaderRows(int i6, int i7, TableRowManipulator tableRowManipulator) {
        forAllSectionsRows(i6, i7, this.ALL_HEADER_ROWS, tableRowManipulator);
    }

    public void forAllRows(int i6, int i7, TableRowManipulator tableRowManipulator) {
        forAllSectionsRows(i6, i7, this.ALL_TABLE_ROWS, tableRowManipulator);
    }

    public void forAllSectionRows(int i6, int i7, TableRowManipulator tableRowManipulator) {
        forAllSectionsRows(i6, i7, this.ALL_SECTIONS, tableRowManipulator);
    }

    @Deprecated
    public boolean addTrackedOffset(int i6, Character ch, boolean z5) {
        return addTrackedOffset(TrackedOffset.track(i6, ch, z5));
    }

    private void insertRows(ArrayList<TableRow> arrayList, int i6, int i7, int i8) {
        while (true) {
            int i9 = i7 - 1;
            if (i7 <= 0) {
                return;
            }
            TableRow tableRow = new TableRow();
            tableRow.appendColumns(i8);
            if (i6 >= arrayList.size()) {
                arrayList.add(tableRow);
            } else {
                arrayList.add(i6, tableRow);
            }
            i7 = i9;
        }
    }

    public boolean addTrackedOffset(TrackedOffset trackedOffset) {
        final int offset = trackedOffset.getOffset();
        this.trackedOffsets.removeIf(new Predicate() { // from class: com.vladsch.flexmark.util.format.g
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$addTrackedOffset$2;
                lambda$addTrackedOffset$2 = MarkdownTable.lambda$addTrackedOffset$2(offset, (TrackedOffset) obj);
                return lambda$addTrackedOffset$2;
            }
        });
        this.trackedOffsets.add(trackedOffset);
        TableCellOffsetInfo cellOffsetInfo = getCellOffsetInfo(offset);
        if (cellOffsetInfo.getInsideColumn()) {
            List<TableCell> list = cellOffsetInfo.tableRow.cells;
            int i6 = cellOffsetInfo.column;
            TableCell tableCell = cellOffsetInfo.tableCell;
            list.set(i6, tableCell.withTrackedOffset(offset - tableCell.getTextStartOffset(i6 == 0 ? null : list.get(i6 - 1)), trackedOffset.isAfterSpaceEdit(), trackedOffset.isAfterDelete()));
            return true;
        }
        if (cellOffsetInfo.isBeforeCells()) {
            cellOffsetInfo.tableRow.setBeforeOffset(offset);
            return true;
        }
        if (cellOffsetInfo.isInCellSpan()) {
            List<TableCell> list2 = cellOffsetInfo.tableRow.cells;
            int i7 = cellOffsetInfo.column;
            TableCell tableCell2 = cellOffsetInfo.tableCell;
            list2.set(i7, tableCell2.withSpanTrackedOffset(offset - tableCell2.getInsideEndOffset()));
            return true;
        }
        if (!cellOffsetInfo.isAfterCells()) {
            return false;
        }
        cellOffsetInfo.tableRow.setAfterOffset(offset);
        return true;
    }
}
