package androidx.lifecycle;

import m4.AbstractC1276k;

/* renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0847v {
    public EnumC0842p a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0844s f10881b;

    public final void a(InterfaceC0846u interfaceC0846u, EnumC0841o enumC0841o) {
        EnumC0842p a = enumC0841o.a();
        EnumC0842p enumC0842p = this.a;
        AbstractC1276k.f(enumC0842p, "state1");
        if (a.compareTo(enumC0842p) < 0) {
            enumC0842p = a;
        }
        this.a = enumC0842p;
        this.f10881b.d(interfaceC0846u, enumC0841o);
        this.a = a;
    }
}
