package I;

import B0.H;
import D.C0091s;
import F0.w0;
import H0.C0144d;
import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import O.N0;
import P2.C0348d;
import P2.L0;
import P2.V;
import Q.A0;
import Q.D1;
import Q.N;
import Q.P1;
import Q.W;
import R2.AbstractC0530j;
import S0.C0545g;
import S0.F;
import S0.O;
import S0.P;
import T.C0;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.F0;
import T.InterfaceC0608h;
import T.InterfaceC0617l0;
import T.M0;
import T.X;
import T.d1;
import T.e1;
import X3.y;
import Y3.C;
import Z2.AbstractC0783w;
import Z2.a1;
import a3.C0818g;
import android.content.Context;
import android.graphics.drawable.Drawable;
import b0.C0873f;
import b0.C0879l;
import b3.AbstractC0897m;
import b3.C0898n;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.parser.PegdownExtensions;
import e0.InterfaceC0958c;
import e1.C0959a;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1033j;
import h0.C1038o;
import h0.InterfaceC1041r;
import j1.AbstractC1135a;
import java.util.Collection;
import java.util.List;
import l4.InterfaceC1193a;
import m4.C1285t;
import p.AbstractC1464z;
import q.C1491c;
import q.C1492d;
import r.C1603s;
import v.AbstractC1787b;
import v.AbstractC1799h;
import v.AbstractC1806l;
import v.o0;
import v.p0;
import v.t0;
import x4.InterfaceC1942y;
import y.AbstractC1975o;
import y.C1955L;
import y.C1956M;
import y.InterfaceC1957N;
import y.T;
import y.U;
import y2.AbstractC1992b;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2104c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2105e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2106f;

    public /* synthetic */ m(int i6, int i7, Object obj, Object obj2) {
        this.f2104c = i7;
        this.f2106f = obj;
        this.f2105e = obj2;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        O o5;
        switch (this.f2104c) {
            case 0:
                K.e eVar = (K.e) this.f2106f;
                G.g gVar = (G.g) this.f2105e;
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    boolean f6 = c0626q.f(eVar);
                    Object P5 = c0626q.P();
                    if (f6 || P5 == C0616l.a) {
                        P5 = T.r.s(new o(0, eVar, K.e.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 0, 0));
                        c0626q.m0(P5);
                    }
                    p.a(gVar, (G.c) ((d1) P5).getValue(), c0626q, 0);
                } else {
                    c0626q.V();
                }
                return y.a;
            case 1:
                ((Integer) obj2).getClass();
                p.a((G.g) this.f2105e, (G.c) this.f2106f, (C0626q) obj, T.r.J(1));
                return y.a;
            case 2:
                ((Integer) obj2).getClass();
                ((w) this.f2106f).a((Drawable) this.f2105e, (C0626q) obj, T.r.J(49));
                return y.a;
            case 3:
                ((Integer) obj2).getClass();
                Y4.l.i((List) this.f2106f, (Collection) this.f2105e, (C0626q) obj, T.r.J(1));
                return y.a;
            case 4:
                ((Integer) obj2).getClass();
                C.e((InterfaceC0958c) this.f2106f, (C0873f) this.f2105e, (C0626q) obj, T.r.J(1));
                return y.a;
            case AbstractC1787b.f15290g /* 5 */:
                N0 n02 = (N0) this.f2106f;
                InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f2105e;
                F.a aVar = (F.a) obj;
                Context context = (Context) obj2;
                boolean j3 = n02.j();
                C0545g m3 = n02.m();
                String str = m3 != null ? m3.f7630e : null;
                O o6 = n02.f4013v;
                if (o6 != null) {
                    long j4 = o6.a;
                    X0.p pVar = n02.f3993b;
                    o5 = new O(F.b(pVar.b((int) (j4 >> 32)), pVar.b((int) (j4 & 4294967295L))));
                } else {
                    o5 = null;
                }
                O.C.a(aVar, context, j3, str, o5, n02.f4000i, new C0091s(n02, interfaceC1942y, context, 10));
                return y.a;
            case 6:
                ((Integer) obj2).getClass();
                V.f((L2.a) this.f2106f, (InterfaceC1193a) this.f2105e, (C0626q) obj, T.r.J(1));
                return y.a;
            case 7:
                ((Integer) obj2).getClass();
                L0.d((L2.c) this.f2106f, (P) this.f2105e, (C0626q) obj, T.r.J(9));
                return y.a;
            case 8:
                ((Integer) obj2).getClass();
                ((W) this.f2106f).a((H) this.f2105e, (C0626q) obj, T.r.J(1));
                return y.a;
            case AbstractC1787b.f15287d /* 9 */:
                String str2 = (String) this.f2106f;
                l4.c cVar = (l4.c) this.f2105e;
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    D1.a(str2, cVar, t0.a, false, false, null, AbstractC0530j.f6942d, null, null, null, null, false, null, null, null, true, 0, 0, null, null, c0626q2, 1573248, 12582912, 8257464);
                } else {
                    c0626q2.V();
                }
                return y.a;
            case AbstractC1787b.f15289f /* 10 */:
                C0873f c0873f = (C0873f) this.f2106f;
                X x5 = (X) this.f2105e;
                C0626q c0626q3 = (C0626q) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    c0873f.d((List) x5.getValue(), c0626q3, 48);
                } else {
                    c0626q3.V();
                }
                return y.a;
            case 11:
                C0879l c0879l = (C0879l) this.f2106f;
                M0 m02 = (M0) this.f2105e;
                int intValue4 = ((Integer) obj).intValue();
                if (obj2 instanceof InterfaceC0608h) {
                    c0879l.f10993f.b((InterfaceC0608h) obj2);
                } else if (!(obj2 instanceof F0)) {
                    if (obj2 instanceof C0) {
                        T.r.F(m02, intValue4, obj2);
                        c0879l.e((C0) obj2);
                    } else if (obj2 instanceof C0627q0) {
                        T.r.F(m02, intValue4, obj2);
                        ((C0627q0) obj2).d();
                    }
                }
                return y.a;
            case 12:
                ((Integer) obj2).getClass();
                U2.a.l((L2.i) this.f2106f, (Long) this.f2105e, (C0626q) obj, T.r.J(1));
                return y.a;
            case 13:
                ((Integer) obj2).getClass();
                AbstractC0783w.k((C0818g) this.f2106f, (InterfaceC1193a) this.f2105e, (C0626q) obj, T.r.J(9));
                return y.a;
            case 14:
                ((Integer) obj2).getClass();
                AbstractC0783w.p((InterfaceC1041r) this.f2106f, (InterfaceC1193a) this.f2105e, (C0626q) obj, T.r.J(1));
                return y.a;
            case 15:
                X x6 = (X) this.f2106f;
                X x7 = (X) this.f2105e;
                x6.setValue(new e1.j(((e1.j) obj).a));
                x7.setValue(new e1.l(((e1.l) obj2).a));
                return y.a;
            case PegdownExtensions.AUTOLINKS /* 16 */:
                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) this.f2106f;
                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) this.f2105e;
                C0626q c0626q4 = (C0626q) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (c0626q4.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                    p0 a = o0.a(AbstractC1799h.g(8), C1026c.f11796n, c0626q4, 54);
                    int hashCode = Long.hashCode(c0626q4.f8164T);
                    InterfaceC0617l0 l3 = c0626q4.l();
                    C1038o c1038o = C1038o.a;
                    InterfaceC1041r c6 = AbstractC1024a.c(c0626q4, c1038o);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f = C0150g.f1924b;
                    c0626q4.f0();
                    if (c0626q4.f8163S) {
                        c0626q4.k(c0148f);
                    } else {
                        c0626q4.p0();
                    }
                    C0146e c0146e = C0150g.f1928f;
                    T.r.G(c0626q4, a, c0146e);
                    C0146e c0146e2 = C0150g.f1927e;
                    T.r.G(c0626q4, l3, c0146e2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    C0146e c0146e3 = C0150g.f1929g;
                    T.r.x(c0626q4, valueOf, c0146e3);
                    C0144d c0144d = C0150g.f1930h;
                    T.r.C(c0626q4, c0144d);
                    C0146e c0146e4 = C0150g.f1926d;
                    T.r.G(c0626q4, c6, c0146e4);
                    float f7 = d3.b.a;
                    InterfaceC1041r j5 = t0.j(c1038o, f7);
                    e1 e1Var = Q.O.a;
                    long j6 = ((N) c0626q4.j(e1Var)).f5431u;
                    C.d dVar = C.e.a;
                    InterfaceC1041r c7 = l0.h.c(AbstractC1464z.f(j5, j6, dVar), dVar);
                    boolean f8 = c0626q4.f(interfaceC1193a);
                    Object P6 = c0626q4.P();
                    C0602e c0602e = C0616l.a;
                    if (f8 || P6 == c0602e) {
                        P6 = new C0348d(28, interfaceC1193a);
                        c0626q4.m0(P6);
                    }
                    InterfaceC1041r a6 = AbstractC1992b.a(31, c7, (InterfaceC1193a) P6, false);
                    C1033j c1033j = C1026c.f11790h;
                    F0.V d6 = AbstractC1806l.d(c1033j, false);
                    int hashCode2 = Long.hashCode(c0626q4.f8164T);
                    InterfaceC0617l0 l5 = c0626q4.l();
                    InterfaceC1041r c8 = AbstractC1024a.c(c0626q4, a6);
                    c0626q4.f0();
                    if (c0626q4.f8163S) {
                        c0626q4.k(c0148f);
                    } else {
                        c0626q4.p0();
                    }
                    T.r.G(c0626q4, d6, c0146e);
                    T.r.G(c0626q4, l5, c0146e2);
                    AbstractC1135a.n(hashCode2, c0626q4, c0146e3, c0626q4, c0144d);
                    T.r.G(c0626q4, c8, c0146e4);
                    A0.a(C.L(R.drawable.add, 0, c0626q4), h5.e.j0(R.string.model_services_add_action, c0626q4), null, ((N) c0626q4.j(e1Var)).f5427q, c0626q4, 8, 4);
                    c0626q4.p(true);
                    InterfaceC1041r c9 = l0.h.c(AbstractC1464z.f(t0.j(c1038o, f7), ((N) c0626q4.j(e1Var)).f5431u, dVar), dVar);
                    boolean f9 = c0626q4.f(interfaceC1193a2);
                    Object P7 = c0626q4.P();
                    if (f9 || P7 == c0602e) {
                        P7 = new C0348d(29, interfaceC1193a2);
                        c0626q4.m0(P7);
                    }
                    InterfaceC1041r a7 = AbstractC1992b.a(31, c9, (InterfaceC1193a) P7, false);
                    F0.V d7 = AbstractC1806l.d(c1033j, false);
                    int hashCode3 = Long.hashCode(c0626q4.f8164T);
                    InterfaceC0617l0 l6 = c0626q4.l();
                    InterfaceC1041r c10 = AbstractC1024a.c(c0626q4, a7);
                    c0626q4.f0();
                    if (c0626q4.f8163S) {
                        c0626q4.k(c0148f);
                    } else {
                        c0626q4.p0();
                    }
                    T.r.G(c0626q4, d7, c0146e);
                    T.r.G(c0626q4, l6, c0146e2);
                    AbstractC1135a.n(hashCode3, c0626q4, c0146e3, c0626q4, c0144d);
                    T.r.G(c0626q4, c10, c0146e4);
                    A0.a(C.L(R.drawable.search, 0, c0626q4), h5.e.j0(R.string.input_search, c0626q4), null, ((N) c0626q4.j(e1Var)).f5427q, c0626q4, 8, 4);
                    c0626q4.p(true);
                    c0626q4.p(true);
                } else {
                    c0626q4.V();
                }
                return y.a;
            case 17:
                a1 a1Var = (a1) this.f2106f;
                InterfaceC1193a interfaceC1193a3 = (InterfaceC1193a) this.f2105e;
                C0626q c0626q5 = (C0626q) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (c0626q5.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                    P1.a(a1Var.f10145b, interfaceC1193a3, null, false, null, c0626q5, 0, 60);
                } else {
                    c0626q5.V();
                }
                return y.a;
            case 18:
                ((Integer) obj2).getClass();
                AbstractC0897m.a((C0898n) this.f2106f, (InterfaceC1193a) this.f2105e, (C0626q) obj, T.r.J(49));
                return y.a;
            case 19:
                ((Integer) obj2).getClass();
                s4.j.c((InterfaceC1041r) this.f2106f, (G2.d) this.f2105e, (C0626q) obj, T.r.J(65));
                return y.a;
            case 20:
                ((Integer) obj2).getClass();
                d3.d.a((G2.d) this.f2106f, (C0873f) this.f2105e, (C0626q) obj, T.r.J(393));
                return y.a;
            case 21:
                ((Integer) obj2).getClass();
                AbstractC1464z.a((InterfaceC1041r) this.f2106f, (l4.c) this.f2105e, (C0626q) obj, T.r.J(1));
                return y.a;
            case 22:
                ((Integer) obj2).getClass();
                ((C1492d) this.f2106f).a((C1491c) this.f2105e, (C0626q) obj, T.r.J(1));
                return y.a;
            case 23:
                C1603s c1603s = (C1603s) this.f2106f;
                C1285t c1285t = (C1285t) this.f2105e;
                float floatValue = ((Float) obj).floatValue();
                c1603s.a(floatValue, ((Float) obj2).floatValue());
                c1285t.f12970c = floatValue;
                return y.a;
            case 24:
                C0873f c0873f2 = (C0873f) this.f2106f;
                v.r rVar = (v.r) this.f2105e;
                C0626q c0626q6 = (C0626q) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (c0626q6.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                    c0873f2.d(rVar, c0626q6, 0);
                } else {
                    c0626q6.V();
                }
                return y.a;
            case 25:
                w0 w0Var = (w0) obj;
                C0959a c0959a = (C0959a) obj2;
                return ((F0.V) this.f2106f).e(w0Var, w0Var.J(y.a, new C0873f(new m(24, (C0873f) this.f2105e, new v.r(w0Var, c0959a.a)), true, -431986394)), c0959a.a);
            case 26:
                C1956M c1956m = (C1956M) this.f2106f;
                C1955L c1955l = (C1955L) this.f2105e;
                C0626q c0626q7 = (C0626q) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (c0626q7.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                    InterfaceC1957N interfaceC1957N = (InterfaceC1957N) c1956m.f15797b.b();
                    int i6 = c1955l.f15794c;
                    Object obj3 = c1955l.a;
                    if ((i6 >= interfaceC1957N.a() || !interfaceC1957N.b(i6).equals(obj3)) && (i6 = interfaceC1957N.e(obj3)) != -1) {
                        c1955l.f15794c = i6;
                    }
                    if (i6 != -1) {
                        c0626q7.b0(-1664741271);
                        AbstractC1975o.d(interfaceC1957N, c1956m.a, i6, c1955l.a, c0626q7, 0);
                    } else {
                        c0626q7.b0(-1668376610);
                    }
                    c0626q7.p(false);
                    boolean h3 = c0626q7.h(c1955l);
                    Object P8 = c0626q7.P();
                    if (h3 || P8 == C0616l.a) {
                        P8 = new W0.e(c1955l, 17);
                        c0626q7.m0(P8);
                    }
                    T.r.d(obj3, (l4.c) P8, c0626q7);
                } else {
                    c0626q7.V();
                }
                return y.a;
            case 27:
                return ((T) this.f2105e).a(new U((C1956M) this.f2106f, (w0) obj), ((C0959a) obj2).a);
            case 28:
                C0873f c0873f3 = (C0873f) this.f2106f;
                y.o0 o0Var = (y.o0) this.f2105e;
                C0626q c0626q8 = (C0626q) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if (c0626q8.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                    c0873f3.d(o0Var, c0626q8, 0);
                } else {
                    c0626q8.V();
                }
                return y.a;
            default:
                C1285t c1285t2 = (C1285t) this.f2106f;
                x.n nVar = (x.n) this.f2105e;
                float floatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                c1285t2.f12970c += nVar.f15530b.a(floatValue2 - c1285t2.f12970c);
                return y.a;
        }
    }

    public /* synthetic */ m(int i6, Object obj, Object obj2) {
        this.f2104c = i6;
        this.f2106f = obj;
        this.f2105e = obj2;
    }

    public /* synthetic */ m(G.g gVar, G.c cVar, int i6) {
        this.f2104c = 1;
        this.f2105e = gVar;
        this.f2106f = cVar;
    }
}
