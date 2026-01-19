package com.vladsch.flexmark.ext.wikilink.internal;

import com.vladsch.flexmark.ext.wikilink.WikiImage;
import com.vladsch.flexmark.ext.wikilink.WikiLink;
import com.vladsch.flexmark.ext.wikilink.WikiLinkExtension;
import com.vladsch.flexmark.html.HtmlWriter;
import com.vladsch.flexmark.html.renderer.NodeRenderer;
import com.vladsch.flexmark.html.renderer.NodeRendererContext;
import com.vladsch.flexmark.html.renderer.NodeRendererFactory;
import com.vladsch.flexmark.html.renderer.NodeRenderingHandler;
import com.vladsch.flexmark.html.renderer.ResolvedLink;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.data.DataHolder;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class WikiLinkNodeRenderer implements NodeRenderer {
    private final WikiLinkOptions options;

    /* loaded from: classes.dex */
    public static class Factory implements NodeRendererFactory {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vladsch.flexmark.html.renderer.NodeRendererFactory, java.util.function.Function
        public NodeRenderer apply(DataHolder dataHolder) {
            return new WikiLinkNodeRenderer(dataHolder);
        }
    }

    public WikiLinkNodeRenderer(DataHolder dataHolder) {
        this.options = new WikiLinkOptions(dataHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(WikiLink wikiLink, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        if (nodeRendererContext.isDoNotRenderLinks()) {
            return;
        }
        if (this.options.disableRendering) {
            htmlWriter.text((CharSequence) wikiLink.getChars().unescape());
            return;
        }
        ResolvedLink resolveLink = nodeRendererContext.resolveLink(WikiLinkExtension.WIKI_LINK, wikiLink.getLink(), null);
        htmlWriter.attr("href", (CharSequence) resolveLink.getUrl());
        htmlWriter.srcPos(wikiLink.getChars()).withAttr(resolveLink).tag(FlexmarkHtmlConverter.A_NODE);
        nodeRendererContext.renderChildren(wikiLink);
        htmlWriter.tag("/a");
    }

    @Override // com.vladsch.flexmark.html.renderer.NodeRenderer
    public Set<NodeRenderingHandler<?>> getNodeRenderingHandlers() {
        HashSet hashSet = new HashSet();
        final int i6 = 0;
        hashSet.add(new NodeRenderingHandler(WikiLink.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.ext.wikilink.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WikiLinkNodeRenderer f11291b;

            {
                this.f11291b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i6) {
                    case 0:
                        this.f11291b.render((WikiLink) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11291b.render((WikiImage) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }));
        final int i7 = 1;
        hashSet.add(new NodeRenderingHandler(WikiImage.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.ext.wikilink.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WikiLinkNodeRenderer f11291b;

            {
                this.f11291b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i7) {
                    case 0:
                        this.f11291b.render((WikiLink) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11291b.render((WikiImage) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }));
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(WikiImage wikiImage, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        if (nodeRendererContext.isDoNotRenderLinks()) {
            return;
        }
        if (this.options.disableRendering) {
            htmlWriter.text((CharSequence) wikiImage.getChars().unescape());
            return;
        }
        String obj = wikiImage.getText().isNotNull() ? wikiImage.getText().toString() : wikiImage.getLink().unescape();
        ResolvedLink resolveLink = nodeRendererContext.resolveLink(WikiLinkExtension.WIKI_LINK, wikiImage.getLink(), null);
        htmlWriter.attr("src", (CharSequence) resolveLink.getUrl());
        htmlWriter.attr("alt", (CharSequence) obj);
        htmlWriter.srcPos(wikiImage.getChars()).withAttr(resolveLink).tagVoid(FlexmarkHtmlConverter.IMG_NODE);
    }
}
