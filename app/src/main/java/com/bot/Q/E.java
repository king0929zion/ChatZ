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
import h0.C1038o;
import h0.InterfaceC1041r;
import m4.AbstractC1276k;
import v.AbstractC1787b;
import v.AbstractC1799h;
import v.AbstractC1806l;
import v.AbstractC1812s;
import v.C1813t;
import v.C1814u;
import v.C1818y;

/* loaded from: classes.dex */
public final class E implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5210c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0873f f5211e;

    public /* synthetic */ E(C0873f c0873f, int i6) {
        this.f5210c = i6;
        this.f5211e = c0873f;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6 = this.f5210c;
        C1038o c1038o = C1038o.a;
        X3.y yVar = X3.y.a;
        C0873f c0873f = this.f5211e;
        switch (i6) {
            case 0:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Number) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    C1813t a = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q, 0);
                    int hashCode = Long.hashCode(c0626q.f8164T);
                    InterfaceC0617l0 l3 = c0626q.l();
                    InterfaceC1041r c6 = AbstractC1024a.c(c0626q, c1038o);
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
                    c0873f.d(C1814u.a, c0626q, 6);
                    c0626q.p(true);
                } else {
                    c0626q.V();
                }
                return yVar;
            case 1:
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    long b5 = C0478w0.b();
                    C1818y c1818y = v.t0.a;
                    InterfaceC1041r k3 = v.t0.k(c1038o, e1.h.b(b5), e1.h.a(b5));
                    F0.V d6 = AbstractC1806l.d(C1026c.f11790h, false);
                    int hashCode2 = Long.hashCode(c0626q2.f8164T);
                    InterfaceC0617l0 l5 = c0626q2.l();
                    InterfaceC1041r c7 = AbstractC1024a.c(c0626q2, k3);
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
                    c0873f.m(c0626q2, 0);
                    c0626q2.p(true);
                } else {
                    c0626q2.V();
                }
                return yVar;
            default:
                C0626q c0626q3 = (C0626q) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    InterfaceC1041r C5 = AbstractC1787b.C(v.q0.a(), 0, S.l.f7374V, 0, S.l.f7374V, 10);
                    F0.V d7 = AbstractC1806l.d(C1026c.f11786c, false);
                    int hashCode3 = Long.hashCode(c0626q3.f8164T);
                    InterfaceC0617l0 l6 = c0626q3.l();
                    InterfaceC1041r c8 = AbstractC1024a.c(c0626q3, C5);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f3 = C0150g.f1924b;
                    c0626q3.f0();
                    if (c0626q3.f8163S) {
                        c0626q3.k(c0148f3);
                    } else {
                        c0626q3.p0();
                    }
                    T.r.G(c0626q3, d7, C0150g.f1928f);
                    T.r.G(c0626q3, l6, C0150g.f1927e);
                    C0146e c0146e3 = C0150g.f1929g;
                    if (c0626q3.f8163S || !AbstractC1276k.b(c0626q3.P(), Integer.valueOf(hashCode3))) {
                        B3.e.v(hashCode3, c0626q3, hashCode3, c0146e3);
                    }
                    T.r.G(c0626q3, c8, C0150g.f1926d);
                    c0873f.m(c0626q3, 0);
                    c0626q3.p(true);
                } else {
                    c0626q3.V();
                }
                return yVar;
        }
    }
}
