package com.vladsch.flexmark.util.builder;

import com.vladsch.flexmark.ast.util.g;
import com.vladsch.flexmark.util.builder.BuilderBase;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.DataKey;
import com.vladsch.flexmark.util.data.MutableDataHolder;
import com.vladsch.flexmark.util.data.MutableDataSet;
import com.vladsch.flexmark.util.data.NullableDataKey;
import com.vladsch.flexmark.util.data.SharedDataKeys;
import com.vladsch.flexmark.util.misc.Extension;
import i3.C1116a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class BuilderBase<T extends BuilderBase<T>> extends MutableDataSet {
    private Extension currentExtension;
    private final HashMap<Class<?>, HashSet<Object>> extensionApiPoints;
    private final HashSet<Class<?>> loadedExtensions;

    public BuilderBase(DataHolder dataHolder) {
        super(dataHolder);
        this.loadedExtensions = new HashSet<>();
        this.extensionApiPoints = new HashMap<>();
    }

    public static /* synthetic */ HashSet lambda$addExtensionApiPoint$0(Class cls) {
        return new HashSet();
    }

    public static /* synthetic */ boolean lambda$removeExtensions$1(Collection collection, Extension extension) {
        return collection.contains(extension.getClass());
    }

    public static DataHolder removeExtensions(DataHolder dataHolder, Collection<Class<? extends Extension>> collection) {
        DataKey<Collection<Extension>> dataKey = SharedDataKeys.EXTENSIONS;
        if (!dataHolder.contains(dataKey)) {
            return dataHolder;
        }
        ArrayList arrayList = new ArrayList(dataKey.get(dataHolder));
        return arrayList.removeIf(new C1116a(collection, 0)) ? dataHolder instanceof MutableDataHolder ? ((MutableDataHolder) dataHolder).set((DataKey<DataKey<Collection<Extension>>>) dataKey, (DataKey<Collection<Extension>>) arrayList) : dataHolder.toMutable().set((DataKey<DataKey<Collection<Extension>>>) dataKey, (DataKey<Collection<Extension>>) arrayList).toImmutable() : dataHolder;
    }

    public void addExtensionApiPoint(Object obj) {
        Extension extension = this.currentExtension;
        if (extension != null) {
            this.extensionApiPoints.computeIfAbsent(extension.getClass(), new g(12)).add(obj);
        }
    }

    public abstract Object build();

    public final T extensions(Collection<? extends Extension> collection) {
        ArrayList arrayList = new ArrayList(collection.size() + SharedDataKeys.EXTENSIONS.get(this).size());
        for (Extension extension : collection) {
            this.currentExtension = extension;
            if (!this.loadedExtensions.contains(extension.getClass())) {
                preloadExtension(extension);
                arrayList.add(extension);
            }
            this.currentExtension = null;
        }
        for (Extension extension2 : collection) {
            this.currentExtension = extension2;
            Class<?> cls = extension2.getClass();
            if (!this.loadedExtensions.contains(cls) && loadExtension(extension2)) {
                this.loadedExtensions.add(cls);
                arrayList.add(extension2);
            }
            this.currentExtension = null;
        }
        if (!arrayList.isEmpty()) {
            DataKey dataKey = SharedDataKeys.EXTENSIONS;
            arrayList.addAll(0, (Collection) dataKey.get(this));
            set((DataKey<DataKey>) dataKey, (DataKey) arrayList);
        }
        return this;
    }

    @Override // com.vladsch.flexmark.util.data.DataHolder, com.vladsch.flexmark.util.data.MutableDataHolder
    @Deprecated
    public <V> V get(DataKey<V> dataKey) {
        return dataKey.get(this);
    }

    public abstract boolean loadExtension(Extension extension);

    public void loadExtensions() {
        DataKey<Collection<Extension>> dataKey = SharedDataKeys.EXTENSIONS;
        if (contains(dataKey)) {
            extensions(dataKey.get(this));
        }
    }

    public abstract void preloadExtension(Extension extension);

    public abstract void removeApiPoint(Object obj);

    @Override // com.vladsch.flexmark.util.data.MutableDataSet, com.vladsch.flexmark.util.data.MutableDataHolder
    public /* bridge */ /* synthetic */ MutableDataHolder set(DataKey dataKey, Object obj) {
        return set((DataKey<DataKey>) dataKey, (DataKey) obj);
    }

    @Override // com.vladsch.flexmark.util.data.MutableDataSet, com.vladsch.flexmark.util.data.MutableDataHolder
    public /* bridge */ /* synthetic */ MutableDataHolder set(NullableDataKey nullableDataKey, Object obj) {
        return set((NullableDataKey<NullableDataKey>) nullableDataKey, (NullableDataKey) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vladsch.flexmark.util.data.MutableDataSet, com.vladsch.flexmark.util.data.MutableDataHolder
    public <V> MutableDataSet set(DataKey<V> dataKey, V v5) {
        addExtensionApiPoint(dataKey);
        return super.set((DataKey<DataKey<V>>) dataKey, (DataKey<V>) v5);
    }

    public BuilderBase() {
        this.loadedExtensions = new HashSet<>();
        this.extensionApiPoints = new HashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vladsch.flexmark.util.data.MutableDataSet, com.vladsch.flexmark.util.data.MutableDataHolder
    public <V> MutableDataSet set(NullableDataKey<V> nullableDataKey, V v5) {
        addExtensionApiPoint(nullableDataKey);
        return super.set((NullableDataKey<NullableDataKey<V>>) nullableDataKey, (NullableDataKey<V>) v5);
    }
}
