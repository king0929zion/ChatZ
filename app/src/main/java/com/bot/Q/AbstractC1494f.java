package q;

import D.AbstractC0090r0;
import D.Q0;
import D.e1;
import F0.V;
import H0.C0144d;
import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import Q.L;
import S.l;
import S0.P;
import T.B;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import T.r;
import Z2.O0;
import b0.AbstractC0874g;
import b0.C0873f;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1032i;
import h0.C1038o;
import h0.InterfaceC1041r;
import i1.AbstractC1094n;
import j1.AbstractC1135a;
import l0.h;
import l4.InterfaceC1193a;
import o0.s;
import o0.y;
import p.AbstractC1464z;
import v.AbstractC1787b;
import v.AbstractC1799h;
import v.AbstractC1806l;
import v.AbstractC1812s;
import v.C1795f;
import v.C1810p;
import v.C1813t;
import v.C1814u;
import v.Z;
import v.o0;
import v.p0;
import v.t0;
import w.AbstractC1829a;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1494f {
    public static final C1491c a;

    static {
        B b5 = AbstractC1094n.a;
        long j3 = s.f13477d;
        long j4 = s.f13475b;
        a = new C1491c(j3, j4, j4, s.c(0.38f, j4), s.c(0.38f, j4));
    }

    public static final void a(C1491c c1491c, InterfaceC1041r interfaceC1041r, C0873f c0873f, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(-527864079);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(c1491c) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.f(interfaceC1041r) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.h(c0873f) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            InterfaceC1041r r5 = AbstractC1464z.r(AbstractC1787b.A(l.f7374V, AbstractC1493e.f13932i, 1, AbstractC1787b.G(AbstractC1464z.f(h.k(interfaceC1041r, AbstractC1493e.f13927d, C.e.a(AbstractC1493e.f13928e), 28), c1491c.a, y.f13496b))), AbstractC1464z.q(c0626q), true);
            int i8 = (i7 << 3) & 7168;
            C1813t a6 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q, 0);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, r5);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            r.G(c0626q, a6, C0150g.f1928f);
            r.G(c0626q, l3, C0150g.f1927e);
            r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            r.C(c0626q, C0150g.f1930h);
            r.G(c0626q, c6, C0150g.f1926d);
            c0873f.d(C1814u.a, c0626q, Integer.valueOf(((i8 >> 6) & 112) | 6));
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new e1(c1491c, interfaceC1041r, c0873f, i6, 10);
        }
    }

    public static final void b(InterfaceC1041r interfaceC1041r, C1491c c1491c, l4.c cVar, C0626q c0626q, int i6, int i7) {
        int i8;
        int i9;
        c0626q.d0(-625529233);
        int i10 = i7 & 1;
        if (i10 != 0) {
            i8 = i6 | 6;
        } else {
            i8 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        }
        int i11 = i7 & 2;
        if (i11 != 0) {
            i9 = i8 | 48;
        } else {
            i9 = i8 | (c0626q.f(c1491c) ? 32 : 16);
        }
        int i12 = i9 | (c0626q.h(cVar) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q.S(i12 & 1, (i12 & 147) != 146)) {
            if (i10 != 0) {
                interfaceC1041r = C1038o.a;
            }
            if (i11 != 0) {
                c1491c = a;
            }
            a(c1491c, interfaceC1041r, AbstractC0874g.c(-250345048, new Q0(12, cVar, c1491c), c0626q), c0626q, ((i12 << 3) & 112) | ((i12 >> 3) & 14) | 384);
        } else {
            c0626q.V();
        }
        InterfaceC1041r interfaceC1041r2 = interfaceC1041r;
        C1491c c1491c2 = c1491c;
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new e1(interfaceC1041r2, c1491c2, cVar, i6, i7);
        }
    }

    public static final void c(String str, boolean z5, C1491c c1491c, InterfaceC1041r interfaceC1041r, l4.f fVar, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        int i7;
        int i8;
        c0626q.d0(-2001167027);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(str) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.g(z5) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.f(c1491c) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q.f(interfaceC1041r) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0626q.h(fVar) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i7 |= c0626q.h(interfaceC1193a) ? 131072 : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if (c0626q.S(i7 & 1, (74899 & i7) != 74898)) {
            C1032i c1032i = AbstractC1493e.f13929f;
            C1810p c1810p = AbstractC1799h.a;
            float f6 = AbstractC1493e.f13931h;
            C1795f g3 = AbstractC1799h.g(f6);
            boolean z6 = ((i7 & 112) == 32) | ((458752 & i7) == 131072);
            Object P5 = c0626q.P();
            if (z6 || P5 == C0616l.a) {
                P5 = new O0(z5, interfaceC1193a, 1);
                c0626q.m0(P5);
            }
            InterfaceC1041r c6 = AbstractC1464z.k(interfaceC1041r, z5, str, (InterfaceC1193a) P5, 12).c(t0.a);
            float f7 = AbstractC1493e.a;
            float f8 = AbstractC1493e.f13925b;
            float f9 = AbstractC1493e.f13926c;
            InterfaceC1041r A5 = AbstractC1787b.A(f6, l.f7374V, 2, t0.l(c6, f7, f9, f8, f9));
            p0 a6 = o0.a(g3, c1032i, c0626q, 54);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q, A5);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            C0146e c0146e = C0150g.f1928f;
            r.G(c0626q, a6, c0146e);
            C0146e c0146e2 = C0150g.f1927e;
            r.G(c0626q, l3, c0146e2);
            Integer valueOf = Integer.valueOf(hashCode);
            C0146e c0146e3 = C0150g.f1929g;
            r.x(c0626q, valueOf, c0146e3);
            C0144d c0144d = C0150g.f1930h;
            r.C(c0626q, c0144d);
            C0146e c0146e4 = C0150g.f1926d;
            r.G(c0626q, c7, c0146e4);
            if (fVar == null) {
                c0626q.b0(-1597947094);
                c0626q.p(false);
                i8 = i7;
            } else {
                c0626q.b0(-1597947093);
                float f10 = AbstractC1493e.f13933j;
                InterfaceC1041r i9 = t0.i(C1038o.a, f10, l.f7374V, f10, f10, 2);
                i8 = i7;
                V d6 = AbstractC1806l.d(C1026c.f11786c, false);
                int hashCode2 = Long.hashCode(c0626q.f8164T);
                InterfaceC0617l0 l5 = c0626q.l();
                InterfaceC1041r c8 = AbstractC1024a.c(c0626q, i9);
                c0626q.f0();
                if (c0626q.f8163S) {
                    c0626q.k(c0148f);
                } else {
                    c0626q.p0();
                }
                r.G(c0626q, d6, c0146e);
                r.G(c0626q, l5, c0146e2);
                AbstractC1135a.n(hashCode2, c0626q, c0146e3, c0626q, c0144d);
                r.G(c0626q, c8, c0146e4);
                fVar.d(new s(z5 ? c1491c.f13922c : c1491c.f13924e), c0626q, 0);
                c0626q.p(true);
                c0626q.p(false);
            }
            P p5 = new P(z5 ? c1491c.f13921b : c1491c.f13923d, AbstractC1493e.f13936m, AbstractC1493e.f13937n, null, AbstractC1493e.f13939p, AbstractC1493e.f13930g, AbstractC1493e.f13938o, 16613240);
            if (1.0f <= 0.0d) {
                AbstractC1829a.a("invalid weight; must be greater than zero");
            }
            AbstractC0090r0.b(str, new Z(1.0f, true), p5, 0, false, 1, 0, c0626q, (i8 & 14) | 1572864, 952);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new L(str, z5, c1491c, interfaceC1041r, fVar, interfaceC1193a, i6);
        }
    }
}
