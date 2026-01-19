package com.vladsch.flexmark.util.data;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public interface DataHolder extends MutableDataSetter {
    public static final DataHolder NULL = new DataSet();

    boolean contains(DataKeyBase<?> dataKeyBase);

    @Deprecated
    default <T> T get(DataKey<T> dataKey) {
        return dataKey.get(this);
    }

    Map<? extends DataKeyBase<?>, Object> getAll();

    Collection<? extends DataKeyBase<?>> getKeys();

    Object getOrCompute(DataKeyBase<?> dataKeyBase, DataValueFactory<?> dataValueFactory);

    @Override // com.vladsch.flexmark.util.data.MutableDataSetter
    default MutableDataHolder setIn(MutableDataHolder mutableDataHolder) {
        return mutableDataHolder.setAll(this);
    }

    default DataSet toDataSet() {
        return this instanceof DataSet ? (DataSet) this : this instanceof MutableDataHolder ? new MutableDataSet(this) : new DataSet(this);
    }

    DataHolder toImmutable();

    MutableDataHolder toMutable();
}
