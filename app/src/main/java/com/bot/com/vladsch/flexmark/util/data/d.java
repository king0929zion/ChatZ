package com.vladsch.flexmark.util.data;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements DataValueFactory {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11346b;

    public /* synthetic */ d(Object obj, int i6) {
        this.a = i6;
        this.f11346b = obj;
    }

    @Override // com.vladsch.flexmark.util.data.DataValueFactory
    public final Object apply(DataHolder dataHolder) {
        Object lambda$new$0;
        Object lambda$new$1;
        switch (this.a) {
            case 0:
                lambda$new$0 = DataKeyBase.lambda$new$0(this.f11346b, dataHolder);
                return lambda$new$0;
            default:
                lambda$new$1 = NullableDataKey.lambda$new$1(this.f11346b, dataHolder);
                return lambda$new$1;
        }
    }
}
