package com.vladsch.flexmark.util.data;

import java.util.function.Supplier;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements DataValueFactory {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f11343b;

    public /* synthetic */ a(Supplier supplier, int i6) {
        this.a = i6;
        this.f11343b = supplier;
    }

    @Override // com.vladsch.flexmark.util.data.DataValueFactory
    public final Object apply(DataHolder dataHolder) {
        Object obj;
        Object obj2;
        switch (this.a) {
            case 0:
                obj = ((NotNullValueSupplier) this.f11343b).get();
                return obj;
            default:
                obj2 = this.f11343b.get();
                return obj2;
        }
    }
}
