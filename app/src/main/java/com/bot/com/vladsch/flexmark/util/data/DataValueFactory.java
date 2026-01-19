package com.vladsch.flexmark.util.data;

import java.util.function.Function;

/* loaded from: classes.dex */
public interface DataValueFactory<T> extends Function<DataHolder, T> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.function.Function
    T apply(DataHolder dataHolder);
}
