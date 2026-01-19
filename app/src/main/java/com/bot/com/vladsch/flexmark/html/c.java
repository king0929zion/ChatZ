package com.vladsch.flexmark.html;

import com.vladsch.flexmark.html.renderer.LinkResolverBasicContext;
import com.vladsch.flexmark.html.renderer.ResolvedContent;
import com.vladsch.flexmark.html.renderer.ResolvedLink;
import com.vladsch.flexmark.util.ast.Node;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements LinkResolver, UriContentResolver {
    @Override // com.vladsch.flexmark.html.UriContentResolver
    public ResolvedContent resolveContent(Node node, LinkResolverBasicContext linkResolverBasicContext, ResolvedContent resolvedContent) {
        ResolvedContent lambda$static$0;
        lambda$static$0 = UriContentResolver.lambda$static$0(node, linkResolverBasicContext, resolvedContent);
        return lambda$static$0;
    }

    @Override // com.vladsch.flexmark.html.LinkResolver
    public ResolvedLink resolveLink(Node node, LinkResolverBasicContext linkResolverBasicContext, ResolvedLink resolvedLink) {
        ResolvedLink lambda$static$0;
        lambda$static$0 = LinkResolver.lambda$static$0(node, linkResolverBasicContext, resolvedLink);
        return lambda$static$0;
    }
}
