package Q;

import F0.AbstractC0137z;
import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import T.C0616l;
import T.C0625p0;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import b0.AbstractC0874g;
import b0.C0873f;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1033j;
import h0.C1038o;
import h0.InterfaceC1041r;
import m4.AbstractC1276k;
import v.AbstractC1787b;
import v.AbstractC1806l;

/* loaded from: classes.dex */
public abstract class S2 {

    /* renamed from: d, reason: collision with root package name */
    public static final float f5514d;

    /* renamed from: f, reason: collision with root package name */
    public static final float f5516f;
    public static final float a = 600;

    /* renamed from: b, reason: collision with root package name */
    public static final float f5512b = 30;

    /* renamed from: c, reason: collision with root package name */
    public static final float f5513c = 16;

    /* renamed from: e, reason: collision with root package name */
    public static final float f5515e = 6;

    static {
        float f6 = 8;
        f5514d = f6;
        f5516f = f6;
    }

    public static final void a(final C0873f c0873f, final l4.e eVar, l4.e eVar2, S0.P p5, long j3, long j4, C0626q c0626q, final int i6) {
        S0.P p6;
        long j5;
        l4.e eVar3;
        C0146e c0146e;
        boolean z5;
        boolean z6;
        final long j6 = j4;
        c0626q.d0(-931325388);
        int i7 = i6 | (c0626q.h(c0873f) ? 4 : 2) | (c0626q.h(eVar) ? 32 : 16) | (c0626q.h(eVar2) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.f(p5) ? 2048 : PegdownExtensions.ANCHORLINKS) | (c0626q.e(j3) ? 16384 : 8192) | (c0626q.e(j6) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS);
        if (c0626q.S(i7 & 1, (74899 & i7) != 74898)) {
            float f6 = eVar2 == null ? f5514d : 0;
            C1038o c1038o = C1038o.a;
            InterfaceC1041r C5 = AbstractC1787b.C(c1038o, f5513c, S.l.f7374V, f6, S.l.f7374V, 10);
            Object P5 = c0626q.P();
            if (P5 == C0616l.a) {
                P5 = new C0414g(1);
                c0626q.m0(P5);
            }
            F0.V v5 = (F0.V) P5;
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, C5);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            C0146e c0146e2 = C0150g.f1928f;
            T.r.G(c0626q, v5, c0146e2);
            C0146e c0146e3 = C0150g.f1927e;
            T.r.G(c0626q, l3, c0146e3);
            C0146e c0146e4 = C0150g.f1929g;
            if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode))) {
                B3.e.v(hashCode, c0626q, hashCode, c0146e4);
            }
            C0146e c0146e5 = C0150g.f1926d;
            T.r.G(c0626q, c6, c0146e5);
            InterfaceC1041r A5 = AbstractC1787b.A(S.l.f7374V, f5515e, 1, AbstractC0137z.l(c1038o, "text"));
            C1033j c1033j = C1026c.f11786c;
            F0.V d6 = AbstractC1806l.d(c1033j, false);
            int hashCode2 = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l5 = c0626q.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q, A5);
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d6, c0146e2);
            T.r.G(c0626q, l5, c0146e3);
            if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode2))) {
                B3.e.v(hashCode2, c0626q, hashCode2, c0146e4);
            }
            T.r.G(c0626q, c7, c0146e5);
            c0873f.m(c0626q, Integer.valueOf(i7 & 14));
            c0626q.p(true);
            if (eVar != null) {
                c0626q.b0(-1014168049);
                InterfaceC1041r l6 = AbstractC0137z.l(c1038o, "action");
                F0.V d7 = AbstractC1806l.d(c1033j, false);
                c0146e = c0146e4;
                int hashCode3 = Long.hashCode(c0626q.f8164T);
                InterfaceC0617l0 l7 = c0626q.l();
                InterfaceC1041r c8 = AbstractC1024a.c(c0626q, l6);
                c0626q.f0();
                if (c0626q.f8163S) {
                    c0626q.k(c0148f);
                } else {
                    c0626q.p0();
                }
                T.r.G(c0626q, d7, c0146e2);
                T.r.G(c0626q, l7, c0146e3);
                if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode3))) {
                    B3.e.v(hashCode3, c0626q, hashCode3, c0146e);
                }
                T.r.G(c0626q, c8, c0146e5);
                j5 = j3;
                p6 = p5;
                T.r.b(new C0625p0[]{U.a.a(new o0.s(j5)), f3.a.a(p6)}, eVar, c0626q, (i7 & 112) | 8);
                c0626q.p(true);
                z5 = false;
                c0626q.p(false);
            } else {
                p6 = p5;
                c0146e = c0146e4;
                z5 = false;
                j5 = j3;
                c0626q.b0(-1013852841);
                c0626q.p(false);
            }
            if (eVar2 != null) {
                c0626q.b0(-1013804481);
                InterfaceC1041r l8 = AbstractC0137z.l(c1038o, "dismissAction");
                F0.V d8 = AbstractC1806l.d(c1033j, z5);
                int hashCode4 = Long.hashCode(c0626q.f8164T);
                InterfaceC0617l0 l9 = c0626q.l();
                InterfaceC1041r c9 = AbstractC1024a.c(c0626q, l8);
                c0626q.f0();
                if (c0626q.f8163S) {
                    c0626q.k(c0148f);
                } else {
                    c0626q.p0();
                }
                T.r.G(c0626q, d8, c0146e2);
                T.r.G(c0626q, l9, c0146e3);
                if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode4))) {
                    B3.e.v(hashCode4, c0626q, hashCode4, c0146e);
                }
                T.r.G(c0626q, c9, c0146e5);
                j6 = j4;
                eVar3 = eVar2;
                T.r.a(U.a.a(new o0.s(j6)), eVar3, c0626q, 8 | ((i7 >> 3) & 112));
                z6 = true;
                c0626q.p(true);
                c0626q.p(false);
            } else {
                j6 = j4;
                boolean z7 = z5;
                z6 = true;
                eVar3 = eVar2;
                c0626q.b0(-1013535401);
                c0626q.p(z7);
            }
            c0626q.p(z6);
        } else {
            p6 = p5;
            j5 = j3;
            eVar3 = eVar2;
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            final l4.e eVar4 = eVar3;
            final S0.P p7 = p6;
            final long j7 = j5;
            t5.f8193d = new l4.e(eVar, eVar4, p7, j7, j6, i6) { // from class: Q.M2

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ l4.e f5373e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ l4.e f5374f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ S0.P f5375g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ long f5376h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ long f5377i;

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = T.r.J(1);
                    S2.a(C0873f.this, this.f5373e, this.f5374f, this.f5375g, this.f5376h, this.f5377i, (C0626q) obj, J4);
                    return X3.y.a;
                }
            };
        }
    }

    public static final void b(final InterfaceC1041r interfaceC1041r, final l4.e eVar, final l4.e eVar2, final o0.L l3, final long j3, final long j4, final long j5, final long j6, final C0873f c0873f, C0626q c0626q, final int i6) {
        int i7;
        l4.e eVar3;
        l4.e eVar4;
        o0.L l5;
        c0626q.d0(-1218779924);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            eVar3 = eVar;
            i7 |= c0626q.h(eVar3) ? 32 : 16;
        } else {
            eVar3 = eVar;
        }
        if ((i6 & 384) == 0) {
            eVar4 = eVar2;
            i7 |= c0626q.h(eVar4) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        } else {
            eVar4 = eVar2;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q.g(false) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            l5 = l3;
            i7 |= c0626q.f(l5) ? 16384 : 8192;
        } else {
            l5 = l3;
        }
        if ((196608 & i6) == 0) {
            i7 |= c0626q.e(j3) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if ((1572864 & i6) == 0) {
            i7 |= c0626q.e(j4) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT;
        }
        if ((12582912 & i6) == 0) {
            i7 |= c0626q.e(j5) ? PegdownExtensions.EXTANCHORLINKS_WRAP : PegdownExtensions.EXTANCHORLINKS;
        }
        if ((100663296 & i6) == 0) {
            i7 |= c0626q.e(j6) ? PegdownExtensions.MULTI_LINE_IMAGE_URLS : PegdownExtensions.TOC;
        }
        if ((805306368 & i6) == 0) {
            i7 |= c0626q.h(c0873f) ? PegdownExtensions.NOT_USED : PegdownExtensions.FORCELISTITEMPARA;
        }
        if (c0626q.S(i7 & 1, (306783379 & i7) != 306783378)) {
            c0626q.X();
            if ((i6 & 1) != 0 && !c0626q.B()) {
                c0626q.V();
            }
            c0626q.q();
            float f6 = S.y.f7499d;
            C0873f c6 = AbstractC0874g.c(-1343524879, new R2(eVar3, c0873f, eVar4, j5, j6), c0626q);
            int i8 = (i7 & 14) | 12779520;
            int i9 = i7 >> 9;
            X2.a(interfaceC1041r, l5, j3, j4, S.l.f7374V, f6, c6, c0626q, (i9 & 7168) | i8 | (i9 & 112) | (i9 & 896), 80);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e() { // from class: Q.O2
                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = T.r.J(i6 | 1);
                    S2.b(InterfaceC1041r.this, eVar, eVar2, l3, j3, j4, j5, j6, c0873f, (C0626q) obj, J4);
                    return X3.y.a;
                }
            };
        }
    }

    public static final void c(final I2 i22, InterfaceC1041r interfaceC1041r, o0.L l3, long j3, long j4, long j5, long j6, long j7, C0626q c0626q, final int i6, final int i7) {
        int i8;
        final long j8;
        final long j9;
        final InterfaceC1041r interfaceC1041r2;
        final o0.L l5;
        final long j10;
        final long j11;
        final long j12;
        o0.L l6;
        InterfaceC1041r interfaceC1041r3;
        int i9;
        long j13;
        long j14;
        long j15;
        c0626q.d0(274621471);
        if ((i6 & 6) == 0) {
            i8 = (c0626q.f(i22) ? 4 : 2) | i6;
        } else {
            i8 = i6;
        }
        int i10 = i8 | 432;
        if ((i6 & 3072) == 0) {
            i10 = i8 | 1456;
        }
        if ((i6 & 24576) == 0) {
            j8 = j3;
            i10 |= ((i7 & 16) == 0 && c0626q.e(j8)) ? 16384 : 8192;
        } else {
            j8 = j3;
        }
        if ((196608 & i6) == 0) {
            j9 = j4;
            i10 |= ((i7 & 32) == 0 && c0626q.e(j9)) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        } else {
            j9 = j4;
        }
        if ((1572864 & i6) == 0) {
            i10 |= PegdownExtensions.SUBSCRIPT;
        }
        if ((12582912 & i6) == 0) {
            i10 |= PegdownExtensions.EXTANCHORLINKS;
        }
        if ((100663296 & i6) == 0) {
            i10 |= PegdownExtensions.TOC;
        }
        if (c0626q.S(i10 & 1, (38347923 & i10) != 38347922)) {
            c0626q.X();
            if ((i6 & 1) == 0 || c0626q.B()) {
                o0.L a6 = W1.a(S.y.f7500e, c0626q);
                int i11 = i10 & (-7169);
                if ((i7 & 16) != 0) {
                    j8 = O.d(S.y.f7498c, c0626q);
                    i11 = i10 & (-64513);
                }
                if ((i7 & 32) != 0) {
                    j9 = O.d(S.y.f7502g, c0626q);
                    i11 &= -458753;
                }
                S.f fVar = S.y.a;
                long d6 = O.d(fVar, c0626q);
                long d7 = O.d(fVar, c0626q);
                long d8 = O.d(S.y.f7501f, c0626q);
                l6 = a6;
                interfaceC1041r3 = C1038o.a;
                i9 = i11 & (-267911169);
                j13 = j9;
                j14 = j8;
                j15 = d6;
                j11 = d7;
                j12 = d8;
            } else {
                c0626q.V();
                int i12 = i10 & (-7169);
                if ((i7 & 16) != 0) {
                    i12 = i10 & (-64513);
                }
                if ((i7 & 32) != 0) {
                    i12 &= -458753;
                }
                long j16 = j9;
                j14 = j8;
                j13 = j16;
                l6 = l3;
                j15 = j5;
                j11 = j6;
                j12 = j7;
                i9 = i12 & (-267911169);
                interfaceC1041r3 = interfaceC1041r;
            }
            c0626q.q();
            i22.a.getClass();
            c0626q.b0(-663517017);
            c0626q.p(false);
            i22.a.getClass();
            c0626q.b0(-662974393);
            c0626q.p(false);
            int i13 = i9 << 3;
            long j17 = j13;
            b(AbstractC1787b.y(interfaceC1041r3, 12), null, null, l6, j14, j17, j11, j12, AbstractC0874g.c(-1266389126, new V(i22, 3), c0626q), c0626q, (i13 & 7168) | 805306368 | (i13 & 458752) | (i13 & 3670016));
            interfaceC1041r2 = interfaceC1041r3;
            l5 = l6;
            j8 = j14;
            j9 = j17;
            j10 = j15;
        } else {
            c0626q.V();
            interfaceC1041r2 = interfaceC1041r;
            l5 = l3;
            j10 = j5;
            j11 = j6;
            j12 = j7;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e() { // from class: Q.N2
                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = T.r.J(i6 | 1);
                    S2.c(I2.this, interfaceC1041r2, l5, j8, j9, j10, j11, j12, (C0626q) obj, J4, i7);
                    return X3.y.a;
                }
            };
        }
    }
}
