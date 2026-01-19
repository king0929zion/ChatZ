package Q;

import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import b0.AbstractC0874g;
import b0.C0873f;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import h0.AbstractC1024a;
import h0.C1038o;
import h0.InterfaceC1041r;
import i1.C1102v;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import v.AbstractC1787b;

/* renamed from: Q.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0426j {
    public static final float a = 280;

    /* renamed from: b, reason: collision with root package name */
    public static final float f5892b = 560;

    /* renamed from: c, reason: collision with root package name */
    public static final float f5893c = 8;

    /* renamed from: d, reason: collision with root package name */
    public static final float f5894d = 12;

    /* renamed from: e, reason: collision with root package name */
    public static final v.k0 f5895e;

    /* renamed from: f, reason: collision with root package name */
    public static final v.k0 f5896f;

    /* renamed from: g, reason: collision with root package name */
    public static final v.k0 f5897g;

    /* renamed from: h, reason: collision with root package name */
    public static final T.B f5898h;

    static {
        float f6 = 24;
        f5895e = new v.k0(f6, f6, f6, f6);
        float f7 = 16;
        AbstractC1787b.g(S.l.f7374V, S.l.f7374V, f7, 7);
        f5896f = AbstractC1787b.g(S.l.f7374V, S.l.f7374V, f7, 7);
        f5897g = AbstractC1787b.g(S.l.f7374V, S.l.f7374V, f6, 7);
        f5898h = new T.B(new O.A(6));
    }

    public static final void a(final C0873f c0873f, InterfaceC1041r interfaceC1041r, final l4.e eVar, final l4.e eVar2, final o0.L l3, final long j3, final float f6, final long j4, final long j5, final long j6, final long j7, C0626q c0626q, final int i6) {
        final InterfaceC1041r interfaceC1041r2;
        c0626q.d0(1378716401);
        int i7 = i6 | 48 | (c0626q.h(null) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.h(eVar) ? 2048 : PegdownExtensions.ANCHORLINKS) | (c0626q.h(eVar2) ? 16384 : 8192) | (c0626q.f(l3) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS) | (c0626q.e(j3) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT) | (c0626q.c(f6) ? PegdownExtensions.EXTANCHORLINKS_WRAP : PegdownExtensions.EXTANCHORLINKS) | (c0626q.e(j4) ? PegdownExtensions.MULTI_LINE_IMAGE_URLS : PegdownExtensions.TOC) | (c0626q.e(j5) ? PegdownExtensions.NOT_USED : PegdownExtensions.FORCELISTITEMPARA);
        if (c0626q.S(i7 & 1, ((i7 & 306783379) == 306783378 && (((c0626q.e(j6) ? (char) 4 : (char) 2) | (c0626q.e(j7) ? SequenceUtils.SPC : (char) 16)) & 19) == 18) ? false : true)) {
            C0873f c6 = AbstractC0874g.c(-652798794, new C0410f(eVar, eVar2, j5, j6, j7, j4, c0873f), c0626q);
            int i8 = i7 >> 12;
            int i9 = (i8 & 896) | (i8 & 112) | 12582918 | ((i7 >> 9) & 57344);
            C1038o c1038o = C1038o.a;
            X2.a(c1038o, l3, j3, 0L, f6, S.l.f7374V, c6, c0626q, i9, 104);
            interfaceC1041r2 = c1038o;
        } else {
            c0626q.V();
            interfaceC1041r2 = interfaceC1041r;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(interfaceC1041r2, eVar, eVar2, l3, j3, f6, j4, j5, j6, j7, i6) { // from class: Q.b

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1041r f5656e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ l4.e f5657f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ l4.e f5658g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ o0.L f5659h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ long f5660i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ float f5661j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ long f5662k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ long f5663l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ long f5664m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ long f5665n;

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = T.r.J(7);
                    AbstractC0426j.a(C0873f.this, this.f5656e, this.f5657f, this.f5658g, this.f5659h, this.f5660i, this.f5661j, this.f5662k, this.f5663l, this.f5664m, this.f5665n, (C0626q) obj, J4);
                    return X3.y.a;
                }
            };
        }
    }

    public static final void b(C0873f c0873f, C0626q c0626q, int i6) {
        c0626q.d0(-917637668);
        if (c0626q.S(i6 & 1, (i6 & 147) != 146)) {
            Object P5 = c0626q.P();
            if (P5 == C0616l.a) {
                P5 = new C0414g(0);
                c0626q.m0(P5);
            }
            F0.V v5 = (F0.V) P5;
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, C1038o.a);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, v5, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            C0146e c0146e = C0150g.f1929g;
            if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode))) {
                B3.e.v(hashCode, c0626q, hashCode, c0146e);
            }
            T.r.G(c0626q, c6, C0150g.f1926d);
            c0873f.m(c0626q, 6);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0398c(c0873f, i6);
        }
    }

    public static final void c(final InterfaceC1193a interfaceC1193a, final C0873f c0873f, final InterfaceC1041r interfaceC1041r, final l4.e eVar, final l4.e eVar2, final l4.e eVar3, final o0.L l3, final long j3, final long j4, final long j5, final long j6, final float f6, final C1102v c1102v, C0626q c0626q, final int i6, final int i7) {
        int i8;
        C0873f c0873f2;
        l4.e eVar4;
        int i9;
        c0626q.d0(-867616355);
        if ((i6 & 6) == 0) {
            i8 = (c0626q.h(interfaceC1193a) ? 4 : 2) | i6;
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            c0873f2 = c0873f;
            i8 |= c0626q.h(c0873f2) ? 32 : 16;
        } else {
            c0873f2 = c0873f;
        }
        if ((i6 & 384) == 0) {
            i8 |= c0626q.f(interfaceC1041r) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            eVar4 = eVar;
            i8 |= c0626q.h(eVar4) ? 2048 : PegdownExtensions.ANCHORLINKS;
        } else {
            eVar4 = eVar;
        }
        if ((i6 & 24576) == 0) {
            i8 |= c0626q.h(null) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i8 |= c0626q.h(eVar2) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if ((i6 & 1572864) == 0) {
            i8 |= c0626q.h(eVar3) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT;
        }
        if ((i6 & 12582912) == 0) {
            i8 |= c0626q.f(l3) ? PegdownExtensions.EXTANCHORLINKS_WRAP : PegdownExtensions.EXTANCHORLINKS;
        }
        if ((i6 & 100663296) == 0) {
            i8 |= c0626q.e(j3) ? PegdownExtensions.MULTI_LINE_IMAGE_URLS : PegdownExtensions.TOC;
        }
        if ((i6 & 805306368) == 0) {
            i8 |= c0626q.e(j4) ? PegdownExtensions.NOT_USED : PegdownExtensions.FORCELISTITEMPARA;
        }
        if ((i7 & 6) == 0) {
            i9 = i7 | (c0626q.e(j5) ? 4 : 2);
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            i9 |= c0626q.e(j6) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i9 |= c0626q.c(f6) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i7 & 3072) == 0) {
            i9 |= c0626q.f(c1102v) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        int i10 = i9;
        if (c0626q.S(i8 & 1, ((i8 & 306783379) == 306783378 && (i10 & 1171) == 1170) ? false : true)) {
            d(interfaceC1193a, interfaceC1041r, c1102v, AbstractC0874g.c(527420759, new C0422i(eVar2, eVar3, l3, j3, f6, j4, j5, j6, eVar4, c0873f2), c0626q), c0626q, (i8 & 14) | 3072 | ((i8 >> 3) & 112) | ((i10 >> 3) & 896));
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e() { // from class: Q.d
                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = T.r.J(i6 | 1);
                    int J5 = T.r.J(i7);
                    AbstractC0426j.c(InterfaceC1193a.this, c0873f, interfaceC1041r, eVar, eVar2, eVar3, l3, j3, j4, j5, j6, f6, c1102v, (C0626q) obj, J4, J5);
                    return X3.y.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [B0.H, java.lang.Object] */
    public static final void d(InterfaceC1193a interfaceC1193a, InterfaceC1041r interfaceC1041r, C1102v c1102v, C0873f c0873f, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(24925658);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.h(interfaceC1193a) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.f(interfaceC1041r) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.f(c1102v) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q.h(c0873f) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if (c0626q.S(i7 & 1, (i7 & 1171) != 1170)) {
            W w5 = (W) c0626q.j(f5898h);
            ?? obj = new Object();
            obj.f391c = interfaceC1193a;
            obj.f392e = interfaceC1041r;
            obj.f393f = c1102v;
            obj.f394g = c0873f;
            w5.a(obj, c0626q, 0);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new O.P(interfaceC1193a, interfaceC1041r, c1102v, c0873f, i6);
        }
    }
}
