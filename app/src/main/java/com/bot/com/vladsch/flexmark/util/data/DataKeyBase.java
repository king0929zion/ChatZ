package com.vladsch.flexmark.util.data;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public abstract class DataKeyBase<T> implements MutableDataValueSetter<T> {
    private final T defaultValue;
    private final DataValueFactory<T> factory;
    private final String name;

    public DataKeyBase(String str, T t5, DataValueFactory<T> dataValueFactory) {
        this.name = str;
        this.defaultValue = t5;
        this.factory = dataValueFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$new$0(Object obj, DataHolder dataHolder) {
        return obj;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public T get(DataHolder dataHolder) {
        return dataHolder == null ? this.defaultValue : (T) dataHolder.getOrCompute(this, new c(this, 0));
    }

    public T getDefaultValue() {
        return this.defaultValue;
    }

    public DataValueFactory<T> getFactory() {
        return this.factory;
    }

    @Deprecated
    public final T getFrom(DataHolder dataHolder) {
        return get(dataHolder);
    }

    public String getName() {
        return this.name;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        T t5 = this.defaultValue;
        if (t5 == null) {
            return AbstractC1135a.f("NullableDataKey<unknown> ", this.name);
        }
        return "NullableDataKey<" + t5.getClass().getSimpleName() + "> " + this.name;
    }

    public T getDefaultValue(DataHolder dataHolder) {
        return this.factory.apply(dataHolder);
    }

    public DataKeyBase(String str, DataKeyBase<T> dataKeyBase) {
        this(str, dataKeyBase.defaultValue, new c(dataKeyBase, 1));
    }

    public DataKeyBase(String str, T t5) {
        this(str, t5, new d(t5, 0));
    }
}
