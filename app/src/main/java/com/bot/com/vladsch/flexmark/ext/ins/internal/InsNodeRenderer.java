package com.vladsch.flexmark.ext.ins.internal;

import com.vladsch.flexmark.ext.emoji.internal.a;
import com.vladsch.flexmark.ext.ins.Ins;
import com.vladsch.flexmark.ext.ins.InsExtension;
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
public class InsNodeRenderer implements NodeRenderer {
    private final String insStyleHtmlClose;
    private final String insStyleHtmlOpen;

    /* loaded from: classes.dex */
    public static class Factory implements NodeRendererFactory {
        @Override // com.vladsch.flexmark.html.renderer.NodeRendererFactory, java.util.function.Function
        public NodeRenderer apply(DataHolder dataHolder) {
            return new InsNodeRenderer(dataHolder);
        }
    }

    public InsNodeRenderer(DataHolder dataHolder) {
        this.insStyleHtmlOpen = InsExtension.INS_STYLE_HTML_OPEN.get(dataHolder);
        this.insStyleHtmlClose = InsExtension.INS_STYLE_HTML_CLOSE.get(dataHolder);
    }

    public void render(Ins ins, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        String str = this.insStyleHtmlOpen;
        if (str != null && this.insStyleHtmlClose != null) {
            htmlWriter.raw((CharSequence) str);
            nodeRendererContext.renderChildren(ins);
            htmlWriter.raw((CharSequence) this.insStyleHtmlClose);
        } else {
            if (nodeRendererContext.getHtmlOptions().sourcePositionParagraphLines) {
                htmlWriter.withAttr().tag(FlexmarkHtmlConverter.INS_NODE);
            } else {
                htmlWriter.srcPos(ins.getText()).withAttr().tag(FlexmarkHtmlConverter.INS_NODE);
            }
            nodeRendererContext.renderChildren(ins);
            htmlWriter.tag("/ins");
        }
    }

    @Override // com.vladsch.flexmark.html.renderer.NodeRenderer
    public Set<NodeRenderingHandler<?>> getNodeRenderingHandlers() {
        HashSet hashSet = new HashSet();
        hashSet.add(new NodeRenderingHandler(Ins.class, new a(this, 4)));
        return hashSet;
    }
}
