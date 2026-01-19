package com.vladsch.flexmark.util.dependency;

import java.util.Set;

/* loaded from: classes.dex */
public interface Dependent {
    boolean affectsGlobalScope();

    Set<Class<?>> getAfterDependents();

    Set<Class<?>> getBeforeDependents();
}
