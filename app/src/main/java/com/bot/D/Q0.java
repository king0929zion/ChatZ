package D;

import H0.C0144d;
import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.C0158m;
import H0.InterfaceC0152h;
import I0.C0172a0;
import O.AbstractC0317k0;
import O.C0315j0;
import O.C0319l0;
import P2.C0345b0;
import P2.C0348d;
import P2.C0389z;
import Q.M1;
import Q.f3;
import Q.t3;
import Q.u3;
import R2.AbstractC0530j;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import Y2.EnumC0731u;
import Z2.AbstractC0783w;
import a1.C0795c;
import a3.C0810H;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b3.AbstractC0897m;
import b3.C0898n;
import com.bot.core.model.LLMProvider;
import com.tencent.mmkv.R;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1032i;
import h0.C1038o;
import h0.InterfaceC1041r;
import i4.AbstractC1118b;
import j1.AbstractC1135a;
import java.util.List;
import l4.InterfaceC1193a;
import m.InterfaceC1194A;
import m4.AbstractC1276k;
import n.C1316c;
import n.C1336m;
import n0.C1353b;
import p.AbstractC1464z;
import q.C1491c;
import q.C1492d;
import s.AbstractC1647k;
import t.C1682j;
import t0.AbstractC1688b;
import u4.AbstractC1776n;
import v.AbstractC1787b;
import v.AbstractC1799h;
import v.AbstractC1806l;
import v.AbstractC1812s;
import v.C1810p;
import v.C1813t;
import v.C1814u;
import v.C1818y;
import w.AbstractC1829a;
import x.C1851b;
import x4.InterfaceC1942y;
import y2.AbstractC1992b;
import z.C2004b;

