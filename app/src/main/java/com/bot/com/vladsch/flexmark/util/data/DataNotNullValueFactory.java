package com.vladsch.flexmark.util.data;

/* loaded from: classes.dex */
public interface DataNotNullValueFactory<T> extends DataValueFactory<T> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.data.DataValueFactory, java.util.function.Function
    T apply(DataHolder dataHolder);
}
