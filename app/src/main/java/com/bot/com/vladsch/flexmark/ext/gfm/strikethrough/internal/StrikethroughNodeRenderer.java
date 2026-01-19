package com.vladsch.flexmark.ext.gfm.strikethrough.internal;

import com.vladsch.flexmark.ext.gfm.strikethrough.Strikethrough;
import com.vladsch.flexmark.ext.gfm.strikethrough.StrikethroughSubscriptExtension;
import com.vladsch.flexmark.ext.gfm.strikethrough.Subscript;
import com.vladsch.flexmark.ext.gfm.strikethrough.internal.StrikethroughNodeRenderer;
import com.vladsch.flexmark.html.HtmlWriter;
import com.vladsch.flexmark.html.renderer.NodeRenderer;
import com.vladsch.flexmark.html.renderer.NodeRendererContext;
import com.vladsch.flexmark.html.renderer.NodeRendererFactory;
import com.vladsch.flexmark.html.renderer.NodeRenderingHandler;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.data.DataHolder;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class StrikethroughNodeRenderer implements NodeRenderer {
    private final String strikethroughStyleHtmlClose;
    private final String strikethroughStyleHtmlOpen;
    private final String subscriptStyleHtmlClose;
    private final String subscriptStyleHtmlOpen;

    /* loaded from: classes.dex */
    public static class Factory implements NodeRendererFactory {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vladsch.flexmark.html.renderer.NodeRendererFactory, java.util.function.Function
        public NodeRenderer apply(DataHolder dataHolder) {
            return new StrikethroughNodeRenderer(dataHolder);
        }
    }

    public StrikethroughNodeRenderer(DataHolder dataHolder) {
        this.strikethroughStyleHtmlOpen = StrikethroughSubscriptExtension.STRIKETHROUGH_STYLE_HTML_OPEN.get(dataHolder);
        this.strikethroughStyleHtmlClose = StrikethroughSubscriptExtension.STRIKETHROUGH_STYLE_HTML_CLOSE.get(dataHolder);
        this.subscriptStyleHtmlOpen = StrikethroughSubscriptExtension.SUBSCRIPT_STYLE_HTML_OPEN.get(dataHolder);
        this.subscriptStyleHtmlClose = StrikethroughSubscriptExtension.SUBSCRIPT_STYLE_HTML_CLOSE.get(dataHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(Strikethrough strikethrough, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        String str = this.strikethroughStyleHtmlOpen;
        if (str != null && this.strikethroughStyleHtmlClose != null) {
            htmlWriter.raw((CharSequence) str);
            nodeRendererContext.renderChildren(strikethrough);
            htmlWriter.raw((CharSequence) this.strikethroughStyleHtmlClose);
        } else {
            if (nodeRendererContext.getHtmlOptions().sourcePositionParagraphLines) {
                htmlWriter.withAttr().tag(FlexmarkHtmlConverter.DEL_NODE);
            } else {
                htmlWriter.srcPos(strikethrough.getText()).withAttr().tag(FlexmarkHtmlConverter.DEL_NODE);
            }
            nodeRendererContext.renderChildren(strikethrough);
            htmlWriter.tag("/del");
        }
    }

    @Override // com.vladsch.flexmark.html.renderer.NodeRenderer
    public Set<NodeRenderingHandler<?>> getNodeRenderingHandlers() {
        HashSet hashSet = new HashSet();
        final int i6 = 0;
        hashSet.add(new NodeRenderingHandler(Strikethrough.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: f3.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StrikethroughNodeRenderer f11760b;

            {
                this.f11760b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i6) {
                    case 0:
                        this.f11760b.render((Strikethrough) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11760b.render((Subscript) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }));
        final int i7 = 1;
        hashSet.add(new NodeRenderingHandler(Subscript.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: f3.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StrikethroughNodeRenderer f11760b;

            {
                this.f11760b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i7) {
                    case 0:
                        this.f11760b.render((Strikethrough) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11760b.render((Subscript) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }));
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(Subscript subscript, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        String str = this.subscriptStyleHtmlOpen;
        if (str != null && this.subscriptStyleHtmlClose != null) {
            htmlWriter.raw((CharSequence) str);
            nodeRendererContext.renderChildren(subscript);
            htmlWriter.raw((CharSequence) this.subscriptStyleHtmlClose);
        } else {
            if (nodeRendererContext.getHtmlOptions().sourcePositionParagraphLines) {
                htmlWriter.withAttr().tag(FlexmarkHtmlConverter.SUB_NODE);
            } else {
                htmlWriter.srcPos(subscript.getText()).withAttr().tag(FlexmarkHtmlConverter.SUB_NODE);
            }
            nodeRendererContext.renderChildren(subscript);
            htmlWriter.tag("/sub");
        }
    }
}