/* loaded from: classes.dex */
public final /* synthetic */ class Q0 implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f870c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f871e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f872f;

    public /* synthetic */ Q0(int i6, Object obj, Object obj2) {
        this.f870c = i6;
        this.f871e = obj;
        this.f872f = obj2;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0148f c0148f;
        long j3;
        boolean z5;
        boolean z6;
        long j4;
        boolean z7;
        String str;
        Typeface typeface;
        switch (this.f870c) {
            case 0:
                l4.c cVar = (l4.c) this.f871e;
                C1682j c1682j = (C1682j) this.f872f;
                C0626q c0626q = (C0626q) obj2;
                ((Integer) obj3).getClass();
                c0626q.b0(-102778667);
                Object P5 = c0626q.P();
                C0602e c0602e = C0616l.a;
                if (P5 == c0602e) {
                    P5 = T.r.p(c0626q);
                    c0626q.m0(P5);
                }
                InterfaceC1942y interfaceC1942y = (InterfaceC1942y) P5;
                Object P6 = c0626q.P();
                if (P6 == c0602e) {
                    P6 = T.r.A(null);
                    c0626q.m0(P6);
                }
                T.X x5 = (T.X) P6;
                T.X E5 = T.r.E(cVar, c0626q);
                boolean f6 = c0626q.f(c1682j);
                Object P7 = c0626q.P();
                if (f6 || P7 == c0602e) {
                    P7 = new C0086p(3, x5, c1682j);
                    c0626q.m0(P7);
                }
                T.r.d(c1682j, (l4.c) P7, c0626q);
                boolean h3 = c0626q.h(interfaceC1942y) | c0626q.f(c1682j) | c0626q.f(E5);
                Object P8 = c0626q.P();
                if (h3 || P8 == c0602e) {
                    P8 = new U0(interfaceC1942y, x5, c1682j, E5);
                    c0626q.m0(P8);
                }
                InterfaceC1041r a = B0.Q.a(C1038o.a, c1682j, (PointerInputEventHandler) P8);
                c0626q.p(false);
                return a;
            case 1:
                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) this.f872f;
                l4.c cVar2 = (l4.c) this.f871e;
                C0626q c0626q2 = (C0626q) obj2;
                ((Integer) obj3).getClass();
                c0626q2.b0(759876635);
                Object P9 = c0626q2.P();
                C0602e c0602e2 = C0616l.a;
                if (P9 == c0602e2) {
                    P9 = T.r.s(interfaceC1193a);
                    c0626q2.m0(P9);
                }
                T.d1 d1Var = (T.d1) P9;
                Object P10 = c0626q2.P();
                if (P10 == c0602e2) {
                    P10 = new C1316c(new C1353b(((C1353b) d1Var.getValue()).a), AbstractC0317k0.f4142b, new C1353b(AbstractC0317k0.f4143c), 8);
                    c0626q2.m0(P10);
                }
                C1316c c1316c = (C1316c) P10;
                boolean h6 = c0626q2.h(c1316c);
                Object P11 = c0626q2.P();
                if (h6 || P11 == c0602e2) {
                    P11 = new C0315j0(d1Var, c1316c, null);
                    c0626q2.m0(P11);
                }
                T.r.f(c0626q2, X3.y.a, (l4.e) P11);
                C1336m c1336m = c1316c.f13093c;
                boolean f7 = c0626q2.f(c1336m);
                Object P12 = c0626q2.P();
                if (f7 || P12 == c0602e2) {
                    P12 = new J1.v(c1336m, 1);
                    c0626q2.m0(P12);
                }
                InterfaceC1041r interfaceC1041r = (InterfaceC1041r) cVar2.f((InterfaceC1193a) P12);
                c0626q2.p(false);
                return interfaceC1041r;
            case 2:
                D2.c cVar3 = (D2.c) this.f872f;
                l4.c cVar4 = (l4.c) this.f871e;
                C0626q c0626q3 = (C0626q) obj2;
                int intValue = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q3.S(intValue & 1, (intValue & 17) != 16)) {
                    C0345b0 s5 = P2.V.s(o0.y.d(4278355455L), c0626q3);
                    boolean z8 = !cVar3.f1273b;
                    boolean f8 = c0626q3.f(cVar4);
                    Object P13 = c0626q3.P();
                    if (f8 || P13 == C0616l.a) {
                        P13 = new C0389z(cVar4, 0);
                        c0626q3.m0(P13);
                    }
                    P2.V.h(R.drawable.mdi_reasoning, R.string.chat_reasoning_label, R.string.chat_reasoning_close, s5, z8, (InterfaceC1193a) P13, c0626q3, 0, 0);
                } else {
                    c0626q3.V();
                }
                return X3.y.a;
            case 3:
                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) this.f871e;
                InterfaceC1193a interfaceC1193a3 = (InterfaceC1193a) this.f872f;
                C0626q c0626q4 = (C0626q) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1814u) obj, "$this$ModalBottomSheet");
                if (c0626q4.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                    C1818y c1818y = v.t0.a;
                    C1813t a6 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q4, 0);
                    int hashCode = Long.hashCode(c0626q4.f8164T);
                    InterfaceC0617l0 l3 = c0626q4.l();
                    InterfaceC1041r c6 = AbstractC1024a.c(c0626q4, c1818y);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f2 = C0150g.f1924b;
                    c0626q4.f0();
                    if (c0626q4.f8163S) {
                        c0626q4.k(c0148f2);
                    } else {
                        c0626q4.p0();
                    }
                    C0146e c0146e = C0150g.f1928f;
                    T.r.G(c0626q4, a6, c0146e);
                    C0146e c0146e2 = C0150g.f1927e;
                    T.r.G(c0626q4, l3, c0146e2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    C0146e c0146e3 = C0150g.f1929g;
                    T.r.x(c0626q4, valueOf, c0146e3);
                    C0144d c0144d = C0150g.f1930h;
                    T.r.C(c0626q4, c0144d);
                    C0146e c0146e4 = C0150g.f1926d;
                    T.r.G(c0626q4, c6, c0146e4);
                    boolean f9 = c0626q4.f(interfaceC1193a2);
                    Object P14 = c0626q4.P();
                    C0602e c0602e3 = C0616l.a;
                    if (f9 || P14 == c0602e3) {
                        P14 = new C0348d(12, interfaceC1193a2);
                        c0626q4.m0(P14);
                    }
                    InterfaceC1041r a7 = AbstractC1992b.a(31, c1818y, (InterfaceC1193a) P14, false);
                    float f10 = 12;
                    InterfaceC1041r y5 = AbstractC1787b.y(a7, f10);
                    C1032i c1032i = C1026c.f11796n;
                    C1810p c1810p = AbstractC1799h.a;
                    v.p0 a8 = v.o0.a(c1810p, c1032i, c0626q4, 48);
                    int hashCode2 = Long.hashCode(c0626q4.f8164T);
                    InterfaceC0617l0 l5 = c0626q4.l();
                    InterfaceC1041r c7 = AbstractC1024a.c(c0626q4, y5);
                    c0626q4.f0();
                    if (c0626q4.f8163S) {
                        c0148f = c0148f2;
                        c0626q4.k(c0148f);
                    } else {
                        c0148f = c0148f2;
                        c0626q4.p0();
                    }
                    T.r.G(c0626q4, a8, c0146e);
                    T.r.G(c0626q4, l5, c0146e2);
                    AbstractC1135a.n(hashCode2, c0626q4, c0146e3, c0626q4, c0144d);
                    T.r.G(c0626q4, c7, c0146e4);
                    C0148f c0148f3 = c0148f;
                    Q.A0.a(Y3.C.L(R.drawable.edit, 0, c0626q4), h5.e.j0(R.string.chat_rename, c0626q4), null, 0L, c0626q4, 8, 12);
                    String j02 = h5.e.j0(R.string.chat_rename, c0626q4);
                    T.e1 e1Var = u3.a;
                    S0.P p5 = ((t3) c0626q4.j(e1Var)).f6129j;
                    float f11 = 16;
                    C1038o c1038o = C1038o.a;
                    f3.b(j02, AbstractC1787b.C(c1038o, f11, S.l.f7374V, S.l.f7374V, S.l.f7374V, 14), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, p5, c0626q4, 48, 0, 131068);
                    c0626q4.p(true);
                    boolean f12 = c0626q4.f(interfaceC1193a3);
                    Object P15 = c0626q4.P();
                    if (f12 || P15 == c0602e3) {
                        P15 = new C0348d(13, interfaceC1193a3);
                        c0626q4.m0(P15);
                    }
                    InterfaceC1041r y6 = AbstractC1787b.y(AbstractC1992b.a(31, c1818y, (InterfaceC1193a) P15, false), f10);
                    v.p0 a9 = v.o0.a(c1810p, c1032i, c0626q4, 48);
                    int hashCode3 = Long.hashCode(c0626q4.f8164T);
                    InterfaceC0617l0 l6 = c0626q4.l();
                    InterfaceC1041r c8 = AbstractC1024a.c(c0626q4, y6);
                    c0626q4.f0();
                    if (c0626q4.f8163S) {
                        c0626q4.k(c0148f3);
                    } else {
                        c0626q4.p0();
                    }
                    T.r.G(c0626q4, a9, c0146e);
                    T.r.G(c0626q4, l6, c0146e2);
                    AbstractC1135a.n(hashCode3, c0626q4, c0146e3, c0626q4, c0144d);
                    T.r.G(c0626q4, c8, c0146e4);
                    Q.A0.a(Y3.C.L(R.drawable.delete, 0, c0626q4), h5.e.j0(R.string.button_delete, c0626q4), null, 0L, c0626q4, 8, 12);
                    f3.b(h5.e.j0(R.string.button_delete, c0626q4), AbstractC1787b.C(c1038o, f11, S.l.f7374V, S.l.f7374V, S.l.f7374V, 14), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q4.j(e1Var)).f6129j, c0626q4, 48, 0, 131068);
                    c0626q4.p(true);
                    AbstractC1787b.h(c0626q4, v.t0.d(c1038o, 32));
                    c0626q4.p(true);
                } else {
                    c0626q4.V();
                }
                return X3.y.a;
            case 4:
                X2.L l7 = (X2.L) this.f871e;
                T.d1 d1Var2 = (T.d1) this.f872f;
                C0626q c0626q5 = (C0626q) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q5.S(intValue3 & 1, (intValue3 & 17) != 16)) {
                    boolean booleanValue = ((Boolean) d1Var2.getValue()).booleanValue();
                    boolean h7 = c0626q5.h(l7) | c0626q5.f(d1Var2);
                    Object P16 = c0626q5.P();
                    if (h7 || P16 == C0616l.a) {
                        P16 = new r(21, l7, d1Var2);
                        c0626q5.m0(P16);
                    }
                    AbstractC0530j.e(booleanValue, (InterfaceC1193a) P16, c0626q5, 0);
                } else {
                    c0626q5.V();
                }
                return X3.y.a;
            case AbstractC1787b.f15290g /* 5 */:
                T.d1 d1Var3 = (T.d1) this.f871e;
                T.d1 d1Var4 = (T.d1) this.f872f;
                C0626q c0626q6 = (C0626q) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q6.S(intValue4 & 1, (intValue4 & 17) != 16)) {
                    AbstractC0530j.m(((Boolean) d1Var3.getValue()).booleanValue(), ((Boolean) d1Var4.getValue()).booleanValue(), c0626q6, 0);
                } else {
                    c0626q6.V();
                }
                return X3.y.a;
            case 6:
                C0172a0 c0172a0 = (C0172a0) this.f871e;
                Context context = (Context) this.f872f;
                C0626q c0626q7 = (C0626q) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q7.S(intValue5 & 1, (intValue5 & 17) != 16)) {
                    String j03 = h5.e.j0(R.string.about_official_website, c0626q7);
                    T.e1 e1Var2 = Q.O.a;
                    o0.s sVar = new o0.s(((Q.N) c0626q7.j(e1Var2)).a);
                    boolean h8 = c0626q7.h(c0172a0);
                    Object P17 = c0626q7.P();
                    C0602e c0602e4 = C0616l.a;
                    if (h8 || P17 == c0602e4) {
                        P17 = new Y3.l(c0172a0, 2);
                        c0626q7.m0(P17);
                    }
                    Z2.f1 f1Var = new Z2.f1(R.drawable.language, j03, "https://bothub.bookab.info/", sVar, (InterfaceC1193a) P17);
                    Z2.f1 f1Var2 = new Z2.f1(R.drawable.info, h5.e.j0(R.string.about_version, c0626q7), "4.3.2", (InterfaceC1193a) null, 24);
                    String j04 = h5.e.j0(R.string.about_qq_group, c0626q7);
                    String k02 = h5.e.k0(R.string.about_qq_group_id, new Object[]{"292036480"}, c0626q7);
                    o0.s sVar2 = new o0.s(((Q.N) c0626q7.j(e1Var2)).a);
                    boolean h9 = c0626q7.h(context) | c0626q7.h(c0172a0);
                    Object P18 = c0626q7.P();
                    if (h9 || P18 == c0602e4) {
                        P18 = new r(29, context, c0172a0);
                        c0626q7.m0(P18);
                    }
                    AbstractC0783w.O(Y4.l.I(f1Var, f1Var2, new Z2.f1(R.drawable.brand_qq, j04, k02, sVar2, (InterfaceC1193a) P18)), null, c0626q7, 0);
                } else {
                    c0626q7.V();
                }
                return X3.y.a;
            case 7:
                List list = (List) this.f871e;
                T.X x6 = (T.X) this.f872f;
                C0626q c0626q8 = (C0626q) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q8.S(intValue6 & 1, (intValue6 & 17) != 16)) {
                    String str2 = (String) x6.getValue();
                    boolean f13 = c0626q8.f(x6);
                    Object P19 = c0626q8.P();
                    if (f13 || P19 == C0616l.a) {
                        P19 = new C0103y(x6, 20);
                        c0626q8.m0(P19);
                    }
                    AbstractC0783w.S(list, str2, (l4.c) P19, c0626q8, 0);
                } else {
                    c0626q8.V();
                }
                return X3.y.a;
            case 8:
                EnumC0731u enumC0731u = (EnumC0731u) this.f871e;
                String str3 = (String) this.f872f;
                C0626q c0626q9 = (C0626q) obj2;
                ((Integer) obj3).getClass();
                AbstractC1276k.f((InterfaceC1194A) obj, "$this$AnimatedVisibility");
                float f14 = 8;
                InterfaceC1041r c9 = l0.h.c(v.t0.a, C.e.a(f14));
                int ordinal = enumC0731u.ordinal();
                if (ordinal == 0) {
                    c0626q9.b0(1242809206);
                    c0626q9.p(false);
                    j3 = o0.s.f13480g;
                } else if (ordinal == 1) {
                    c0626q9.b0(1242799837);
                    j3 = o0.s.c(0.5f, ((Q.N) c0626q9.j(Q.O.a)).f5407c);
                    c0626q9.p(false);
                } else if (ordinal == 2) {
                    c0626q9.b0(1242802846);
                    c0626q9.p(false);
                    j3 = o0.s.c(0.15f, o0.y.d(4281648985L));
                } else {
                    if (ordinal != 3) {
                        c0626q9.b0(1242796518);
                        c0626q9.p(false);
                        throw new RuntimeException();
                    }
                    c0626q9.b0(1242806493);
                    j3 = o0.s.c(0.5f, ((Q.N) c0626q9.j(Q.O.a)).f5435y);
                    c0626q9.p(false);
                }
                InterfaceC1041r y7 = AbstractC1787b.y(AbstractC1464z.f(c9, j3, o0.y.f13496b), 12);
                v.p0 a10 = v.o0.a(AbstractC1799h.a, C1026c.f11796n, c0626q9, 48);
                int hashCode4 = Long.hashCode(c0626q9.f8164T);
                InterfaceC0617l0 l8 = c0626q9.l();
                InterfaceC1041r c10 = AbstractC1024a.c(c0626q9, y7);
                InterfaceC0152h.a.getClass();
                C0148f c0148f4 = C0150g.f1924b;
                c0626q9.f0();
                if (c0626q9.f8163S) {
                    c0626q9.k(c0148f4);
                } else {
                    c0626q9.p0();
                }
                T.r.G(c0626q9, a10, C0150g.f1928f);
                T.r.G(c0626q9, l8, C0150g.f1927e);
                T.r.x(c0626q9, Integer.valueOf(hashCode4), C0150g.f1929g);
                T.r.C(c0626q9, C0150g.f1930h);
                T.r.G(c0626q9, c10, C0150g.f1926d);
                int ordinal2 = enumC0731u.ordinal();
                if (ordinal2 != 0) {
                    C1038o c1038o2 = C1038o.a;
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            z5 = true;
                            c0626q9.b0(-474858221);
                            AbstractC1806l.a(AbstractC1464z.f(v.t0.j(c1038o2, f14), o0.y.d(4281648985L), C.e.a), c0626q9, 0);
                            AbstractC1787b.h(c0626q9, v.t0.n(c1038o2, f14));
                            f3.b(h5.e.j0(R.string.mcp_connected, c0626q9), null, o0.y.d(4281648985L), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q9.j(u3.a)).f6130k, c0626q9, 384, 0, 131066);
                            c0626q9 = c0626q9;
                            c0626q9.p(false);
                        } else {
                            if (ordinal2 != 3) {
                                c0626q9.b0(-1955001055);
                                c0626q9.p(false);
                                throw new RuntimeException();
                            }
                            c0626q9.b0(-474289960);
                            AbstractC1688b L5 = Y3.C.L(R.drawable.close, 0, c0626q9);
                            T.e1 e1Var3 = Q.O.a;
                            Q.A0.a(L5, null, v.t0.j(c1038o2, 16), ((Q.N) c0626q9.j(e1Var3)).f5433w, c0626q9, 440, 0);
                            AbstractC1787b.h(c0626q9, v.t0.n(c1038o2, f14));
                            if (str3 == null) {
                                c0626q9.b0(-1954949483);
                                str3 = h5.e.j0(R.string.mcp_connection_failed, c0626q9);
                            } else {
                                c0626q9.b0(-1954949979);
                            }
                            c0626q9.p(false);
                            z5 = true;
                            f3.b(str3, null, ((Q.N) c0626q9.j(e1Var3)).f5433w, 0L, null, 0L, null, 0L, 2, false, 2, 0, ((t3) c0626q9.j(u3.a)).f6130k, c0626q9, 0, 24960, 110586);
                            c0626q9 = c0626q9;
                            c0626q9.p(false);
                        }
                        c0626q9.p(z5);
                        return X3.y.a;
                    }
                    c0626q9.b0(-475471711);
                    T.e1 e1Var4 = Q.O.a;
                    M1.a(v.t0.j(c1038o2, 16), ((Q.N) c0626q9.j(e1Var4)).a, 2, 0L, 0, S.l.f7374V, c0626q9, 390, 56);
                    AbstractC1787b.h(c0626q9, v.t0.n(c1038o2, f14));
                    f3.b(h5.e.j0(R.string.mcp_connecting, c0626q9), null, ((Q.N) c0626q9.j(e1Var4)).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q9.j(u3.a)).f6130k, c0626q9, 0, 0, 131066);
                    c0626q9 = c0626q9;
                    c0626q9.p(false);
                } else {
                    c0626q9.b0(-473526709);
                    c0626q9.p(false);
                }
                z5 = true;
                c0626q9.p(z5);
                return X3.y.a;
            case AbstractC1787b.f15287d /* 9 */:
                Integer num = (Integer) this.f871e;
                C0810H c0810h = (C0810H) this.f872f;
                C0626q c0626q10 = (C0626q) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1814u) obj, "$this$Card");
                if (c0626q10.S(intValue7 & 1, (intValue7 & 17) != 16)) {
                    C1038o c1038o3 = C1038o.a;
                    InterfaceC1041r y8 = AbstractC1787b.y(c1038o3, 16);
                    C1813t a11 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q10, 0);
                    int hashCode5 = Long.hashCode(c0626q10.f8164T);
                    InterfaceC0617l0 l9 = c0626q10.l();
                    InterfaceC1041r c11 = AbstractC1024a.c(c0626q10, y8);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f5 = C0150g.f1924b;
                    c0626q10.f0();
                    if (c0626q10.f8163S) {
                        c0626q10.k(c0148f5);
                    } else {
                        c0626q10.p0();
                    }
                    C0146e c0146e5 = C0150g.f1928f;
                    T.r.G(c0626q10, a11, c0146e5);
                    C0146e c0146e6 = C0150g.f1927e;
                    T.r.G(c0626q10, l9, c0146e6);
                    Integer valueOf2 = Integer.valueOf(hashCode5);
                    C0146e c0146e7 = C0150g.f1929g;
                    T.r.x(c0626q10, valueOf2, c0146e7);
                    C0144d c0144d2 = C0150g.f1930h;
                    T.r.C(c0626q10, c0144d2);
                    C0146e c0146e8 = C0150g.f1926d;
                    T.r.G(c0626q10, c11, c0146e8);
                    C1818y c1818y2 = v.t0.a;
                    v.p0 a12 = v.o0.a(AbstractC1799h.a, C1026c.f11796n, c0626q10, 48);
                    int hashCode6 = Long.hashCode(c0626q10.f8164T);
                    InterfaceC0617l0 l10 = c0626q10.l();
                    InterfaceC1041r c12 = AbstractC1024a.c(c0626q10, c1818y2);
                    c0626q10.f0();
                    if (c0626q10.f8163S) {
                        c0626q10.k(c0148f5);
                    } else {
                        c0626q10.p0();
                    }
                    T.r.G(c0626q10, a12, c0146e5);
                    T.r.G(c0626q10, l10, c0146e6);
                    AbstractC1135a.n(hashCode6, c0626q10, c0146e7, c0626q10, c0144d2);
                    T.r.G(c0626q10, c12, c0146e8);
                    c0626q10.b0(1532219903);
                    int intValue8 = num.intValue();
                    AbstractC1688b L6 = Y3.C.L(intValue8, 0, c0626q10);
                    String str4 = c0810h.a.f11167c;
                    InterfaceC1041r j5 = v.t0.j(c1038o3, 24);
                    if (AbstractC0783w.V(Integer.valueOf(intValue8))) {
                        c0626q10.b0(780402251);
                        j4 = ((Q.N) c0626q10.j(Q.O.a)).f5427q;
                        z6 = false;
                        c0626q10.p(false);
                    } else {
                        z6 = false;
                        c0626q10.b0(780402925);
                        c0626q10.p(false);
                        j4 = o0.s.f13481h;
                    }
                    Q.A0.a(L6, str4, j5, j4, c0626q10, 392, 0);
                    AbstractC1787b.h(c0626q10, v.t0.n(c1038o3, 12));
                    c0626q10.p(z6);
                    f3.b(c0810h.a.f11167c, null, ((Q.N) c0626q10.j(Q.O.a)).f5427q, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q10.j(u3.a)).f6127h, c0626q10, 0, 0, 131066);
                    LLMProvider lLMProvider = c0810h.a;
                    if (!lLMProvider.f11175k || (str = lLMProvider.f11176l) == null || AbstractC1776n.Q(str)) {
                        z7 = false;
                        c0626q10.b0(1513025974);
                    } else {
                        c0626q10.b0(1532955037);
                        if (1.0f <= 0.0d) {
                            AbstractC1829a.a("invalid weight; must be greater than zero");
                        }
                        AbstractC1787b.h(c0626q10, new v.Z(1.0f, true));
                        z7 = false;
                        AbstractC1806l.a(AbstractC1464z.f(v.t0.j(c1038o3, 8), o0.y.d(4281648985L), C.e.a), c0626q10, 0);
                    }
                    c0626q10.p(z7);
                    c0626q10.p(true);
                    c0626q10.p(true);
                } else {
                    c0626q10.V();
                }
                return X3.y.a;
            case AbstractC1787b.f15289f /* 10 */:
                Spannable spannable = (Spannable) this.f871e;
                C0319l0 c0319l0 = (C0319l0) this.f872f;
                S0.G g3 = (S0.G) obj;
                int intValue9 = ((Integer) obj2).intValue();
                int intValue10 = ((Integer) obj3).intValue();
                W0.p pVar = g3.f7575f;
                W0.k kVar = g3.f7572c;
                if (kVar == null) {
                    kVar = W0.k.f8834h;
                }
                W0.i iVar = g3.f7573d;
                int i6 = iVar != null ? iVar.a : 0;
                W0.j jVar = g3.f7574e;
                int i7 = jVar != null ? jVar.a : 65535;
                C0795c c0795c = (C0795c) c0319l0.f4150e;
                W0.r b5 = ((W0.f) c0795c.f10557e).b(pVar, kVar, i6, i7);
                if (b5 instanceof W0.r) {
                    Object obj4 = b5.f8849c;
                    AbstractC1276k.d(obj4, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj4;
                } else {
                    C0158m c0158m = new C0158m(b5, c0795c.f10562j);
                    c0795c.f10562j = c0158m;
                    Object obj5 = c0158m.f1974g;
                    AbstractC1276k.d(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj5;
                }
                spannable.setSpan(new V0.b(typeface, 1), intValue9, intValue10, 33);
                return X3.y.a;
            case 11:
                C0898n c0898n = (C0898n) this.f871e;
                InterfaceC1193a interfaceC1193a4 = (InterfaceC1193a) this.f872f;
                ((Integer) obj3).getClass();
                AbstractC1276k.f((InterfaceC1194A) obj, "$this$AnimatedVisibility");
                AbstractC0897m.b(c0898n.f11044b, c0898n.f11045c, null, interfaceC1193a4, (C0626q) obj2, 0);
                return X3.y.a;
            case 12:
                l4.c cVar5 = (l4.c) this.f871e;
                C1491c c1491c = (C1491c) this.f872f;
                C0626q c0626q11 = (C0626q) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                if (c0626q11.S(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Object P20 = c0626q11.P();
                    if (P20 == C0616l.a) {
                        P20 = new C1492d();
                        c0626q11.m0(P20);
                    }
                    C1492d c1492d = (C1492d) P20;
                    c1492d.a.clear();
                    cVar5.f(c1492d);
                    c1492d.a(c1491c, c0626q11, 0);
                } else {
                    c0626q11.V();
                }
                return X3.y.a;
            default:
                C2004b c2004b = (C2004b) this.f871e;
                e1.m mVar = (e1.m) this.f872f;
                float floatValue = ((Float) obj).floatValue();
                float floatValue2 = ((Float) obj2).floatValue();
                float floatValue3 = ((Float) obj3).floatValue();
                boolean p6 = AbstractC1118b.p(c2004b, floatValue);
                if (c2004b.l().f16155e != r.X0.f14183c && mVar != e1.m.f11576c) {
                    p6 = !p6;
                }
                int i8 = c2004b.l().f16152b;
                float l11 = i8 == 0 ? 0.0f : AbstractC1118b.l(c2004b) / i8;
                float f15 = l11 - ((int) l11);
                char c13 = Math.abs(floatValue) >= c2004b.f16064q.e0(AbstractC1647k.a) ? floatValue > S.l.f7374V ? (char) 1 : (char) 2 : (char) 0;
                if (c13 != 0) {
                    if (c13 != 1) {
                        if (c13 != 2) {
                            floatValue2 = 0.0f;
                        }
                    }
                    floatValue2 = floatValue3;
                } else if (Math.abs(f15) <= 0.5f) {
                    floatValue2 = floatValue3;
                    break;
                } else {
                    floatValue2 = floatValue3;
                }
                return Float.valueOf(floatValue2);
        }
    }

    public /* synthetic */ Q0(int i6, Object obj, l4.c cVar) {
        this.f870c = i6;
        this.f872f = obj;
        this.f871e = cVar;
    }
}
