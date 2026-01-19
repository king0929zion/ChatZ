package p;

import H0.InterfaceC0160o;
import h0.AbstractC1040q;
import q0.C1496b;
import q0.InterfaceC1498d;
import t.C1682j;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final class U extends AbstractC1040q implements InterfaceC0160o {

    /* renamed from: r, reason: collision with root package name */
    public final C1682j f13652r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13653s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f13654t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13655u;

    public U(C1682j c1682j) {
        this.f13652r = c1682j;
    }

    @Override // h0.AbstractC1040q
    public final void E0() {
        AbstractC1888A.y(A0(), null, new T(this, null), 3);
    }

    @Override // H0.InterfaceC0160o
    public final void k0(H0.L l3) {
        l3.b();
        C1496b c1496b = l3.f1765c;
        if (this.f13653s) {
            InterfaceC1498d.n0(l3, o0.s.c(0.3f, o0.s.f13475b), 0L, c1496b.c(), S.l.f7374V, 122);
        } else if (this.f13654t || this.f13655u) {
            InterfaceC1498d.n0(l3, o0.s.c(0.1f, o0.s.f13475b), 0L, c1496b.c(), S.l.f7374V, 122);
        }
    }
}
