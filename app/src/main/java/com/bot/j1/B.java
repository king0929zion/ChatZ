package J1;

import F0.V;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import I0.AbstractC0204q0;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import T.X;
import T.d1;
import Z2.AbstractC0783w;
import Z2.C0756i;
import Z2.C0772q;
import Z2.C0775s;
import Z2.Q;
import Z2.U;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b0.AbstractC0874g;
import com.bot.core.model.McpServer;
import e0.InterfaceC0958c;
import e1.InterfaceC0961c;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import java.util.List;
import java.util.ListIterator;
import l4.InterfaceC1193a;
import m.C1230l;
import m4.AbstractC1276k;
import n.AbstractC1318d;
import n.C1316c;
import n.C1321e0;
import v.AbstractC1806l;
import v.C1810p;
import v.C1818y;
import v.t0;
import x.C1851b;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class B implements l4.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2815c = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ X f2816e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2817f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2818g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2819h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d1 f2820i;

    public B(List list, InterfaceC1942y interfaceC1942y, X x5, l4.c cVar, X x6) {
        this.f2817f = list;
        this.f2818g = interfaceC1942y;
        this.f2816e = x5;
        this.f2819h = cVar;
        this.f2820i = x6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [T.q] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object] */
    @Override // l4.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z5;
        I1.j jVar;
        int i6;
        X3.y yVar;
        boolean z6;
        String str;
        int i7 = this.f2815c;
        X3.y yVar2 = X3.y.a;
        d1 d1Var = this.f2820i;
        Object obj5 = this.f2817f;
        Object obj6 = this.f2819h;
        Object obj7 = this.f2818g;
        switch (i7) {
            case 0:
                C1230l c1230l = (C1230l) obj;
                I1.j jVar2 = (I1.j) obj2;
                C0626q c0626q = (C0626q) obj3;
                ((Number) obj4).intValue();
                boolean b5 = AbstractC1276k.b(((C1321e0) obj5).f13135c.getValue(), (I1.j) obj7);
                if (!((Boolean) this.f2816e.getValue()).booleanValue() && !b5) {
                    List list = (List) d1Var.getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            jVar = listIterator.previous();
                            if (AbstractC1276k.b(jVar2, (I1.j) jVar)) {
                            }
                        } else {
                            jVar = 0;
                        }
                    }
                    jVar2 = jVar;
                }
                if (jVar2 == null) {
                    c0626q.b0(105930796);
                    z5 = false;
                } else {
                    z5 = false;
                    c0626q.b0(-1520603531);
                    Y3.C.b(jVar2, (InterfaceC0958c) obj6, AbstractC0874g.c(-1263531443, new m(jVar2, c1230l), c0626q), c0626q, 384);
                }
                c0626q.p(z5);
                return yVar2;
            default:
                C1851b c1851b = (C1851b) obj;
                int intValue = ((Number) obj2).intValue();
                ?? r10 = (C0626q) obj3;
                int intValue2 = ((Number) obj4).intValue();
                l4.c cVar = (l4.c) obj6;
                InterfaceC1942y interfaceC1942y = (InterfaceC1942y) obj7;
                if ((intValue2 & 6) == 0) {
                    i6 = (r10.f(c1851b) ? 4 : 2) | intValue2;
                } else {
                    i6 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i6 |= r10.d(intValue) ? 32 : 16;
                }
                if (!r10.S(i6 & 1, (i6 & 147) != 146)) {
                    r10.V();
                    return yVar2;
                }
                McpServer mcpServer = (McpServer) ((List) obj5).get(intValue);
                r10.b0(-1929729476);
                String str2 = mcpServer.a;
                float e02 = ((InterfaceC0961c) r10.j(AbstractC0204q0.f2358h)).e0(80);
                boolean f6 = r10.f(str2);
                Object P5 = r10.P();
                Object obj8 = C0616l.a;
                if (f6 || P5 == obj8) {
                    P5 = AbstractC1318d.a(S.l.f7374V);
                    r10.m0(P5);
                }
                C1316c c1316c = (C1316c) P5;
                X x5 = this.f2816e;
                boolean b6 = AbstractC1276k.b((String) x5.getValue(), str2);
                String str3 = (String) x5.getValue();
                boolean g3 = r10.g(b6) | r10.h(c1316c);
                Object P6 = r10.P();
                if (g3 || P6 == obj8) {
                    yVar = yVar2;
                    P6 = new Q(b6, c1316c, null);
                    r10.m0(P6);
                } else {
                    yVar = yVar2;
                }
                T.r.f(r10, str3, (l4.e) P6);
                boolean h3 = r10.h(interfaceC1942y) | r10.h(c1316c);
                Object P7 = r10.P();
                if (h3 || P7 == obj8) {
                    P7 = new C0775s(interfaceC1942y, x5, c1316c, 1);
                    r10.m0(P7);
                }
                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P7;
                C1818y c1818y = t0.a;
                V d6 = AbstractC1806l.d(C1026c.f11786c, false);
                int hashCode = Long.hashCode(r10.f8164T);
                InterfaceC0617l0 l3 = r10.l();
                InterfaceC1041r c6 = AbstractC1024a.c(r10, c1818y);
                InterfaceC0152h.a.getClass();
                C0148f c0148f = C0150g.f1924b;
                r10.f0();
                if (r10.f8163S) {
                    r10.k(c0148f);
                } else {
                    r10.p0();
                }
                T.r.G(r10, d6, C0150g.f1928f);
                T.r.G(r10, l3, C0150g.f1927e);
                T.r.x(r10, Integer.valueOf(hashCode), C0150g.f1929g);
                T.r.C(r10, C0150g.f1930h);
                T.r.G(r10, c6, C0150g.f1926d);
                InterfaceC1041r e6 = C1810p.f15333b.e(C1038o.a, C1026c.f11791i);
                boolean f7 = r10.f(interfaceC1193a) | r10.h(mcpServer);
                Object P8 = r10.P();
                if (f7 || P8 == obj8) {
                    P8 = new Q2.m(interfaceC1193a, mcpServer, (X) d1Var, 3);
                    r10.m0(P8);
                }
                AbstractC0783w.p(e6, (InterfaceC1193a) P8, r10, 0);
                boolean h6 = r10.h(c1316c);
                Object P9 = r10.P();
                if (h6 || P9 == obj8) {
                    z6 = true;
                    P9 = new C0756i(c1316c, 1);
                    r10.m0(P9);
                } else {
                    z6 = true;
                }
                InterfaceC1041r o5 = o0.y.o(c1818y, (l4.c) P9);
                boolean f8 = r10.f(str2) | r10.h(interfaceC1942y) | r10.h(c1316c) | r10.c(e02);
                Object P10 = r10.P();
                if (f8 || P10 == obj8) {
                    C0772q c0772q = new C0772q(e02, 1, x5, str2, c1316c, (InterfaceC1942y) obj7);
                    str = str2;
                    r10.m0(c0772q);
                    P10 = c0772q;
                } else {
                    str = str2;
                }
                InterfaceC1041r a = B0.Q.a(o5, str, (PointerInputEventHandler) P10);
                boolean f9 = r10.f(interfaceC1193a) | r10.f(cVar) | r10.f(str);
                Object P11 = r10.P();
                if (f9 || P11 == obj8) {
                    U u5 = new U(interfaceC1193a, cVar, str, x5, 0);
                    r10.m0(u5);
                    P11 = u5;
                }
                McpServer.Companion companion = McpServer.Companion;
                AbstractC0783w.n(mcpServer, (InterfaceC1193a) P11, a, r10, 8);
                r10.p(z6);
                r10.p(false);
                return yVar;
        }
    }

    public B(C1321e0 c1321e0, I1.j jVar, e0.d dVar, X x5, d1 d1Var) {
        this.f2817f = c1321e0;
        this.f2818g = jVar;
        this.f2819h = dVar;
        this.f2816e = x5;
        this.f2820i = d1Var;
    }
}
