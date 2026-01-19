package Q;

import D.C0086p;
import I0.AbstractC0204q0;
import O.C0296a;
import R.AbstractC0507l;
import R.C0513s;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b0.AbstractC0874g;
import b0.C0873f;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.parser.PegdownExtensions;
import e1.InterfaceC0961c;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import n.AbstractC1324g;
import n.C1316c;
import o0.C1387I;
import p.AbstractC1464z;
import r.AbstractC1601r0;
import v.AbstractC1787b;
import v.C1777A;
import v.C1810p;
import x4.InterfaceC1942y;

/* renamed from: Q.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0452p1 {
    public static final float a = 48;

    /* renamed from: b, reason: collision with root package name */
    public static final float f6033b = 24;

    /* renamed from: c, reason: collision with root package name */
    public static final long f6034c = o0.y.h(0.5f, S.l.f7374V);

    /* JADX WARN: Removed duplicated region for block: B:107:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final l4.InterfaceC1193a r31, h0.InterfaceC1041r r32, Q.C0405d2 r33, float r34, boolean r35, o0.L r36, long r37, long r39, float r41, long r42, l4.e r44, l4.e r45, Q.C0456q1 r46, final b0.C0873f r47, T.C0626q r48, final int r49) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.AbstractC0452p1.a(l4.a, h0.r, Q.d2, float, boolean, o0.L, long, long, float, long, l4.e, l4.e, Q.q1, b0.f, T.q, int):void");
    }

    public static final void b(final C1316c c1316c, final InterfaceC1942y interfaceC1942y, final InterfaceC1193a interfaceC1193a, final l4.c cVar, final InterfaceC1041r interfaceC1041r, final C0405d2 c0405d2, final float f6, final boolean z5, final o0.L l3, final long j3, final long j4, final float f7, final l4.e eVar, final l4.e eVar2, final C0873f c0873f, C0626q c0626q, final int i6) {
        C1810p c1810p = C1810p.f15333b;
        c0626q.d0(-37400432);
        int i7 = i6 | (c0626q.h(c1316c) ? 32 : 16) | (c0626q.h(interfaceC1942y) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.h(interfaceC1193a) ? 2048 : 1024) | (c0626q.h(cVar) ? 16384 : 8192);
        boolean f8 = c0626q.f(interfaceC1041r);
        int i8 = PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        int i9 = i7 | (f8 ? 131072 : 65536) | (c0626q.f(c0405d2) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT) | (c0626q.c(f6) ? PegdownExtensions.EXTANCHORLINKS_WRAP : PegdownExtensions.EXTANCHORLINKS) | (c0626q.g(z5) ? PegdownExtensions.MULTI_LINE_IMAGE_URLS : PegdownExtensions.TOC) | (c0626q.f(l3) ? PegdownExtensions.NOT_USED : PegdownExtensions.FORCELISTITEMPARA);
        int i10 = (c0626q.e(j3) ? 4 : 2) | (c0626q.e(j4) ? 32 : 16) | (c0626q.c(f7) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.h(eVar) ? 2048 : 1024) | (c0626q.h(eVar2) ? 16384 : 8192);
        if (c0626q.h(c0873f)) {
            i8 = 131072;
        }
        int i11 = i10 | i8;
        if (c0626q.S(i9 & 1, ((i9 & 306783379) == 306783378 && (i11 & 74899) == 74898) ? false : true)) {
            c0626q.X();
            if ((i6 & 1) != 0 && !c0626q.B()) {
                c0626q.V();
            }
            c0626q.q();
            String j5 = AbstractC0507l.j(R.string.m3c_bottom_sheet_pane_title, c0626q);
            InterfaceC1041r c6 = v.t0.o(S.l.f7374V, f6, 1, c1810p.e(interfaceC1041r, C1026c.f11787e)).c(v.t0.a);
            InterfaceC1041r interfaceC1041r2 = C1038o.a;
            Object obj = C0616l.a;
            if (z5) {
                c0626q.b0(-1582035383);
                boolean z6 = (((i9 & 3670016) ^ 1572864) > 1048576 && c0626q.f(c0405d2)) || (i9 & 1572864) == 1048576;
                Object P5 = c0626q.P();
                if (z6 || P5 == obj) {
                    float f9 = AbstractC0393a2.a;
                    P5 = new Z1(c0405d2, cVar);
                    c0626q.m0(P5);
                }
                interfaceC1041r2 = A0.g.a(interfaceC1041r2, (A0.a) P5, null);
                c0626q.p(false);
            } else {
                c0626q.b0(-1582020872);
                c0626q.p(false);
            }
            InterfaceC1041r c7 = c6.c(interfaceC1041r2);
            C0513s c0513s = c0405d2.f5767d;
            int i12 = (i9 & 3670016) ^ 1572864;
            boolean z7 = (i12 > 1048576 && c0626q.f(c0405d2)) || (i9 & 1572864) == 1048576;
            Object P6 = c0626q.P();
            if (z7 || P6 == obj) {
                P6 = new B4.D(c0405d2, 14);
                c0626q.m0(P6);
            }
            InterfaceC1041r h3 = AbstractC0507l.h(c7, c0513s, (l4.e) P6);
            M.q qVar = c0405d2.f5767d.f6829f;
            boolean z8 = z5 && c0405d2.d();
            boolean z9 = c0405d2.f5767d.f6835l.getValue() != null;
            boolean z10 = (i9 & 57344) == 16384;
            Object P7 = c0626q.P();
            if (z10 || P7 == obj) {
                P7 = new C0420h1(null, cVar);
                c0626q.m0(P7);
            }
            InterfaceC1041r a6 = AbstractC1601r0.a(h3, qVar, r.X0.f14183c, z8, null, z9, (l4.f) P7, false, 168);
            boolean f10 = c0626q.f(j5);
            Object P8 = c0626q.P();
            if (f10 || P8 == obj) {
                P8 = new M2.b(j5, 4);
                c0626q.m0(P8);
            }
            InterfaceC1041r a7 = P0.n.a(a6, false, (l4.c) P8);
            int g3 = (int) c0405d2.f5767d.f6833j.g();
            if (g3 < 0) {
                g3 = 0;
            }
            InterfaceC1041r n3 = AbstractC1787b.n(a7, new C1777A(g3));
            boolean z11 = ((i12 > 1048576 && c0626q.f(c0405d2)) || (i9 & 1572864) == 1048576) | ((i9 & 112) == 32 || c0626q.h(c1316c));
            Object P9 = c0626q.P();
            if (z11 || P9 == obj) {
                P9 = new C0086p(15, c0405d2, c1316c);
                c0626q.m0(P9);
            }
            int i13 = i11 << 6;
            X2.a(o0.y.o(o0.y.o(n3, (l4.c) P9), new C0454q(c0405d2, 0)), l3, j3, j4, f7, S.l.f7374V, AbstractC0874g.c(728743275, new C0444n1(eVar2, c1316c, c0405d2, eVar, c0873f, interfaceC1193a, interfaceC1942y, z5), c0626q), c0626q, ((i9 >> 24) & 112) | 12582912 | (i13 & 896) | (i13 & 7168) | (i13 & 57344), 96);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(interfaceC1942y, interfaceC1193a, cVar, interfaceC1041r, c0405d2, f6, z5, l3, j3, j4, f7, eVar, eVar2, c0873f, i6) { // from class: Q.W0

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1942y f5559e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1193a f5560f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ l4.c f5561g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1041r f5562h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ C0405d2 f5563i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ float f5564j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ boolean f5565k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ o0.L f5566l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ long f5567m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ long f5568n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ float f5569o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ l4.e f5570p;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ l4.e f5571q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ C0873f f5572r;

                @Override // l4.e
                public final Object m(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int J4 = T.r.J(71);
                    AbstractC0452p1.b(C1316c.this, this.f5559e, this.f5560f, this.f5561g, this.f5562h, this.f5563i, this.f5564j, this.f5565k, this.f5566l, this.f5567m, this.f5568n, this.f5569o, this.f5570p, this.f5571q, this.f5572r, (C0626q) obj2, J4);
                    return X3.y.a;
                }
            };
        }
    }

    public static final void c(final long j3, final InterfaceC1193a interfaceC1193a, final boolean z5, final boolean z6, C0626q c0626q, final int i6) {
        c0626q.d0(-391613911);
        int i7 = i6 | (c0626q.e(j3) ? 4 : 2) | (c0626q.h(interfaceC1193a) ? 32 : 16) | (c0626q.g(z5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.g(z6) ? 2048 : PegdownExtensions.ANCHORLINKS);
        if (!c0626q.S(i7 & 1, (i7 & 1171) != 1170)) {
            c0626q.V();
        } else if (j3 != 16) {
            c0626q.b0(-1438582326);
            T.d1 b5 = AbstractC1324g.b(z5 ? 1.0f : S.l.f7374V, R1.u(S.p.f7415f, c0626q), null, c0626q, 0, 28);
            Object j4 = AbstractC0507l.j(R.string.close_sheet, c0626q);
            InterfaceC1041r interfaceC1041r = C1038o.a;
            Object obj = C0616l.a;
            if (z6) {
                c0626q.b0(-1438283579);
                int i8 = i7 & 112;
                boolean z7 = i8 == 32;
                Object P5 = c0626q.P();
                if (z7 || P5 == obj) {
                    P5 = new C0448o1(0, interfaceC1193a);
                    c0626q.m0(P5);
                }
                InterfaceC1041r a6 = B0.Q.a(interfaceC1041r, interfaceC1193a, (PointerInputEventHandler) P5);
                boolean f6 = (i8 == 32) | c0626q.f(j4);
                Object P6 = c0626q.P();
                if (f6 || P6 == obj) {
                    P6 = new C0086p(16, j4, interfaceC1193a);
                    c0626q.m0(P6);
                }
                interfaceC1041r = P0.n.a(a6, true, (l4.c) P6);
                c0626q.p(false);
            } else {
                c0626q.b0(-1437857391);
                c0626q.p(false);
            }
            InterfaceC1041r c6 = v.t0.f15349c.c(interfaceC1041r);
            boolean f7 = c0626q.f(b5) | ((i7 & 14) == 4);
            Object P7 = c0626q.P();
            if (f7 || P7 == obj) {
                P7 = new U0(j3, b5);
                c0626q.m0(P7);
            }
            AbstractC1464z.a(c6, (l4.c) P7, c0626q, 0);
            c0626q.p(false);
        } else {
            c0626q.b0(-1437676103);
            c0626q.p(false);
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(j3, interfaceC1193a, z5, z6, i6) { // from class: Q.V0

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f5540c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1193a f5541e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f5542f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f5543g;

                @Override // l4.e
                public final Object m(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int J4 = T.r.J(1);
                    AbstractC0452p1.c(this.f5540c, this.f5541e, this.f5542f, this.f5543g, (C0626q) obj2, J4);
                    return X3.y.a;
                }
            };
        }
    }

    public static final float d(C1387I c1387i, float f6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c1387i.f13428s >> 32));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == S.l.f7374V) {
            return 1.0f;
        }
        return 1.0f - (Y3.C.B(S.l.f7374V, Math.min(c1387i.a() * a, intBitsToFloat), f6) / intBitsToFloat);
    }

    public static final float e(C1387I c1387i, float f6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c1387i.f13428s & 4294967295L));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == S.l.f7374V) {
            return 1.0f;
        }
        return 1.0f - (Y3.C.B(S.l.f7374V, Math.min(c1387i.a() * f6033b, intBitsToFloat), f6) / intBitsToFloat);
    }

    public static final C0405d2 f(int i6, int i7, C0626q c0626q) {
        final int i8 = 1;
        final int i9 = 0;
        boolean z5 = (i7 & 1) == 0;
        Object P5 = c0626q.P();
        Object obj = C0616l.a;
        Object obj2 = P5;
        if (P5 == obj) {
            Object d02 = new P2.D0(4);
            c0626q.m0(d02);
            obj2 = d02;
        }
        l4.c cVar = (l4.c) obj2;
        int i10 = 14;
        int i11 = (i6 & 14) | 384;
        float f6 = AbstractC0393a2.a;
        final float f7 = C0450p.f6031c;
        final float f8 = C0450p.f6032d;
        final InterfaceC0961c interfaceC0961c = (InterfaceC0961c) c0626q.j(AbstractC0204q0.f2358h);
        boolean f9 = c0626q.f(interfaceC0961c) | c0626q.c(f7);
        Object P6 = c0626q.P();
        Object obj3 = P6;
        if (f9 || P6 == obj) {
            Object obj4 = new InterfaceC1193a() { // from class: Q.X1
                @Override // l4.InterfaceC1193a
                public final Object b() {
                    float e02;
                    switch (i9) {
                        case 0:
                            e02 = interfaceC0961c.e0(f7);
                            break;
                        default:
                            e02 = interfaceC0961c.e0(f7);
                            break;
                    }
                    return Float.valueOf(e02);
                }
            };
            c0626q.m0(obj4);
            obj3 = obj4;
        }
        InterfaceC1193a interfaceC1193a = (InterfaceC1193a) obj3;
        boolean f10 = c0626q.f(interfaceC0961c) | c0626q.c(f8);
        Object P7 = c0626q.P();
        Object obj5 = P7;
        if (f10 || P7 == obj) {
            Object obj6 = new InterfaceC1193a() { // from class: Q.X1
                @Override // l4.InterfaceC1193a
                public final Object b() {
                    float e02;
                    switch (i8) {
                        case 0:
                            e02 = interfaceC0961c.e0(f8);
                            break;
                        default:
                            e02 = interfaceC0961c.e0(f8);
                            break;
                    }
                    return Float.valueOf(e02);
                }
            };
            c0626q.m0(obj6);
            obj5 = obj6;
        }
        InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) obj5;
        Object[] objArr = {Boolean.valueOf(z5), cVar, Boolean.FALSE};
        e0.k kVar = new e0.k(i9, new B4.z(i10), new C0296a(z5, interfaceC1193a, interfaceC1193a2, cVar));
        if ((((i11 & 14) ^ 6) <= 4 || !c0626q.g(z5)) && (i11 & 6) != 4) {
            i8 = 0;
        }
        int i12 = (c0626q.f(interfaceC1193a) ? 1 : 0) | i8 | (c0626q.f(interfaceC1193a2) ? 1 : 0) | (c0626q.f(cVar) ? 1 : 0) | (c0626q.g(false) ? 1 : 0);
        Object P8 = c0626q.P();
        if (i12 != 0 || P8 == obj) {
            Object y12 = new Y1(z5, interfaceC1193a, interfaceC1193a2, EnumC0409e2.f5776c, cVar);
            c0626q.m0(y12);
            P8 = y12;
        }
        return (C0405d2) e0.l.c(objArr, kVar, (InterfaceC1193a) P8, c0626q, 0);
    }
}
