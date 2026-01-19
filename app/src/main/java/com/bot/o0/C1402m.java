package o0;

import F0.U;
import F0.W;
import F0.X;
import F0.k0;
import H0.A0;
import H0.AbstractC0157l;
import H0.InterfaceC0170z;
import H0.i0;
import f0.AbstractC0983f;
import f0.AbstractC0997t;
import h0.AbstractC1040q;
import m4.AbstractC1276k;
import o4.AbstractC1410a;

/* renamed from: o0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1402m extends AbstractC1040q implements InterfaceC0170z, A0 {

    /* renamed from: r, reason: collision with root package name */
    public l4.c f13470r;

    public C1402m(l4.c cVar) {
        this.f13470r = cVar;
    }

    @Override // h0.AbstractC1040q
    public final boolean B0() {
        return false;
    }

    @Override // H0.A0
    public final void I(P0.x xVar) {
        boolean z5;
        L l3;
        i0 t5 = AbstractC0157l.t(this, 2);
        if (t5.f1946I) {
            L l5 = t5.f1944G;
            z5 = t5.f1945H;
            l3 = l5;
        } else {
            C1387I c1387i = y.a;
            if (c1387i == null) {
                y.a = new C1387I();
            } else {
                c1387i.b();
            }
            C1387I c1387i2 = y.a;
            AbstractC1276k.c(c1387i2);
            c1387i2.f13429t = t5.f1954r.f1714C;
            c1387i2.f13428s = AbstractC1410a.S(t5.f1487f);
            AbstractC0983f e6 = AbstractC0997t.e();
            l4.c e7 = e6 != null ? e6.e() : null;
            AbstractC0983f h3 = AbstractC0997t.h(e6);
            try {
                this.f13470r.f(c1387i2);
                AbstractC0997t.k(e6, h3, e7);
                l3 = c1387i2.f13425p;
                z5 = c1387i2.f13426q;
            } catch (Throwable th) {
                AbstractC0997t.k(e6, h3, e7);
                throw th;
            }
        }
        if (z5) {
            P0.v.f(xVar, l3);
        }
    }

    @Override // H0.InterfaceC0170z
    public final W d(X x5, U u5, long j3) {
        k0 w5 = u5.w(j3);
        return x5.D(w5.f1485c, w5.f1486e, Y3.w.f9813c, new B0.F(15, w5, this));
    }

    @Override // H0.A0
    public final boolean h() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f13470r + ')';
    }
}
