package Q;

import H0.C0146e;
import H0.C0150g;
import H0.InterfaceC0152h;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n.AbstractC1318d;
import n.C1316c;
import n.C1327h0;
import n.C1336m;
import v.AbstractC1806l;

/* loaded from: classes.dex */
public final class E2 implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I2 f5226c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ I2 f5227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0470u0 f5228f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f5229g;

    public E2(I2 i22, I2 i23, C0470u0 c0470u0, String str) {
        this.f5226c = i22;
        this.f5227e = i23;
        this.f5228f = c0470u0;
        this.f5229g = str;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        l4.e eVar = (l4.e) obj;
        C0626q c0626q = (C0626q) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c0626q.h(eVar) ? 4 : 2;
        }
        if (c0626q.S(intValue & 1, (intValue & 19) != 18)) {
            I2 i22 = this.f5227e;
            Object obj4 = this.f5226c;
            boolean b5 = AbstractC1276k.b(obj4, i22);
            C1327h0 u5 = R1.u(S.p.f7416g, c0626q);
            boolean f6 = c0626q.f(obj4);
            Object obj5 = this.f5228f;
            boolean h3 = f6 | c0626q.h(obj5);
            Object P5 = c0626q.P();
            Object obj6 = C0616l.a;
            if (h3 || P5 == obj6) {
                P5 = new D.r(17, obj4, obj5);
                c0626q.m0(P5);
            }
            InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P5;
            Object P6 = c0626q.P();
            if (P6 == obj6) {
                P6 = AbstractC1318d.a(!b5 ? 1.0f : S.l.f7374V);
                c0626q.m0(P6);
            }
            C1316c c1316c = (C1316c) P6;
            Boolean valueOf = Boolean.valueOf(b5);
            boolean h6 = c0626q.h(c1316c) | c0626q.g(b5) | c0626q.h(u5) | c0626q.f(interfaceC1193a);
            Object P7 = c0626q.P();
            if (h6 || P7 == obj6) {
                Object g22 = new G2(c1316c, b5, u5, interfaceC1193a, null);
                c0626q.m0(g22);
                P7 = g22;
            }
            T.r.f(c0626q, valueOf, (l4.e) P7);
            C1336m c1336m = c1316c.f13093c;
            C1327h0 u6 = R1.u(S.p.f7414e, c0626q);
            Object P8 = c0626q.P();
            if (P8 == obj6) {
                P8 = AbstractC1318d.a(b5 ? 0.8f : 1.0f);
                c0626q.m0(P8);
            }
            C1316c c1316c2 = (C1316c) P8;
            Boolean valueOf2 = Boolean.valueOf(b5);
            boolean h7 = c0626q.h(c1316c2) | c0626q.g(b5) | c0626q.h(u6);
            Object P9 = c0626q.P();
            if (h7 || P9 == obj6) {
                P9 = new H2(c1316c2, b5, u6, null);
                c0626q.m0(P9);
            }
            T.r.f(c0626q, valueOf2, (l4.e) P9);
            C1336m c1336m2 = c1316c2.f13093c;
            InterfaceC1041r p5 = o0.y.p(C1038o.a, ((Number) c1336m2.f13186e.getValue()).floatValue(), ((Number) c1336m2.f13186e.getValue()).floatValue(), ((Number) c1336m.f13186e.getValue()).floatValue(), S.l.f7374V, null, 131064);
            boolean g3 = c0626q.g(b5) | c0626q.f(obj4);
            Object obj7 = this.f5229g;
            boolean f7 = g3 | c0626q.f(obj7);
            Object P10 = c0626q.P();
            if (f7 || P10 == obj6) {
                P10 = new J1.k(b5, obj7, obj4, 1);
                c0626q.m0(P10);
            }
            InterfaceC1041r a = P0.n.a(p5, false, (l4.c) P10);
            F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, a);
            InterfaceC0152h.a.getClass();
            InterfaceC1193a interfaceC1193a2 = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(interfaceC1193a2);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d6, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            C0146e c0146e = C0150g.f1929g;
            if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode))) {
                B3.e.v(hashCode, c0626q, hashCode, c0146e);
            }
            T.r.G(c0626q, c6, C0150g.f1926d);
            eVar.m(c0626q, Integer.valueOf(intValue & 14));
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        return X3.y.a;
    }
}
