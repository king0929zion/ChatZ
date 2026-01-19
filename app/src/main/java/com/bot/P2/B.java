package P2;

import H0.C0144d;
import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import Q.D1;
import Q.P1;
import Q.R1;
import Q.f3;
import Q.t3;
import Q.u3;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import Z2.AbstractC0783w;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import i4.AbstractC1118b;
import j1.AbstractC1135a;
import java.util.List;
import l4.InterfaceC1193a;
import m.InterfaceC1194A;
import m0.AbstractC1249d;
import m4.AbstractC1276k;
import v.AbstractC1787b;
import v.AbstractC1799h;
import v.AbstractC1812s;
import v.C1795f;
import v.C1813t;
import v.C1814u;
import v.C1818y;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final /* synthetic */ class B implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4653c = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4.c f4654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ X3.e f4655f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4656g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4657h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4658i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4659j;

    public /* synthetic */ B(Z2.C c6, InterfaceC1942y interfaceC1942y, A.d dVar, l4.c cVar, l4.c cVar2, InterfaceC1193a interfaceC1193a) {
        this.f4656g = c6;
        this.f4657h = interfaceC1942y;
        this.f4658i = dVar;
        this.f4654e = cVar;
        this.f4655f = cVar2;
        this.f4659j = interfaceC1193a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        InterfaceC1193a interfaceC1193a;
        switch (this.f4653c) {
            case 0:
                List list = (List) this.f4656g;
                List list2 = (List) this.f4657h;
                I0.S0 s02 = (I0.S0) this.f4659j;
                l4.c cVar = (l4.c) this.f4655f;
                List list3 = (List) this.f4658i;
                C0626q c0626q = (C0626q) obj2;
                ((Integer) obj3).getClass();
                AbstractC1276k.f((InterfaceC1194A) obj, "$this$AnimatedVisibility");
                InterfaceC1041r d6 = v.t0.d(v.t0.a, AbstractC0350e.a);
                C1795f g3 = AbstractC1799h.g(8);
                boolean h3 = c0626q.h(list) | c0626q.h(list2) | c0626q.f(s02);
                l4.c cVar2 = this.f4654e;
                boolean f6 = h3 | c0626q.f(cVar2) | c0626q.f(cVar) | c0626q.h(list3);
                Object P5 = c0626q.P();
                if (f6 || P5 == C0616l.a) {
                    C0379t c0379t = new C0379t(list, list2, s02, cVar2, cVar, list3);
                    c0626q.m0(c0379t);
                    P5 = c0379t;
                }
                AbstractC1118b.b(d6, null, null, g3, null, null, false, null, (l4.c) P5, c0626q, 24582, 494);
                return X3.y.a;
            case 1:
                Z2.C c6 = (Z2.C) this.f4656g;
                InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f4657h;
                A.d dVar = (A.d) this.f4658i;
                l4.c cVar3 = (l4.c) this.f4655f;
                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) this.f4659j;
                C0626q c0626q2 = (C0626q) obj2;
                int intValue = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1814u) obj, "$this$Card");
                if (c0626q2.S(intValue & 1, (intValue & 17) != 16)) {
                    C1038o c1038o = C1038o.a;
                    InterfaceC1041r y5 = AbstractC1787b.y(c1038o, 16);
                    C1813t a = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q2, 0);
                    int hashCode = Long.hashCode(c0626q2.f8164T);
                    InterfaceC0617l0 l3 = c0626q2.l();
                    InterfaceC1041r c7 = AbstractC1024a.c(c0626q2, y5);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f = C0150g.f1924b;
                    c0626q2.f0();
                    if (c0626q2.f8163S) {
                        c0626q2.k(c0148f);
                    } else {
                        c0626q2.p0();
                    }
                    C0146e c0146e = C0150g.f1928f;
                    T.r.G(c0626q2, a, c0146e);
                    C0146e c0146e2 = C0150g.f1927e;
                    T.r.G(c0626q2, l3, c0146e2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    C0146e c0146e3 = C0150g.f1929g;
                    T.r.x(c0626q2, valueOf, c0146e3);
                    C0144d c0144d = C0150g.f1930h;
                    T.r.C(c0626q2, c0144d);
                    C0146e c0146e4 = C0150g.f1926d;
                    T.r.G(c0626q2, c7, c0146e4);
                    String str = c6.f9899b;
                    C1818y c1818y = v.t0.a;
                    boolean h6 = c0626q2.h(interfaceC1942y) | c0626q2.h(dVar);
                    Object P6 = c0626q2.P();
                    C0602e c0602e = C0616l.a;
                    if (h6 || P6 == c0602e) {
                        interfaceC1193a = interfaceC1193a2;
                        P6 = new Z2.D(interfaceC1942y, dVar, 0);
                        c0626q2.m0(P6);
                    } else {
                        interfaceC1193a = interfaceC1193a2;
                    }
                    D1.a(str, this.f4654e, AbstractC1249d.t(c1818y, (l4.c) P6), false, false, null, AbstractC0783w.f10429l, null, null, null, null, false, null, null, null, true, 0, 0, null, null, c0626q2, 1572864, 12582912, 8257464);
                    AbstractC1787b.h(c0626q2, v.t0.d(c1038o, 12));
                    String str2 = c6.f9900c;
                    boolean h7 = c0626q2.h(interfaceC1942y) | c0626q2.h(dVar);
                    Object P7 = c0626q2.P();
                    if (h7 || P7 == c0602e) {
                        P7 = new Z2.D(interfaceC1942y, dVar, 1);
                        c0626q2.m0(P7);
                    }
                    D1.a(str2, cVar3, AbstractC1249d.t(c1818y, (l4.c) P7), false, false, null, AbstractC0783w.f10431m, null, null, null, null, false, null, null, null, true, 0, 0, null, null, c0626q2, 1572864, 12582912, 8257464);
                    v.p0 a6 = v.o0.a(AbstractC1799h.f15304b, C1026c.f11795m, c0626q2, 6);
                    int hashCode2 = Long.hashCode(c0626q2.f8164T);
                    InterfaceC0617l0 l5 = c0626q2.l();
                    InterfaceC1041r c8 = AbstractC1024a.c(c0626q2, c1818y);
                    c0626q2.f0();
                    if (c0626q2.f8163S) {
                        c0626q2.k(c0148f);
                    } else {
                        c0626q2.p0();
                    }
                    T.r.G(c0626q2, a6, c0146e);
                    T.r.G(c0626q2, l5, c0146e2);
                    AbstractC1135a.n(hashCode2, c0626q2, c0146e3, c0626q2, c0144d);
                    T.r.G(c0626q2, c8, c0146e4);
                    R1.o(interfaceC1193a, null, false, null, null, null, AbstractC0783w.f10433n, c0626q2, 805306368, 510);
                    c0626q2.p(true);
                    c0626q2.p(true);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
            default:
                String str3 = (String) this.f4657h;
                List<X3.i> list4 = (List) this.f4656g;
                InterfaceC1193a interfaceC1193a3 = (InterfaceC1193a) this.f4659j;
                InterfaceC1193a interfaceC1193a4 = (InterfaceC1193a) this.f4655f;
                C0626q c0626q3 = (C0626q) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1814u) obj, "$this$Card");
                if (c0626q3.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                    C1813t a7 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q3, 0);
                    int hashCode3 = Long.hashCode(c0626q3.f8164T);
                    InterfaceC0617l0 l6 = c0626q3.l();
                    C1038o c1038o2 = C1038o.a;
                    InterfaceC1041r c9 = AbstractC1024a.c(c0626q3, c1038o2);
                    InterfaceC0152h.a.getClass();
                    InterfaceC1193a interfaceC1193a5 = C0150g.f1924b;
                    c0626q3.f0();
                    if (c0626q3.f8163S) {
                        c0626q3.k(interfaceC1193a5);
                    } else {
                        c0626q3.p0();
                    }
                    T.r.G(c0626q3, a7, C0150g.f1928f);
                    T.r.G(c0626q3, l6, C0150g.f1927e);
                    T.r.x(c0626q3, Integer.valueOf(hashCode3), C0150g.f1929g);
                    T.r.C(c0626q3, C0150g.f1930h);
                    T.r.G(c0626q3, c9, C0150g.f1926d);
                    float f7 = 24;
                    C1038o c1038o3 = c1038o2;
                    float f8 = f7;
                    int i6 = 0;
                    f3.b(str3, AbstractC1787b.z(c1038o2, f7, f7), ((Q.N) c0626q3.j(Q.O.a)).f5427q, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q3.j(u3.a)).f6126g, c0626q3, 48, 0, 131064);
                    C0626q c0626q4 = c0626q3;
                    c0626q4.b0(961866179);
                    C0626q c0626q5 = c0626q4;
                    for (X3.i iVar : list4) {
                        final Object obj4 = iVar.f9393c;
                        String str4 = (String) iVar.f9394e;
                        C1818y c1818y2 = v.t0.a;
                        Object obj5 = this.f4658i;
                        boolean b5 = AbstractC1276k.b(obj5, obj4);
                        final l4.c cVar4 = this.f4654e;
                        boolean f9 = c0626q5.f(cVar4) | c0626q5.h(obj4);
                        Object P8 = c0626q5.P();
                        Object obj6 = C0616l.a;
                        if (f9 || P8 == obj6) {
                            final int i7 = 0;
                            P8 = new InterfaceC1193a() { // from class: Z2.c1
                                @Override // l4.InterfaceC1193a
                                public final Object b() {
                                    switch (i7) {
                                        case 0:
                                            cVar4.f(obj4);
                                            break;
                                        default:
                                            cVar4.f(obj4);
                                            break;
                                    }
                                    return X3.y.a;
                                }
                            };
                            c0626q5.m0(P8);
                        }
                        InterfaceC1041r b6 = B.c.b(c1818y2, b5, (InterfaceC1193a) P8);
                        float f10 = i6;
                        float f11 = f8;
                        InterfaceC1041r z5 = AbstractC1787b.z(b6, f11, f10);
                        v.p0 a8 = v.o0.a(AbstractC1799h.a, C1026c.f11796n, c0626q5, 48);
                        int hashCode4 = Long.hashCode(c0626q5.f8164T);
                        InterfaceC0617l0 l7 = c0626q5.l();
                        InterfaceC1041r c10 = AbstractC1024a.c(c0626q5, z5);
                        InterfaceC0152h.a.getClass();
                        InterfaceC1193a interfaceC1193a6 = C0150g.f1924b;
                        c0626q5.f0();
                        if (c0626q5.f8163S) {
                            c0626q5.k(interfaceC1193a6);
                        } else {
                            c0626q5.p0();
                        }
                        T.r.G(c0626q5, a8, C0150g.f1928f);
                        T.r.G(c0626q5, l7, C0150g.f1927e);
                        T.r.x(c0626q5, Integer.valueOf(hashCode4), C0150g.f1929g);
                        T.r.C(c0626q5, C0150g.f1930h);
                        T.r.G(c0626q5, c10, C0150g.f1926d);
                        boolean b7 = AbstractC1276k.b(obj5, obj4);
                        boolean f12 = c0626q5.f(cVar4) | c0626q5.h(obj4);
                        Object P9 = c0626q5.P();
                        if (f12 || P9 == obj6) {
                            final int i8 = 1;
                            P9 = new InterfaceC1193a() { // from class: Z2.c1
                                @Override // l4.InterfaceC1193a
                                public final Object b() {
                                    switch (i8) {
                                        case 0:
                                            cVar4.f(obj4);
                                            break;
                                        default:
                                            cVar4.f(obj4);
                                            break;
                                    }
                                    return X3.y.a;
                                }
                            };
                            c0626q5.m0(P9);
                        }
                        C1038o c1038o4 = c1038o3;
                        C0626q c0626q6 = c0626q5;
                        P1.a(b7, (InterfaceC1193a) P9, AbstractC1787b.w(c1038o4, -12, f10), false, null, c0626q6, 384, 56);
                        C0626q c0626q7 = c0626q6;
                        f3.b(str4, AbstractC1787b.C(c1038o4, 6, S.l.f7374V, S.l.f7374V, S.l.f7374V, 14), ((Q.N) c0626q7.j(Q.O.a)).f5427q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 48, 0, 262136);
                        c0626q7.p(true);
                        f8 = f11;
                        c1038o3 = c1038o4;
                        i6 = 0;
                        c0626q5 = c0626q7;
                    }
                    C1038o c1038o5 = c1038o3;
                    c0626q5.p(i6);
                    InterfaceC1041r z6 = AbstractC1787b.z(v.t0.a, f8, 16);
                    v.p0 a9 = v.o0.a(AbstractC1799h.f15304b, C1026c.f11795m, c0626q5, 6);
                    int hashCode5 = Long.hashCode(c0626q5.f8164T);
                    InterfaceC0617l0 l8 = c0626q5.l();
                    InterfaceC1041r c11 = AbstractC1024a.c(c0626q5, z6);
                    InterfaceC0152h.a.getClass();
                    InterfaceC1193a interfaceC1193a7 = C0150g.f1924b;
                    c0626q5.f0();
                    if (c0626q5.f8163S) {
                        c0626q5.k(interfaceC1193a7);
                    } else {
                        c0626q5.p0();
                    }
                    T.r.G(c0626q5, a9, C0150g.f1928f);
                    T.r.G(c0626q5, l8, C0150g.f1927e);
                    T.r.x(c0626q5, Integer.valueOf(hashCode5), C0150g.f1929g);
                    T.r.C(c0626q5, C0150g.f1930h);
                    T.r.G(c0626q5, c11, C0150g.f1926d);
                    R1.o(interfaceC1193a3, null, false, null, null, null, AbstractC0783w.f10438p0, c0626q5, 805306368, 510);
                    AbstractC1787b.h(c0626q5, v.t0.n(c1038o5, 8));
                    R1.o(interfaceC1193a4, null, false, null, null, null, AbstractC0783w.f10440q0, c0626q5, 805306368, 510);
                    c0626q5.p(true);
                    c0626q5.p(true);
                } else {
                    c0626q3.V();
                }
                return X3.y.a;
        }
    }

    public /* synthetic */ B(String str, List list, Object obj, l4.c cVar, InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2) {
        this.f4657h = str;
        this.f4656g = list;
        this.f4658i = obj;
        this.f4654e = cVar;
        this.f4659j = interfaceC1193a;
        this.f4655f = interfaceC1193a2;
    }

    public /* synthetic */ B(List list, List list2, I0.S0 s02, l4.c cVar, l4.c cVar2, List list3) {
        this.f4656g = list;
        this.f4657h = list2;
        this.f4659j = s02;
        this.f4654e = cVar;
        this.f4655f = cVar2;
        this.f4658i = list3;
    }
}
