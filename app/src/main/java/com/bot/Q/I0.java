package Q;

import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import T.C0626q;
import T.InterfaceC0617l0;
import b0.C0873f;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1036m;
import h0.InterfaceC1041r;
import m4.AbstractC1276k;
import p.AbstractC1464z;
import v.AbstractC1787b;
import v.AbstractC1799h;
import v.AbstractC1806l;
import v.AbstractC1812s;
import v.C1813t;
import v.C1814u;

/* loaded from: classes.dex */
public final class I0 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5287c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0873f f5288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5289f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5290g;

    public I0(InterfaceC1041r interfaceC1041r, p.P0 p02, C0873f c0873f) {
        this.f5289f = interfaceC1041r;
        this.f5290g = p02;
        this.f5288e = c0873f;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f5287c) {
            case 0:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Number) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    InterfaceC1041r r5 = AbstractC1464z.r(AbstractC1787b.G(AbstractC1787b.A(S.l.f7374V, K0.f5328d, 1, (InterfaceC1041r) this.f5289f)), (p.P0) this.f5290g, true);
                    C1813t a = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q, 0);
                    int hashCode = Long.hashCode(c0626q.f8164T);
                    InterfaceC0617l0 l3 = c0626q.l();
                    InterfaceC1041r c6 = AbstractC1024a.c(c0626q, r5);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f = C0150g.f1924b;
                    c0626q.f0();
                    if (c0626q.f8163S) {
                        c0626q.k(c0148f);
                    } else {
                        c0626q.p0();
                    }
                    T.r.G(c0626q, a, C0150g.f1928f);
                    T.r.G(c0626q, l3, C0150g.f1927e);
                    C0146e c0146e = C0150g.f1929g;
                    if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode))) {
                        B3.e.v(hashCode, c0626q, hashCode, c0146e);
                    }
                    T.r.G(c0626q, c6, C0150g.f1926d);
                    this.f5288e.d(C1814u.a, c0626q, 6);
                    c0626q.p(true);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            default:
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C1036m c1036m = new C1036m(new I.n((n.y0) this.f5289f, 5));
                    q3 q3Var = (q3) this.f5290g;
                    F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
                    int hashCode2 = Long.hashCode(c0626q2.f8164T);
                    InterfaceC0617l0 l5 = c0626q2.l();
                    InterfaceC1041r c7 = AbstractC1024a.c(c0626q2, c1036m);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f2 = C0150g.f1924b;
                    c0626q2.f0();
                    if (c0626q2.f8163S) {
                        c0626q2.k(c0148f2);
                    } else {
                        c0626q2.p0();
                    }
                    T.r.G(c0626q2, d6, C0150g.f1928f);
                    T.r.G(c0626q2, l5, C0150g.f1927e);
                    C0146e c0146e2 = C0150g.f1929g;
                    if (c0626q2.f8163S || !AbstractC1276k.b(c0626q2.P(), Integer.valueOf(hashCode2))) {
                        B3.e.v(hashCode2, c0626q2, hashCode2, c0146e2);
                    }
                    T.r.G(c0626q2, c7, C0150g.f1926d);
                    this.f5288e.d(q3Var, c0626q2, 6);
                    c0626q2.p(true);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
        }
    }

    public I0(n.y0 y0Var, C0873f c0873f, q3 q3Var) {
        this.f5289f = y0Var;
        this.f5288e = c0873f;
        this.f5290g = q3Var;
    }
}
