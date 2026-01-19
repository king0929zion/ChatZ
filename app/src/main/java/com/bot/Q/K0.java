package Q;

import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import T.C0607g0;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import b0.AbstractC0874g;
import b0.C0873f;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n.AbstractC1318d;
import n.C1304M;
import n.C1327h0;
import p.AbstractC1464z;
import v.AbstractC1787b;
import v.AbstractC1799h;
import v.InterfaceC1802i0;

/* loaded from: classes.dex */
public abstract class K0 {
    public static final float a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f5326b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f5327c = 12;

    /* renamed from: d, reason: collision with root package name */
    public static final float f5328d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final float f5329e = 112;

    /* renamed from: f, reason: collision with root package name */
    public static final float f5330f = 280;

    static {
        float f6 = 48;
        a = f6;
        f5326b = f6;
    }

    public static final void a(final InterfaceC1041r interfaceC1041r, final C1304M c1304m, final T.X x5, final p.P0 p02, final o0.L l3, final long j3, final float f6, final float f7, final C0873f c0873f, C0626q c0626q, final int i6) {
        c0626q.d0(848986741);
        int i7 = i6 | (c0626q.f(interfaceC1041r) ? 4 : 2) | (c0626q.f(c1304m) ? 32 : 16) | (c0626q.f(p02) ? 2048 : PegdownExtensions.ANCHORLINKS) | (c0626q.f(l3) ? 16384 : 8192) | (c0626q.e(j3) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS) | (c0626q.c(f6) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT) | (c0626q.c(f7) ? PegdownExtensions.EXTANCHORLINKS_WRAP : PegdownExtensions.EXTANCHORLINKS) | (c0626q.f(null) ? PegdownExtensions.MULTI_LINE_IMAGE_URLS : PegdownExtensions.TOC) | (c0626q.h(c0873f) ? PegdownExtensions.NOT_USED : PegdownExtensions.FORCELISTITEMPARA);
        if (c0626q.S(i7 & 1, (i7 & 306783379) != 306783378)) {
            n.y0 d6 = n.C0.d(c1304m, "DropDownMenu", c0626q, (((i7 >> 3) & 14) | 48) & 126);
            C1327h0 u5 = R1.u(S.p.f7414e, c0626q);
            C1327h0 u6 = R1.u(S.p.f7416g, c0626q);
            n.E0 e02 = AbstractC1318d.f13114j;
            N3.s sVar = d6.a;
            C0607g0 c0607g0 = d6.f13280d;
            boolean booleanValue = ((Boolean) sVar.k()).booleanValue();
            c0626q.b0(143964305);
            float f8 = booleanValue ? 1.0f : 0.8f;
            c0626q.p(false);
            Float valueOf = Float.valueOf(f8);
            boolean booleanValue2 = ((Boolean) c0607g0.getValue()).booleanValue();
            c0626q.b0(143964305);
            float f9 = booleanValue2 ? 1.0f : 0.8f;
            c0626q.p(false);
            Float valueOf2 = Float.valueOf(f9);
            d6.f();
            c0626q.b0(-745957716);
            c0626q.p(false);
            n.u0 c6 = n.C0.c(d6, valueOf, valueOf2, u5, e02, c0626q, 0);
            boolean booleanValue3 = ((Boolean) d6.a.k()).booleanValue();
            c0626q.b0(892761509);
            float f10 = booleanValue3 ? 1.0f : 0.0f;
            c0626q.p(false);
            Float valueOf3 = Float.valueOf(f10);
            boolean booleanValue4 = ((Boolean) c0607g0.getValue()).booleanValue();
            c0626q.b0(892761509);
            float f11 = booleanValue4 ? 1.0f : 0.0f;
            c0626q.p(false);
            Float valueOf4 = Float.valueOf(f11);
            d6.f();
            c0626q.b0(2839488);
            c0626q.p(false);
            n.u0 c7 = n.C0.c(d6, valueOf3, valueOf4, u6, e02, c0626q, 0);
            boolean booleanValue5 = ((Boolean) c0626q.j(I0.E0.a)).booleanValue();
            boolean g3 = c0626q.g(booleanValue5) | c0626q.f(c6) | ((i7 & 112) == 32) | c0626q.f(c7);
            Object P5 = c0626q.P();
            if (g3 || P5 == C0616l.a) {
                Object gVar = new L1.g(booleanValue5, c1304m, x5, c6, c7);
                c0626q.m0(gVar);
                P5 = gVar;
            }
            int i8 = i7 >> 9;
            int i9 = i7 >> 6;
            X2.a(o0.y.o(C1038o.a, (l4.c) P5), l3, j3, 0L, f6, f7, AbstractC0874g.c(-1463404422, new I0(interfaceC1041r, p02, c0873f), c0626q), c0626q, (i8 & 896) | (i8 & 112) | 12582912 | (57344 & i9) | (458752 & i9) | (i9 & 3670016), 8);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(c1304m, x5, p02, l3, j3, f6, f7, c0873f, i6) { // from class: Q.H0

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ C1304M f5269e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ T.X f5270f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ p.P0 f5271g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ o0.L f5272h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ long f5273i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ float f5274j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ float f5275k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ C0873f f5276l;

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = T.r.J(385);
                    K0.a(InterfaceC1041r.this, this.f5269e, this.f5270f, this.f5271g, this.f5272h, this.f5273i, this.f5274j, this.f5275k, this.f5276l, (C0626q) obj, J4);
                    return X3.y.a;
                }
            };
        }
    }

    public static final void b(C0873f c0873f, InterfaceC1193a interfaceC1193a, InterfaceC1041r interfaceC1041r, boolean z5, G0 g02, InterfaceC1802i0 interfaceC1802i0, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(-1325192924);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.h(c0873f) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(interfaceC1193a) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.f(interfaceC1041r) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q.h(null) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0626q.h(null) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i7 |= c0626q.g(z5) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if ((1572864 & i6) == 0) {
            i7 |= c0626q.f(g02) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT;
        }
        if ((12582912 & i6) == 0) {
            i7 |= c0626q.f(interfaceC1802i0) ? PegdownExtensions.EXTANCHORLINKS_WRAP : PegdownExtensions.EXTANCHORLINKS;
        }
        if ((100663296 & i6) == 0) {
            i7 |= c0626q.f(null) ? PegdownExtensions.MULTI_LINE_IMAGE_URLS : PegdownExtensions.TOC;
        }
        if (c0626q.S(i7 & 1, (38347923 & i7) != 38347922)) {
            InterfaceC1041r x5 = AbstractC1787b.x(v.t0.m(AbstractC1464z.j(interfaceC1041r, null, S1.a(S.l.f7374V, 6, 0L, true), z5, null, interfaceC1193a, 24).c(v.t0.a), f5329e, f5326b, f5330f, 8), interfaceC1802i0);
            v.p0 a6 = v.o0.a(AbstractC1799h.a, C1026c.f11796n, c0626q, 48);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, x5);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, a6, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            C0146e c0146e = C0150g.f1929g;
            if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode))) {
                B3.e.v(hashCode, c0626q, hashCode, c0146e);
            }
            T.r.G(c0626q, c6, C0150g.f1926d);
            f3.a(((t3) c0626q.j(u3.a)).f6132m, AbstractC0874g.c(865999929, new J0(g02, z5, c0873f), c0626q), c0626q, 48);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new L(c0873f, interfaceC1193a, interfaceC1041r, z5, g02, interfaceC1802i0, i6);
        }
    }
}
