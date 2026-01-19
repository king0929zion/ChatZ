package Q;

import B0.C0040p;
import D.C0057a0;
import D.C0102x0;
import F0.AbstractC0107a;
import F0.AbstractC0137z;
import F0.C0125m;
import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import I0.AbstractC0204q0;
import R.AbstractC0497b;
import T.C0599c0;
import T.C0602e;
import T.C0616l;
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
import i4.AbstractC1117a;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import p.AbstractC1464z;
import r.AbstractC1601r0;
import t.C1682j;
import v.AbstractC1806l;
import z0.AbstractC2015c;

/* renamed from: Q.z2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0492z2 {
    public static final float a = S.w.f7492n;

    /* renamed from: b, reason: collision with root package name */
    public static final float f6308b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f6309c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f6310d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f6311e;

    /* renamed from: f, reason: collision with root package name */
    public static final F0.z0 f6312f;

    /* JADX WARN: Type inference failed for: r0v5, types: [F0.z0, F0.a] */
    static {
        float f6 = S.w.f7490l;
        f6308b = f6;
        float f7 = S.w.f7488j;
        f6309c = Y4.l.h(f6, f7);
        Y4.l.h(f7, f6);
        f6310d = S.w.a;
        f6311e = 2;
        f6312f = new AbstractC0107a(C0464s2.f6102l);
    }

    public static final void a(final float f6, final l4.c cVar, final InterfaceC1041r interfaceC1041r, final boolean z5, final InterfaceC1193a interfaceC1193a, C0413f2 c0413f2, final C1682j c1682j, final int i6, final C0873f c0873f, final C0873f c0873f2, final r4.d dVar, C0626q c0626q, final int i7, final int i8) {
        int i9;
        C0413f2 c0413f22;
        C1682j c1682j2;
        C0873f c0873f3;
        int i10;
        c0626q.d0(985901935);
        if ((i7 & 6) == 0) {
            i9 = (c0626q.c(f6) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            i9 |= c0626q.h(cVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i9 |= c0626q.f(interfaceC1041r) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i7 & 3072) == 0) {
            i9 |= c0626q.g(z5) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i7 & 24576) == 0) {
            i9 |= c0626q.h(interfaceC1193a) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            c0413f22 = c0413f2;
            i9 |= c0626q.f(c0413f22) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        } else {
            c0413f22 = c0413f2;
        }
        if ((1572864 & i7) == 0) {
            c1682j2 = c1682j;
            i9 |= c0626q.f(c1682j2) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT;
        } else {
            c1682j2 = c1682j;
        }
        if ((12582912 & i7) == 0) {
            i9 |= c0626q.d(i6) ? PegdownExtensions.EXTANCHORLINKS_WRAP : PegdownExtensions.EXTANCHORLINKS;
        }
        if ((100663296 & i7) == 0) {
            c0873f3 = c0873f;
            i9 |= c0626q.h(c0873f3) ? PegdownExtensions.MULTI_LINE_IMAGE_URLS : PegdownExtensions.TOC;
        } else {
            c0873f3 = c0873f;
        }
        if ((i7 & 805306368) == 0) {
            i9 |= c0626q.h(c0873f2) ? PegdownExtensions.NOT_USED : PegdownExtensions.FORCELISTITEMPARA;
        }
        if ((i8 & 6) == 0) {
            i10 = i8 | (c0626q.f(dVar) ? 4 : 2);
        } else {
            i10 = i8;
        }
        if (c0626q.S(i9 & 1, ((i9 & 306783379) == 306783378 && (i10 & 3) == 2) ? false : true)) {
            c0626q.X();
            if ((i7 & 1) != 0 && !c0626q.B()) {
                c0626q.V();
            }
            c0626q.q();
            boolean z6 = ((29360128 & i9) == 8388608) | ((((i10 & 14) ^ 6) > 4 && c0626q.f(dVar)) || (i10 & 6) == 4);
            Object P5 = c0626q.P();
            if (z6 || P5 == C0616l.a) {
                P5 = new C2(f6, i6, interfaceC1193a, dVar);
                c0626q.m0(P5);
            }
            C2 c22 = (C2) P5;
            c22.f5180e = interfaceC1193a;
            c22.f5183h = cVar;
            c22.c(f6);
            int i11 = ((i9 >> 3) & 1008) | ((i9 >> 6) & 57344);
            int i12 = i9 >> 9;
            c(c22, interfaceC1041r, z5, null, c1682j2, c0873f3, c0873f2, c0626q, i11 | (458752 & i12) | (i12 & 3670016));
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            final C0413f2 c0413f23 = c0413f22;
            t5.f8193d = new l4.e() { // from class: Q.r2
                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC0492z2.a(f6, cVar, interfaceC1041r, z5, interfaceC1193a, c0413f23, c1682j, i6, c0873f, c0873f2, dVar, (C0626q) obj, T.r.J(i7 | 1), T.r.J(i8));
                    return X3.y.a;
                }
            };
        }
    }

    public static final void b(float f6, l4.c cVar, InterfaceC1041r interfaceC1041r, boolean z5, r4.d dVar, int i6, InterfaceC1193a interfaceC1193a, C0413f2 c0413f2, C1682j c1682j, C0626q c0626q, int i7) {
        InterfaceC1041r interfaceC1041r2;
        C0413f2 c0413f22;
        C1682j c1682j2;
        int i8;
        C0413f2 c0413f23;
        C1682j c1682j3;
        InterfaceC1041r interfaceC1041r3;
        c0626q.d0(-202044027);
        int i9 = i7 | (c0626q.c(f6) ? 4 : 2) | 384 | (c0626q.g(z5) ? 2048 : PegdownExtensions.ANCHORLINKS) | (c0626q.f(dVar) ? 16384 : 8192) | (c0626q.h(interfaceC1193a) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT) | 104857600;
        if (c0626q.S(i9 & 1, (38347923 & i9) != 38347922)) {
            c0626q.X();
            if ((i7 & 1) == 0 || c0626q.B()) {
                C0445n2 c0445n2 = C0445n2.a;
                C0413f2 d6 = C0445n2.d(c0626q);
                i8 = i9 & (-29360129);
                Object P5 = c0626q.P();
                if (P5 == C0616l.a) {
                    P5 = new C1682j();
                    c0626q.m0(P5);
                }
                c0413f23 = d6;
                c1682j3 = (C1682j) P5;
                interfaceC1041r3 = C1038o.a;
            } else {
                c0626q.V();
                i8 = i9 & (-29360129);
                interfaceC1041r3 = interfaceC1041r;
                c0413f23 = c0413f2;
                c1682j3 = c1682j;
            }
            c0626q.q();
            a(f6, cVar, interfaceC1041r3, z5, interfaceC1193a, c0413f23, c1682j3, i6, AbstractC0874g.c(308249025, new C0468t2(c1682j3, c0413f23, z5), c0626q), AbstractC0874g.c(-1843234110, new C0472u2(c0413f23, z5), c0626q), dVar, c0626q, (i8 & 14) | 905970096 | (i8 & 7168) | (57344 & (i8 >> 6)) | 14155776, (i8 >> 12) & 14);
            interfaceC1041r2 = interfaceC1041r3;
            c0413f22 = c0413f23;
            c1682j2 = c1682j3;
        } else {
            c0626q.V();
            interfaceC1041r2 = interfaceC1041r;
            c0413f22 = c0413f2;
            c1682j2 = c1682j;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0457q2(f6, cVar, interfaceC1041r2, z5, dVar, i6, interfaceC1193a, c0413f22, c1682j2, i7);
        }
    }

    public static final void c(C2 c22, InterfaceC1041r interfaceC1041r, boolean z5, C0413f2 c0413f2, C1682j c1682j, C0873f c0873f, C0873f c0873f2, C0626q c0626q, int i6) {
        int i7;
        C0413f2 c0413f22;
        int i8;
        C0413f2 d6;
        c0626q.d0(409861960);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.h(c22) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.f(interfaceC1041r) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.g(z5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0626q.f(c1682j) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i7 |= c0626q.h(c0873f) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if ((1572864 & i6) == 0) {
            i7 |= c0626q.h(c0873f2) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT;
        }
        if (c0626q.S(i7 & 1, (599187 & i7) != 599186)) {
            c0626q.X();
            if ((i6 & 1) == 0 || c0626q.B()) {
                C0445n2 c0445n2 = C0445n2.a;
                i8 = i7 & (-7169);
                d6 = C0445n2.d(c0626q);
            } else {
                c0626q.V();
                i8 = i7 & (-7169);
                d6 = c0413f2;
            }
            c0626q.q();
            if (c22.f5179c < 0) {
                throw new IllegalArgumentException("steps should be >= 0");
            }
            int i9 = i8 >> 3;
            d(interfaceC1041r, c22, z5, c1682j, c0873f, c0873f2, c0626q, (i8 & 896) | (i9 & 14) | ((i8 << 3) & 112) | (i9 & 7168) | (57344 & i9) | (i9 & 458752));
            c0413f22 = d6;
        } else {
            c0626q.V();
            c0413f22 = c0413f2;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new J(c22, interfaceC1041r, z5, c0413f22, c1682j, c0873f, c0873f2, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(InterfaceC1041r interfaceC1041r, C2 c22, boolean z5, C1682j c1682j, C0873f c0873f, C0873f c0873f2, C0626q c0626q, int i6) {
        int i7;
        C0873f c0873f3;
        C2 c23;
        InterfaceC1041r interfaceC1041r2;
        r.X0 x02;
        boolean z6;
        boolean z7;
        C0873f c0873f4 = c0873f2;
        C0599c0 c0599c0 = c22.f5182g;
        r4.d dVar = c22.f5181f;
        c0626q.d0(898172835);
        int i8 = 4;
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(c22) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.g(z5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q.f(c1682j) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0626q.h(c0873f) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i7 |= c0626q.h(c0873f4) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        int i9 = i7;
        if (c0626q.S(i9 & 1, (i9 & 74899) != 74898)) {
            boolean z8 = c0626q.j(AbstractC0204q0.f2364n) == e1.m.f11577e;
            c22.f5188m = z8;
            r.X0 x03 = c22.f5191p;
            boolean z9 = x03 == r.X0.f14184e && z8;
            C1038o c1038o = C1038o.a;
            if (z5) {
                C0057a0 c0057a0 = new C0057a0(c22, i8);
                C0040p c0040p = B0.Q.a;
                interfaceC1041r2 = new B0.P(c22, c1682j, c0057a0, 4);
            } else {
                interfaceC1041r2 = c1038o;
            }
            r.X0 x04 = c22.f5191p;
            boolean booleanValue = ((Boolean) c22.f5192q.getValue()).booleanValue();
            boolean h3 = c0626q.h(c22);
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (h3 || P5 == c0602e) {
                x02 = x04;
                z6 = false;
                P5 = new C0480w2(c22, null, 0);
                c0626q.m0(P5);
            } else {
                x02 = x04;
                z6 = false;
            }
            boolean z10 = z6;
            InterfaceC1041r interfaceC1041r3 = interfaceC1041r2;
            boolean z11 = z9;
            InterfaceC1041r a6 = AbstractC1601r0.a(c1038o, c22, x02, z5, c1682j, booleanValue, (l4.f) P5, z11, 32);
            EnumC0417g2 enumC0417g2 = EnumC0417g2.f5819c;
            r.X0 x05 = r.X0.f14183c;
            InterfaceC1041r p5 = x03 == x05 ? v.t0.p(AbstractC0137z.l(c1038o, enumC0417g2)) : v.t0.r(AbstractC0137z.l(c1038o, enumC0417g2));
            C0125m c0125m = D0.a;
            InterfaceC1041r c6 = interfaceC1041r.c(L0.a);
            float f6 = f6308b;
            float f7 = a;
            float f8 = f7;
            if (x03 != x05) {
                f7 = f6;
            }
            if (x03 == x05) {
                f8 = f6;
            }
            InterfaceC1041r c7 = P0.n.a(v.t0.i(c6, f7, f8, S.l.f7374V, S.l.f7374V, 12), z10, new C0453p2(z5, c22, z10 ? 1 : 0)).c(x03 == x05 ? AbstractC0497b.f6739d : AbstractC0497b.f6738c);
            final float g3 = c0599c0.g();
            final r4.d dVar2 = new r4.d(dVar.a, dVar.f14678b);
            final int i10 = c22.f5179c;
            InterfaceC1041r n3 = AbstractC1464z.n(P0.n.a(c7, true, new l4.c() { // from class: p.L0
                @Override // l4.c
                public final Object f(Object obj) {
                    Float valueOf = Float.valueOf(g3);
                    r4.d dVar3 = dVar2;
                    P0.h hVar = new P0.h(((Number) AbstractC1117a.i(valueOf, dVar3)).floatValue(), dVar3, i10);
                    s4.e[] eVarArr = P0.v.a;
                    P0.w wVar = P0.t.f4524c;
                    s4.e eVar = P0.v.a[1];
                    ((P0.x) obj).a(wVar, hVar);
                    return X3.y.a;
                }
            }), z5, c1682j);
            InterfaceC1041r interfaceC1041r4 = p5;
            int i11 = c22.f5179c;
            float g6 = c0599c0.g();
            l4.c cVar = c22.f5183h;
            InterfaceC1193a interfaceC1193a = c22.f5180e;
            if (i11 < 0) {
                throw new IllegalArgumentException("steps should be >= 0");
            }
            c23 = c22;
            InterfaceC1041r c8 = AbstractC2015c.d(n3, new C0484x2(z5, cVar, dVar, i11, z11, g6, interfaceC1193a)).c(interfaceC1041r3).c(a6);
            boolean h6 = c0626q.h(c23);
            Object P6 = c0626q.P();
            if (h6 || P6 == c0602e) {
                P6 = new C0102x0(c23, 1);
                c0626q.m0(P6);
            }
            F0.V v5 = (F0.V) P6;
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c9 = AbstractC1024a.c(c0626q, c8);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            C0146e c0146e = C0150g.f1928f;
            T.r.G(c0626q, v5, c0146e);
            C0146e c0146e2 = C0150g.f1927e;
            T.r.G(c0626q, l3, c0146e2);
            C0146e c0146e3 = C0150g.f1929g;
            if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode))) {
                B3.e.v(hashCode, c0626q, hashCode, c0146e3);
            }
            C0146e c0146e4 = C0150g.f1926d;
            T.r.G(c0626q, c9, c0146e4);
            boolean h7 = c0626q.h(c23);
            Object P7 = c0626q.P();
            if (h7 || P7 == c0602e) {
                z7 = false;
                P7 = new C0449o2(c23, 0 == true ? 1 : 0);
                c0626q.m0(P7);
            } else {
                z7 = false;
            }
            InterfaceC1041r n5 = AbstractC0137z.n(interfaceC1041r4, (l4.c) P7);
            C1033j c1033j = C1026c.f11786c;
            F0.V d6 = AbstractC1806l.d(c1033j, z7);
            int hashCode2 = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l5 = c0626q.l();
            InterfaceC1041r c10 = AbstractC1024a.c(c0626q, n5);
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d6, c0146e);
            T.r.G(c0626q, l5, c0146e2);
            if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode2))) {
                B3.e.v(hashCode2, c0626q, hashCode2, c0146e3);
            }
            T.r.G(c0626q, c10, c0146e4);
            int i12 = (i9 >> 3) & 14;
            c0873f3 = c0873f;
            c0873f3.d(c23, c0626q, Integer.valueOf(((i9 >> 9) & 112) | i12));
            c0626q.p(true);
            InterfaceC1041r l6 = AbstractC0137z.l(c1038o, EnumC0417g2.f5820e);
            F0.V d7 = AbstractC1806l.d(c1033j, false);
            int hashCode3 = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l7 = c0626q.l();
            InterfaceC1041r c11 = AbstractC1024a.c(c0626q, l6);
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d7, c0146e);
            T.r.G(c0626q, l7, c0146e2);
            if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode3))) {
                B3.e.v(hashCode3, c0626q, hashCode3, c0146e3);
            }
            T.r.G(c0626q, c11, c0146e4);
            c0873f4 = c0873f2;
            c0873f4.d(c23, c0626q, Integer.valueOf(i12 | ((i9 >> 12) & 112)));
            c0626q.p(true);
            c0626q.p(true);
        } else {
            c0873f3 = c0873f;
            c23 = c22;
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new L(interfaceC1041r, c23, z5, c1682j, c0873f3, c0873f4, i6);
        }
    }

    public static final float e(float f6, float[] fArr, float f7, float f8) {
        Float valueOf;
        if (fArr.length == 0) {
            valueOf = null;
        } else {
            float f9 = fArr[0];
            int i6 = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                valueOf = Float.valueOf(f9);
            } else {
                float abs = Math.abs(Y3.C.B(f7, f8, f9) - f6);
                if (1 <= length) {
                    while (true) {
                        float f10 = fArr[i6];
                        float abs2 = Math.abs(Y3.C.B(f7, f8, f10) - f6);
                        if (Float.compare(abs, abs2) > 0) {
                            f9 = f10;
                            abs = abs2;
                        }
                        if (i6 == length) {
                            break;
                        }
                        i6++;
                    }
                }
                valueOf = Float.valueOf(f9);
            }
        }
        return valueOf != null ? Y3.C.B(f7, f8, valueOf.floatValue()) : f6;
    }
}
