package com.vladsch.flexmark.util.dependency;

import com.vladsch.flexmark.util.dependency.Dependent;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public class FlatDependencyHandler<T extends Dependent> extends DependencyHandler<T, FlatDependencyStage<T>, FlatDependencies<T>> {
    public static <T extends Dependent> List<T> computeDependencies(List<T> list) {
        return new FlatDependencyHandler().resolvedDependencies(list);
    }

    @Override // com.vladsch.flexmark.util.dependency.DependencyHandler
    public Class<? extends T> getDependentClass(T t5) {
        return (Class<? extends T>) t5.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<T> resolvedDependencies(List<T> list) {
        return resolveDependencies(list).dependencies;
    }

    @Override // com.vladsch.flexmark.util.dependency.DependencyHandler
    public FlatDependencies<T> createResolvedDependencies(List<FlatDependencyStage<T>> list) {
        return new FlatDependencies<>(list);
    }

    @Override // com.vladsch.flexmark.util.dependency.DependencyHandler
    public FlatDependencyStage<T> createStage(List<T> list) {
        return new FlatDependencyStage<>(list);
    }
}
