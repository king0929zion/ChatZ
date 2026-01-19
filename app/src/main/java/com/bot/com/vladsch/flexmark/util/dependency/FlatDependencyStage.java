package com.vladsch.flexmark.util.dependency;

import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public class FlatDependencyStage<T> {
    private final List<T> dependents;

    public FlatDependencyStage(List<T> list) {
        this.dependents = list;
    }

    public List<T> getDependents() {
        return this.dependents;
    }
}
