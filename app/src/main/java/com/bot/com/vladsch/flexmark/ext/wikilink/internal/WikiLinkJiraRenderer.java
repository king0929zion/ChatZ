package com.vladsch.flexmark.ext.wikilink.internal;

import com.vladsch.flexmark.ext.wikilink.WikiLink;
import com.vladsch.flexmark.ext.wikilink.WikiLinkExtension;
import com.vladsch.flexmark.html.HtmlWriter;
import com.vladsch.flexmark.html.renderer.NodeRenderer;
import com.vladsch.flexmark.html.renderer.NodeRendererContext;
import com.vladsch.flexmark.html.renderer.NodeRendererFactory;
import com.vladsch.flexmark.html.renderer.NodeRenderingHandler;
import com.vladsch.flexmark.html.renderer.ResolvedLink;
import com.vladsch.flexmark.util.data.DataHolder;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class WikiLinkJiraRenderer implements NodeRenderer {
    private final WikiLinkOptions options;

    /* loaded from: classes.dex */
    public static class Factory implements NodeRendererFactory {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vladsch.flexmark.html.renderer.NodeRendererFactory, java.util.function.Function
        public NodeRenderer apply(DataHolder dataHolder) {
            return new WikiLinkJiraRenderer(dataHolder);
        }
    }

    public WikiLinkJiraRenderer(DataHolder dataHolder) {
        this.options = new WikiLinkOptions(dataHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(WikiLink wikiLink, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        if (this.options.disableRendering) {
            htmlWriter.text((CharSequence) wikiLink.getChars().unescape());
            return;
        }
        ResolvedLink resolveLink = nodeRendererContext.resolveLink(WikiLinkExtension.WIKI_LINK, wikiLink.getLink().toString(), null);
        htmlWriter.raw("[");
        htmlWriter.raw((CharSequence) (wikiLink.getText().isNotNull() ? wikiLink.getText() : wikiLink.getPageRef()).toString());
        htmlWriter.raw("|");
        htmlWriter.raw((CharSequence) resolveLink.getUrl());
        htmlWriter.raw("]");
    }

    @Override // com.vladsch.flexmark.html.renderer.NodeRenderer
    public Set<NodeRenderingHandler<?>> getNodeRenderingHandlers() {
        HashSet hashSet = new HashSet();
        hashSet.add(new NodeRenderingHandler(WikiLink.class, new com.vladsch.flexmark.ext.emoji.internal.a(this, 2)));
        return hashSet;
    }
}
