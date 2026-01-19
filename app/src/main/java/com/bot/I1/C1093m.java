package i1;

import F0.AbstractC0137z;
import F0.V;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import T.X;
import b0.AbstractC0874g;
import h0.AbstractC1024a;
import h0.C1038o;
import h0.InterfaceC1041r;
import m4.AbstractC1277l;

/* renamed from: i1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1093m extends AbstractC1277l implements l4.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12003e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1105y f12004f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ X f12005g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1093m(C1105y c1105y, X x5, int i6) {
        super(2);
        this.f12003e = i6;
        this.f12004f = c1105y;
        this.f12005g = x5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6 = this.f12003e;
        X3.y yVar = X3.y.a;
        X x5 = this.f12005g;
        C1105y c1105y = this.f12004f;
        int i7 = 0;
        switch (i6) {
            case 0:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Number) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    Object P5 = c0626q.P();
                    C0602e c0602e = C0616l.a;
                    if (P5 == c0602e) {
                        P5 = C1084d.f11976i;
                        c0626q.m0(P5);
                    }
                    InterfaceC1041r a = P0.n.a(C1038o.a, false, (l4.c) P5);
                    boolean h3 = c0626q.h(c1105y);
                    Object P6 = c0626q.P();
                    if (h3 || P6 == c0602e) {
                        P6 = new C1091k(c1105y, 1);
                        c0626q.m0(P6);
                    }
                    InterfaceC1041r a6 = l0.h.a(AbstractC0137z.n(a, (l4.c) P6), c1105y.getCanCalculatePosition() ? 1.0f : S.l.f7374V);
                    T.B b5 = AbstractC1094n.a;
                    l4.e eVar = (l4.e) x5.getValue();
                    Object P7 = c0626q.P();
                    if (P7 == c0602e) {
                        P7 = C1086f.f11986c;
                        c0626q.m0(P7);
                    }
                    V v5 = (V) P7;
                    int hashCode = Long.hashCode(c0626q.f8164T);
                    InterfaceC0617l0 l3 = c0626q.l();
                    InterfaceC1041r c6 = AbstractC1024a.c(c0626q, a6);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f = C0150g.f1924b;
                    c0626q.f0();
                    if (c0626q.f8163S) {
                        c0626q.k(c0148f);
                    } else {
                        c0626q.p0();
                    }
                    T.r.G(c0626q, v5, C0150g.f1928f);
                    T.r.G(c0626q, l3, C0150g.f1927e);
                    T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
                    T.r.C(c0626q, C0150g.f1930h);
                    T.r.G(c0626q, c6, C0150g.f1926d);
                    eVar.m(c0626q, 0);
                    c0626q.p(true);
                } else {
                    c0626q.V();
                }
                return yVar;
            default:
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    T.r.a(AbstractC1094n.f12006b.a(Boolean.TRUE), AbstractC0874g.c(1022273628, new C1093m(c1105y, x5, i7), c0626q2), c0626q2, 56);
                } else {
                    c0626q2.V();
                }
                return yVar;
        }
    }
}
