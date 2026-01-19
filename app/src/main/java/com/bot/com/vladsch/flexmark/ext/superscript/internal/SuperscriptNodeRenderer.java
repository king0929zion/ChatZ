package com.vladsch.flexmark.ext.superscript.internal;

import com.vladsch.flexmark.ext.emoji.internal.a;
import com.vladsch.flexmark.ext.superscript.Superscript;
import com.vladsch.flexmark.ext.superscript.SuperscriptExtension;
import com.vladsch.flexmark.html.HtmlWriter;
import com.vladsch.flexmark.html.renderer.NodeRenderer;
import com.vladsch.flexmark.html.renderer.NodeRendererContext;
import com.vladsch.flexmark.html.renderer.NodeRendererFactory;
import com.vladsch.flexmark.html.renderer.NodeRenderingHandler;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.data.DataHolder;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class SuperscriptNodeRenderer implements NodeRenderer {
    private final String superscriptStyleHtmlClose;
    private final String superscriptStyleHtmlOpen;

    /* loaded from: classes.dex */
    public static class Factory implements NodeRendererFactory {
        @Override // com.vladsch.flexmark.html.renderer.NodeRendererFactory, java.util.function.Function
        public NodeRenderer apply(DataHolder dataHolder) {
            return new SuperscriptNodeRenderer(dataHolder);
        }
    }

    public SuperscriptNodeRenderer(DataHolder dataHolder) {
        this.superscriptStyleHtmlOpen = SuperscriptExtension.SUPERSCRIPT_STYLE_HTML_OPEN.get(dataHolder);
        this.superscriptStyleHtmlClose = SuperscriptExtension.SUPERSCRIPT_STYLE_HTML_CLOSE.get(dataHolder);
    }

    public void render(Superscript superscript, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        String str = this.superscriptStyleHtmlOpen;
        if (str != null && this.superscriptStyleHtmlClose != null) {
            htmlWriter.raw((CharSequence) str);
            nodeRendererContext.renderChildren(superscript);
            htmlWriter.raw((CharSequence) this.superscriptStyleHtmlClose);
        } else {
            if (nodeRendererContext.getHtmlOptions().sourcePositionParagraphLines) {
                htmlWriter.withAttr().tag(FlexmarkHtmlConverter.SUP_NODE);
            } else {
                htmlWriter.srcPos(superscript.getText()).withAttr().tag(FlexmarkHtmlConverter.SUP_NODE);
            }
            nodeRendererContext.renderChildren(superscript);
            htmlWriter.tag("/sup");
        }
    }

    @Override // com.vladsch.flexmark.html.renderer.NodeRenderer
    public Set<NodeRenderingHandler<?>> getNodeRenderingHandlers() {
        HashSet hashSet = new HashSet();
        hashSet.add(new NodeRenderingHandler(Superscript.class, new a(this, 6)));
        return hashSet;
    }
}
