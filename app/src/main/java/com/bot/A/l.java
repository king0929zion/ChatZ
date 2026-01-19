package A;

import B0.C0028d;
import F0.InterfaceC0134w;
import H0.AbstractC0157l;
import H0.InterfaceC0169y;
import H0.i0;
import X3.y;
import c4.EnumC0927a;
import h0.AbstractC1040q;
import n0.C1354c;
import r.C1515D;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final class l extends AbstractC1040q implements M0.a, InterfaceC0169y {

    /* renamed from: r, reason: collision with root package name */
    public C1515D f29r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f30s;

    public static final C1354c M0(l lVar, i0 i0Var, C0028d c0028d) {
        C1354c c1354c;
        if (lVar.f11819q && lVar.f30s) {
            i0 u5 = AbstractC0157l.u(lVar);
            if (!i0Var.W0().f11819q) {
                i0Var = null;
            }
            if (i0Var != null && (c1354c = (C1354c) c0028d.b()) != null) {
                return c1354c.j(u5.Q(i0Var, false).e());
            }
        }
        return null;
    }

    @Override // h0.AbstractC1040q
    public final boolean B0() {
        return false;
    }

    @Override // M0.a
    public final Object M(i0 i0Var, C0028d c0028d, d4.c cVar) {
        Object l3 = AbstractC1888A.l(new k(this, i0Var, c0028d, new g(this, i0Var, c0028d, 0), null), cVar);
        return l3 == EnumC0927a.f11114c ? l3 : y.a;
    }

    @Override // H0.InterfaceC0169y
    public final void o(InterfaceC0134w interfaceC0134w) {
        this.f30s = true;
    }
}
