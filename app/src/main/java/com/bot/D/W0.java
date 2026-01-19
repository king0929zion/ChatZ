package D;

import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import I0.AbstractC0204q0;
import Q.AbstractC0451p0;
import T.C0601d0;
import T.C0602e;
import T.C0607g0;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import b0.C0873f;
import e1.AbstractC0960b;
import e1.C0959a;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.InterfaceC1041r;
import i4.AbstractC1118b;
import java.util.List;
import m4.AbstractC1276k;
import r.AbstractC1587m1;
import r.C1529K;
import r.InterfaceC1623y1;
import t.C1682j;
import v.AbstractC1787b;
import v.AbstractC1799h;
import v.AbstractC1812s;
import v.C1813t;
import v.C1814u;

/* loaded from: classes.dex */
public final /* synthetic */ class W0 implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f952c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f954f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f955g;

    public /* synthetic */ W0(Object obj, boolean z5, Object obj2, int i6) {
        this.f952c = i6;
        this.f954f = obj;
        this.f953e = z5;
        this.f955g = obj2;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i6 = this.f952c;
        C0602e c0602e = C0616l.a;
        X3.y yVar = X3.y.a;
        boolean z5 = this.f953e;
        Object obj4 = this.f955g;
        Object obj5 = this.f954f;
        switch (i6) {
            case 0:
                Z0 z02 = (Z0) obj5;
                C0607g0 c0607g0 = z02.f972f;
                C1682j c1682j = (C1682j) obj4;
                C0626q c0626q = (C0626q) obj2;
                ((Integer) obj3).getClass();
                c0626q.b0(-2137546592);
                boolean z6 = ((r.X0) c0607g0.getValue()) == r.X0.f14183c || !(c0626q.j(AbstractC0204q0.f2364n) == e1.m.f11577e);
                boolean f6 = c0626q.f(z02);
                Object P5 = c0626q.P();
                if (f6 || P5 == c0602e) {
                    P5 = new C0056a(z02, 1);
                    c0626q.m0(P5);
                }
                T.X E5 = T.r.E((l4.c) P5, c0626q);
                Object P6 = c0626q.P();
                if (P6 == c0602e) {
                    C1529K c1529k = new C1529K(new Z2.A0(E5, 14));
                    c0626q.m0(c1529k);
                    P6 = c1529k;
                }
                InterfaceC1623y1 interfaceC1623y1 = (InterfaceC1623y1) P6;
                boolean f7 = c0626q.f(interfaceC1623y1) | c0626q.f(z02);
                Object P7 = c0626q.P();
                if (f7 || P7 == c0602e) {
                    P7 = new Y0(interfaceC1623y1, z02);
                    c0626q.m0(P7);
                }
                InterfaceC1041r b5 = AbstractC1587m1.b((Y0) P7, (r.X0) c0607g0.getValue(), z5 && z02.f968b.g() != S.l.f7374V, z6, c1682j);
                c0626q.p(false);
                return b5;
            case 1:
                F0.X x5 = (F0.X) obj;
                F0.U u5 = (F0.U) obj2;
                C0959a c0959a = (C0959a) obj3;
                long j3 = c0959a.a;
                float f8 = AbstractC0451p0.a;
                int g3 = AbstractC0960b.g(j3, ((C0601d0) obj5).g());
                long j4 = c0959a.a;
                int f9 = AbstractC0960b.f(j4, ((C0601d0) obj4).g());
                int j5 = z5 ? g3 : C0959a.j(j4);
                if (!z5) {
                    g3 = C0959a.h(j4);
                }
                F0.k0 w5 = u5.w(C0959a.a(c0959a.a, j5, g3, 0, f9, 4));
                return x5.D(w5.f1485c, w5.f1486e, Y3.w.f9813c, new c1(w5, 3));
            case 2:
                InterfaceC1041r interfaceC1041r = (InterfaceC1041r) obj5;
                C0873f c0873f = (C0873f) obj4;
                List list = (List) obj;
                C0626q c0626q2 = (C0626q) obj2;
                int intValue = ((Integer) obj3).intValue();
                AbstractC1276k.f(list, "elements");
                if (z5) {
                    c0626q2.b0(-136235433);
                    InterfaceC1041r c6 = interfaceC1041r.c(v.t0.a);
                    boolean h3 = c0626q2.h(list);
                    Object P8 = c0626q2.P();
                    if (h3 || P8 == c0602e) {
                        P8 = new C0086p(23, list, c0873f);
                        c0626q2.m0(P8);
                    }
                    AbstractC1118b.a(c6, null, null, null, null, null, false, null, (l4.c) P8, c0626q2, 0, 510);
                    c0626q2.p(false);
                } else {
                    c0626q2.b0(-135976056);
                    C1813t a = AbstractC1812s.a(AbstractC1799h.g(0), C1026c.f11798p, c0626q2, 6);
                    int hashCode = Long.hashCode(c0626q2.f8164T);
                    InterfaceC0617l0 l3 = c0626q2.l();
                    InterfaceC1041r c7 = AbstractC1024a.c(c0626q2, interfaceC1041r);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f = C0150g.f1924b;
                    c0626q2.f0();
                    if (c0626q2.f8163S) {
                        c0626q2.k(c0148f);
                    } else {
                        c0626q2.p0();
                    }
                    T.r.G(c0626q2, a, C0150g.f1928f);
                    T.r.G(c0626q2, l3, C0150g.f1927e);
                    T.r.x(c0626q2, Integer.valueOf(hashCode), C0150g.f1929g);
                    T.r.C(c0626q2, C0150g.f1930h);
                    T.r.G(c0626q2, c7, C0150g.f1926d);
                    c0626q2.b0(-1663989449);
                    int i7 = 0;
                    for (Object obj6 : list) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            Y4.l.U();
                            throw null;
                        }
                        c0873f.n(list, Integer.valueOf(i7), (S2.X) obj6, c0626q2, Integer.valueOf((intValue & 14) | 3072));
                        i7 = i8;
                    }
                    c0626q2.p(false);
                    c0626q2.p(true);
                    c0626q2.p(false);
                }
                return yVar;
            default:
                List list2 = (List) obj5;
                T.d1 d1Var = (T.d1) obj4;
                C0626q c0626q3 = (C0626q) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1814u) obj, "$this$ModalBottomSheet");
                if (c0626q3.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                    U2.a.d(list2, this.f953e, d1Var, AbstractC1787b.z(v.t0.a, 10, 12), c0626q3, 3072);
                } else {
                    c0626q3.V();
                }
                return yVar;
        }
    }

    public /* synthetic */ W0(boolean z5, Object obj, Object obj2, int i6) {
        this.f952c = i6;
        this.f953e = z5;
        this.f954f = obj;
        this.f955g = obj2;
    }
}
