package androidx.lifecycle;

import m4.C1288w;
import x4.AbstractC1888A;
import x4.C1928k;
import x4.InterfaceC1922e0;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class E implements InterfaceC0844s {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EnumC0841o f10823c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1288w f10824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1942y f10825f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ EnumC0841o f10826g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1928k f10827h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ H4.c f10828i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ D1.c f10829j;

    public E(EnumC0841o enumC0841o, C1288w c1288w, InterfaceC1942y interfaceC1942y, EnumC0841o enumC0841o2, C1928k c1928k, H4.c cVar, D1.c cVar2) {
        this.f10823c = enumC0841o;
        this.f10824e = c1288w;
        this.f10825f = interfaceC1942y;
        this.f10826g = enumC0841o2;
        this.f10827h = c1928k;
        this.f10828i = cVar;
        this.f10829j = cVar2;
    }

    @Override // androidx.lifecycle.InterfaceC0844s
    public final void d(InterfaceC0846u interfaceC0846u, EnumC0841o enumC0841o) {
        EnumC0841o enumC0841o2 = this.f10823c;
        C1288w c1288w = this.f10824e;
        if (enumC0841o == enumC0841o2) {
            c1288w.f12973c = AbstractC1888A.y(this.f10825f, null, new D(this.f10828i, this.f10829j, null), 3);
            return;
        }
        if (enumC0841o == this.f10826g) {
            InterfaceC1922e0 interfaceC1922e0 = (InterfaceC1922e0) c1288w.f12973c;
            if (interfaceC1922e0 != null) {
                interfaceC1922e0.f(null);
            }
            c1288w.f12973c = null;
        }
        if (enumC0841o == EnumC0841o.ON_DESTROY) {
            this.f10827h.k(X3.y.a);
        }
    }
}
