package com.vladsch.flexmark.html;

import com.vladsch.flexmark.html.renderer.DelegatingNodeRendererFactory;
import com.vladsch.flexmark.html.renderer.NodeRenderer;
import com.vladsch.flexmark.html.renderer.NodeRendererFactory;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.dependency.Dependent;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class DelegatingNodeRendererFactoryWrapper implements Function<DataHolder, NodeRenderer>, Dependent, DelegatingNodeRendererFactory {
    private Set<Class<?>> myDelegates = null;
    private final NodeRendererFactory nodeRendererFactory;
    private List<DelegatingNodeRendererFactoryWrapper> nodeRenderers;

    public DelegatingNodeRendererFactoryWrapper(List<DelegatingNodeRendererFactoryWrapper> list, NodeRendererFactory nodeRendererFactory) {
        this.nodeRendererFactory = nodeRendererFactory;
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

    @Override // com.vladsch.flexmark.html.renderer.DelegatingNodeRendererFactory
    public Set<Class<?>> getDelegates() {
        NodeRendererFactory nodeRendererFactory = this.nodeRendererFactory;
        if (nodeRendererFactory instanceof DelegatingNodeRendererFactory) {
            return ((DelegatingNodeRendererFactory) nodeRendererFactory).getDelegates();
        }
        return null;
    }

    public NodeRendererFactory getFactory() {
        return this.nodeRendererFactory;
    }

    @Override // java.util.function.Function, com.vladsch.flexmark.html.renderer.NodeRendererFactory
    public NodeRenderer apply(DataHolder dataHolder) {
        return this.nodeRendererFactory.apply(dataHolder);
    }
}
