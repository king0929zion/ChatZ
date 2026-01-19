package com.vladsch.flexmark.html2md.converter;

import com.vladsch.flexmark.util.dependency.Dependent;
import java.util.Set;
import java.util.function.Function;

/* loaded from: classes.dex */
public interface HtmlLinkResolverFactory extends Function<HtmlNodeConverterContext, HtmlLinkResolver>, Dependent {
    @Override // com.vladsch.flexmark.util.dependency.Dependent
    boolean affectsGlobalScope();

    @Override // java.util.function.Function
    HtmlLinkResolver apply(HtmlNodeConverterContext htmlNodeConverterContext);

    @Override // com.vladsch.flexmark.util.dependency.Dependent
    Set<Class<?>> getAfterDependents();

    @Override // com.vladsch.flexmark.util.dependency.Dependent
    Set<Class<?>> getBeforeDependents();
}
