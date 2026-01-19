package com.vladsch.flexmark.util.data;

/* loaded from: classes.dex */
public interface MutableDataHolder extends DataHolder, MutableDataSetter {
    MutableDataHolder clear();

    @Deprecated
    default <T> T get(DataKey<T> dataKey) {
        return dataKey.get(this);
    }

    @Override // com.vladsch.flexmark.util.data.DataHolder
    Object getOrCompute(DataKeyBase<?> dataKeyBase, DataValueFactory<?> dataValueFactory);

    MutableDataHolder remove(DataKeyBase<?> dataKeyBase);

    <T> MutableDataHolder set(DataKey<T> dataKey, T t5);

    <T> MutableDataHolder set(NullableDataKey<T> nullableDataKey, T t5);

    MutableDataHolder setAll(DataHolder dataHolder);

    MutableDataHolder setFrom(MutableDataSetter mutableDataSetter);

    @Override // com.vladsch.flexmark.util.data.DataHolder, com.vladsch.flexmark.util.data.MutableDataSetter
    MutableDataHolder setIn(MutableDataHolder mutableDataHolder);
}
