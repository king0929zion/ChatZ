package com.vladsch.flexmark.html;

import com.vladsch.flexmark.html.renderer.LinkResolverBasicContext;
import com.vladsch.flexmark.util.dependency.Dependent;
import java.util.Set;
import java.util.function.Function;

/* loaded from: classes.dex */
public interface LinkResolverFactory extends Function<LinkResolverBasicContext, LinkResolver>, Dependent {
    boolean affectsGlobalScope();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.function.Function
    LinkResolver apply(LinkResolverBasicContext linkResolverBasicContext);

    Set<Class<?>> getAfterDependents();

    Set<Class<?>> getBeforeDependents();
}
