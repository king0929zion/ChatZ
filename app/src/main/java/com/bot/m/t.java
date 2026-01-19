package M;

import D.C0098v0;
import H0.InterfaceC0154i;
import H0.InterfaceC0155j;
import H0.InterfaceC0161p;
import H0.i0;
import O.N0;
import T.C0607g0;
import h0.AbstractC1040q;
import u.AbstractC1734b;

/* loaded from: classes.dex */
public final class t extends AbstractC1040q implements InterfaceC0154i, InterfaceC0161p, InterfaceC0155j {

    /* renamed from: r, reason: collision with root package name */
    public e f3186r;

    /* renamed from: s, reason: collision with root package name */
    public C0098v0 f3187s;

    /* renamed from: t, reason: collision with root package name */
    public N0 f3188t;

    /* renamed from: u, reason: collision with root package name */
    public final C0607g0 f3189u = T.r.A(null);

    public t(e eVar, C0098v0 c0098v0, N0 n02) {
        this.f3186r = eVar;
        this.f3187s = c0098v0;
        this.f3188t = n02;
    }

    @Override // h0.AbstractC1040q
    public final void E0() {
        e eVar = this.f3186r;
        if (eVar.a != null) {
            AbstractC1734b.c("Expected textInputModifierNode to be null");
        }
        eVar.a = this;
    }

    @Override // h0.AbstractC1040q
    public final void F0() {
        this.f3186r.k(this);
    }

    @Override // H0.InterfaceC0161p
    public final void j0(i0 i0Var) {
        this.f3189u.setValue(i0Var);
    }
}
