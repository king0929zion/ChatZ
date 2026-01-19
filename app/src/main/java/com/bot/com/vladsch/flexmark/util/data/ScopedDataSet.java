package com.vladsch.flexmark.util.data;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public class ScopedDataSet extends DataSet {
    protected final DataHolder parent;

    public ScopedDataSet(DataHolder dataHolder) {
        this.parent = dataHolder;
    }

    @Override // com.vladsch.flexmark.util.data.DataSet, com.vladsch.flexmark.util.data.DataHolder
    public boolean contains(DataKeyBase<?> dataKeyBase) {
        if (super.contains(dataKeyBase)) {
            return true;
        }
        DataHolder dataHolder = this.parent;
        return dataHolder != null && dataHolder.contains(dataKeyBase);
    }

    @Override // com.vladsch.flexmark.util.data.DataSet, com.vladsch.flexmark.util.data.DataHolder
    public Map<? extends DataKeyBase<?>, Object> getAll() {
        if (this.parent == null) {
            return super.getAll();
        }
        HashMap hashMap = new HashMap(this.parent.getAll());
        hashMap.putAll(super.getAll());
        return hashMap;
    }

    @Override // com.vladsch.flexmark.util.data.DataSet, com.vladsch.flexmark.util.data.DataHolder
    public Collection<? extends DataKeyBase<?>> getKeys() {
        if (this.parent == null) {
            return super.getKeys();
        }
        HashSet hashSet = new HashSet(this.parent.getKeys());
        hashSet.addAll(super.getKeys());
        return hashSet;
    }

    @Override // com.vladsch.flexmark.util.data.DataSet, com.vladsch.flexmark.util.data.DataHolder
    public Object getOrCompute(DataKeyBase<?> dataKeyBase, DataValueFactory<?> dataValueFactory) {
        return (this.parent == null || super.contains(dataKeyBase) || !this.parent.contains(dataKeyBase)) ? super.getOrCompute(dataKeyBase, dataValueFactory) : this.parent.getOrCompute(dataKeyBase, dataValueFactory);
    }

    public DataHolder getParent() {
        return this.parent;
    }

    @Override // com.vladsch.flexmark.util.data.DataSet, com.vladsch.flexmark.util.data.DataHolder
    public MutableDataSet toMutable() {
        MutableDataSet mutableDataSet = new MutableDataSet();
        mutableDataSet.dataSet.putAll(super.getAll());
        DataHolder dataHolder = this.parent;
        return dataHolder != null ? new MutableScopedDataSet(dataHolder, mutableDataSet) : mutableDataSet;
    }

    public ScopedDataSet(DataHolder dataHolder, DataHolder dataHolder2) {
        super(dataHolder2);
        this.parent = dataHolder;
    }
}
