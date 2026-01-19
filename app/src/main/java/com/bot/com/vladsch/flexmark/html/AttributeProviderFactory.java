package com.vladsch.flexmark.html;

import com.vladsch.flexmark.html.renderer.LinkResolverContext;
import com.vladsch.flexmark.util.dependency.Dependent;
import java.util.Set;
import java.util.function.Function;

/* loaded from: classes.dex */
public interface AttributeProviderFactory extends Function<LinkResolverContext, AttributeProvider>, Dependent {
    @Override // com.vladsch.flexmark.util.dependency.Dependent
    boolean affectsGlobalScope();

    @Override // java.util.function.Function
    AttributeProvider apply(LinkResolverContext linkResolverContext);

    @Override // com.vladsch.flexmark.util.dependency.Dependent
    Set<Class<?>> getAfterDependents();

    @Override // com.vladsch.flexmark.util.dependency.Dependent
    Set<Class<?>> getBeforeDependents();
}
