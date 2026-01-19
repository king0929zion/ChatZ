package com.vladsch.flexmark.formatter.internal;

import com.vladsch.flexmark.ast.Image;
import com.vladsch.flexmark.ast.Link;
import com.vladsch.flexmark.ast.Reference;
import com.vladsch.flexmark.formatter.Formatter;
import com.vladsch.flexmark.html.LinkResolver;
import com.vladsch.flexmark.html.LinkResolverFactory;
import com.vladsch.flexmark.html.renderer.LinkResolverBasicContext;
import com.vladsch.flexmark.html.renderer.LinkStatus;
import com.vladsch.flexmark.html.renderer.ResolvedLink;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.misc.Utils;
import j1.AbstractC1135a;
import java.util.Set;

/* loaded from: classes.dex */
public class MergeLinkResolver implements LinkResolver {
    private final String docRelativeURL;
    private final String docRootURL;
    private final String[] relativeParts;

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
            return new MergeLinkResolver(linkResolverBasicContext);
        }
    }

    public MergeLinkResolver(LinkResolverBasicContext linkResolverBasicContext) {
        String str = Formatter.DOC_RELATIVE_URL.get(linkResolverBasicContext.getOptions());
        String str2 = Formatter.DOC_ROOT_URL.get(linkResolverBasicContext.getOptions());
        this.docRelativeURL = str;
        this.docRootURL = str2;
        this.relativeParts = Utils.removePrefix(str, '/').split("/");
    }

    @Override // com.vladsch.flexmark.html.LinkResolver
    public ResolvedLink resolveLink(Node node, LinkResolverBasicContext linkResolverBasicContext, ResolvedLink resolvedLink) {
        String str;
        if ((node instanceof Image) || (node instanceof Link) || (node instanceof Reference)) {
            String url = resolvedLink.getUrl();
            if (this.docRelativeURL.isEmpty() && this.docRootURL.isEmpty()) {
                return resolvedLink.withStatus(LinkStatus.VALID).withUrl(url);
            }
            if (url.startsWith("http://") || url.startsWith("https://") || url.startsWith("ftp://") || url.startsWith("sftp://")) {
                return resolvedLink.withStatus(LinkStatus.VALID).withUrl(url);
            }
            if (url.startsWith("file:/")) {
                return resolvedLink.withStatus(LinkStatus.VALID).withUrl(url);
            }
            boolean startsWith = url.startsWith("/");
            String str2 = FlexmarkHtmlConverter.DEFAULT_NODE;
            if (startsWith) {
                String str3 = this.docRootURL;
                if (str3 != null && !str3.isEmpty()) {
                    return resolvedLink.withStatus(LinkStatus.VALID).withUrl(AbstractC1135a.g(this.docRootURL.startsWith("/") ? FlexmarkHtmlConverter.DEFAULT_NODE : "/", this.docRootURL, url));
                }
            } else if (!url.matches("^(?:[a-z]+:|#|\\?)")) {
                int indexOf = url.indexOf(35);
                if (indexOf == 0) {
                    return resolvedLink.withStatus(LinkStatus.VALID);
                }
                int i6 = 0;
                if (indexOf > 0) {
                    str = url.substring(indexOf);
                    url = url.substring(0, indexOf);
                } else if (url.contains("?")) {
                    int indexOf2 = url.indexOf("?");
                    str = url.substring(indexOf2);
                    url = url.substring(0, indexOf2);
                } else {
                    str = FlexmarkHtmlConverter.DEFAULT_NODE;
                }
                String[] split = url.split("/");
                int length = this.relativeParts.length;
                StringBuilder sb = new StringBuilder();
                String str4 = FlexmarkHtmlConverter.DEFAULT_NODE;
                for (String str5 : split) {
                    if (!str5.equals(".")) {
                        if (!str5.equals("..")) {
                            sb.append(str4);
                            sb.append(str5);
                            str4 = "/";
                        } else {
                            if (length == 0) {
                                return resolvedLink;
                            }
                            length--;
                        }
                    }
                }
                if (this.docRelativeURL.startsWith("/")) {
                    str2 = "/";
                }
                StringBuilder sb2 = new StringBuilder();
                while (i6 < length) {
                    sb2.append(str2);
                    sb2.append(this.relativeParts[i6]);
                    i6++;
                    str2 = "/";
                }
                sb2.append('/');
                sb2.append((CharSequence) sb);
                sb2.append(str);
                return resolvedLink.withStatus(LinkStatus.VALID).withUrl(sb2.toString());
            }
        }
        return resolvedLink;
    }
}
