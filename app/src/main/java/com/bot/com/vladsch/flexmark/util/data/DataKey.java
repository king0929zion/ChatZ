package com.vladsch.flexmark.util.data;

/* loaded from: classes.dex */
public class DataKey<T> extends DataKeyBase<T> {
    public DataKey(String str, T t5, DataNotNullValueFactory<T> dataNotNullValueFactory) {
        super(str, t5, dataNotNullValueFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$new$1(Object obj, DataHolder dataHolder) {
        return obj;
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
        return mutableDataHolder.set((DataKey<DataKey<T>>) this, (DataKey<T>) t5);
    }

    @Override // com.vladsch.flexmark.util.data.DataKeyBase
    public String toString() {
        return "DataKey<" + getDefaultValue().getClass().getSimpleName() + "> " + getName();
    }

    public DataKey(String str, NotNullValueSupplier<T> notNullValueSupplier) {
        super(str, notNullValueSupplier.get(), new a(notNullValueSupplier, 0));
    }

    @Override // com.vladsch.flexmark.util.data.DataKeyBase
    public T getDefaultValue(DataHolder dataHolder) {
        return (T) super.getDefaultValue(dataHolder);
    }

    @Override // com.vladsch.flexmark.util.data.DataKeyBase
    public DataNotNullValueFactory<T> getFactory() {
        return (DataNotNullValueFactory) super.getFactory();
    }

    public DataKey(String str, DataKey<T> dataKey) {
        this(str, dataKey.getDefaultValue(), new b(dataKey, 0));
    }

    public DataKey(String str, T t5) {
        this(str, t5, new b(t5, 2));
    }
}
