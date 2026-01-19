package P2;

import D.C0066f;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import S2.AbstractC0565e;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import T.d1;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n.AbstractC1318d;
import n.AbstractC1324g;
import n.AbstractC1350y;
import n.C1297F;
import n.C1300I;
import n.EnumC1310T;
import p.AbstractC1464z;
import u0.C1746g;
import v.AbstractC1799h;
import v.AbstractC1806l;
import v.AbstractC1812s;
import v.C1813t;
import y2.AbstractC1992b;

/* loaded from: classes.dex */
public abstract class L0 {
    public static final float a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f4762b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f4763c;

    static {
        float f6 = 32;
        a = f6;
        float f7 = 18;
        f4762b = f7;
        f4763c = (f6 - f7) / 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(L2.c r48, boolean r49, h0.InterfaceC1041r r50, T.C0626q r51, int r52) {
        /*
            Method dump skipped, instructions count: 1813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.L0.a(L2.c, boolean, h0.r, T.q, int):void");
    }

    public static final void b(final C1746g c1746g, final String str, final boolean z5, final long j3, final InterfaceC1193a interfaceC1193a, C0626q c0626q, final int i6) {
        C1746g c1746g2;
        int i7;
        c0626q.d0(-1149356653);
        if ((i6 & 6) == 0) {
            c1746g2 = c1746g;
            i7 = (c0626q.f(c1746g2) ? 4 : 2) | i6;
        } else {
            c1746g2 = c1746g;
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.f(str) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.g(z5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q.e(j3) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0626q.h(interfaceC1193a) ? 16384 : 8192;
        }
        if (c0626q.S(i7 & 1, (i7 & 9363) != 9362)) {
            float f6 = a;
            C1038o c1038o = C1038o.a;
            InterfaceC1041r a6 = AbstractC1992b.a(29, l0.h.c(v.t0.j(c1038o, f6), C.e.a), interfaceC1193a, z5);
            F0.V d6 = AbstractC1806l.d(C1026c.f11790h, false);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, a6);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d6, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q, C0150g.f1930h);
            T.r.G(c0626q, c6, C0150g.f1926d);
            Q.A0.b(c1746g2, str, v.t0.j(c1038o, f4762b), j3, c0626q, (i7 & 14) | 384 | (i7 & 112) | (i7 & 7168), 0);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e() { // from class: P2.K0
                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    L0.b(C1746g.this, str, z5, j3, interfaceC1193a, (C0626q) obj, T.r.J(i6 | 1));
                    return X3.y.a;
                }
            };
        }
    }

    public static final void c(L2.c cVar, C0626q c0626q, int i6) {
        AbstractC1276k.f(cVar, "message");
        c0626q.d0(441584948);
        int i7 = (c0626q.h(cVar) ? 4 : 2) | i6;
        if (c0626q.S(i7 & 1, (i7 & 3) != 2)) {
            boolean z5 = cVar.f3058b == L2.d.f3069c;
            c0626q.Z(-838622427, cVar.a);
            if (z5) {
                c0626q.b0(-227457359);
                V.o(cVar, c0626q, i7 & 14);
                c0626q.p(false);
            } else {
                c0626q.b0(-227390740);
                V.a(cVar, c0626q, i7 & 14);
                c0626q.p(false);
            }
            c0626q.p(false);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0342a(cVar, i6, 1);
        }
    }

    public static final void d(L2.c cVar, S0.P p5, C0626q c0626q, int i6) {
        boolean z5;
        C0626q c0626q2 = c0626q;
        AbstractC1276k.f(cVar, "message");
        L2.e eVar = cVar.f3064h;
        c0626q2.d0(-1250585389);
        int i7 = (c0626q2.h(cVar) ? 4 : 2) | i6 | (c0626q2.f(p5) ? 32 : 16);
        if (c0626q2.S(i7 & 1, (i7 & 19) != 18)) {
            if (cVar.f3059c.length() > 0) {
                c0626q2.b0(-1642777628);
                L2.e eVar2 = L2.e.f3076g;
                d1 b5 = AbstractC1324g.b(eVar == eVar2 ? 1.0f : S.l.f7374V, AbstractC1318d.s(180, 6, null), "message_actions_alpha", c0626q2, 3120, 20);
                c0626q2 = c0626q2;
                C1813t a6 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q2, 0);
                int hashCode = Long.hashCode(c0626q2.f8164T);
                InterfaceC0617l0 l3 = c0626q2.l();
                C1038o c1038o = C1038o.a;
                InterfaceC1041r c6 = AbstractC1024a.c(c0626q2, c1038o);
                InterfaceC0152h.a.getClass();
                C0148f c0148f = C0150g.f1924b;
                c0626q2.f0();
                if (c0626q2.f8163S) {
                    c0626q2.k(c0148f);
                } else {
                    c0626q2.p0();
                }
                T.r.G(c0626q2, a6, C0150g.f1928f);
                T.r.G(c0626q2, l3, C0150g.f1927e);
                T.r.x(c0626q2, Integer.valueOf(hashCode), C0150g.f1929g);
                T.r.C(c0626q2, C0150g.f1930h);
                T.r.G(c0626q2, c6, C0150g.f1926d);
                AbstractC0565e.c(cVar.f3059c, null, true, p5, eVar == L2.e.f3075f, c0626q2, ((i7 << 6) & 7168) | 384, 18);
                boolean z6 = eVar == eVar2;
                boolean f6 = c0626q2.f(b5);
                Object P5 = c0626q2.P();
                if (f6 || P5 == C0616l.a) {
                    P5 = new I0(b5, 0);
                    c0626q2.m0(P5);
                }
                a(cVar, z6, o0.y.o(c1038o, (l4.c) P5), c0626q2, i7 & 14);
                c0626q2.p(true);
                z5 = false;
            } else {
                z5 = false;
                c0626q2.b0(-1645513905);
            }
            c0626q2.p(z5);
        } else {
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new I.m(i6, 7, cVar, p5);
        }
    }

    public static final void e(int i6, C0626q c0626q) {
        c0626q.d0(1457755809);
        if (c0626q.S(i6 & 1, i6 != 0)) {
            C1300I p5 = AbstractC1318d.p("typing", c0626q, 0);
            long j3 = ((Q.N) c0626q.j(Q.O.a)).f5427q;
            C1297F g3 = AbstractC1318d.g(p5, 1.0f, 1.4f, AbstractC1318d.o(AbstractC1318d.s(1000, 2, AbstractC1350y.f13277c), EnumC1310T.f13042e, 4), "pulse", c0626q, 29112, 0);
            InterfaceC1041r j4 = v.t0.j(C1038o.a, 12);
            F0.V d6 = AbstractC1806l.d(C1026c.f11790h, false);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, j4);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d6, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q, C0150g.f1930h);
            T.r.G(c0626q, c6, C0150g.f1926d);
            InterfaceC1041r q3 = o0.y.q(v.t0.f15349c, ((Number) g3.f12991f.getValue()).floatValue(), ((Number) g3.f12991f.getValue()).floatValue(), S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V, null, 524284);
            boolean e6 = c0626q.e(j3);
            Object P5 = c0626q.P();
            if (e6 || P5 == C0616l.a) {
                P5 = new C0066f(j3, 2);
                c0626q.m0(P5);
            }
            AbstractC1464z.a(q3, (l4.c) P5, c0626q, 0);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new B4.z(i6, 9);
        }
    }
}
