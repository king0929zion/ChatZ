package P2;

import D.C0069g0;
import F0.C0120h;
import H0.C0144d;
import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import Q.M1;
import Q.f3;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import T.e1;
import Z2.AbstractC0783w;
import Z2.a1;
import a3.C0811I;
import b0.C0873f;
import b3.C0889e;
import com.bot.feature.settings.data.ModelConfig;
import com.tencent.mmkv.R;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1033j;
import h0.C1038o;
import h0.InterfaceC1041r;
import i4.AbstractC1117a;
import j1.AbstractC1135a;
import java.util.List;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import o0.C1395f;
import p.AbstractC1464z;
import v.AbstractC1799h;
import v.AbstractC1806l;
import v.AbstractC1812s;
import v.C1813t;
import v.C1818y;
import x.C1851b;
import y2.AbstractC1992b;

/* loaded from: classes.dex */
public final class W0 implements l4.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4805c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f4806e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4807f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4808g;

    public /* synthetic */ W0(List list, Object obj, X3.e eVar, int i6) {
        this.f4805c = i6;
        this.f4806e = list;
        this.f4807f = obj;
        this.f4808g = eVar;
    }

    @Override // l4.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i6;
        C1038o c1038o;
        boolean z5;
        boolean z6;
        int i7;
        int i8;
        int i9;
        switch (this.f4805c) {
            case 0:
                C1851b c1851b = (C1851b) obj;
                int intValue = ((Number) obj2).intValue();
                C0626q c0626q = (C0626q) obj3;
                int intValue2 = ((Number) obj4).intValue();
                C1033j c1033j = C1026c.f11790h;
                List list = (List) this.f4807f;
                C0889e c0889e = (C0889e) this.f4808g;
                if ((intValue2 & 6) == 0) {
                    i6 = (c0626q.f(c1851b) ? 4 : 2) | intValue2;
                } else {
                    i6 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i6 |= c0626q.d(intValue) ? 32 : 16;
                }
                if (c0626q.S(i6 & 1, (i6 & 147) != 146)) {
                    String str = (String) this.f4806e.get(intValue);
                    c0626q.b0(1955906958);
                    boolean f6 = c0626q.f(str);
                    Object P5 = c0626q.P();
                    C0602e c0602e = C0616l.a;
                    if (f6 || P5 == c0602e) {
                        P5 = T.r.A(Float.valueOf(1.0f));
                        c0626q.m0(P5);
                    }
                    T.X x5 = (T.X) P5;
                    float f7 = AbstractC0350e.a;
                    C1038o c1038o2 = C1038o.a;
                    InterfaceC1041r n3 = v.t0.n(v.t0.d(c1038o2, f7), ((e1.f) AbstractC1117a.h(new e1.f(f7 * ((Number) x5.getValue()).floatValue()), new e1.f(AbstractC0350e.f4914b), new e1.f(AbstractC0350e.f4915c))).f11571c);
                    float f8 = AbstractC0350e.f4916d;
                    InterfaceC1041r c6 = l0.h.c(n3, C.e.a(f8));
                    e1 e1Var = Q.O.a;
                    InterfaceC1041r f9 = AbstractC1464z.f(c6, o0.s.c(0.3f, ((Q.N) c0626q.j(e1Var)).f5428r), o0.y.f13496b);
                    boolean f10 = ((((i6 & 112) ^ 48) > 32 && c0626q.d(intValue)) || (i6 & 48) == 32) | c0626q.f(c0889e) | c0626q.h(list);
                    Object P6 = c0626q.P();
                    if (f10 || P6 == c0602e) {
                        P6 = new S0(c0889e, list, intValue);
                        c0626q.m0(P6);
                    }
                    InterfaceC1041r a = AbstractC1992b.a(31, f9, (InterfaceC1193a) P6, false);
                    F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
                    int hashCode = Long.hashCode(c0626q.f8164T);
                    InterfaceC0617l0 l3 = c0626q.l();
                    InterfaceC1041r c7 = AbstractC1024a.c(c0626q, a);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f = C0150g.f1924b;
                    c0626q.f0();
                    if (c0626q.f8163S) {
                        c0626q.k(c0148f);
                    } else {
                        c0626q.p0();
                    }
                    C0146e c0146e = C0150g.f1928f;
                    T.r.G(c0626q, d6, c0146e);
                    C0146e c0146e2 = C0150g.f1927e;
                    T.r.G(c0626q, l3, c0146e2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    C0146e c0146e3 = C0150g.f1929g;
                    T.r.x(c0626q, valueOf, c0146e3);
                    C0144d c0144d = C0150g.f1930h;
                    T.r.C(c0626q, c0144d);
                    C0146e c0146e4 = C0150g.f1926d;
                    T.r.G(c0626q, c7, c0146e4);
                    W w5 = new W(null, true);
                    boolean f11 = c0626q.f(str);
                    Object P7 = c0626q.P();
                    if (f11 || P7 == c0602e) {
                        P7 = new V0(str, null);
                        c0626q.m0(P7);
                    }
                    l4.e eVar = (l4.e) P7;
                    Object P8 = c0626q.P();
                    if (P8 == c0602e) {
                        P8 = T.r.A(w5);
                        c0626q.m0(P8);
                    }
                    T.X x6 = (T.X) P8;
                    boolean h3 = c0626q.h(eVar);
                    Object P9 = c0626q.P();
                    if (h3 || P9 == c0602e) {
                        c1038o = c1038o2;
                        P9 = new T.U0(eVar, x6, null);
                        c0626q.m0(P9);
                    } else {
                        c1038o = c1038o2;
                    }
                    T.r.f(c0626q, str, (l4.e) P9);
                    C1395f c1395f = ((W) x6.getValue()).a;
                    boolean f12 = c0626q.f(x6) | c0626q.f(x5);
                    Object P10 = c0626q.P();
                    if (f12 || P10 == c0602e) {
                        P10 = new T0(x6, x5, null);
                        c0626q.m0(P10);
                    }
                    T.r.f(c0626q, c1395f, (l4.e) P10);
                    if (((W) x6.getValue()).f4804b) {
                        c0626q.b0(1810625670);
                        InterfaceC1041r f13 = AbstractC1464z.f(v.t0.f15349c, o0.s.c(0.3f, ((Q.N) c0626q.j(e1Var)).f5428r), C.e.a(f8));
                        F0.V d7 = AbstractC1806l.d(c1033j, false);
                        int hashCode2 = Long.hashCode(c0626q.f8164T);
                        InterfaceC0617l0 l5 = c0626q.l();
                        InterfaceC1041r c8 = AbstractC1024a.c(c0626q, f13);
                        c0626q.f0();
                        if (c0626q.f8163S) {
                            c0626q.k(c0148f);
                        } else {
                            c0626q.p0();
                        }
                        T.r.G(c0626q, d7, c0146e);
                        T.r.G(c0626q, l5, c0146e2);
                        AbstractC1135a.n(hashCode2, c0626q, c0146e3, c0626q, c0144d);
                        T.r.G(c0626q, c8, c0146e4);
                        M1.a(v.t0.j(c1038o, 18), ((Q.N) c0626q.j(e1Var)).a, 2, 0L, 0, S.l.f7374V, c0626q, 390, 56);
                        z5 = true;
                        c0626q.p(true);
                        z6 = false;
                        c0626q.p(false);
                    } else {
                        C1038o c1038o3 = c1038o;
                        z5 = true;
                        if (((W) x6.getValue()).a != null) {
                            c0626q.b0(1811581772);
                            C1395f c1395f2 = ((W) x6.getValue()).a;
                            AbstractC1276k.c(c1395f2);
                            AbstractC1464z.c(c1395f2, null, v.t0.f15349c, C0120h.a, c0626q, 25008);
                            c0626q.p(false);
                            z6 = false;
                        } else {
                            c0626q.b0(1812021724);
                            C1818y c1818y = v.t0.f15349c;
                            long j3 = o0.s.f13478e;
                            InterfaceC1041r f14 = AbstractC1464z.f(c1818y, o0.s.c(0.1f, j3), C.e.a(f8));
                            F0.V d8 = AbstractC1806l.d(c1033j, false);
                            int hashCode3 = Long.hashCode(c0626q.f8164T);
                            InterfaceC0617l0 l6 = c0626q.l();
                            InterfaceC1041r c9 = AbstractC1024a.c(c0626q, f14);
                            c0626q.f0();
                            if (c0626q.f8163S) {
                                c0626q.k(c0148f);
                            } else {
                                c0626q.p0();
                            }
                            T.r.G(c0626q, d8, c0146e);
                            T.r.G(c0626q, l6, c0146e2);
                            AbstractC1135a.n(hashCode3, c0626q, c0146e3, c0626q, c0144d);
                            T.r.G(c0626q, c9, c0146e4);
                            C1813t a6 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11799q, c0626q, 48);
                            int hashCode4 = Long.hashCode(c0626q.f8164T);
                            InterfaceC0617l0 l7 = c0626q.l();
                            InterfaceC1041r c10 = AbstractC1024a.c(c0626q, c1038o3);
                            c0626q.f0();
                            if (c0626q.f8163S) {
                                c0626q.k(c0148f);
                            } else {
                                c0626q.p0();
                            }
                            T.r.G(c0626q, a6, c0146e);
                            T.r.G(c0626q, l7, c0146e2);
                            AbstractC1135a.n(hashCode4, c0626q, c0146e3, c0626q, c0144d);
                            T.r.G(c0626q, c10, c0146e4);
                            z6 = false;
                            Q.A0.a(Y3.C.L(R.drawable.broken_image, 0, c0626q), null, null, o0.s.c(0.6f, j3), c0626q, 3128, 4);
                            z5 = true;
                            f3.b(h5.e.j0(R.string.chat_image_load_failed, c0626q), null, o0.s.c(0.6f, j3), s4.j.z(10), null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 24960, 0, 262122);
                            c0626q = c0626q;
                            c0626q.p(true);
                            c0626q.p(true);
                            c0626q.p(false);
                        }
                    }
                    c0626q.p(z5);
                    c0626q.p(z6);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            case 1:
                C1851b c1851b2 = (C1851b) obj;
                int intValue3 = ((Number) obj2).intValue();
                C0626q c0626q2 = (C0626q) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i7 = (c0626q2.f(c1851b2) ? 4 : 2) | intValue4;
                } else {
                    i7 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i7 |= c0626q2.d(intValue3) ? 32 : 16;
                }
                if (c0626q2.S(i7 & 1, (i7 & 147) != 146)) {
                    S2.X x7 = (S2.X) this.f4806e.get(intValue3);
                    c0626q2.b0(2133622616);
                    ((C0873f) this.f4808g).n((List) this.f4807f, Integer.valueOf(intValue3), x7, c0626q2, Integer.valueOf((i7 & 112) | 3072));
                    c0626q2.p(false);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
            case 2:
                C1851b c1851b3 = (C1851b) obj;
                int intValue5 = ((Number) obj2).intValue();
                C0626q c0626q3 = (C0626q) obj3;
                int intValue6 = ((Number) obj4).intValue();
                l4.e eVar2 = (l4.e) this.f4808g;
                if ((intValue6 & 6) == 0) {
                    i8 = (c0626q3.f(c1851b3) ? 4 : 2) | intValue6;
                } else {
                    i8 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i8 |= c0626q3.d(intValue5) ? 32 : 16;
                }
                if (c0626q3.S(i8 & 1, (i8 & 147) != 146)) {
                    ModelConfig modelConfig = (ModelConfig) this.f4806e.get(intValue5);
                    c0626q3.b0(146465877);
                    boolean contains = ((List) this.f4807f).contains(modelConfig.a);
                    boolean f15 = c0626q3.f(eVar2) | c0626q3.f(modelConfig);
                    Object P11 = c0626q3.P();
                    if (f15 || P11 == C0616l.a) {
                        P11 = new C0069g0(13, eVar2, modelConfig);
                        c0626q3.m0(P11);
                    }
                    AbstractC0783w.B(modelConfig, contains, (l4.c) P11, c0626q3, 0);
                    c0626q3.p(false);
                } else {
                    c0626q3.V();
                }
                return X3.y.a;
            default:
                C1851b c1851b4 = (C1851b) obj;
                int intValue7 = ((Number) obj2).intValue();
                C0626q c0626q4 = (C0626q) obj3;
                int intValue8 = ((Number) obj4).intValue();
                l4.c cVar = (l4.c) this.f4808g;
                C0811I c0811i = (C0811I) this.f4807f;
                if ((intValue8 & 6) == 0) {
                    i9 = (c0626q4.f(c1851b4) ? 4 : 2) | intValue8;
                } else {
                    i9 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i9 |= c0626q4.d(intValue7) ? 32 : 16;
                }
                if (c0626q4.S(i9 & 1, (i9 & 147) != 146)) {
                    a1 a1Var = (a1) this.f4806e.get(intValue7);
                    c0626q4.b0(-1983335561);
                    boolean h6 = c0626q4.h(c0811i) | c0626q4.f(a1Var) | c0626q4.f(cVar);
                    Object P12 = c0626q4.P();
                    C0602e c0602e2 = C0616l.a;
                    if (h6 || P12 == c0602e2) {
                        P12 = new Q2.m(5, c0811i, a1Var, cVar);
                        c0626q4.m0(P12);
                    }
                    InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P12;
                    boolean h7 = c0626q4.h(c0811i) | c0626q4.f(a1Var);
                    Object P13 = c0626q4.P();
                    if (h7 || P13 == c0602e2) {
                        P13 = new X4.k(3, c0811i, a1Var);
                        c0626q4.m0(P13);
                    }
                    AbstractC0783w.L(a1Var, interfaceC1193a, (InterfaceC1193a) P13, c0626q4, 0);
                    c0626q4.p(false);
                } else {
                    c0626q4.V();
                }
                return X3.y.a;
        }
    }

    public /* synthetic */ W0(List list, Object obj, List list2, int i6) {
        this.f4805c = i6;
        this.f4806e = list;
        this.f4808g = obj;
        this.f4807f = list2;
    }
}
