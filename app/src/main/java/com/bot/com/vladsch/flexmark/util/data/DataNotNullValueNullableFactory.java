package com.vladsch.flexmark.util.data;

/* loaded from: classes.dex */
public interface DataNotNullValueNullableFactory<T> extends DataNotNullValueFactory<T> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.data.DataNotNullValueFactory, com.vladsch.flexmark.util.data.DataValueFactory, java.util.function.Function
    T apply(DataHolder dataHolder);
}
