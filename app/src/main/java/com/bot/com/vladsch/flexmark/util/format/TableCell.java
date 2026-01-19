package com.vladsch.flexmark.util.format;

import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.html.CellAlignment;
import com.vladsch.flexmark.util.misc.Utils;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.PrefixedSubSequence;
import com.vladsch.flexmark.util.sequence.SequenceUtils;

/* loaded from: classes.dex */
public class TableCell {
    public static final TableCell DEFAULT_CELL;
    public static final int NOT_TRACKED = Integer.MAX_VALUE;
    public static final TableCell NULL;
    public final boolean afterDelete;
    public final boolean afterSpace;
    public final CellAlignment alignment;
    public final BasedSequence closeMarker;
    public final int columnSpan;
    public final BasedSequence openMarker;
    public final int rowSpan;
    public final int spanTrackedOffset;
    public final Node tableCellNode;
    public final BasedSequence text;
    public final int trackedTextAdjust;
    public final int trackedTextOffset;

    static {
        BasedSequence basedSequence = BasedSequence.NULL;
        CellAlignment cellAlignment = CellAlignment.NONE;
        NULL = new TableCell(null, basedSequence, SequenceUtils.SPACE, basedSequence, 1, 0, cellAlignment);
        DEFAULT_CELL = new TableCell(null, basedSequence, SequenceUtils.SPACE, basedSequence, 1, 1, cellAlignment);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TableCell(java.lang.CharSequence r9, int r10, int r11) {
        /*
            r8 = this;
            com.vladsch.flexmark.util.sequence.BasedSequence r2 = com.vladsch.flexmark.util.sequence.BasedSequence.NULL
            com.vladsch.flexmark.util.html.CellAlignment r7 = com.vladsch.flexmark.util.html.CellAlignment.NONE
            r1 = 0
            r4 = r2
            r0 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.util.format.TableCell.<init>(java.lang.CharSequence, int, int):void");
    }

    private CharSequence dumpSequence(BasedSequence basedSequence) {
        StringBuilder sb = new StringBuilder();
        sb.append("{ \"");
        sb.append((CharSequence) basedSequence.replace("\"", "\\\""));
        sb.append("\" [");
        sb.append(basedSequence.getStartOffset());
        sb.append(", ");
        sb.append(basedSequence.getEndOffset());
        sb.append("), length=");
        sb.append(basedSequence.length());
        sb.append("}");
        return sb;
    }

    public int getCellLength(TableCell tableCell) {
        return getEndOffset() - getStartOffset(tableCell);
    }

    public int getCellPrefixLength(TableCell tableCell) {
        return getInsideStartOffset(tableCell) - getStartOffset(tableCell);
    }

    public int getCellSize(TableCell tableCell) {
        return getEndOffset() - getStartOffset(tableCell);
    }

    public int getEndOffset() {
        return (!this.closeMarker.isEmpty() ? this.closeMarker : this.text).getEndOffset();
    }

    public int getInsideEndOffset() {
        return !this.closeMarker.isEmpty() ? this.closeMarker.getStartOffset() : this.text.getEndOffset();
    }

    public int getInsideStartOffset(TableCell tableCell) {
        return tableCell != null ? tableCell.getEndOffset() : !this.openMarker.isEmpty() ? this.openMarker.getEndOffset() : this.text.getStartOffset();
    }

    public BasedSequence getLastSegment() {
        return !this.closeMarker.isEmpty() ? this.closeMarker : this.text;
    }

    public int getStartOffset(TableCell tableCell) {
        if (tableCell != null) {
            return tableCell.getEndOffset();
        }
        return (!this.openMarker.isEmpty() ? this.openMarker : this.text).getStartOffset();
    }

    public int getTextEndOffset(TableCell tableCell) {
        return !this.text.isEmpty() ? this.text.getEndOffset() : !this.openMarker.isEmpty() ? this.openMarker.getEndOffset() + 1 : tableCell != null ? tableCell.getEndOffset() + 1 : this.closeMarker.getStartOffset() - 1;
    }

    public int getTextStartOffset(TableCell tableCell) {
        return !this.text.isEmpty() ? this.text.getStartOffset() : !this.openMarker.isEmpty() ? this.openMarker.getEndOffset() + 1 : tableCell != null ? tableCell.getEndOffset() + 1 : this.closeMarker.getStartOffset() - 1;
    }

    public int insideToTextOffset(int i6, TableCell tableCell) {
        return Utils.maxLimit(this.text.length(), Utils.minLimit(getTextStartOffset(tableCell) + (i6 - getInsideStartOffset(tableCell)), 0));
    }

    public boolean isAtCell(int i6, TableCell tableCell) {
        return i6 >= getInsideStartOffset(tableCell) && i6 <= getInsideEndOffset();
    }

    public boolean isInsideCell(int i6, TableCell tableCell) {
        return i6 >= getInsideStartOffset(tableCell) && i6 <= getInsideEndOffset();
    }

    public int textToInsideOffset(int i6, TableCell tableCell) {
        return Utils.maxLimit(getCellSize(tableCell), Utils.minLimit(getInsideStartOffset(tableCell) + (i6 - getTextStartOffset(tableCell)), 0));
    }

    public String toString() {
        String substring = getClass().getName().substring(getClass().getPackage().getName().length() + 1);
        CharSequence dumpSequence = dumpSequence(this.openMarker);
        CharSequence dumpSequence2 = dumpSequence(this.text);
        CharSequence dumpSequence3 = dumpSequence(this.closeMarker);
        return substring + "{openMarker=" + ((Object) dumpSequence) + ", text=" + ((Object) dumpSequence2) + ", closeMarker=" + ((Object) dumpSequence3) + ", columnSpan=" + this.columnSpan + ", rowSpan=" + this.rowSpan + ", alignment=" + this.alignment + ", trackedTextOffset=" + this.trackedTextOffset + ", spanTrackedOffset=" + this.spanTrackedOffset + ", trackedTextAdjust=" + this.trackedTextAdjust + ", afterSpace=" + this.afterSpace + ", afterDelete=" + this.afterDelete + "}";
    }

    public TableCell withAfterSpace(boolean z5) {
        return new TableCell(this.tableCellNode, this.openMarker, this.text, this.closeMarker, this.rowSpan, this.columnSpan, this.alignment, this.trackedTextOffset, this.spanTrackedOffset, this.trackedTextAdjust, z5, this.afterDelete);
    }

    public TableCell withAlignment(CellAlignment cellAlignment) {
        return new TableCell(this.tableCellNode, this.openMarker, this.text, this.closeMarker, this.rowSpan, this.columnSpan, cellAlignment, this.trackedTextOffset, this.spanTrackedOffset, this.trackedTextAdjust, this.afterSpace, this.afterDelete);
    }

    public TableCell withColumnSpan(int i6) {
        Node node = this.tableCellNode;
        BasedSequence basedSequence = this.openMarker;
        BasedSequence basedSequence2 = this.text;
        BasedSequence basedSequence3 = this.closeMarker;
        int i7 = this.rowSpan;
        CellAlignment cellAlignment = this.alignment;
        int i8 = this.trackedTextOffset;
        int i9 = this.spanTrackedOffset;
        int i10 = NOT_TRACKED;
        if (i9 != Integer.MAX_VALUE) {
            i10 = Utils.min(i9, i6);
        }
        return new TableCell(node, basedSequence, basedSequence2, basedSequence3, i7, i6, cellAlignment, i8, i10, this.trackedTextAdjust, this.afterSpace, this.afterDelete);
    }

    public TableCell withRowSpan(int i6) {
        return new TableCell(this.tableCellNode, this.openMarker, this.text, this.closeMarker, i6, this.columnSpan, this.alignment, this.trackedTextOffset, this.spanTrackedOffset, this.trackedTextAdjust, this.afterSpace, this.afterDelete);
    }

    public TableCell withSpanTrackedOffset(int i6) {
        return new TableCell(this.tableCellNode, this.openMarker, this.text, this.closeMarker, this.rowSpan, this.columnSpan, this.alignment, this.trackedTextOffset, i6, this.trackedTextAdjust, this.afterSpace, this.afterDelete);
    }

    public TableCell withText(CharSequence charSequence) {
        return new TableCell(this.tableCellNode, this.openMarker, charSequence, this.closeMarker, this.rowSpan, this.columnSpan, this.alignment, NOT_TRACKED, this.spanTrackedOffset, this.trackedTextAdjust, this.afterSpace, this.afterDelete);
    }

    public TableCell withTrackedOffset(int i6) {
        return new TableCell(this.tableCellNode, this.openMarker, this.text, this.closeMarker, this.rowSpan, this.columnSpan, this.alignment, i6, this.spanTrackedOffset, this.trackedTextAdjust, this.afterSpace, this.afterDelete);
    }

    public TableCell withTrackedTextAdjust(int i6) {
        return new TableCell(this.tableCellNode, this.openMarker, this.text, this.closeMarker, this.rowSpan, this.columnSpan, this.alignment, this.trackedTextOffset, this.spanTrackedOffset, i6, this.afterSpace, this.afterDelete);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TableCell(com.vladsch.flexmark.util.ast.Node r9, java.lang.CharSequence r10, int r11, int r12, com.vladsch.flexmark.util.html.CellAlignment r13) {
        /*
            r8 = this;
            com.vladsch.flexmark.util.sequence.BasedSequence r2 = com.vladsch.flexmark.util.sequence.BasedSequence.NULL
            r4 = r2
            r0 = r8
            r1 = r9
            r3 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.util.format.TableCell.<init>(com.vladsch.flexmark.util.ast.Node, java.lang.CharSequence, int, int, com.vladsch.flexmark.util.html.CellAlignment):void");
    }

    public TableCell withText(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        return new TableCell(this.tableCellNode, charSequence, charSequence2, charSequence3, this.rowSpan, this.columnSpan, this.alignment, NOT_TRACKED, this.spanTrackedOffset, this.trackedTextAdjust, this.afterSpace, this.afterDelete);
    }

    public TableCell withTrackedOffset(int i6, boolean z5, boolean z6) {
        return new TableCell(this.tableCellNode, this.openMarker, this.text, this.closeMarker, this.rowSpan, this.columnSpan, this.alignment, i6, this.spanTrackedOffset, this.trackedTextAdjust, z5, z6);
    }

    public TableCell(Node node, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i6, int i7) {
        this(node, charSequence, charSequence2, charSequence3, i6, i7, CellAlignment.NONE);
    }

    public TableCell(Node node, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i6, int i7, CellAlignment cellAlignment) {
        this(node, charSequence, charSequence2, charSequence3, i6, i7, cellAlignment, NOT_TRACKED, NOT_TRACKED, 0, false, false);
    }

    public TableCell(Node node, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i6, int i7, CellAlignment cellAlignment, int i8, int i9, int i10, boolean z5, boolean z6) {
        BasedSequence of = BasedSequence.of(charSequence2);
        this.tableCellNode = node;
        BasedSequence of2 = BasedSequence.of(charSequence);
        this.openMarker = of2;
        BasedSequence of3 = BasedSequence.of(charSequence3);
        this.closeMarker = of3;
        BasedSequence subSequence = of2.isEmpty() ? of3.subSequence(0, 0) : of2.subSequence(of2.length());
        if (of.isEmpty() && of != BasedSequence.NULL) {
            of = PrefixedSubSequence.prefixOf(SequenceUtils.SPACE, subSequence);
        }
        this.text = of;
        this.rowSpan = i6;
        this.columnSpan = i7;
        this.alignment = cellAlignment == null ? CellAlignment.NONE : cellAlignment;
        this.trackedTextOffset = i8;
        this.spanTrackedOffset = i9;
        this.trackedTextAdjust = i10;
        this.afterSpace = z5;
        this.afterDelete = z6;
    }

    public TableCell(TableCell tableCell, boolean z5, int i6, int i7, CellAlignment cellAlignment) {
        this.tableCellNode = z5 ? tableCell.tableCellNode : null;
        BasedSequence basedSequence = tableCell.openMarker;
        this.openMarker = basedSequence;
        BasedSequence basedSequence2 = tableCell.closeMarker;
        this.closeMarker = basedSequence2;
        BasedSequence subSequence = basedSequence.isEmpty() ? basedSequence2.subSequence(0, 0) : basedSequence.subSequence(basedSequence.length());
        BasedSequence basedSequence3 = tableCell.text;
        this.text = basedSequence3 == BasedSequence.NULL ? PrefixedSubSequence.prefixOf(SequenceUtils.SPACE, subSequence) : basedSequence3;
        this.rowSpan = i6;
        this.columnSpan = i7;
        this.alignment = cellAlignment == null ? CellAlignment.NONE : cellAlignment;
        this.trackedTextOffset = tableCell.trackedTextOffset;
        this.spanTrackedOffset = tableCell.spanTrackedOffset;
        this.trackedTextAdjust = tableCell.trackedTextAdjust;
        this.afterSpace = tableCell.afterSpace;
        this.afterDelete = tableCell.afterDelete;
    }
}
