package com.vladsch.flexmark.util.data;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements DataValueFactory {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataKeyBase f11345b;

    public /* synthetic */ c(DataKeyBase dataKeyBase, int i6) {
        this.a = i6;
        this.f11345b = dataKeyBase;
    }

    @Override // com.vladsch.flexmark.util.data.DataValueFactory
    public final Object apply(DataHolder dataHolder) {
        switch (this.a) {
            case 0:
                return this.f11345b.getDefaultValue(dataHolder);
            default:
                return this.f11345b.get(dataHolder);
        }
    }
}
