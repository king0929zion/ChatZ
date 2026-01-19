package com.vladsch.flexmark.html;

import com.vladsch.flexmark.html.renderer.LinkResolverBasicContext;
import com.vladsch.flexmark.html.renderer.ResolvedLink;
import com.vladsch.flexmark.util.ast.Node;

/* loaded from: classes.dex */
public interface LinkResolver {
    public static final LinkResolver NULL = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ ResolvedLink lambda$static$0(Node node, LinkResolverBasicContext linkResolverBasicContext, ResolvedLink resolvedLink) {
        return resolvedLink;
    }

    ResolvedLink resolveLink(Node node, LinkResolverBasicContext linkResolverBasicContext, ResolvedLink resolvedLink);
}
