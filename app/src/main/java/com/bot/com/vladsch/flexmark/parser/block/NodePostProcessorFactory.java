package com.vladsch.flexmark.parser.block;

import com.vladsch.flexmark.parser.PostProcessorFactory;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class NodePostProcessorFactory implements PostProcessorFactory {
    private final HashMap<Class<?>, Set<Class<?>>> NODE_MAP = new HashMap<>();

    public NodePostProcessorFactory(boolean z5) {
    }

    public final void addNodeWithExclusions(Class<? extends Node> cls, Class<?>... clsArr) {
        if (clsArr.length > 0) {
            this.NODE_MAP.put(cls, new HashSet(Arrays.asList(clsArr)));
        } else {
            addNodes(cls);
        }
    }

    public final void addNodes(Class<?>... clsArr) {
        for (Class<?> cls : clsArr) {
            this.NODE_MAP.put(cls, Collections.EMPTY_SET);
        }
    }

    @Override // com.vladsch.flexmark.util.dependency.Dependent
    public final boolean affectsGlobalScope() {
        return false;
    }

    @Override // com.vladsch.flexmark.parser.PostProcessorFactory, java.util.function.Function
    public abstract NodePostProcessor apply(Document document);

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
        return this.NODE_MAP;
    }
}
