package Z2;

import H0.C0150g;
import H0.InterfaceC0152h;
import I0.AbstractC0204q0;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import a3.C0810H;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import e1.InterfaceC0961c;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.C1045v;
import h0.InterfaceC1041r;
import java.util.List;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n.AbstractC1318d;
import n.C1316c;
import v.AbstractC1806l;
import v.C1810p;
import v.C1818y;
import w0.InterfaceC1830a;
import x.C1851b;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class W0 implements l4.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f10111c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z0 f10112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1942y f10113f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ T.X f10114g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l4.c f10115h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1830a f10116i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l4.c f10117j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T.X f10118k;

    public W0(List list, Z0 z02, InterfaceC1942y interfaceC1942y, T.X x5, l4.c cVar, InterfaceC1830a interfaceC1830a, l4.c cVar2, T.X x6) {
        this.f10111c = list;
        this.f10112e = z02;
        this.f10113f = interfaceC1942y;
        this.f10114g = x5;
        this.f10115h = cVar;
        this.f10116i = interfaceC1830a;
        this.f10117j = cVar2;
        this.f10118k = x6;
    }

    @Override // l4.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i6;
        Object obj5;
        boolean z5;
        InterfaceC1041r a;
        Object obj6;
        T.X x5;
        C1851b c1851b = (C1851b) obj;
        int intValue = ((Number) obj2).intValue();
        C0626q c0626q = (C0626q) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i6 = (c0626q.f(c1851b) ? 4 : 2) | intValue2;
        } else {
            i6 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i6 |= c0626q.d(intValue) ? 32 : 16;
        }
        if (c0626q.S(i6 & 1, (i6 & 147) != 146)) {
            C0810H c0810h = (C0810H) this.f10111c.get(intValue);
            c0626q.b0(-1865198385);
            String str = c0810h.a.a;
            float e02 = ((InterfaceC0961c) c0626q.j(AbstractC0204q0.f2358h)).e0(140);
            boolean f6 = c0626q.f(str);
            Object P5 = c0626q.P();
            Object obj7 = C0616l.a;
            if (f6 || P5 == obj7) {
                P5 = AbstractC1318d.a(S.l.f7374V);
                c0626q.m0(P5);
            }
            C1316c c1316c = (C1316c) P5;
            T.X x6 = this.f10114g;
            boolean b5 = AbstractC1276k.b((String) x6.getValue(), str);
            boolean z6 = !c0810h.a.f11174j;
            String str2 = (String) x6.getValue();
            boolean g3 = c0626q.g(b5) | c0626q.h(c1316c);
            Object P6 = c0626q.P();
            if (g3 || P6 == obj7) {
                P6 = new Q0(b5, c1316c, null);
                c0626q.m0(P6);
            }
            T.r.f(c0626q, str2, (l4.e) P6);
            Z0 z02 = this.f10112e;
            z02.getClass();
            AbstractC1276k.f(str, "providerId");
            boolean b6 = AbstractC1276k.b((String) z02.f10137f.getValue(), str);
            float g6 = b6 ? z02.f10138g.g() : S.l.f7374V;
            C1038o c1038o = C1038o.a;
            if (b6) {
                obj5 = z02;
                z5 = b6;
                a = c1038o;
            } else {
                obj5 = z02;
                z5 = b6;
                a = C1851b.a(c1851b, AbstractC1318d.r(1.0f, 400.0f, null, 4));
            }
            InterfaceC1942y interfaceC1942y = this.f10113f;
            boolean h3 = c0626q.h(interfaceC1942y) | c0626q.h(c1316c);
            Object P7 = c0626q.P();
            if (h3 || P7 == obj7) {
                P7 = new C0775s(interfaceC1942y, x6, c1316c, 2);
                c0626q.m0(P7);
            }
            InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P7;
            C1818y c1818y = v.t0.a;
            InterfaceC1041r c6 = c1818y.c(a).c(new C1045v(z5 ? 1.0f : S.l.f7374V));
            boolean c7 = c0626q.c(g6);
            Object P8 = c0626q.P();
            if (c7 || P8 == obj7) {
                P8 = new C0750f(g6, 1);
                c0626q.m0(P8);
            }
            InterfaceC1041r o5 = o0.y.o(c6, (l4.c) P8);
            F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c8 = AbstractC1024a.c(c0626q, o5);
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
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q, C0150g.f1930h);
            T.r.G(c0626q, c8, C0150g.f1926d);
            InterfaceC1041r e6 = C1810p.f15333b.e(c1038o, C1026c.f11791i);
            boolean f7 = c0626q.f(interfaceC1193a);
            Object obj8 = this.f10115h;
            boolean f8 = f7 | c0626q.f(obj8) | c0626q.f(str);
            Object P9 = c0626q.P();
            if (f8 || P9 == obj7) {
                P9 = new Q2.m(interfaceC1193a, obj8, str, 4);
                c0626q.m0(P9);
            }
            InterfaceC1193a interfaceC1193a3 = (InterfaceC1193a) P9;
            boolean g7 = c0626q.g(z6) | c0626q.f(interfaceC1193a) | c0626q.h(c0810h);
            Object P10 = c0626q.P();
            if (g7 || P10 == obj7) {
                P10 = new R0(z6, interfaceC1193a, c0810h, this.f10118k);
                c0626q.m0(P10);
            }
            Object obj9 = obj5;
            AbstractC0783w.J(e6, z6, interfaceC1193a3, (InterfaceC1193a) P10, c0626q, 0);
            boolean h6 = c0626q.h(c1316c);
            Object P11 = c0626q.P();
            if (h6 || P11 == obj7) {
                P11 = new C0756i(c1316c, 2);
                c0626q.m0(P11);
            }
            InterfaceC1041r o6 = o0.y.o(c1818y, (l4.c) P11);
            InterfaceC1830a interfaceC1830a = this.f10116i;
            boolean h7 = c0626q.h(interfaceC1830a) | c0626q.h(obj9) | c0626q.f(str);
            Object P12 = c0626q.P();
            if (h7 || P12 == obj7) {
                P12 = new C0760k(interfaceC1830a, obj9, str, 1);
                c0626q.m0(P12);
            }
            InterfaceC1041r a6 = B0.Q.a(o6, str, (PointerInputEventHandler) P12);
            boolean f9 = c0626q.f(str) | c0626q.h(interfaceC1942y) | c0626q.h(c1316c) | c0626q.c(e02);
            Object P13 = c0626q.P();
            if (f9 || P13 == obj7) {
                obj6 = obj7;
                Object c0772q = new C0772q(e02, 2, x6, str, c1316c, this.f10113f);
                x5 = x6;
                str = str;
                c0626q.m0(c0772q);
                P13 = c0772q;
            } else {
                obj6 = obj7;
                x5 = x6;
            }
            InterfaceC1041r a7 = B0.Q.a(a6, str, (PointerInputEventHandler) P13);
            boolean f10 = c0626q.f(interfaceC1193a);
            l4.c cVar = this.f10117j;
            boolean f11 = f10 | c0626q.f(cVar) | c0626q.f(str);
            Object P14 = c0626q.P();
            if (f11 || P14 == obj6) {
                Object u5 = new U(interfaceC1193a, cVar, str, x5, 1);
                c0626q.m0(u5);
                P14 = u5;
            }
            AbstractC0783w.I(c0810h, (InterfaceC1193a) P14, a7, c0626q, C0810H.f10622i, 0);
            c0626q.p(true);
            c0626q.p(false);
        } else {
            c0626q.V();
        }
        return X3.y.a;
    }
}
