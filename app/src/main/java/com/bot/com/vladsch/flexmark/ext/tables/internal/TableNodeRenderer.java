package com.vladsch.flexmark.ext.tables.internal;

import N1.y;
import com.vladsch.flexmark.ext.tables.TableBlock;
import com.vladsch.flexmark.ext.tables.TableBody;
import com.vladsch.flexmark.ext.tables.TableCaption;
import com.vladsch.flexmark.ext.tables.TableCell;
import com.vladsch.flexmark.ext.tables.TableHead;
import com.vladsch.flexmark.ext.tables.TableRow;
import com.vladsch.flexmark.ext.tables.TableSeparator;
import com.vladsch.flexmark.html.HtmlWriter;
import com.vladsch.flexmark.html.renderer.NodeRenderer;
import com.vladsch.flexmark.html.renderer.NodeRendererContext;
import com.vladsch.flexmark.html.renderer.NodeRendererFactory;
import com.vladsch.flexmark.html.renderer.NodeRenderingHandler;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.html.Attribute;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public class TableNodeRenderer implements NodeRenderer {
    private final TableParserOptions options;

    /* renamed from: com.vladsch.flexmark.ext.tables.internal.TableNodeRenderer$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$vladsch$flexmark$ext$tables$TableCell$Alignment;

        static {
            int[] iArr = new int[TableCell.Alignment.values().length];
            $SwitchMap$com$vladsch$flexmark$ext$tables$TableCell$Alignment = iArr;
            try {
                iArr[TableCell.Alignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$ext$tables$TableCell$Alignment[TableCell.Alignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$ext$tables$TableCell$Alignment[TableCell.Alignment.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Factory implements NodeRendererFactory {
        @Override // com.vladsch.flexmark.html.renderer.NodeRendererFactory, java.util.function.Function
        public NodeRenderer apply(DataHolder dataHolder) {
            return new TableNodeRenderer(dataHolder);
        }
    }

    public TableNodeRenderer(DataHolder dataHolder) {
        this.options = new TableParserOptions(dataHolder);
    }

    private static String getAlignValue(TableCell.Alignment alignment) {
        int i6 = AnonymousClass1.$SwitchMap$com$vladsch$flexmark$ext$tables$TableCell$Alignment[alignment.ordinal()];
        if (i6 == 1) {
            return "left";
        }
        if (i6 == 2) {
            return "center";
        }
        if (i6 == 3) {
            return "right";
        }
        throw new IllegalStateException("Unknown alignment: " + alignment);
    }

    public void render(TableSeparator tableSeparator, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
    }

    @Override // com.vladsch.flexmark.html.renderer.NodeRenderer
    public Set<NodeRenderingHandler<?>> getNodeRenderingHandlers() {
        final int i6 = 0;
        final int i7 = 1;
        final int i8 = 2;
        final int i9 = 3;
        final int i10 = 4;
        final int i11 = 5;
        final int i12 = 6;
        return new HashSet(Arrays.asList(new NodeRenderingHandler(TableBlock.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.ext.tables.internal.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TableNodeRenderer f11289b;

            {
                this.f11289b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i6) {
                    case 0:
                        this.f11289b.render((TableBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11289b.render((TableHead) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11289b.render((TableSeparator) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11289b.render((TableBody) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11289b.render((TableRow) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11289b.render((TableCell) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11289b.render((TableCaption) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(TableHead.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.ext.tables.internal.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TableNodeRenderer f11289b;

            {
                this.f11289b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i7) {
                    case 0:
                        this.f11289b.render((TableBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11289b.render((TableHead) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11289b.render((TableSeparator) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11289b.render((TableBody) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11289b.render((TableRow) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11289b.render((TableCell) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11289b.render((TableCaption) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(TableSeparator.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.ext.tables.internal.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TableNodeRenderer f11289b;

            {
                this.f11289b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i8) {
                    case 0:
                        this.f11289b.render((TableBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11289b.render((TableHead) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11289b.render((TableSeparator) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11289b.render((TableBody) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11289b.render((TableRow) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11289b.render((TableCell) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11289b.render((TableCaption) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(TableBody.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.ext.tables.internal.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TableNodeRenderer f11289b;

            {
                this.f11289b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i9) {
                    case 0:
                        this.f11289b.render((TableBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11289b.render((TableHead) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11289b.render((TableSeparator) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11289b.render((TableBody) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11289b.render((TableRow) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11289b.render((TableCell) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11289b.render((TableCaption) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(TableRow.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.ext.tables.internal.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TableNodeRenderer f11289b;

            {
                this.f11289b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i10) {
                    case 0:
                        this.f11289b.render((TableBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11289b.render((TableHead) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11289b.render((TableSeparator) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11289b.render((TableBody) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11289b.render((TableRow) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11289b.render((TableCell) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11289b.render((TableCaption) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(TableCell.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.ext.tables.internal.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TableNodeRenderer f11289b;

            {
                this.f11289b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i11) {
                    case 0:
                        this.f11289b.render((TableBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11289b.render((TableHead) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11289b.render((TableSeparator) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11289b.render((TableBody) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11289b.render((TableRow) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11289b.render((TableCell) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11289b.render((TableCaption) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(TableCaption.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.ext.tables.internal.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TableNodeRenderer f11289b;

            {
                this.f11289b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i12) {
                    case 0:
                        this.f11289b.render((TableBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11289b.render((TableHead) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11289b.render((TableSeparator) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11289b.render((TableBody) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11289b.render((TableRow) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11289b.render((TableCell) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11289b.render((TableCaption) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        })));
    }

    public void render(TableBlock tableBlock, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        if (!this.options.className.isEmpty()) {
            htmlWriter.attr(Attribute.CLASS_ATTR, (CharSequence) this.options.className);
        }
        htmlWriter.srcPosWithEOL(tableBlock.getChars()).withAttr().tagLineIndent(FlexmarkHtmlConverter.TABLE_NODE, (Runnable) new y(6, nodeRendererContext, tableBlock)).line();
    }

    public void render(TableHead tableHead, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.withAttr().withCondIndent().tagLine((CharSequence) FlexmarkHtmlConverter.THEAD_NODE, (Runnable) new y(2, nodeRendererContext, tableHead));
    }

    public void render(TableBody tableBody, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.withAttr().withCondIndent().tagLine((CharSequence) FlexmarkHtmlConverter.TBODY_NODE, (Runnable) new y(3, nodeRendererContext, tableBody));
    }

    public void render(TableRow tableRow, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.srcPos(tableRow.getChars().trimStart()).withAttr().tagLine(FlexmarkHtmlConverter.TR_NODE, (Runnable) new y(4, nodeRendererContext, tableRow));
    }

    public void render(TableCaption tableCaption, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.srcPos(tableCaption.getChars().trimStart()).withAttr().tagLine(FlexmarkHtmlConverter.CAPTION_NODE, (Runnable) new y(5, nodeRendererContext, tableCaption));
    }

    public void render(TableCell tableCell, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        String str = tableCell.isHeader() ? FlexmarkHtmlConverter.TH_NODE : FlexmarkHtmlConverter.TD_NODE;
        if (tableCell.getAlignment() != null) {
            htmlWriter.attr("align", (CharSequence) getAlignValue(tableCell.getAlignment()));
        }
        if (this.options.columnSpans && tableCell.getSpan() > 1) {
            htmlWriter.attr("colspan", (CharSequence) String.valueOf(tableCell.getSpan()));
        }
        htmlWriter.srcPos(tableCell.getText()).withAttr().tag((CharSequence) str);
        nodeRendererContext.renderChildren(tableCell);
        htmlWriter.tag((CharSequence) "/".concat(str));
    }
}
