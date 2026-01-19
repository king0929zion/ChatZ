package com.vladsch.flexmark.ext.wikilink.internal;

import com.vladsch.flexmark.ext.wikilink.WikiImage;
import com.vladsch.flexmark.ext.wikilink.WikiLinkExtension;
import com.vladsch.flexmark.html.LinkResolver;
import com.vladsch.flexmark.html.LinkResolverFactory;
import com.vladsch.flexmark.html.renderer.LinkResolverBasicContext;
import com.vladsch.flexmark.html.renderer.LinkStatus;
import com.vladsch.flexmark.html.renderer.LinkType;
import com.vladsch.flexmark.html.renderer.ResolvedLink;
import com.vladsch.flexmark.util.ast.Node;
import java.util.Set;

/* loaded from: classes.dex */
public class WikiLinkLinkResolver implements LinkResolver {
    private final WikiLinkOptions options;

    /* loaded from: classes.dex */
    public static class Factory implements LinkResolverFactory {
        @Override // com.vladsch.flexmark.html.LinkResolverFactory, com.vladsch.flexmark.util.dependency.Dependent
        public boolean affectsGlobalScope() {
            return false;
        }

        @Override // com.vladsch.flexmark.html.LinkResolverFactory, com.vladsch.flexmark.util.dependency.Dependent
        public Set<Class<?>> getAfterDependents() {
            return null;
        }

        @Override // com.vladsch.flexmark.html.LinkResolverFactory, com.vladsch.flexmark.util.dependency.Dependent
        public Set<Class<?>> getBeforeDependents() {
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vladsch.flexmark.html.LinkResolverFactory, java.util.function.Function
        public LinkResolver apply(LinkResolverBasicContext linkResolverBasicContext) {
            return new WikiLinkLinkResolver(linkResolverBasicContext);
        }
    }

    public WikiLinkLinkResolver(LinkResolverBasicContext linkResolverBasicContext) {
        this.options = new WikiLinkOptions(linkResolverBasicContext.getOptions());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vladsch.flexmark.html.LinkResolver
    public ResolvedLink resolveLink(Node node, LinkResolverBasicContext linkResolverBasicContext, ResolvedLink resolvedLink) {
        if (resolvedLink.getLinkType() != WikiLinkExtension.WIKI_LINK) {
            return resolvedLink;
        }
        StringBuilder sb = new StringBuilder();
        boolean z5 = node instanceof WikiImage;
        String url = resolvedLink.getUrl();
        int length = url.length();
        boolean z6 = (length <= 0 || url.charAt(0) != '/') ? 0 : 1;
        WikiLinkOptions wikiLinkOptions = this.options;
        sb.append(z5 ? wikiLinkOptions.getImagePrefix(z6) : wikiLinkOptions.getLinkPrefix(z6));
        WikiLinkOptions wikiLinkOptions2 = this.options;
        String str = wikiLinkOptions2.linkEscapeChars;
        String str2 = wikiLinkOptions2.linkReplaceChars;
        boolean z7 = false;
        boolean z8 = false;
        for (int i6 = z6; i6 < length; i6++) {
            char charAt = url.charAt(i6);
            if (charAt == '#' && !z8) {
                WikiLinkOptions wikiLinkOptions3 = this.options;
                if (wikiLinkOptions3.allowAnchors && (!z7 || !wikiLinkOptions3.allowAnchorEscape)) {
                    sb.append(z5 ? wikiLinkOptions3.imageFileExtension : wikiLinkOptions3.linkFileExtension);
                    sb.append(charAt);
                    z7 = false;
                    z8 = true;
                }
            }
            if (charAt == '\\') {
                if (z7) {
                    sb.append("%5C");
                }
                z7 = !z7;
            } else {
                if (charAt != '#' || z8) {
                    int indexOf = str.indexOf(charAt);
                    if (indexOf < 0) {
                        sb.append(charAt);
                    } else {
                        sb.append(str2.charAt(indexOf));
                    }
                } else {
                    sb.append("%23");
                }
                z7 = false;
            }
        }
        if (z7) {
            sb.append("%5C");
        }
        if (!z8) {
            WikiLinkOptions wikiLinkOptions4 = this.options;
            sb.append(z5 ? wikiLinkOptions4.imageFileExtension : wikiLinkOptions4.linkFileExtension);
        }
        return z5 ? new ResolvedLink(LinkType.IMAGE, sb.toString(), null, LinkStatus.UNCHECKED) : new ResolvedLink(LinkType.LINK, sb.toString(), null, LinkStatus.UNCHECKED);
    }
}
