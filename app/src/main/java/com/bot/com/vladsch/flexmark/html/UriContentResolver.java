package com.vladsch.flexmark.html;

import com.vladsch.flexmark.html.renderer.LinkResolverBasicContext;
import com.vladsch.flexmark.html.renderer.ResolvedContent;
import com.vladsch.flexmark.util.ast.Node;

/* loaded from: classes.dex */
public interface UriContentResolver {
    public static final UriContentResolver NULL = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ ResolvedContent lambda$static$0(Node node, LinkResolverBasicContext linkResolverBasicContext, ResolvedContent resolvedContent) {
        return resolvedContent;
    }

    ResolvedContent resolveContent(Node node, LinkResolverBasicContext linkResolverBasicContext, ResolvedContent resolvedContent);
}
