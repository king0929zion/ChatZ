package Q;

import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import T.C0626q;
import T.InterfaceC0617l0;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import m4.AbstractC1276k;
import v.AbstractC1787b;
import v.AbstractC1806l;
import w.AbstractC1829a;

/* renamed from: Q.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0406e implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5771c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4.e f5772e;

    public /* synthetic */ C0406e(int i6, l4.e eVar) {
        this.f5771c = i6;
        this.f5772e = eVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f5771c) {
            case 0:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Number) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    InterfaceC1041r c6 = AbstractC1787b.x(C1038o.a, AbstractC0426j.f5896f).c(new v.J(C1026c.f11798p));
                    F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
                    int hashCode = Long.hashCode(c0626q.f8164T);
                    InterfaceC0617l0 l3 = c0626q.l();
                    InterfaceC1041r c7 = AbstractC1024a.c(c0626q, c6);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f = C0150g.f1924b;
                    c0626q.f0();
                    if (c0626q.f8163S) {
                        c0626q.k(c0148f);
                    } else {
                        c0626q.p0();
                    }
                    T.r.G(c0626q, d6, C0150g.f1928f);
                    T.r.G(c0626q, l3, C0150g.f1927e);
                    C0146e c0146e = C0150g.f1929g;
                    if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode))) {
                        B3.e.v(hashCode, c0626q, hashCode, c0146e);
                    }
                    T.r.G(c0626q, c7, C0150g.f1926d);
                    this.f5772e.m(c0626q, 0);
                    c0626q.p(true);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            default:
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        AbstractC1829a.a("invalid weight; must be greater than zero");
                    }
                    InterfaceC1041r c8 = AbstractC1787b.x(new v.Z(1.0f, false), AbstractC0426j.f5897g).c(new v.J(C1026c.f11798p));
                    F0.V d7 = AbstractC1806l.d(C1026c.f11786c, false);
                    int hashCode2 = Long.hashCode(c0626q2.f8164T);
                    InterfaceC0617l0 l5 = c0626q2.l();
                    InterfaceC1041r c9 = AbstractC1024a.c(c0626q2, c8);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f2 = C0150g.f1924b;
                    c0626q2.f0();
                    if (c0626q2.f8163S) {
                        c0626q2.k(c0148f2);
                    } else {
                        c0626q2.p0();
                    }
                    T.r.G(c0626q2, d7, C0150g.f1928f);
                    T.r.G(c0626q2, l5, C0150g.f1927e);
                    C0146e c0146e2 = C0150g.f1929g;
                    if (c0626q2.f8163S || !AbstractC1276k.b(c0626q2.P(), Integer.valueOf(hashCode2))) {
                        B3.e.v(hashCode2, c0626q2, hashCode2, c0146e2);
                    }
                    T.r.G(c0626q2, c9, C0150g.f1926d);
                    this.f5772e.m(c0626q2, 0);
                    c0626q2.p(true);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
        }
    }
}
