package com.vladsch.flexmark.util.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class DataSet implements DataHolder {
    private static final ArrayList<DataKeyAggregator> ourDataKeyAggregators = new ArrayList<>();
    protected final HashMap<DataKeyBase<?>, Object> dataSet;

    public DataSet() {
        this(null);
    }

    public static DataHolder aggregateActions(DataHolder dataHolder, DataHolder dataHolder2) {
        DataSet dataSet = new DataSet(dataHolder);
        dataSet.dataSet.putAll(dataHolder2.getAll());
        ArrayList<DataKeyAggregator> arrayList = ourDataKeyAggregators;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            DataKeyAggregator dataKeyAggregator = arrayList.get(i6);
            i6++;
            dataSet = dataKeyAggregator.aggregateActions(dataSet, dataHolder, dataHolder2).toDataSet();
        }
        return dataSet;
    }

    public static boolean invokeSetContains(Set<Class<?>> set, DataKeyAggregator dataKeyAggregator) {
        if (set == null) {
            return false;
        }
        return set.contains(dataKeyAggregator.getClass());
    }

    public static boolean isAggregatorRegistered(DataKeyAggregator dataKeyAggregator) {
        ArrayList<DataKeyAggregator> arrayList = ourDataKeyAggregators;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            DataKeyAggregator dataKeyAggregator2 = arrayList.get(i6);
            i6++;
            if (dataKeyAggregator2.getClass() == dataKeyAggregator.getClass()) {
                return true;
            }
        }
        return false;
    }

    public static DataSet merge(DataHolder... dataHolderArr) {
        DataSet dataSet = new DataSet();
        for (DataHolder dataHolder : dataHolderArr) {
            dataSet.dataSet.putAll(dataHolder.getAll());
        }
        return dataSet;
    }

    public static void registerDataKeyAggregator(DataKeyAggregator dataKeyAggregator) {
        if (isAggregatorRegistered(dataKeyAggregator)) {
            throw new IllegalStateException("Aggregator " + dataKeyAggregator + " is already registered");
        }
        int i6 = 0;
        while (true) {
            ArrayList<DataKeyAggregator> arrayList = ourDataKeyAggregators;
            if (i6 >= arrayList.size()) {
                arrayList.add(dataKeyAggregator);
                return;
            }
            DataKeyAggregator dataKeyAggregator2 = arrayList.get(i6);
            if (invokeSetContains(dataKeyAggregator2.invokeAfterSet(), dataKeyAggregator)) {
                if (!invokeSetContains(dataKeyAggregator.invokeAfterSet(), dataKeyAggregator2)) {
                    arrayList.add(i6, dataKeyAggregator);
                    return;
                }
                throw new IllegalStateException("Circular invokeAfter dependencies for " + dataKeyAggregator + " and " + dataKeyAggregator2);
            }
            i6++;
        }
    }

    public DataHolder aggregate() {
        ArrayList<DataKeyAggregator> arrayList = ourDataKeyAggregators;
        int size = arrayList.size();
        int i6 = 0;
        DataHolder dataHolder = this;
        while (i6 < size) {
            DataKeyAggregator dataKeyAggregator = arrayList.get(i6);
            i6++;
            dataHolder = dataKeyAggregator.aggregate(dataHolder);
        }
        return dataHolder;
    }

    @Override // com.vladsch.flexmark.util.data.DataHolder
    public boolean contains(DataKeyBase<?> dataKeyBase) {
        return this.dataSet.containsKey(dataKeyBase);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataSet) {
            return this.dataSet.equals(((DataSet) obj).dataSet);
        }
        return false;
    }

    @Override // com.vladsch.flexmark.util.data.DataHolder
    public Map<? extends DataKeyBase<?>, Object> getAll() {
        return this.dataSet;
    }

    @Override // com.vladsch.flexmark.util.data.DataHolder
    public Collection<? extends DataKeyBase<?>> getKeys() {
        return this.dataSet.keySet();
    }

    @Override // com.vladsch.flexmark.util.data.DataHolder
    public Object getOrCompute(DataKeyBase<?> dataKeyBase, DataValueFactory<?> dataValueFactory) {
        return this.dataSet.containsKey(dataKeyBase) ? this.dataSet.get(dataKeyBase) : dataValueFactory.apply((DataHolder) this);
    }

    public int hashCode() {
        return this.dataSet.hashCode();
    }

    @Override // com.vladsch.flexmark.util.data.DataHolder
    public DataSet toDataSet() {
        return this;
    }

    @Override // com.vladsch.flexmark.util.data.DataHolder
    public DataSet toImmutable() {
        return this;
    }

    public String toString() {
        return "DataSet{dataSet=" + this.dataSet + "}";
    }

    public DataSet(DataHolder dataHolder) {
        if (dataHolder == null) {
            this.dataSet = new HashMap<>();
        } else {
            this.dataSet = new HashMap<>(dataHolder.getAll());
        }
    }

    @Override // com.vladsch.flexmark.util.data.DataHolder
    public MutableDataSet toMutable() {
        return new MutableDataSet(this);
    }

    public static DataHolder aggregate(DataHolder dataHolder, DataHolder dataHolder2) {
        if (dataHolder == null && dataHolder2 == null) {
            return new DataSet();
        }
        if (dataHolder2 == null) {
            return dataHolder;
        }
        if (dataHolder == null) {
            return dataHolder2.toDataSet().aggregate().toImmutable();
        }
        return aggregateActions(dataHolder, dataHolder2).toDataSet().aggregate().toImmutable();
    }
}
