package S2;

import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import Q.R1;
import T.C0626q;
import T.InterfaceC0617l0;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.InterfaceC1041r;
import m4.AbstractC1276k;
import v.AbstractC1806l;

/* renamed from: S2.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0562c0 implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7741c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1041r f7742e;

    public /* synthetic */ C0562c0(InterfaceC1041r interfaceC1041r, int i6) {
        this.f7741c = i6;
        this.f7742e = interfaceC1041r;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        InterfaceC1041r interfaceC1041r = (InterfaceC1041r) obj;
        switch (this.f7741c) {
            case 0:
                C0626q c0626q = (C0626q) obj2;
                int intValue = ((Integer) obj3).intValue();
                AbstractC1276k.f(interfaceC1041r, "animatedModifier");
                if ((intValue & 6) == 0) {
                    intValue |= c0626q.f(interfaceC1041r) ? 4 : 2;
                }
                if (c0626q.S(intValue & 1, (intValue & 19) != 18)) {
                    AbstractC1806l.a(this.f7742e.c(interfaceC1041r), c0626q, 0);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            default:
                C0626q c0626q2 = (C0626q) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                AbstractC1276k.f(interfaceC1041r, "animatedModifier");
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c0626q2.f(interfaceC1041r) ? 4 : 2;
                }
                if (c0626q2.S(intValue2 & 1, (intValue2 & 19) != 18)) {
                    InterfaceC1041r c6 = this.f7742e.c(interfaceC1041r);
                    F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
                    int hashCode = Long.hashCode(c0626q2.f8164T);
                    InterfaceC0617l0 l3 = c0626q2.l();
                    InterfaceC1041r c7 = AbstractC1024a.c(c0626q2, c6);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f = C0150g.f1924b;
                    c0626q2.f0();
                    if (c0626q2.f8163S) {
                        c0626q2.k(c0148f);
                    } else {
                        c0626q2.p0();
                    }
                    T.r.G(c0626q2, d6, C0150g.f1928f);
                    T.r.G(c0626q2, l3, C0150g.f1927e);
                    T.r.x(c0626q2, Integer.valueOf(hashCode), C0150g.f1929g);
                    T.r.C(c0626q2, C0150g.f1930h);
                    T.r.G(c0626q2, c7, C0150g.f1926d);
                    R1.f(null, 1, o0.s.c(0.3f, ((Q.N) c0626q2.j(Q.O.a)).f5378A), c0626q2, 48, 1);
                    c0626q2.p(true);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
        }
    }
}
