package D;

import F0.AbstractC0137z;
import H0.C0144d;
import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import I0.AbstractC0204q0;
import O.AbstractC0317k0;
import O.C0332s0;
import P2.C0345b0;
import P2.C0389z;
import Q.AbstractC0492z2;
import Q.C2;
import Q.R1;
import Q.f3;
import Q.t3;
import Q.u3;
import T.C0601d0;
import T.C0602e;
import T.C0607g0;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import Z2.AbstractC0783w;
import a3.C0812a;
import com.bot.core.model.McpServer;
import com.bot.core.model.McpTool;
import com.bot.core.model.McpToolParameter;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import e1.C0959a;
import e1.InterfaceC0961c;
import f0.C0996s;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import i4.AbstractC1117a;
import j1.AbstractC1135a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import l4.InterfaceC1193a;
import m.InterfaceC1194A;
import m4.AbstractC1276k;
import n.C1340o;
import p.AbstractC1464z;
import u4.AbstractC1776n;
import v.AbstractC1787b;
import v.AbstractC1799h;
import v.AbstractC1806l;
import v.AbstractC1812s;
import v.C1813t;
import v.C1814u;
import v.C1818y;
import w.AbstractC1829a;
import x.C1851b;

/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f985c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f986e;

    public /* synthetic */ b1(H4.c cVar, H4.b bVar) {
        this.f985c = 2;
        this.f986e = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v5, types: [X3.k] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.ArrayList] */
    private final Object a(Object obj, Object obj2, Object obj3) {
        int i6;
        C1038o c1038o;
        boolean z5;
        List list;
        String str;
        kotlinx.serialization.json.b bVar;
        ?? b5;
        String str2;
        boolean z6;
        boolean z7;
        boolean z8;
        McpTool mcpTool = (McpTool) this.f986e;
        C0626q c0626q = (C0626q) obj2;
        int intValue = ((Integer) obj3).intValue();
        AbstractC1276k.f((C1814u) obj, "$this$Card");
        if (c0626q.S(intValue & 1, (intValue & 17) != 16)) {
            C1038o c1038o2 = C1038o.a;
            InterfaceC1041r y5 = AbstractC1787b.y(c1038o2, 12);
            C1813t a = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q, 0);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, y5);
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
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q, C0150g.f1930h);
            T.r.G(c0626q, c6, C0150g.f1926d);
            String str3 = mcpTool.a;
            T.e1 e1Var = u3.a;
            S0.P p5 = ((t3) c0626q.j(e1Var)).f6128i;
            T.e1 e1Var2 = Q.O.a;
            f3.b(str3, null, ((Q.N) c0626q.j(e1Var2)).f5427q, 0L, W0.k.f8835i, 0L, null, 0L, 0, false, 0, 0, p5, c0626q, 1572864, 0, 131002);
            C0626q c0626q2 = c0626q;
            String str4 = mcpTool.f11217b;
            if (str4 == null || AbstractC1776n.Q(str4)) {
                i6 = 1099347907;
                c1038o = c1038o2;
                z5 = false;
                c0626q2.b0(1099347907);
            } else {
                c0626q2.b0(1106545859);
                i6 = 1099347907;
                c1038o = c1038o2;
                f3.b(mcpTool.f11217b, AbstractC1787b.C(c1038o2, S.l.f7374V, 4, S.l.f7374V, S.l.f7374V, 13), ((Q.N) c0626q2.j(e1Var2)).f5429s, 0L, null, 0L, null, 0L, 2, false, 3, 0, ((t3) c0626q2.j(e1Var)).f6131l, c0626q2, 48, 24960, 110584);
                c0626q2 = c0626q2;
                z5 = false;
            }
            c0626q2.p(z5);
            kotlinx.serialization.json.c cVar = mcpTool.f11218c;
            kotlinx.serialization.json.b bVar2 = cVar != null ? (kotlinx.serialization.json.b) cVar.get("properties") : null;
            kotlinx.serialization.json.c cVar2 = bVar2 instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) bVar2 : null;
            List list2 = Y3.v.f9812c;
            if (cVar2 == null) {
                list = list2;
            } else {
                if (cVar != null && (bVar = (kotlinx.serialization.json.b) cVar.get("required")) != null) {
                    try {
                        kotlinx.serialization.json.a aVar = bVar instanceof kotlinx.serialization.json.a ? (kotlinx.serialization.json.a) bVar : null;
                        if (aVar != null) {
                            b5 = new ArrayList(Y3.n.Z(aVar, 10));
                            for (kotlinx.serialization.json.b bVar3 : aVar.f12632c) {
                                kotlinx.serialization.json.d dVar = bVar3 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) bVar3 : null;
                                if (dVar == null || (str2 = dVar.a()) == null) {
                                    str2 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                }
                                b5.add(str2);
                            }
                        } else {
                            b5 = list2;
                        }
                    } catch (Throwable th) {
                        b5 = X3.a.b(th);
                    }
                    if (!(b5 instanceof X3.k)) {
                        list2 = b5;
                    }
                    list2 = list2;
                }
                Set<String> keySet = cVar2.f12633c.keySet();
                ArrayList arrayList = new ArrayList(Y3.n.Z(keySet, 10));
                for (String str5 : keySet) {
                    Object obj4 = cVar2.get(str5);
                    kotlinx.serialization.json.c cVar3 = obj4 instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) obj4 : null;
                    kotlinx.serialization.json.b bVar4 = cVar3 != null ? (kotlinx.serialization.json.b) cVar3.get("type") : null;
                    kotlinx.serialization.json.d dVar2 = bVar4 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) bVar4 : null;
                    if (dVar2 == null || (str = dVar2.a()) == null) {
                        str = "string";
                    }
                    kotlinx.serialization.json.b bVar5 = cVar3 != null ? (kotlinx.serialization.json.b) cVar3.get("description") : null;
                    kotlinx.serialization.json.d dVar3 = bVar5 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) bVar5 : null;
                    arrayList.add(new McpToolParameter(str5, str, dVar3 != null ? dVar3.a() : null, list2.contains(str5)));
                }
                list = arrayList;
            }
            if (list.isEmpty()) {
                z6 = z5;
                z7 = true;
                c0626q2.b0(i6);
            } else {
                c0626q2.b0(1107082562);
                AbstractC1787b.h(c0626q2, v.t0.d(c1038o, 8));
                C0626q c0626q3 = c0626q2;
                boolean z9 = z5;
                f3.b(h5.e.j0(R.string.mcp_tool_params, c0626q2), null, ((Q.N) c0626q2.j(Q.O.a)).a, 0L, W0.k.f8835i, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q2.j(u3.a)).f6134o, c0626q3, 1572864, 0, 131002);
                c0626q2 = c0626q3;
                c0626q2.b0(-657012908);
                char c7 = 5;
                for (McpToolParameter mcpToolParameter : Y3.m.H0(list, 5)) {
                    C1038o c1038o3 = c1038o;
                    InterfaceC1041r C5 = AbstractC1787b.C(c1038o3, S.l.f7374V, 2, S.l.f7374V, S.l.f7374V, 13);
                    v.p0 a6 = v.o0.a(AbstractC1799h.a, C1026c.f11796n, c0626q2, 48);
                    int hashCode2 = Long.hashCode(c0626q2.f8164T);
                    InterfaceC0617l0 l5 = c0626q2.l();
                    InterfaceC1041r c8 = AbstractC1024a.c(c0626q2, C5);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f2 = C0150g.f1924b;
                    c0626q2.f0();
                    if (c0626q2.f8163S) {
                        c0626q2.k(c0148f2);
                    } else {
                        c0626q2.p0();
                    }
                    T.r.G(c0626q2, a6, C0150g.f1928f);
                    T.r.G(c0626q2, l5, C0150g.f1927e);
                    T.r.x(c0626q2, Integer.valueOf(hashCode2), C0150g.f1929g);
                    T.r.C(c0626q2, C0150g.f1930h);
                    T.r.G(c0626q2, c8, C0150g.f1926d);
                    String str6 = mcpToolParameter.a;
                    T.e1 e1Var3 = u3.a;
                    S0.P p6 = ((t3) c0626q2.j(e1Var3)).f6131l;
                    T.e1 e1Var4 = Q.O.a;
                    List list3 = list;
                    C0626q c0626q4 = c0626q2;
                    f3.b(str6, null, ((Q.N) c0626q2.j(e1Var4)).f5427q, 0L, W0.k.f8835i, 0L, null, 0L, 0, false, 0, 0, p6, c0626q4, 1572864, 0, 131002);
                    f3.b(AbstractC1135a.s(" (", mcpToolParameter.f11219b, ")"), null, ((Q.N) c0626q4.j(e1Var4)).f5429s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q4.j(e1Var3)).f6131l, c0626q4, 0, 0, 131066);
                    c0626q2 = c0626q4;
                    if (mcpToolParameter.f11221d) {
                        c0626q2.b0(-1996307709);
                        f3.b(" *", null, ((Q.N) c0626q2.j(e1Var4)).f5433w, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q2.j(e1Var3)).f6131l, c0626q2, 6, 0, 131066);
                        c0626q2 = c0626q2;
                        z8 = false;
                    } else {
                        z8 = false;
                        c0626q2.b0(-2005180033);
                    }
                    c0626q2.p(z8);
                    c0626q2.p(true);
                    list = list3;
                    z9 = z8;
                    c1038o = c1038o3;
                    c7 = 5;
                }
                List list4 = list;
                C1038o c1038o4 = c1038o;
                z7 = true;
                c0626q2.p(z9);
                if (list4.size() > 5) {
                    c0626q2.b0(1108586093);
                    C0626q c0626q5 = c0626q2;
                    f3.b(h5.e.k0(R.string.mcp_tool_more_params, new Object[]{Integer.valueOf(list4.size() - 5)}, c0626q2), AbstractC1787b.C(c1038o4, S.l.f7374V, 2, S.l.f7374V, S.l.f7374V, 13), ((Q.N) c0626q2.j(Q.O.a)).f5429s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q2.j(u3.a)).f6131l, c0626q5, 48, 0, 131064);
                    c0626q2 = c0626q5;
                    z6 = false;
                } else {
                    z6 = false;
                    c0626q2.b0(1099347907);
                }
                c0626q2.p(z6);
            }
            c0626q2.p(z6);
            c0626q2.p(z7);
        } else {
            c0626q.V();
        }
        return X3.y.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [D.a1, java.lang.Object] */
    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        boolean z5;
        boolean z6;
        Object obj4;
        C0626q c0626q;
        boolean z7;
        boolean z8;
        C1038o c1038o;
        boolean z9;
        boolean z10;
        boolean z11;
        int i6 = this.f985c;
        int i7 = 3;
        C0602e c0602e = C0616l.a;
        X3.y yVar = X3.y.a;
        int i8 = 2;
        Object obj5 = this.f986e;
        switch (i6) {
            case 0:
                S0.P p5 = (S0.P) obj5;
                C0626q c0626q2 = (C0626q) obj2;
                ((Integer) obj3).getClass();
                c0626q2.b0(1582736677);
                InterfaceC0961c interfaceC0961c = (InterfaceC0961c) c0626q2.j(AbstractC0204q0.f2358h);
                W0.d dVar = (W0.d) c0626q2.j(AbstractC0204q0.f2361k);
                e1.m mVar = (e1.m) c0626q2.j(AbstractC0204q0.f2364n);
                boolean f6 = c0626q2.f(p5) | c0626q2.d(mVar.ordinal());
                Object P5 = c0626q2.P();
                Object obj6 = P5;
                if (f6 || P5 == c0602e) {
                    S0.P h3 = S0.F.h(p5, mVar);
                    c0626q2.m0(h3);
                    obj6 = h3;
                }
                S0.P p6 = (S0.P) obj6;
                boolean f7 = c0626q2.f(dVar) | c0626q2.f(p6);
                Object P6 = c0626q2.P();
                Object obj7 = P6;
                if (f7 || P6 == c0602e) {
                    S0.G g3 = p6.a;
                    W0.p pVar = g3.f7575f;
                    W0.k kVar = g3.f7572c;
                    if (kVar == null) {
                        kVar = W0.k.f8834h;
                    }
                    W0.i iVar = g3.f7573d;
                    int i9 = iVar != null ? iVar.a : 0;
                    W0.j jVar = g3.f7574e;
                    W0.r b5 = ((W0.f) dVar).b(pVar, kVar, i9, jVar != null ? jVar.a : 65535);
                    c0626q2.m0(b5);
                    obj7 = b5;
                }
                T.d1 d1Var = (T.d1) obj7;
                Object P7 = c0626q2.P();
                Object obj8 = P7;
                if (P7 == c0602e) {
                    Object value = d1Var.getValue();
                    ?? obj9 = new Object();
                    obj9.a = mVar;
                    obj9.f976b = interfaceC0961c;
                    obj9.f977c = dVar;
                    obj9.f978d = p5;
                    obj9.f979e = value;
                    obj9.f980f = M0.b(p5, interfaceC0961c, dVar);
                    c0626q2.m0(obj9);
                    obj8 = obj9;
                }
                a1 a1Var = (a1) obj8;
                Object value2 = d1Var.getValue();
                if (mVar != a1Var.a || !AbstractC1276k.b(interfaceC0961c, a1Var.f976b) || !AbstractC1276k.b(dVar, a1Var.f977c) || !AbstractC1276k.b(p6, a1Var.f978d) || !AbstractC1276k.b(value2, a1Var.f979e)) {
                    a1Var.a = mVar;
                    a1Var.f976b = interfaceC0961c;
                    a1Var.f977c = dVar;
                    a1Var.f978d = p6;
                    a1Var.f979e = value2;
                    a1Var.f980f = M0.b(p6, interfaceC0961c, dVar);
                }
                boolean h6 = c0626q2.h(a1Var);
                Object P8 = c0626q2.P();
                Object obj10 = P8;
                if (h6 || P8 == c0602e) {
                    b1 b1Var = new b1(a1Var, 1);
                    c0626q2.m0(b1Var);
                    obj10 = b1Var;
                }
                InterfaceC1041r k3 = AbstractC0137z.k(C1038o.a, (l4.f) obj10);
                c0626q2.p(false);
                return k3;
            case 1:
                C0959a c0959a = (C0959a) obj3;
                long j3 = ((a1) obj5).f980f;
                long j4 = c0959a.a;
                int j5 = C0959a.j(j4);
                long j6 = c0959a.a;
                F0.k0 w5 = ((F0.U) obj2).w(C0959a.a(j4, AbstractC1117a.f((int) (j3 >> 32), j5, C0959a.h(j6)), 0, AbstractC1117a.f((int) (j3 & 4294967295L), C0959a.i(j6), C0959a.g(j6)), 0, 10));
                return ((F0.X) obj).D(w5.f1485c, w5.f1486e, Y3.w.f9813c, new c1(w5, 0));
            case 2:
                H4.c cVar = (H4.c) obj5;
                H4.c.f2052k.set(cVar, null);
                cVar.c(null);
                return yVar;
            case 3:
                ((H4.h) obj5).e();
                return yVar;
            case 4:
                M.j jVar2 = (M.j) obj5;
                int intValue = ((Integer) obj).intValue();
                int intValue2 = ((Integer) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                if (!booleanValue) {
                    intValue = jVar2.f3168y.a(intValue);
                }
                if (!booleanValue) {
                    intValue2 = jVar2.f3168y.a(intValue2);
                }
                if (jVar2.f3167x) {
                    long j7 = jVar2.f3164u.f9125b;
                    int i10 = S0.O.f7611c;
                    if (intValue != ((int) (j7 >> 32)) || intValue2 != ((int) (j7 & 4294967295L))) {
                        int min = Math.min(intValue, intValue2);
                        EnumC0075j0 enumC0075j0 = EnumC0075j0.f1042c;
                        if (min >= 0 && Math.max(intValue, intValue2) <= jVar2.f3164u.a.f7630e.length()) {
                            if (booleanValue || intValue == intValue2) {
                                O.N0 n02 = jVar2.f3169z;
                                n02.t(false);
                                n02.q(enumC0075j0);
                            } else {
                                jVar2.f3169z.h(true);
                            }
                            jVar2.f3165v.f1203v.f(new X0.v(jVar2.f3164u.a, S0.F.b(intValue, intValue2), (S0.O) null));
                            z5 = true;
                            return Boolean.valueOf(z5);
                        }
                        O.N0 n03 = jVar2.f3169z;
                        n03.t(false);
                        n03.q(enumC0075j0);
                    }
                }
                z5 = false;
                return Boolean.valueOf(z5);
            case AbstractC1787b.f15290g /* 5 */:
                C0332s0 c0332s0 = (C0332s0) obj5;
                InterfaceC1041r interfaceC1041r = (InterfaceC1041r) obj;
                C0626q c0626q3 = (C0626q) obj2;
                ((Integer) obj3).getClass();
                c0626q3.b0(-1914520728);
                InterfaceC0961c interfaceC0961c2 = (InterfaceC0961c) c0626q3.j(AbstractC0204q0.f2358h);
                Object P9 = c0626q3.P();
                Object obj11 = P9;
                if (P9 == c0602e) {
                    C0607g0 A5 = T.r.A(new e1.l(0L));
                    c0626q3.m0(A5);
                    obj11 = A5;
                }
                T.X x5 = (T.X) obj11;
                boolean h7 = c0626q3.h(c0332s0);
                Object P10 = c0626q3.P();
                Object obj12 = P10;
                if (h7 || P10 == c0602e) {
                    r rVar = new r(9, c0332s0, x5);
                    c0626q3.m0(rVar);
                    obj12 = rVar;
                }
                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) obj12;
                boolean f8 = c0626q3.f(interfaceC0961c2);
                Object P11 = c0626q3.P();
                if (f8 || P11 == c0602e) {
                    z6 = false;
                    O.w0 w0Var = new O.w0(interfaceC0961c2, x5, false ? 1 : 0);
                    c0626q3.m0(w0Var);
                    obj4 = w0Var;
                } else {
                    z6 = false;
                    obj4 = P11;
                }
                C1340o c1340o = AbstractC0317k0.a;
                InterfaceC1041r a = AbstractC1024a.a(interfaceC1041r, new Q0(1, (Object) interfaceC1193a, (l4.c) obj4));
                c0626q3.p(z6);
                return a;
            case 6:
                O.N0 n04 = (O.N0) obj5;
                InterfaceC1041r interfaceC1041r2 = (InterfaceC1041r) obj;
                C0626q c0626q4 = (C0626q) obj2;
                ((Integer) obj3).getClass();
                c0626q4.b0(1980580247);
                InterfaceC0961c interfaceC0961c3 = (InterfaceC0961c) c0626q4.j(AbstractC0204q0.f2358h);
                Object P12 = c0626q4.P();
                Object obj13 = P12;
                if (P12 == c0602e) {
                    C0607g0 A6 = T.r.A(new e1.l(0L));
                    c0626q4.m0(A6);
                    obj13 = A6;
                }
                T.X x6 = (T.X) obj13;
                boolean h8 = c0626q4.h(n04);
                Object P13 = c0626q4.P();
                Object obj14 = P13;
                if (h8 || P13 == c0602e) {
                    r rVar2 = new r(11, n04, x6);
                    c0626q4.m0(rVar2);
                    obj14 = rVar2;
                }
                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) obj14;
                boolean f9 = c0626q4.f(interfaceC0961c3);
                Object P14 = c0626q4.P();
                Object obj15 = P14;
                if (f9 || P14 == c0602e) {
                    O.w0 w0Var2 = new O.w0(interfaceC0961c3, x6, i8);
                    c0626q4.m0(w0Var2);
                    obj15 = w0Var2;
                }
                C1340o c1340o2 = AbstractC0317k0.a;
                InterfaceC1041r a6 = AbstractC1024a.a(interfaceC1041r2, new Q0(1, (Object) interfaceC1193a2, (l4.c) obj15));
                c0626q4.p(false);
                return a6;
            case 7:
                l4.c cVar2 = (l4.c) obj5;
                C0626q c0626q5 = (C0626q) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q5.S(intValue3 & 1, (intValue3 & 17) != 16)) {
                    C0345b0 s5 = P2.V.s(o0.y.d(4281648985L), c0626q5);
                    boolean f10 = c0626q5.f(cVar2);
                    Object P15 = c0626q5.P();
                    if (f10 || P15 == c0602e) {
                        P15 = new C0389z(cVar2, 1);
                        c0626q5.m0(P15);
                    }
                    P2.V.h(R.drawable.search, R.string.feature_web_search, R.string.chat_web_search_close, s5, false, (InterfaceC1193a) P15, c0626q5, 0, 16);
                } else {
                    c0626q5.V();
                }
                return yVar;
            case 8:
                C2 c22 = (C2) obj5;
                F0.X x7 = (F0.X) obj;
                F0.k0 w6 = ((F0.U) obj2).w(((C0959a) obj3).a);
                return x7.D(w6.f1485c, w6.f1486e, Y3.C.I(new X3.i(AbstractC0492z2.f6312f, Integer.valueOf(e1.f.c(Float.NaN, Float.NaN) ? c22.f5191p == r.X0.f14183c ? w6.f1485c / 2 : w6.f1486e / 2 : x7.l0(Float.NaN)))), new c1(w6, 4));
            case AbstractC1787b.f15287d /* 9 */:
                C0601d0 c0601d0 = (C0601d0) obj5;
                C0626q c0626q6 = (C0626q) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                AbstractC1276k.f((v.q0) obj, "$this$OutlinedButton");
                if (c0626q6.S(intValue4 & 1, (intValue4 & 17) != 16)) {
                    f3.b(h5.e.k0(R.string.markdown_image_retry, new Object[]{Integer.valueOf(c0601d0.g()), 3}, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                } else {
                    c0626q6.V();
                }
                return yVar;
            case AbstractC1787b.f15289f /* 10 */:
                L2.h hVar = (L2.h) obj5;
                C0626q c0626q7 = (C0626q) obj2;
                ((Integer) obj3).getClass();
                AbstractC1276k.f((InterfaceC1194A) obj, "$this$AnimatedVisibility");
                float f11 = 8;
                InterfaceC1041r C5 = AbstractC1787b.C(v.t0.a, S.l.f7374V, f11, S.l.f7374V, S.l.f7374V, 13);
                C1813t a7 = AbstractC1812s.a(AbstractC1799h.g(f11), C1026c.f11798p, c0626q7, 6);
                int hashCode = Long.hashCode(c0626q7.f8164T);
                InterfaceC0617l0 l3 = c0626q7.l();
                InterfaceC1041r c6 = AbstractC1024a.c(c0626q7, C5);
                InterfaceC0152h.a.getClass();
                C0148f c0148f = C0150g.f1924b;
                c0626q7.f0();
                if (c0626q7.f8163S) {
                    c0626q7.k(c0148f);
                } else {
                    c0626q7.p0();
                }
                T.r.G(c0626q7, a7, C0150g.f1928f);
                T.r.G(c0626q7, l3, C0150g.f1927e);
                T.r.x(c0626q7, Integer.valueOf(hashCode), C0150g.f1929g);
                T.r.C(c0626q7, C0150g.f1930h);
                T.r.G(c0626q7, c6, C0150g.f1926d);
                if (hVar.f3086c.isEmpty()) {
                    c0626q = c0626q7;
                    z7 = false;
                    c0626q.b0(1355564890);
                } else {
                    c0626q7.b0(1363861265);
                    Set entrySet = hVar.f3086c.entrySet();
                    Object P16 = c0626q7.P();
                    if (P16 == c0602e) {
                        P16 = new S2.Y(5);
                        c0626q7.m0(P16);
                    }
                    f3.b(h5.e.k0(R.string.tool_call_arguments, new Object[]{Y3.m.v0(entrySet, ", ", null, null, (l4.c) P16, 30)}, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 2, 0, new S0.P(o0.s.c(0.6f, ((Q.N) c0626q7.j(Q.O.a)).f5427q), s4.j.z(12), null, null, 0L, 0, 0L, 16777212), c0626q7, 0, 24576, 114686);
                    c0626q = c0626q7;
                    z7 = false;
                }
                c0626q.p(z7);
                U2.a.h(hVar.f3088e, hVar.f3085b, c0626q, z7 ? 1 : 0);
                String str = hVar.f3089f;
                if (str == null) {
                    c0626q.b0(1364525656);
                } else {
                    c0626q.b0(1364525657);
                    f3.b(h5.e.k0(R.string.tool_call_error, new Object[]{str}, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 2, 0, new S0.P(((Q.N) c0626q.j(Q.O.a)).f5433w, s4.j.z(12), null, null, 0L, 0, 0L, 16777212), c0626q, 0, 24576, 114686);
                    z7 = false;
                }
                c0626q.p(z7);
                c0626q.p(true);
                return yVar;
            case 11:
                C0996s c0996s = (C0996s) obj5;
                C0626q c0626q8 = (C0626q) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q8.S(intValue5 & 1, (intValue5 & 17) != 16)) {
                    C1818y c1818y = v.t0.a;
                    v.p0 a8 = v.o0.a(AbstractC1799h.a, C1026c.f11796n, c0626q8, 48);
                    int hashCode2 = Long.hashCode(c0626q8.f8164T);
                    InterfaceC0617l0 l5 = c0626q8.l();
                    InterfaceC1041r c7 = AbstractC1024a.c(c0626q8, c1818y);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f2 = C0150g.f1924b;
                    c0626q8.f0();
                    if (c0626q8.f8163S) {
                        c0626q8.k(c0148f2);
                    } else {
                        c0626q8.p0();
                    }
                    T.r.G(c0626q8, a8, C0150g.f1928f);
                    T.r.G(c0626q8, l5, C0150g.f1927e);
                    T.r.x(c0626q8, Integer.valueOf(hashCode2), C0150g.f1929g);
                    T.r.C(c0626q8, C0150g.f1930h);
                    T.r.G(c0626q8, c7, C0150g.f1926d);
                    String j02 = h5.e.j0(R.string.mcp_headers_title, c0626q8);
                    S0.P p7 = ((t3) c0626q8.j(u3.a)).f6127h;
                    long j8 = ((Q.N) c0626q8.j(Q.O.a)).f5427q;
                    if (1.0f <= 0.0d) {
                        AbstractC1829a.a("invalid weight; must be greater than zero");
                    }
                    f3.b(j02, new v.Z(1.0f, true), j8, 0L, null, 0L, null, 0L, 0, false, 0, 0, p7, c0626q8, 0, 0, 131064);
                    boolean f12 = c0626q8.f(c0996s);
                    Object P17 = c0626q8.P();
                    if (f12 || P17 == c0602e) {
                        P17 = new Y3.l(c0996s, i7);
                        c0626q8.m0(P17);
                    }
                    R1.o((InterfaceC1193a) P17, null, false, null, null, null, AbstractC0783w.f10427k, c0626q8, 805306368, 510);
                    c0626q8.p(true);
                } else {
                    c0626q8.V();
                }
                return yVar;
            case 12:
                T.d1 d1Var2 = (T.d1) obj5;
                C0626q c0626q9 = (C0626q) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q9.S(intValue6 & 1, (intValue6 & 17) != 16)) {
                    AbstractC0783w.r(((C0812a) d1Var2.getValue()).a, ((C0812a) d1Var2.getValue()).f10635b, ((C0812a) d1Var2.getValue()).f10636c, null, c0626q9, 0);
                } else {
                    c0626q9.V();
                }
                return yVar;
            case 13:
                McpServer mcpServer = (McpServer) obj5;
                C0626q c0626q10 = (C0626q) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1814u) obj, "$this$Card");
                if (c0626q10.S(intValue7 & 1, (intValue7 & 17) != 16)) {
                    C1038o c1038o2 = C1038o.a;
                    InterfaceC1041r y5 = AbstractC1787b.y(c1038o2, 16);
                    C1813t a9 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q10, 0);
                    int hashCode3 = Long.hashCode(c0626q10.f8164T);
                    InterfaceC0617l0 l6 = c0626q10.l();
                    InterfaceC1041r c8 = AbstractC1024a.c(c0626q10, y5);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f3 = C0150g.f1924b;
                    c0626q10.f0();
                    if (c0626q10.f8163S) {
                        c0626q10.k(c0148f3);
                    } else {
                        c0626q10.p0();
                    }
                    C0146e c0146e = C0150g.f1928f;
                    T.r.G(c0626q10, a9, c0146e);
                    C0146e c0146e2 = C0150g.f1927e;
                    T.r.G(c0626q10, l6, c0146e2);
                    Integer valueOf = Integer.valueOf(hashCode3);
                    C0146e c0146e3 = C0150g.f1929g;
                    T.r.x(c0626q10, valueOf, c0146e3);
                    C0144d c0144d = C0150g.f1930h;
                    T.r.C(c0626q10, c0144d);
                    C0146e c0146e4 = C0150g.f1926d;
                    T.r.G(c0626q10, c8, c0146e4);
                    C1818y c1818y2 = v.t0.a;
                    v.p0 a10 = v.o0.a(AbstractC1799h.a, C1026c.f11796n, c0626q10, 48);
                    int hashCode4 = Long.hashCode(c0626q10.f8164T);
                    InterfaceC0617l0 l7 = c0626q10.l();
                    InterfaceC1041r c9 = AbstractC1024a.c(c0626q10, c1818y2);
                    c0626q10.f0();
                    if (c0626q10.f8163S) {
                        c0626q10.k(c0148f3);
                    } else {
                        c0626q10.p0();
                    }
                    T.r.G(c0626q10, a10, c0146e);
                    T.r.G(c0626q10, l7, c0146e2);
                    AbstractC1135a.n(hashCode4, c0626q10, c0146e3, c0626q10, c0144d);
                    T.r.G(c0626q10, c9, c0146e4);
                    String str2 = mcpServer.f11213c;
                    T.e1 e1Var = u3.a;
                    S0.P p8 = ((t3) c0626q10.j(e1Var)).f6127h;
                    T.e1 e1Var2 = Q.O.a;
                    f3.b(str2, null, ((Q.N) c0626q10.j(e1Var2)).f5427q, 0L, null, 0L, null, 0L, 2, false, 1, 0, p8, c0626q10, 0, 24960, 110586);
                    if (1.0f <= 0.0d) {
                        AbstractC1829a.a("invalid weight; must be greater than zero");
                    }
                    AbstractC1787b.h(c0626q10, new v.Z(1.0f, true));
                    if (mcpServer.f11212b) {
                        c0626q10.b0(1704839794);
                        z8 = false;
                        AbstractC1806l.a(AbstractC1464z.f(v.t0.j(c1038o2, 8), o0.y.d(4281648985L), C.e.a), c0626q10, 0);
                    } else {
                        z8 = false;
                        c0626q10.b0(1693979440);
                    }
                    c0626q10.p(z8);
                    c0626q10.p(true);
                    if (AbstractC1776n.Q(mcpServer.f11215e)) {
                        c1038o = c1038o2;
                        z9 = false;
                        c0626q10.b0(353840204);
                    } else {
                        c0626q10.b0(364991431);
                        c1038o = c1038o2;
                        f3.b(mcpServer.f11215e, AbstractC1787b.C(c1038o2, S.l.f7374V, 6, S.l.f7374V, S.l.f7374V, 13), ((Q.N) c0626q10.j(e1Var2)).f5429s, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((t3) c0626q10.j(e1Var)).f6130k, c0626q10, 48, 24960, 110584);
                        z9 = false;
                    }
                    c0626q10.p(z9);
                    if (AbstractC1776n.Q(mcpServer.f11214d)) {
                        z10 = false;
                        z11 = true;
                        c0626q10.b0(353840204);
                    } else {
                        c0626q10.b0(365440559);
                        InterfaceC1041r z12 = AbstractC1787b.z(AbstractC1464z.f(l0.h.c(AbstractC1787b.C(c1038o, S.l.f7374V, 6, S.l.f7374V, S.l.f7374V, 13), C.e.a(12)), o0.s.c(0.12f, ((Q.N) c0626q10.j(e1Var2)).f5427q), o0.y.f13496b), 10, 4);
                        F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
                        int hashCode5 = Long.hashCode(c0626q10.f8164T);
                        InterfaceC0617l0 l8 = c0626q10.l();
                        InterfaceC1041r c10 = AbstractC1024a.c(c0626q10, z12);
                        c0626q10.f0();
                        if (c0626q10.f8163S) {
                            c0626q10.k(c0148f3);
                        } else {
                            c0626q10.p0();
                        }
                        T.r.G(c0626q10, d6, c0146e);
                        T.r.G(c0626q10, l8, c0146e2);
                        AbstractC1135a.n(hashCode5, c0626q10, c0146e3, c0626q10, c0144d);
                        T.r.G(c0626q10, c10, c0146e4);
                        f3.b(mcpServer.f11214d, null, ((Q.N) c0626q10.j(e1Var2)).f5427q, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((t3) c0626q10.j(e1Var)).f6134o, c0626q10, 0, 24960, 110586);
                        z11 = true;
                        c0626q10.p(true);
                        z10 = false;
                    }
                    c0626q10.p(z10);
                    c0626q10.p(z11);
                } else {
                    c0626q10.V();
                }
                return yVar;
            case 14:
                return a(obj, obj2, obj3);
            case 15:
                ((C0104y0) obj5).f1237e.a(((B0.y) obj2).f483c, O.I.f3953d);
                return yVar;
            default:
                ((C0056a) obj5).f((Throwable) obj);
                return yVar;
        }
    }

    public /* synthetic */ b1(Object obj, int i6) {
        this.f985c = i6;
        this.f986e = obj;
    }
}
