package com.vladsch.flexmark.html2md.converter;

import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.dependency.Dependent;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class DelegatingNodeRendererFactoryWrapper implements Function<DataHolder, HtmlNodeRenderer>, Dependent, DelegatingNodeRendererFactory {
    private Set<Class<?>> myDelegates = null;
    private final HtmlNodeRendererFactory nodeRendererFactory;
    private List<DelegatingNodeRendererFactoryWrapper> nodeRenderers;

    public DelegatingNodeRendererFactoryWrapper(List<DelegatingNodeRendererFactoryWrapper> list, HtmlNodeRendererFactory htmlNodeRendererFactory) {
        this.nodeRendererFactory = htmlNodeRendererFactory;
        this.nodeRenderers = list;
    }

    @Override // com.vladsch.flexmark.util.dependency.Dependent
    public final boolean affectsGlobalScope() {
        return false;
    }

    @Override // com.vladsch.flexmark.util.dependency.Dependent
    public final Set<Class<?>> getAfterDependents() {
        return null;
    }

    @Override // com.vladsch.flexmark.util.dependency.Dependent
    public Set<Class<?>> getBeforeDependents() {
        if (this.myDelegates == null && this.nodeRenderers != null) {
            Set<Class<?>> delegates = getDelegates();
            if (delegates != null) {
                this.myDelegates = new HashSet();
                for (DelegatingNodeRendererFactoryWrapper delegatingNodeRendererFactoryWrapper : this.nodeRenderers) {
                    if (delegates.contains(delegatingNodeRendererFactoryWrapper.getFactory().getClass())) {
                        this.myDelegates.add(delegatingNodeRendererFactoryWrapper.getFactory().getClass());
                    }
                }
            }
            this.nodeRenderers = null;
        }
        return this.myDelegates;
    }

    @Override // com.vladsch.flexmark.html2md.converter.DelegatingNodeRendererFactory
    public Set<Class<?>> getDelegates() {
        HtmlNodeRendererFactory htmlNodeRendererFactory = this.nodeRendererFactory;
        if (htmlNodeRendererFactory instanceof DelegatingNodeRendererFactory) {
            return ((DelegatingNodeRendererFactory) htmlNodeRendererFactory).getDelegates();
        }
        return null;
    }

    public HtmlNodeRendererFactory getFactory() {
        return this.nodeRendererFactory;
    }

    @Override // java.util.function.Function, com.vladsch.flexmark.html2md.converter.HtmlNodeRendererFactory
    public HtmlNodeRenderer apply(DataHolder dataHolder) {
        return this.nodeRendererFactory.apply(dataHolder);
    }
}
