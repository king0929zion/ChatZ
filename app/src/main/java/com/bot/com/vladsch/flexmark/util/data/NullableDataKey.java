package com.vladsch.flexmark.util.data;

import j1.AbstractC1135a;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public class NullableDataKey<T> extends DataKeyBase<T> {
    public NullableDataKey(String str, T t5, DataValueFactory<T> dataValueFactory) {
        super(str, t5, dataValueFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$new$1(Object obj, DataHolder dataHolder) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$new$2(DataHolder dataHolder) {
        return null;
    }

    @Override // com.vladsch.flexmark.util.data.DataKeyBase
    public T get(DataHolder dataHolder) {
        return (T) super.get(dataHolder);
    }

    @Override // com.vladsch.flexmark.util.data.DataKeyBase
    public T getDefaultValue() {
        return (T) super.getDefaultValue();
    }

    @Override // com.vladsch.flexmark.util.data.MutableDataValueSetter
    public MutableDataHolder set(MutableDataHolder mutableDataHolder, T t5) {
        return mutableDataHolder.set((NullableDataKey<NullableDataKey<T>>) this, (NullableDataKey<T>) t5);
    }

    @Override // com.vladsch.flexmark.util.data.DataKeyBase
    public String toString() {
        T defaultValue = getDefaultValue();
        if (defaultValue == null) {
            return AbstractC1135a.f("DataKey<null> ", getName());
        }
        return "DataKey<" + defaultValue.getClass().getSimpleName() + "> " + getName();
    }

    public NullableDataKey(String str, DataValueNullableFactory<T> dataValueNullableFactory) {
        super(str, dataValueNullableFactory.apply((DataHolder) null), dataValueNullableFactory);
    }

    @Override // com.vladsch.flexmark.util.data.DataKeyBase
    public T getDefaultValue(DataHolder dataHolder) {
        return (T) super.getDefaultValue(dataHolder);
    }

    public NullableDataKey(String str, Supplier<T> supplier) {
        super(str, supplier.get(), new a(supplier, 1));
    }

    public NullableDataKey(String str, DataKeyBase<T> dataKeyBase) {
        this(str, dataKeyBase.getDefaultValue(), new c(dataKeyBase, 1));
    }

    public NullableDataKey(String str, T t5) {
        this(str, t5, new d(t5, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vladsch.flexmark.util.data.DataValueFactory, java.lang.Object] */
    public NullableDataKey(String str) {
        this(str, null, new Object());
    }
}
