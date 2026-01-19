package com.vladsch.flexmark.util.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class MutableScopedDataSet extends MutableDataSet {
    protected final DataHolder parent;

    public MutableScopedDataSet(DataHolder dataHolder) {
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
        HashMap hashMap = new HashMap(super.getAll());
        for (DataKeyBase<?> dataKeyBase : this.parent.getKeys()) {
            if (!contains(dataKeyBase)) {
                hashMap.put(dataKeyBase, dataKeyBase.get(this.parent));
            }
        }
        return hashMap;
    }

    @Override // com.vladsch.flexmark.util.data.DataSet, com.vladsch.flexmark.util.data.DataHolder
    public Collection<? extends DataKeyBase<?>> getKeys() {
        if (this.parent == null) {
            return super.getKeys();
        }
        ArrayList arrayList = new ArrayList(super.getKeys());
        for (DataKeyBase<?> dataKeyBase : this.parent.getKeys()) {
            if (!contains(dataKeyBase)) {
                arrayList.add(dataKeyBase);
            }
        }
        return arrayList;
    }

    @Override // com.vladsch.flexmark.util.data.MutableDataSet, com.vladsch.flexmark.util.data.DataSet, com.vladsch.flexmark.util.data.DataHolder
    public Object getOrCompute(DataKeyBase<?> dataKeyBase, DataValueFactory<?> dataValueFactory) {
        return (this.parent == null || super.contains(dataKeyBase) || !this.parent.contains(dataKeyBase)) ? super.getOrCompute(dataKeyBase, dataValueFactory) : this.parent.getOrCompute(dataKeyBase, dataValueFactory);
    }

    public DataHolder getParent() {
        return this.parent;
    }

    public MutableScopedDataSet(DataHolder dataHolder, MutableDataHolder mutableDataHolder) {
        super(mutableDataHolder);
        this.parent = dataHolder;
    }
}
