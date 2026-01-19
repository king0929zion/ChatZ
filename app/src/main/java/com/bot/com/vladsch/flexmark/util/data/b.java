package com.vladsch.flexmark.util.data;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements DataNotNullValueFactory {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11344b;

    public /* synthetic */ b(Object obj, int i6) {
        this.a = i6;
        this.f11344b = obj;
    }

    @Override // com.vladsch.flexmark.util.data.DataNotNullValueFactory, com.vladsch.flexmark.util.data.DataValueFactory
    public final Object apply(DataHolder dataHolder) {
        Object lambda$new$1;
        switch (this.a) {
            case 0:
                return ((DataKey) this.f11344b).get(dataHolder);
            case 1:
                return (Boolean) ((DataKey) this.f11344b).get(dataHolder);
            default:
                lambda$new$1 = DataKey.lambda$new$1(this.f11344b, dataHolder);
                return lambda$new$1;
        }
    }
}
