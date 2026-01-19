package com.vladsch.flexmark.ext.ins.internal;

import com.vladsch.flexmark.ext.emoji.internal.a;
import com.vladsch.flexmark.ext.ins.Ins;
import com.vladsch.flexmark.html.HtmlWriter;
import com.vladsch.flexmark.html.renderer.NodeRenderer;
import com.vladsch.flexmark.html.renderer.NodeRendererContext;
import com.vladsch.flexmark.html.renderer.NodeRendererFactory;
import com.vladsch.flexmark.html.renderer.NodeRenderingHandler;
import com.vladsch.flexmark.util.data.DataHolder;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class InsJiraRenderer implements NodeRenderer {

    /* loaded from: classes.dex */
    public static class Factory implements NodeRendererFactory {
        @Override // com.vladsch.flexmark.html.renderer.NodeRendererFactory, java.util.function.Function
        public NodeRenderer apply(DataHolder dataHolder) {
            return new InsJiraRenderer(dataHolder);
        }
    }

    public InsJiraRenderer(DataHolder dataHolder) {
    }

    public void render(Ins ins, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.raw("+");
        nodeRendererContext.renderChildren(ins);
        htmlWriter.raw("+");
    }

    @Override // com.vladsch.flexmark.html.renderer.NodeRenderer
    public Set<NodeRenderingHandler<?>> getNodeRenderingHandlers() {
        HashSet hashSet = new HashSet();
        hashSet.add(new NodeRenderingHandler(Ins.class, new a(this, 3)));
        return hashSet;
    }
}
