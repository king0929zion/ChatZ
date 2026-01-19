package Q;

import F0.AbstractC0137z;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import com.vladsch.flexmark.parser.PegdownExtensions;
import f0.C0996s;
import h0.C1038o;
import h0.InterfaceC1041r;
import i4.AbstractC1117a;
import n0.C1354c;
import n0.C1355d;
import o0.AbstractC1399j;
import o0.C1397h;
import p.AbstractC1464z;
import q0.InterfaceC1498d;
import t.C1682j;
import v.AbstractC1787b;
import v.C1818y;

/* renamed from: Q.n2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0445n2 {
    public static final C0445n2 a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final float f6013b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f6014c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1397h f6015d;

    /* JADX WARN: Type inference failed for: r0v0, types: [Q.n2, java.lang.Object] */
    static {
        float f6 = S.w.f7493o;
        f6013b = f6;
        f6014c = f6;
        f6015d = AbstractC1399j.a();
    }

    public static C0413f2 d(C0626q c0626q) {
        N n3 = (N) c0626q.j(O.a);
        C0413f2 c0413f2 = n3.f5414f0;
        if (c0413f2 != null) {
            return c0413f2;
        }
        long c6 = O.c(n3, S.w.f7487i);
        S.f fVar = S.w.f7480b;
        long c7 = O.c(n3, fVar);
        S.f fVar2 = S.w.f7491m;
        long c8 = O.c(n3, fVar2);
        long c9 = O.c(n3, fVar2);
        long c10 = O.c(n3, fVar);
        long k3 = o0.y.k(o0.s.c(S.w.f7484f, O.c(n3, S.w.f7483e)), n3.f5426p);
        S.f fVar3 = S.w.f7481c;
        long c11 = O.c(n3, fVar3);
        float f6 = S.w.f7482d;
        long c12 = o0.s.c(f6, c11);
        S.f fVar4 = S.w.f7485g;
        long c13 = O.c(n3, fVar4);
        float f7 = S.w.f7486h;
        C0413f2 c0413f22 = new C0413f2(c6, c7, c8, c9, c10, k3, c12, o0.s.c(f7, c13), o0.s.c(f7, O.c(n3, fVar4)), o0.s.c(f6, O.c(n3, fVar3)));
        n3.f5414f0 = c0413f22;
        return c0413f22;
    }

    public static void e(InterfaceC1498d interfaceC1498d, r.X0 x02, long j3, long j4, long j5, float f6, float f7) {
        C1355d c1355d;
        long floatToRawIntBits = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L);
        if (x02 == r.X0.f14183c) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L));
            C1354c a6 = AbstractC1117a.a(j3, (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
            c1355d = new C1355d(a6.a, a6.f13295b, a6.f13296c, a6.f13297d, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits2);
        } else {
            float intBitsToFloat3 = Float.intBitsToFloat((int) (j4 >> 32));
            float intBitsToFloat4 = Float.intBitsToFloat((int) (j4 & 4294967295L));
            C1354c a7 = AbstractC1117a.a(j3, (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32));
            c1355d = new C1355d(a7.a, a7.f13295b, a7.f13296c, a7.f13297d, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits2, floatToRawIntBits);
        }
        C1397h c1397h = f6015d;
        C1397h.b(c1397h, c1355d);
        InterfaceC1498d.K(interfaceC1498d, c1397h, j5, null, 60);
        c1397h.f();
    }

    public final void a(final C1682j c1682j, InterfaceC1041r interfaceC1041r, final C0413f2 c0413f2, final boolean z5, long j3, C0626q c0626q, final int i6) {
        final InterfaceC1041r interfaceC1041r2;
        final long j4;
        long j5;
        InterfaceC1041r interfaceC1041r3;
        c0626q.d0(-290277409);
        int i7 = i6 | (c0626q.f(c1682j) ? 4 : 2) | 48 | (c0626q.f(c0413f2) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.g(z5) ? 2048 : PegdownExtensions.ANCHORLINKS) | 24576;
        if (c0626q.S(i7 & 1, (74899 & i7) != 74898)) {
            c0626q.X();
            if ((i6 & 1) == 0 || c0626q.B()) {
                j5 = AbstractC0492z2.f6309c;
                interfaceC1041r3 = C1038o.a;
            } else {
                c0626q.V();
                interfaceC1041r3 = interfaceC1041r;
                j5 = j3;
            }
            c0626q.q();
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (P5 == c0602e) {
                P5 = new C0996s();
                c0626q.m0(P5);
            }
            C0996s c0996s = (C0996s) P5;
            boolean z6 = (i7 & 14) == 4;
            Object P6 = c0626q.P();
            if (z6 || P6 == c0602e) {
                P6 = new C0437l2(c1682j, c0996s, null);
                c0626q.m0(P6);
            }
            T.r.f(c0626q, c1682j, (l4.e) P6);
            long floatToRawIntBits = !c0996s.isEmpty() ? (Float.floatToRawIntBits(e1.h.b(j5) / 2) << 32) | (Float.floatToRawIntBits(e1.h.a(j5)) & 4294967295L) : j5;
            C1818y c1818y = v.t0.a;
            AbstractC1787b.h(c0626q, AbstractC1464z.f(AbstractC1464z.o(v.t0.k(interfaceC1041r3, e1.h.b(floatToRawIntBits), e1.h.a(floatToRawIntBits)), c1682j), z5 ? c0413f2.a : c0413f2.f5809f, W1.a(S.w.f7489k, c0626q)));
            j4 = j5;
            interfaceC1041r2 = interfaceC1041r3;
        } else {
            c0626q.V();
            interfaceC1041r2 = interfaceC1041r;
            j4 = j3;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(c1682j, interfaceC1041r2, c0413f2, z5, j4, i6) { // from class: Q.i2

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ C1682j f5884e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1041r f5885f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ C0413f2 f5886g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f5887h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ long f5888i;

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = T.r.J(196609);
                    C0445n2.this.a(this.f5884e, this.f5885f, this.f5886g, this.f5887h, this.f5888i, (C0626q) obj, J4);
                    return X3.y.a;
                }
            };
        }
    }

    public final void b(final C2 c22, InterfaceC1041r interfaceC1041r, final boolean z5, final C0413f2 c0413f2, l4.e eVar, l4.f fVar, float f6, float f7, C0626q c0626q, final int i6) {
        int i7;
        final InterfaceC1041r interfaceC1041r2;
        final l4.e eVar2;
        final l4.f fVar2;
        final float f8;
        final float f9;
        int i8;
        l4.e eVar3;
        float f10;
        l4.f fVar3;
        InterfaceC1041r interfaceC1041r3;
        float f11;
        c0626q.d0(49984771);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.h(c22) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        int i9 = i7 | 48;
        if ((i6 & 384) == 0) {
            i9 |= c0626q.g(z5) ? 256 : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i9 |= c0626q.f(c0413f2) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i9 |= 8192;
        }
        int i10 = i9 | 14352384;
        if ((100663296 & i6) == 0) {
            i10 |= c0626q.f(this) ? PegdownExtensions.MULTI_LINE_IMAGE_URLS : PegdownExtensions.TOC;
        }
        if (c0626q.S(i10 & 1, (38347923 & i10) != 38347922)) {
            c0626q.X();
            if ((i6 & 1) == 0 || c0626q.B()) {
                boolean z6 = ((((i10 & 7168) ^ 3072) > 2048 && c0626q.f(c0413f2)) || (i10 & 3072) == 2048) | ((i10 & 896) == 256);
                Object P5 = c0626q.P();
                C0602e c0602e = C0616l.a;
                if (z6 || P5 == c0602e) {
                    P5 = new D.O(c0413f2, z5);
                    c0626q.m0(P5);
                }
                l4.e eVar4 = (l4.e) P5;
                i8 = i10 & (-57345);
                Object P6 = c0626q.P();
                if (P6 == c0602e) {
                    P6 = C0441m2.f5977c;
                    c0626q.m0(P6);
                }
                float f12 = AbstractC0492z2.f6310d;
                eVar3 = eVar4;
                f10 = AbstractC0492z2.f6311e;
                fVar3 = (l4.f) P6;
                interfaceC1041r3 = C1038o.a;
                f11 = f12;
            } else {
                c0626q.V();
                i8 = i10 & (-57345);
                interfaceC1041r3 = interfaceC1041r;
                eVar3 = eVar;
                fVar3 = fVar;
                f11 = f6;
                f10 = f7;
            }
            c0626q.q();
            int i11 = i8 << 3;
            c(c22, interfaceC1041r3, z5, c0413f2, eVar3, fVar3, f11, f10, c0626q, 805306416 | (i8 & 14) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (3670016 & i11) | (29360128 & i11) | (i11 & 234881024), ((i8 >> 21) & 112) | 6);
            interfaceC1041r2 = interfaceC1041r3;
            f9 = f10;
            f8 = f11;
            fVar2 = fVar3;
            eVar2 = eVar3;
        } else {
            c0626q.V();
            interfaceC1041r2 = interfaceC1041r;
            eVar2 = eVar;
            fVar2 = fVar;
            f8 = f6;
            f9 = f7;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e() { // from class: Q.h2
                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    C0445n2.this.b(c22, interfaceC1041r2, z5, c0413f2, eVar2, fVar2, f8, f9, (C0626q) obj, T.r.J(i6 | 1));
                    return X3.y.a;
                }
            };
        }
    }

    public final void c(final C2 c22, final InterfaceC1041r interfaceC1041r, final boolean z5, final C0413f2 c0413f2, final l4.e eVar, final l4.f fVar, final float f6, final float f7, C0626q c0626q, final int i6, final int i7) {
        int i8;
        float f8;
        int i9;
        C0626q c0626q2;
        long j3;
        long j4;
        InterfaceC1041r interfaceC1041r2;
        c0626q.d0(133396521);
        if ((i6 & 6) == 0) {
            i8 = (c0626q.h(c22) ? 4 : 2) | i6;
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= c0626q.c(Float.NaN) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= c0626q.f(interfaceC1041r) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i8 |= c0626q.g(z5) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i8 |= c0626q.f(c0413f2) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i8 |= c0626q.h(eVar) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if ((1572864 & i6) == 0) {
            i8 |= c0626q.h(fVar) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT;
        }
        if ((12582912 & i6) == 0) {
            f8 = f6;
            i8 |= c0626q.c(f8) ? PegdownExtensions.EXTANCHORLINKS_WRAP : PegdownExtensions.EXTANCHORLINKS;
        } else {
            f8 = f6;
        }
        if ((i6 & 100663296) == 0) {
            i8 |= c0626q.c(f7) ? PegdownExtensions.MULTI_LINE_IMAGE_URLS : PegdownExtensions.TOC;
        }
        if ((i6 & 805306368) == 0) {
            i8 |= c0626q.g(false) ? PegdownExtensions.NOT_USED : PegdownExtensions.FORCELISTITEMPARA;
        }
        if ((i7 & 6) == 0) {
            i9 = i7 | (c0626q.g(false) ? 4 : 2);
        } else {
            i9 = i7;
        }
        if (c0626q.S(i8 & 1, ((i8 & 306783379) == 306783378 && (i9 & 3) == 2) ? false : true)) {
            final long a6 = c0413f2.a(z5, false);
            long a7 = c0413f2.a(z5, true);
            if (z5) {
                j3 = a7;
                j4 = c0413f2.f5808e;
            } else {
                j3 = a7;
                j4 = c0413f2.f5813j;
            }
            long j5 = z5 ? c0413f2.f5806c : c0413f2.f5811h;
            InterfaceC1041r c6 = c22.f5191p == r.X0.f14183c ? v.t0.n(interfaceC1041r, AbstractC0492z2.a).c(v.t0.f15348b) : v.t0.d(interfaceC1041r.c(v.t0.a), AbstractC0492z2.a);
            int i10 = i8 & 112;
            int i11 = i8;
            boolean h3 = (i10 == 32) | c0626q.h(c22);
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (h3 || P5 == c0602e) {
                P5 = new D.b1(c22, 8);
                c0626q.m0(P5);
            }
            InterfaceC1041r c7 = c6.c(AbstractC0137z.k(C1038o.a, (l4.f) P5));
            boolean h6 = ((i11 & 29360128) == 8388608) | (i10 == 32) | c0626q.h(c22) | c0626q.e(a6) | c0626q.e(j3) | c0626q.e(j4) | c0626q.e(j5) | ((i11 & 234881024) == 67108864) | ((i11 & 458752) == 131072) | ((i11 & 3670016) == 1048576) | ((i11 & 1879048192) == 536870912) | ((i9 & 14) == 4);
            Object P6 = c0626q.P();
            if (h6 || P6 == c0602e) {
                final long j6 = j5;
                c0626q2 = c0626q;
                final long j7 = j4;
                interfaceC1041r2 = c7;
                final float f9 = f8;
                final long j8 = j3;
                l4.c cVar = new l4.c() { // from class: Q.j2
                    /* JADX WARN: Removed duplicated region for block: B:62:0x0250  */
                    @Override // l4.c
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object f(java.lang.Object r32) {
                        /*
                            Method dump skipped, instructions count: 960
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: Q.C0429j2.f(java.lang.Object):java.lang.Object");
                    }
                };
                c0626q2.m0(cVar);
                P6 = cVar;
            } else {
                c0626q2 = c0626q;
                interfaceC1041r2 = c7;
            }
            AbstractC1464z.a(interfaceC1041r2, (l4.c) P6, c0626q2, 0);
        } else {
            c0626q2 = c0626q;
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new l4.e() { // from class: Q.k2
                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    C0445n2.this.c(c22, interfaceC1041r, z5, c0413f2, eVar, fVar, f6, f7, (C0626q) obj, T.r.J(i6 | 1), T.r.J(i7));
                    return X3.y.a;
                }
            };
        }
    }
}
