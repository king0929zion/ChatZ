package com.vladsch.flexmark.parser.block;

import com.vladsch.flexmark.parser.PostProcessorFactory;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class DocumentPostProcessorFactory implements PostProcessorFactory {
    @Override // com.vladsch.flexmark.util.dependency.Dependent
    public final boolean affectsGlobalScope() {
        return true;
    }

    @Override // com.vladsch.flexmark.util.dependency.Dependent
    public Set<Class<?>> getAfterDependents() {
        return null;
    }

    @Override // com.vladsch.flexmark.util.dependency.Dependent
    public Set<Class<?>> getBeforeDependents() {
        return null;
    }

    @Override // com.vladsch.flexmark.parser.PostProcessorFactory
    public final Map<Class<?>, Set<Class<?>>> getNodeTypes() {
        return null;
    }
}
