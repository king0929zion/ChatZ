package com.vladsch.flexmark.ext.tables.internal;

import D.f1;
import com.vladsch.flexmark.ast.Paragraph;
import com.vladsch.flexmark.ast.Text;
import com.vladsch.flexmark.ext.tables.TableBlock;
import com.vladsch.flexmark.ext.tables.TableBody;
import com.vladsch.flexmark.ext.tables.TableCaption;
import com.vladsch.flexmark.ext.tables.TableCell;
import com.vladsch.flexmark.ext.tables.TableHead;
import com.vladsch.flexmark.ext.tables.TableRow;
import com.vladsch.flexmark.ext.tables.TableSeparator;
import com.vladsch.flexmark.ext.tables.TablesExtension;
import com.vladsch.flexmark.ext.wikilink.WikiNode;
import com.vladsch.flexmark.formatter.MarkdownWriter;
import com.vladsch.flexmark.formatter.NodeFormatter;
import com.vladsch.flexmark.formatter.NodeFormatterContext;
import com.vladsch.flexmark.formatter.NodeFormatterFactory;
import com.vladsch.flexmark.formatter.NodeFormattingHandler;
import com.vladsch.flexmark.formatter.RenderPurpose;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.format.MarkdownTable;
import com.vladsch.flexmark.util.format.TableFormatOptions;
import com.vladsch.flexmark.util.format.TableManipulator;
import com.vladsch.flexmark.util.format.TrackedOffset;
import com.vladsch.flexmark.util.format.TrackedOffsetList;
import com.vladsch.flexmark.util.html.CellAlignment;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.LineAppendable;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public class TableNodeFormatter implements NodeFormatter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private MarkdownTable myTable;
    private final TableFormatOptions options;
    private final boolean parserTrimCellWhiteSpace;

    /* renamed from: com.vladsch.flexmark.ext.tables.internal.TableNodeFormatter$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose;

        static {
            int[] iArr = new int[RenderPurpose.values().length];
            $SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose = iArr;
            try {
                iArr[RenderPurpose.TRANSLATION_SPANS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose[RenderPurpose.TRANSLATED_SPANS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose[RenderPurpose.TRANSLATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose[RenderPurpose.FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Factory implements NodeFormatterFactory {
        @Override // com.vladsch.flexmark.formatter.NodeFormatterFactory
        public NodeFormatter create(DataHolder dataHolder) {
            return new TableNodeFormatter(dataHolder);
        }
    }

    public TableNodeFormatter(DataHolder dataHolder) {
        this.options = new TableFormatOptions(dataHolder);
        this.parserTrimCellWhiteSpace = TablesExtension.TRIM_CELL_WHITESPACE.get(dataHolder).booleanValue();
    }

    public static /* synthetic */ void lambda$render$0(TableCell tableCell, String[] strArr, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        nodeFormatterContext.renderChildren(tableCell);
        strArr[0] = markdownWriter.toString(-1, -1);
    }

    public void render(TableBlock tableBlock, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        this.myTable = new MarkdownTable(tableBlock.getChars(), this.options);
        int i6 = AnonymousClass1.$SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose[nodeFormatterContext.getRenderPurpose().ordinal()];
        if (i6 != 1 && i6 != 2 && i6 != 3) {
            nodeFormatterContext.renderChildren(tableBlock);
            TrackedOffsetList trackedOffsets = nodeFormatterContext.getTrackedOffsets();
            TrackedOffsetList trackedOffsets2 = trackedOffsets.getTrackedOffsets(tableBlock.getStartOffset(), tableBlock.getEndOffset());
            if (!trackedOffsets.isEmpty()) {
                Iterator<TrackedOffset> it = trackedOffsets2.iterator();
                while (it.hasNext()) {
                    this.myTable.addTrackedOffset(it.next());
                }
            }
            if (this.options.tableManipulator != TableManipulator.NULL) {
                this.myTable.normalize();
                this.options.tableManipulator.apply(this.myTable, tableBlock);
            }
            if (this.myTable.getMaxColumns() > 0) {
                markdownWriter.blankLine();
                this.myTable.setFormatTableIndentPrefix(markdownWriter.getPrefix());
                MarkdownWriter markdownWriter2 = new MarkdownWriter(markdownWriter.getOptions());
                this.myTable.appendTable(markdownWriter2);
                List<TrackedOffset> trackedOffsets3 = this.myTable.getTrackedOffsets();
                int offsetWithPending = markdownWriter.offsetWithPending();
                if (!trackedOffsets2.isEmpty()) {
                    for (TrackedOffset trackedOffset : trackedOffsets2) {
                        if (trackedOffset.isResolved()) {
                            trackedOffset.setIndex(trackedOffset.getIndex() + offsetWithPending);
                        }
                    }
                }
                int i7 = 0;
                markdownWriter.pushPrefix().setPrefix((CharSequence) FlexmarkHtmlConverter.DEFAULT_NODE, false).pushOptions().removeOptions(LineAppendable.F_WHITESPACE_REMOVAL).append(markdownWriter2).popOptions().popPrefix(false);
                markdownWriter.tailBlankLine();
                if (this.myTable.getMaxColumns() > 0 && !trackedOffsets2.isEmpty() && this.options.dumpIntellijOffsets) {
                    markdownWriter.append("\nTracked Offsets").line();
                    String str = "  ";
                    for (TrackedOffset trackedOffset2 : trackedOffsets3) {
                        i7++;
                        MarkdownWriter append = markdownWriter.append((CharSequence) str);
                        Locale locale = Locale.US;
                        append.append((CharSequence) (i7 + ":[" + trackedOffset2.getIndex() + "," + (trackedOffset2.getIndex() + 1) + "] was:[" + trackedOffset2.getOffset() + "," + (trackedOffset2.getOffset() + 1) + "]"));
                        str = SequenceUtils.SPACE;
                    }
                    markdownWriter.append(SequenceUtils.EOL);
                }
            }
        } else {
            markdownWriter.blankLine();
            nodeFormatterContext.renderChildren(tableBlock);
            markdownWriter.tailBlankLine();
        }
        this.myTable = null;
    }

    @Override // com.vladsch.flexmark.formatter.NodeFormatter
    public Set<Class<?>> getNodeClasses() {
        return null;
    }

    @Override // com.vladsch.flexmark.formatter.NodeFormatter
    public Set<NodeFormattingHandler<?>> getNodeFormattingHandlers() {
        final int i6 = 0;
        final int i7 = 1;
        final int i8 = 2;
        final int i9 = 3;
        final int i10 = 4;
        final int i11 = 5;
        final int i12 = 6;
        final int i13 = 7;
        return new HashSet(Arrays.asList(new NodeFormattingHandler(TableBlock.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.ext.tables.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TableNodeFormatter f11288b;

            {
                this.f11288b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i6) {
                    case 0:
                        this.f11288b.render((TableBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11288b.render((TableHead) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11288b.render((TableSeparator) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11288b.render((TableBody) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11288b.render((TableRow) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11288b.render((TableCell) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11288b.render((TableCaption) node, nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11288b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(TableHead.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.ext.tables.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TableNodeFormatter f11288b;

            {
                this.f11288b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i7) {
                    case 0:
                        this.f11288b.render((TableBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11288b.render((TableHead) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11288b.render((TableSeparator) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11288b.render((TableBody) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11288b.render((TableRow) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11288b.render((TableCell) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11288b.render((TableCaption) node, nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11288b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(TableSeparator.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.ext.tables.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TableNodeFormatter f11288b;

            {
                this.f11288b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i8) {
                    case 0:
                        this.f11288b.render((TableBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11288b.render((TableHead) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11288b.render((TableSeparator) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11288b.render((TableBody) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11288b.render((TableRow) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11288b.render((TableCell) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11288b.render((TableCaption) node, nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11288b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(TableBody.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.ext.tables.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TableNodeFormatter f11288b;

            {
                this.f11288b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i9) {
                    case 0:
                        this.f11288b.render((TableBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11288b.render((TableHead) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11288b.render((TableSeparator) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11288b.render((TableBody) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11288b.render((TableRow) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11288b.render((TableCell) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11288b.render((TableCaption) node, nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11288b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(TableRow.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.ext.tables.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TableNodeFormatter f11288b;

            {
                this.f11288b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i10) {
                    case 0:
                        this.f11288b.render((TableBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11288b.render((TableHead) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11288b.render((TableSeparator) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11288b.render((TableBody) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11288b.render((TableRow) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11288b.render((TableCell) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11288b.render((TableCaption) node, nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11288b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(TableCell.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.ext.tables.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TableNodeFormatter f11288b;

            {
                this.f11288b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i11) {
                    case 0:
                        this.f11288b.render((TableBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11288b.render((TableHead) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11288b.render((TableSeparator) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11288b.render((TableBody) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11288b.render((TableRow) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11288b.render((TableCell) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11288b.render((TableCaption) node, nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11288b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(TableCaption.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.ext.tables.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TableNodeFormatter f11288b;

            {
                this.f11288b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i12) {
                    case 0:
                        this.f11288b.render((TableBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11288b.render((TableHead) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11288b.render((TableSeparator) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11288b.render((TableBody) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11288b.render((TableRow) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11288b.render((TableCell) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11288b.render((TableCaption) node, nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11288b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(Text.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.ext.tables.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TableNodeFormatter f11288b;

            {
                this.f11288b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i13) {
                    case 0:
                        this.f11288b.render((TableBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11288b.render((TableHead) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11288b.render((TableSeparator) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11288b.render((TableBody) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11288b.render((TableRow) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11288b.render((TableCell) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11288b.render((TableCaption) node, nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11288b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        })));
    }

    public void render(TableHead tableHead, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        this.myTable.setSeparator(false);
        this.myTable.setHeader(true);
        nodeFormatterContext.renderChildren(tableHead);
    }

    public void render(TableSeparator tableSeparator, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        this.myTable.setSeparator(true);
        nodeFormatterContext.renderChildren(tableSeparator);
    }

    public void render(TableBody tableBody, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        this.myTable.setSeparator(false);
        this.myTable.setHeader(false);
        nodeFormatterContext.renderChildren(tableBody);
    }

    public void render(TableRow tableRow, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        nodeFormatterContext.renderChildren(tableRow);
        if (nodeFormatterContext.getRenderPurpose() == RenderPurpose.FORMAT) {
            if (this.myTable.isSeparator()) {
                return;
            }
            this.myTable.nextRow();
            return;
        }
        markdownWriter.line();
    }

    public void render(TableCaption tableCaption, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        if (nodeFormatterContext.getRenderPurpose() == RenderPurpose.FORMAT) {
            this.myTable.setCaptionWithMarkers(tableCaption, tableCaption.getOpeningMarker(), tableCaption.getText(), tableCaption.getClosingMarker());
            return;
        }
        String str = tableCaption.hasChildren() ? "dummy" : FlexmarkHtmlConverter.DEFAULT_NODE;
        if (MarkdownTable.formattedCaption(BasedSequence.of(str).subSequence(0, str.length()), this.options) != null) {
            markdownWriter.line().append((CharSequence) tableCaption.getOpeningMarker());
            nodeFormatterContext.renderChildren(tableCaption);
            markdownWriter.append((CharSequence) tableCaption.getClosingMarker()).line();
        }
    }

    public void render(TableCell tableCell, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        if (nodeFormatterContext.getRenderPurpose() == RenderPurpose.FORMAT) {
            BasedSequence text = tableCell.getText();
            if (this.options.trimCellWhitespace) {
                if (text.isBlank() && !text.isEmpty()) {
                    text = text.subSequence(0, 1);
                } else {
                    text = text.trim();
                }
            }
            this.myTable.addCell(new com.vladsch.flexmark.util.format.TableCell(tableCell, tableCell.getOpeningMarker(), text, tableCell.getClosingMarker(), 1, tableCell.getSpan(), tableCell.getAlignment() == null ? CellAlignment.NONE : tableCell.getAlignment().cellAlignment()));
            return;
        }
        if (tableCell.getPrevious() == null) {
            if (this.options.leadTrailPipes && tableCell.getOpeningMarker().isEmpty()) {
                markdownWriter.append(WikiNode.SEPARATOR_CHAR);
            } else {
                markdownWriter.append((CharSequence) tableCell.getOpeningMarker());
            }
        } else {
            markdownWriter.append((CharSequence) tableCell.getOpeningMarker());
        }
        if (!this.myTable.isSeparator() && this.options.spaceAroundPipes && (!tableCell.getText().startsWith(SequenceUtils.SPACE) || this.parserTrimCellWhiteSpace)) {
            markdownWriter.append(SequenceUtils.SPC);
        }
        String[] strArr = {FlexmarkHtmlConverter.DEFAULT_NODE};
        nodeFormatterContext.translatingSpan(new f1(tableCell, strArr));
        if (!this.myTable.isSeparator() && this.options.spaceAroundPipes && (!strArr[0].endsWith(SequenceUtils.SPACE) || this.parserTrimCellWhiteSpace)) {
            markdownWriter.append(SequenceUtils.SPC);
        }
        if (tableCell.getNext() == null) {
            if (this.options.leadTrailPipes && tableCell.getClosingMarker().isEmpty()) {
                markdownWriter.append(WikiNode.SEPARATOR_CHAR);
                return;
            } else {
                markdownWriter.append((CharSequence) tableCell.getClosingMarker());
                return;
            }
        }
        markdownWriter.append((CharSequence) tableCell.getClosingMarker());
    }

    public void render(Text text, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        MarkdownTable markdownTable = this.myTable;
        if (markdownTable != null && markdownTable.isSeparator()) {
            Node ancestorOfType = text.getAncestorOfType(Paragraph.class);
            if ((ancestorOfType instanceof Paragraph) && ((Paragraph) ancestorOfType).hasTableSeparator()) {
                markdownWriter.pushPrefix().addPrefix((CharSequence) SequenceUtils.SPACE).append((CharSequence) text.getChars()).popPrefix();
                return;
            } else {
                markdownWriter.append((CharSequence) text.getChars());
                return;
            }
        }
        markdownWriter.append((CharSequence) text.getChars());
    }
}
