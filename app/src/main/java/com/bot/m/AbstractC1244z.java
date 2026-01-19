package m;

import F0.AbstractC0137z;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import I3.C0237a;
import T.C0602e;
import T.C0607g0;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import T.T0;
import b0.C0873f;
import com.vladsch.flexmark.parser.PegdownExtensions;
import f0.C0990m;
import h0.AbstractC1024a;
import h0.C1038o;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import n.AbstractC1318d;
import n.C0;
import n.C1304M;
import n.E0;
import n.r0;
import n.y0;
import p0.C1468d;
import v.C1814u;

/* renamed from: m.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1244z {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v27, types: [b0.f] */
    /* JADX WARN: Type inference failed for: r39v0, types: [T.q, java.lang.Object] */
    public static final void a(y0 y0Var, l4.c cVar, InterfaceC1041r interfaceC1041r, C1210Q c1210q, C1211S c1211s, l4.e eVar, C0873f c0873f, C0626q c0626q, int i6) {
        int i7;
        C0873f c0873f2;
        int i8;
        int i9;
        d0 d0Var;
        E0 e02;
        C0602e c0602e;
        y0 y0Var2;
        boolean z5;
        r0 r0Var;
        r0 r0Var2;
        r0 r0Var3;
        boolean z6;
        r0 r0Var4;
        boolean z7;
        r0 r0Var5;
        r0 r0Var6;
        r0 r0Var7;
        r0 r0Var8;
        C1211S c1211s2;
        C1210Q c1210q2;
        C0873f c0873f3;
        c0626q.d0(1912839215);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(y0Var) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(cVar) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.f(interfaceC1041r) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q.f(c1210q) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0626q.f(c1211s) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i7 |= c0626q.h(eVar) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        int i10 = i7 | 1572864;
        if ((12582912 & i6) == 0) {
            i10 |= c0626q.h(c0873f) ? PegdownExtensions.EXTANCHORLINKS_WRAP : PegdownExtensions.EXTANCHORLINKS;
        }
        int i11 = i10;
        if (c0626q.S(i11 & 1, (4793491 & i11) != 4793490)) {
            C0607g0 c0607g0 = y0Var.f13280d;
            N3.s sVar = y0Var.a;
            if (((Boolean) cVar.f(c0607g0.getValue())).booleanValue() || ((Boolean) cVar.f(sVar.k())).booleanValue() || y0Var.g() || y0Var.d()) {
                c0626q.b0(-232413539);
                int i12 = i11 & 14;
                int i13 = i12 | 48;
                int i14 = i13 & 14;
                boolean z8 = ((i14 ^ 6) > 4 && c0626q.f(y0Var)) || (i13 & 6) == 4;
                Object P5 = c0626q.P();
                boolean z9 = z8;
                C0602e c0602e2 = C0616l.a;
                if (z9 || P5 == c0602e2) {
                    P5 = sVar.k();
                    c0626q.m0(P5);
                }
                if (y0Var.g()) {
                    P5 = sVar.k();
                }
                c0626q.b0(1844425648);
                EnumC1199F e6 = e(y0Var, cVar, P5, c0626q);
                c0626q.p(false);
                Object value = y0Var.f13280d.getValue();
                c0626q.b0(1844425648);
                EnumC1199F e7 = e(y0Var, cVar, value, c0626q);
                c0626q.p(false);
                int i15 = i14 | 3072;
                C0990m c0990m = C0.a;
                int i16 = (i15 & 14) ^ 6;
                boolean z10 = (i16 > 4 && c0626q.f(y0Var)) || (i15 & 6) == 4;
                Object P6 = c0626q.P();
                if (z10 || P6 == c0602e2) {
                    i8 = i15;
                    i9 = i11;
                    P6 = new y0(new C1304M(e6), y0Var, B3.e.s(new StringBuilder(), y0Var.f13279c, " > EnterExitTransition"));
                    c0626q.m0(P6);
                } else {
                    i8 = i15;
                    i9 = i11;
                }
                y0 y0Var3 = (y0) P6;
                boolean f6 = c0626q.f(y0Var3) | ((i16 > 4 && c0626q.f(y0Var)) || (i8 & 6) == 4);
                Object P7 = c0626q.P();
                if (f6 || P7 == c0602e2) {
                    P7 = new Z2.X(7, y0Var, y0Var3);
                    c0626q.m0(P7);
                }
                T.r.d(y0Var3, (l4.c) P7, c0626q);
                if (y0Var.g()) {
                    y0Var3.k(e6, e7);
                } else {
                    y0Var3.p(e7);
                    y0Var3.f13287k.setValue(Boolean.FALSE);
                }
                T.X E5 = T.r.E(eVar, c0626q);
                N3.s sVar2 = y0Var3.a;
                N3.s sVar3 = y0Var3.a;
                C0607g0 c0607g02 = y0Var3.f13280d;
                Object m3 = eVar.m(sVar2.k(), c0607g02.getValue());
                boolean f7 = c0626q.f(y0Var3) | c0626q.f(E5);
                Object P8 = c0626q.P();
                if (f7 || P8 == c0602e2) {
                    P8 = new C1240v(y0Var3, E5, null);
                    c0626q.m0(P8);
                }
                l4.e eVar2 = (l4.e) P8;
                Object P9 = c0626q.P();
                if (P9 == c0602e2) {
                    P9 = T.r.A(m3);
                    c0626q.m0(P9);
                }
                T.X x5 = (T.X) P9;
                boolean h3 = c0626q.h(eVar2);
                Object P10 = c0626q.P();
                if (h3 || P10 == c0602e2) {
                    P10 = new T0(eVar2, x5, null);
                    c0626q.m0(P10);
                }
                T.r.f(c0626q, X3.y.a, (l4.e) P10);
                Object k3 = sVar3.k();
                EnumC1199F enumC1199F = EnumC1199F.f12716f;
                if (k3 == enumC1199F && c0607g02.getValue() == enumC1199F && ((Boolean) x5.getValue()).booleanValue()) {
                    c0626q.b0(-272333293);
                    c0626q.p(false);
                    c0873f3 = c0873f;
                    z5 = false;
                } else {
                    c0626q.b0(-231383533);
                    boolean z11 = i12 == 4;
                    Object P11 = c0626q.P();
                    if (z11 || P11 == c0602e2) {
                        P11 = new C1195B();
                        c0626q.m0(P11);
                    }
                    C1195B c1195b = (C1195B) P11;
                    E0 e03 = AbstractC1205L.a;
                    E0 e04 = AbstractC1318d.f13120p;
                    Object P12 = c0626q.P();
                    if (P12 == c0602e2) {
                        P12 = C1203J.f12733e;
                        c0626q.m0(P12);
                    }
                    InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P12;
                    boolean f8 = c0626q.f(y0Var3);
                    Object P13 = c0626q.P();
                    if (f8 || P13 == c0602e2) {
                        P13 = T.r.A(c1210q);
                        c0626q.m0(P13);
                    }
                    T.X x6 = (T.X) P13;
                    Object k5 = sVar3.k();
                    Object value2 = c0607g02.getValue();
                    EnumC1199F enumC1199F2 = EnumC1199F.f12715e;
                    if (k5 == value2 && sVar3.k() == enumC1199F2) {
                        if (y0Var3.g()) {
                            x6.setValue(c1210q);
                        } else {
                            x6.setValue(C1210Q.f12760b);
                        }
                    } else if (c0607g02.getValue() == enumC1199F2) {
                        x6.setValue(((C1210Q) x6.getValue()).a(c1210q));
                    }
                    C1210Q c1210q3 = (C1210Q) x6.getValue();
                    boolean f9 = c0626q.f(y0Var3);
                    Object P14 = c0626q.P();
                    if (f9 || P14 == c0602e2) {
                        P14 = T.r.A(c1211s);
                        c0626q.m0(P14);
                    }
                    T.X x7 = (T.X) P14;
                    if (sVar3.k() == c0607g02.getValue() && sVar3.k() == enumC1199F2) {
                        if (y0Var3.g()) {
                            x7.setValue(c1211s);
                        } else {
                            x7.setValue(C1211S.f12761b);
                        }
                    } else if (c0607g02.getValue() != enumC1199F2) {
                        x7.setValue(((C1211S) x7.getValue()).a(c1211s));
                    }
                    C1211S c1211s3 = (C1211S) x7.getValue();
                    d0 d0Var2 = c1210q3.a;
                    d0 d0Var3 = c1211s3.a;
                    b0 b0Var = d0Var2.f12787b;
                    C1197D c1197d = d0Var2.f12788c;
                    boolean z12 = (b0Var == null && d0Var3.f12787b == null) ? false : true;
                    boolean z13 = (c1197d == null && d0Var3.f12788c == null) ? false : true;
                    if (z12) {
                        c0626q.b0(133792645);
                        Object P15 = c0626q.P();
                        if (P15 == c0602e2) {
                            P15 = "Built-in slide";
                            c0626q.m0("Built-in slide");
                        }
                        d0Var = d0Var3;
                        c0602e = c0602e2;
                        y0Var2 = y0Var3;
                        z5 = false;
                        r0 b5 = C0.b(y0Var2, e04, (String) P15, c0626q, 384, 0);
                        e02 = e04;
                        c0626q.p(false);
                        r0Var = b5;
                    } else {
                        d0Var = d0Var3;
                        e02 = e04;
                        c0602e = c0602e2;
                        y0Var2 = y0Var3;
                        z5 = false;
                        c0626q.b0(133898448);
                        c0626q.p(false);
                        r0Var = null;
                    }
                    if (z13) {
                        c0626q.b0(133990239);
                        E0 e05 = AbstractC1318d.f13121q;
                        Object P16 = c0626q.P();
                        if (P16 == c0602e) {
                            P16 = "Built-in shrink/expand";
                            c0626q.m0("Built-in shrink/expand");
                        }
                        r0 b6 = C0.b(y0Var2, e05, (String) P16, c0626q, 384, 0);
                        c0626q.p(z5);
                        r0Var2 = b6;
                    } else {
                        c0626q.b0(134101063);
                        c0626q.p(z5);
                        r0Var2 = null;
                    }
                    if (z13) {
                        c0626q.b0(134174689);
                        Object P17 = c0626q.P();
                        if (P17 == c0602e) {
                            P17 = "Built-in InterruptionHandlingOffset";
                            c0626q.m0("Built-in InterruptionHandlingOffset");
                        }
                        r0 b7 = C0.b(y0Var2, e02, (String) P17, c0626q, 384, 0);
                        c0626q.p(z5);
                        r0Var3 = b7;
                    } else {
                        c0626q.b0(134345095);
                        c0626q.p(z5);
                        r0Var3 = null;
                    }
                    boolean z14 = !z13;
                    float[] fArr = C1468d.a;
                    c0626q.b0(135150476);
                    c0626q.p(z5);
                    E0 e06 = AbstractC1318d.f13114j;
                    boolean z15 = (d0Var2.a == null && d0Var.a == null) ? z5 : true;
                    boolean z16 = (d0Var2.f12789d == null && d0Var.f12789d == null) ? z5 : true;
                    if (z15) {
                        c0626q.b0(-703879421);
                        Object P18 = c0626q.P();
                        if (P18 == c0602e) {
                            P18 = "Built-in alpha";
                            c0626q.m0("Built-in alpha");
                        }
                        String str = (String) P18;
                        z6 = z14;
                        r0 b8 = C0.b(y0Var2, e06, str, c0626q, 384, 0);
                        c0626q.p(z5);
                        r0Var4 = b8;
                    } else {
                        z6 = z14;
                        c0626q.b0(-703709976);
                        c0626q.p(z5);
                        r0Var4 = null;
                    }
                    if (z16) {
                        c0626q.b0(-703642333);
                        Object P19 = c0626q.P();
                        if (P19 == c0602e) {
                            P19 = "Built-in scale";
                            c0626q.m0("Built-in scale");
                        }
                        z7 = z16;
                        r0Var5 = r0Var4;
                        r0 b9 = C0.b(y0Var2, e06, (String) P19, c0626q, 384, 0);
                        c0626q.p(z5);
                        r0Var6 = b9;
                    } else {
                        z7 = z16;
                        r0Var5 = r0Var4;
                        c0626q.b0(-703472888);
                        c0626q.p(z5);
                        r0Var6 = null;
                    }
                    if (z7) {
                        c0626q.b0(-703395232);
                        r0Var7 = r0Var6;
                        r0Var8 = C0.b(y0Var2, AbstractC1205L.a, "TransformOriginInterruptionHandling", c0626q, 384, 0);
                        c0626q.p(z5);
                    } else {
                        r0Var7 = r0Var6;
                        c0626q.b0(-703222904);
                        c0626q.p(z5);
                        r0Var8 = null;
                    }
                    boolean h6 = c0626q.h(r0Var5) | c0626q.f(c1210q3) | c0626q.f(c1211s3) | c0626q.h(r0Var7) | c0626q.f(y0Var2) | c0626q.h(r0Var8);
                    Object P20 = c0626q.P();
                    if (h6 || P20 == c0602e) {
                        c1211s2 = c1211s3;
                        c1210q2 = c1210q3;
                        P20 = new C1201H(r0Var5, r0Var7, y0Var2, c1210q2, c1211s2, r0Var8);
                        c0626q.m0(P20);
                    } else {
                        c1211s2 = c1211s3;
                        c1210q2 = c1210q3;
                    }
                    C1201H c1201h = (C1201H) P20;
                    boolean g3 = c0626q.g(z6) | c0626q.f(interfaceC1193a);
                    Object P21 = c0626q.P();
                    if (g3 || P21 == c0602e) {
                        P21 = new C0237a(z6, interfaceC1193a);
                        c0626q.m0(P21);
                    }
                    C1038o c1038o = C1038o.a;
                    InterfaceC1041r c6 = o0.y.o(c1038o, (l4.c) P21).c(new C1200G(y0Var2, r0Var2, r0Var3, r0Var, c1210q2, c1211s2, interfaceC1193a, c1201h)).c(c1038o);
                    c0626q.b0(-7432681);
                    c0626q.p(z5);
                    InterfaceC1041r c7 = interfaceC1041r.c(c6.c(c1038o));
                    Object P22 = c0626q.P();
                    if (P22 == c0602e) {
                        P22 = new C1238t(c1195b);
                        c0626q.m0(P22);
                    }
                    C1238t c1238t = (C1238t) P22;
                    int hashCode = Long.hashCode(c0626q.f8164T);
                    InterfaceC0617l0 l3 = c0626q.l();
                    InterfaceC1041r c8 = AbstractC1024a.c(c0626q, c7);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f = C0150g.f1924b;
                    c0626q.f0();
                    if (c0626q.f8163S) {
                        c0626q.k(c0148f);
                    } else {
                        c0626q.p0();
                    }
                    T.r.G(c0626q, c1238t, C0150g.f1928f);
                    T.r.G(c0626q, l3, C0150g.f1927e);
                    T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
                    T.r.C(c0626q, C0150g.f1930h);
                    T.r.G(c0626q, c8, C0150g.f1926d);
                    ?? r12 = c0873f;
                    r12.d(c1195b, c0626q, Integer.valueOf((i9 >> 18) & 112));
                    c0626q.p(true);
                    c0626q.p(z5);
                    c0873f3 = r12;
                }
                c0626q.p(z5);
                c0873f2 = c0873f3;
            } else {
                c0626q.b0(-272333293);
                c0626q.p(false);
                c0873f2 = c0873f;
            }
        } else {
            c0873f2 = c0873f;
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C1239u(y0Var, cVar, interfaceC1041r, c1210q, c1211s, eVar, c0873f2, i6);
        }
    }

    public static final void b(C1814u c1814u, boolean z5, InterfaceC1041r interfaceC1041r, C1210Q c1210q, C1211S c1211s, String str, C0873f c0873f, C0626q c0626q, int i6, int i7) {
        InterfaceC1041r interfaceC1041r2;
        C1210Q c1210q2;
        String str2;
        int i8;
        C1210Q c1210q3;
        c0626q.d0(1799879339);
        int i9 = (c0626q.g(z5) ? 32 : 16) | i6;
        int i10 = i9 | 384;
        int i11 = i7 & 4;
        if (i11 != 0) {
            i10 = i9 | 3456;
        } else if ((i6 & 3072) == 0) {
            i10 |= c0626q.f(c1210q) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i10 |= c0626q.f(c1211s) ? 16384 : 8192;
        }
        int i12 = i10 | PegdownExtensions.SUPPRESS_ALL_HTML;
        if (c0626q.S(i12 & 1, (599185 & i12) != 599184)) {
            if (i11 != 0) {
                c1210q3 = AbstractC1205L.b(null, 3).a(AbstractC1205L.a(null, 15));
                i8 = 196608;
            } else {
                i8 = 196608;
                c1210q3 = c1210q;
            }
            y0 e6 = C0.e(Boolean.valueOf(z5), "AnimatedVisibility", c0626q, ((i12 >> 3) & 14) | 48, 0);
            Object P5 = c0626q.P();
            if (P5 == C0616l.a) {
                P5 = C1221c.f12773h;
                c0626q.m0(P5);
            }
            int i13 = (i12 & 57344) | (i12 & 7168) | 432 | i8;
            C1038o c1038o = C1038o.a;
            d(e6, (l4.c) P5, c1038o, c1210q3, c1211s, c0873f, c0626q, i13);
            c1210q2 = c1210q3;
            str2 = "AnimatedVisibility";
            interfaceC1041r2 = c1038o;
        } else {
            c0626q.V();
            interfaceC1041r2 = interfaceC1041r;
            c1210q2 = c1210q;
            str2 = str;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C1242x(c1814u, z5, interfaceC1041r2, c1210q2, c1211s, str2, c0873f, i6, i7);
        }
    }

    public static final void c(boolean z5, InterfaceC1041r interfaceC1041r, C1210Q c1210q, C1211S c1211s, String str, C0873f c0873f, C0626q c0626q, int i6, int i7) {
        int i8;
        InterfaceC1041r interfaceC1041r2;
        String str2;
        c0626q.d0(-1448730565);
        if ((i6 & 6) == 0) {
            i8 = (c0626q.g(z5) ? 4 : 2) | i6;
        } else {
            i8 = i6;
        }
        int i9 = i7 & 2;
        if (i9 != 0) {
            i8 |= 48;
        } else if ((i6 & 48) == 0) {
            i8 |= c0626q.f(interfaceC1041r) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= c0626q.f(c1210q) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i8 |= c0626q.f(c1211s) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        int i10 = i8 | 24576;
        if ((196608 & i6) == 0) {
            i10 |= c0626q.h(c0873f) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if (c0626q.S(i10 & 1, (74899 & i10) != 74898)) {
            if (i9 != 0) {
                interfaceC1041r = C1038o.a;
            }
            interfaceC1041r2 = interfaceC1041r;
            y0 e6 = C0.e(Boolean.valueOf(z5), "AnimatedVisibility", c0626q, (i10 & 14) | ((i10 >> 9) & 112), 0);
            Object P5 = c0626q.P();
            if (P5 == C0616l.a) {
                P5 = C1221c.f12772g;
                c0626q.m0(P5);
            }
            int i11 = i10 << 3;
            d(e6, (l4.c) P5, interfaceC1041r2, c1210q, c1211s, c0873f, c0626q, (i11 & 57344) | (i11 & 896) | 48 | (i11 & 7168) | (i10 & 458752));
            str2 = "AnimatedVisibility";
        } else {
            c0626q.V();
            interfaceC1041r2 = interfaceC1041r;
            str2 = str;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C1241w(z5, interfaceC1041r2, c1210q, c1211s, str2, c0873f, i6, i7);
        }
    }

    public static final void d(y0 y0Var, l4.c cVar, InterfaceC1041r interfaceC1041r, C1210Q c1210q, C1211S c1211s, C0873f c0873f, C0626q c0626q, int i6) {
        int i7;
        C1210Q c1210q2;
        C1211S c1211s2;
        C0873f c0873f2;
        c0626q.d0(1706321816);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(y0Var) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(cVar) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.f(interfaceC1041r) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            c1210q2 = c1210q;
            i7 |= c0626q.f(c1210q2) ? 2048 : PegdownExtensions.ANCHORLINKS;
        } else {
            c1210q2 = c1210q;
        }
        if ((i6 & 24576) == 0) {
            c1211s2 = c1211s;
            i7 |= c0626q.f(c1211s2) ? 16384 : 8192;
        } else {
            c1211s2 = c1211s;
        }
        if ((i6 & PegdownExtensions.SUPPRESS_ALL_HTML) == 0) {
            c0873f2 = c0873f;
            i7 |= c0626q.h(c0873f2) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        } else {
            c0873f2 = c0873f;
        }
        if (c0626q.S(i7 & 1, (74899 & i7) != 74898)) {
            int i8 = i7 & 112;
            int i9 = i7 & 14;
            boolean z5 = (i8 == 32) | (i9 == 4);
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (z5 || P5 == c0602e) {
                P5 = new C1243y(cVar, y0Var);
                c0626q.m0(P5);
            }
            InterfaceC1041r k3 = AbstractC0137z.k(interfaceC1041r, (l4.f) P5);
            Object P6 = c0626q.P();
            if (P6 == c0602e) {
                P6 = C1226h.f12811g;
                c0626q.m0(P6);
            }
            a(y0Var, cVar, k3, c1210q2, c1211s2, (l4.e) P6, c0873f2, c0626q, 196608 | i9 | i8 | (i7 & 7168) | (57344 & i7) | ((i7 << 6) & 29360128));
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C1225g(y0Var, cVar, interfaceC1041r, c1210q, c1211s, c0873f, i6);
        }
    }

    public static final EnumC1199F e(y0 y0Var, l4.c cVar, Object obj, C0626q c0626q) {
        c0626q.Z(-422486745, y0Var);
        boolean g3 = y0Var.g();
        N3.s sVar = y0Var.a;
        EnumC1199F enumC1199F = EnumC1199F.f12714c;
        EnumC1199F enumC1199F2 = EnumC1199F.f12716f;
        EnumC1199F enumC1199F3 = EnumC1199F.f12715e;
        if (g3) {
            c0626q.b0(-212166497);
            c0626q.p(false);
            if (((Boolean) cVar.f(obj)).booleanValue()) {
                enumC1199F = enumC1199F3;
            } else if (((Boolean) cVar.f(sVar.k())).booleanValue()) {
                enumC1199F = enumC1199F2;
            }
        } else {
            c0626q.b0(-211892364);
            Object P5 = c0626q.P();
            if (P5 == C0616l.a) {
                P5 = T.r.A(Boolean.FALSE);
                c0626q.m0(P5);
            }
            T.X x5 = (T.X) P5;
            if (((Boolean) cVar.f(sVar.k())).booleanValue()) {
                x5.setValue(Boolean.TRUE);
            }
            if (((Boolean) cVar.f(obj)).booleanValue()) {
                enumC1199F = enumC1199F3;
            } else if (((Boolean) x5.getValue()).booleanValue()) {
                enumC1199F = enumC1199F2;
            }
            c0626q.p(false);
        }
        c0626q.p(false);
        return enumC1199F;
    }
}
