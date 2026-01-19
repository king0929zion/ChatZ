package com.vladsch.flexmark.formatter;

import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.dependency.Dependent;
import java.util.Set;

/* loaded from: classes.dex */
public interface NodeFormatterFactory extends Dependent {
    @Override // com.vladsch.flexmark.util.dependency.Dependent
    default boolean affectsGlobalScope() {
        return false;
    }

    NodeFormatter create(DataHolder dataHolder);

    @Override // com.vladsch.flexmark.util.dependency.Dependent
    default Set<Class<?>> getAfterDependents() {
        return null;
    }

    @Override // com.vladsch.flexmark.util.dependency.Dependent
    default Set<Class<?>> getBeforeDependents() {
        return null;
    }
}
