package com.vladsch.flexmark.ext.superscript.internal;

import com.vladsch.flexmark.ext.emoji.internal.a;
import com.vladsch.flexmark.ext.superscript.Superscript;
import com.vladsch.flexmark.html.HtmlWriter;
import com.vladsch.flexmark.html.renderer.NodeRenderer;
import com.vladsch.flexmark.html.renderer.NodeRendererContext;
import com.vladsch.flexmark.html.renderer.NodeRendererFactory;
import com.vladsch.flexmark.html.renderer.NodeRenderingHandler;
import com.vladsch.flexmark.util.data.DataHolder;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class SuperscriptJiraRenderer implements NodeRenderer {

    /* loaded from: classes.dex */
    public static class Factory implements NodeRendererFactory {
        @Override // com.vladsch.flexmark.html.renderer.NodeRendererFactory, java.util.function.Function
        public NodeRenderer apply(DataHolder dataHolder) {
            return new SuperscriptJiraRenderer(dataHolder);
        }
    }

    public SuperscriptJiraRenderer(DataHolder dataHolder) {
    }

    public void render(Superscript superscript, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.raw("^");
        nodeRendererContext.renderChildren(superscript);
        htmlWriter.raw("^");
    }

    @Override // com.vladsch.flexmark.html.renderer.NodeRenderer
    public Set<NodeRenderingHandler<?>> getNodeRenderingHandlers() {
        HashSet hashSet = new HashSet();
        hashSet.add(new NodeRenderingHandler(Superscript.class, new a(this, 5)));
        return hashSet;
    }
}
