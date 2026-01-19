package R;

import D.C0056a;
import D.C0069g0;
import D.C0086p;
import D.C0091s;
import D.e1;
import H0.C0146e;
import H0.C0150g;
import H0.InterfaceC0152h;
import Q.f3;
import Q.s3;
import T.C0616l;
import T.C0625p0;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0846u;
import b0.AbstractC0874g;
import b0.C0873f;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import i1.AbstractC1094n;
import i1.C1079C;
import i1.InterfaceC1078B;
import l4.InterfaceC1193a;
import m0.AbstractC1249d;
import m4.AbstractC1276k;
import u0.C1746g;
import v.AbstractC1806l;
import x4.InterfaceC1942y;
import z0.AbstractC2015c;

/* renamed from: R.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0507l {
    public static final S0.y a = new S0.y(null, new S0.w());

    /* renamed from: b, reason: collision with root package name */
    public static final StackTraceElement[] f6800b = new StackTraceElement[0];

    /* renamed from: c, reason: collision with root package name */
    public static C1746g f6801c;

    public static final void a(boolean z5, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(-1339183247);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.g(z5) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(interfaceC1193a) ? 32 : 16;
        }
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            Y3.C.a(z5, interfaceC1193a, c0626q, i7 & 126, 0);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0515u(i6, 0, interfaceC1193a, z5);
        }
    }

    public static final void b(InterfaceC1078B interfaceC1078B, C0873f c0873f, s3 s3Var, C0873f c0873f2, C0626q c0626q, int i6) {
        InterfaceC1078B interfaceC1078B2;
        int i7;
        T.X x5;
        c0626q.d0(-1221877520);
        if ((i6 & 6) == 0) {
            interfaceC1078B2 = interfaceC1078B;
            i7 = (c0626q.f(interfaceC1078B2) ? 4 : 2) | i6;
        } else {
            interfaceC1078B2 = interfaceC1078B;
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(c0873f) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= (i6 & PegdownExtensions.STRIKETHROUGH) == 0 ? c0626q.f(s3Var) : c0626q.h(s3Var) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        int i8 = i6 & 3072;
        C1038o c1038o = C1038o.a;
        if (i8 == 0) {
            i7 |= c0626q.f(c1038o) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0626q.h(null) ? 16384 : 8192;
        }
        boolean z5 = false;
        if ((i6 & PegdownExtensions.SUPPRESS_ALL_HTML) == 0) {
            i7 |= c0626q.g(false) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if ((1572864 & i6) == 0) {
            i7 |= c0626q.g(true) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT;
        }
        if ((12582912 & i6) == 0) {
            i7 |= c0626q.g(false) ? PegdownExtensions.EXTANCHORLINKS_WRAP : PegdownExtensions.EXTANCHORLINKS;
        }
        if ((100663296 & i6) == 0) {
            i7 |= c0626q.h(c0873f2) ? PegdownExtensions.MULTI_LINE_IMAGE_URLS : PegdownExtensions.TOC;
        }
        int i9 = i7;
        if (c0626q.S(i9 & 1, (38347923 & i9) != 38347922)) {
            Object P5 = c0626q.P();
            Object obj = C0616l.a;
            if (P5 == obj) {
                P5 = T.r.p(c0626q);
                c0626q.m0(P5);
            }
            InterfaceC1942y interfaceC1942y = (InterfaceC1942y) P5;
            Object P6 = c0626q.P();
            if (P6 == obj) {
                P6 = T.r.A(Boolean.FALSE);
                c0626q.m0(P6);
            }
            T.X x6 = (T.X) P6;
            F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, c1038o);
            InterfaceC0152h.a.getClass();
            InterfaceC1193a interfaceC1193a = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(interfaceC1193a);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d6, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            C0146e c0146e = C0150g.f1929g;
            if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode))) {
                B3.e.v(hashCode, c0626q, hashCode, c0146e);
            }
            T.r.G(c0626q, c6, C0150g.f1926d);
            if (s3Var.b()) {
                c0626q.b0(-1891243071);
                x5 = x6;
                e(interfaceC1078B2, s3Var, interfaceC1942y, false, x5, c0873f, c0626q, (i9 & 14) | PegdownExtensions.SUPPRESS_ALL_HTML | ((i9 >> 3) & 112) | ((i9 >> 6) & 896) | ((i9 << 15) & 3670016));
                c0626q.p(false);
            } else {
                x5 = x6;
                c0626q.b0(-1890863476);
                c0626q.p(false);
            }
            f(s3Var, x5, c0873f2, c0626q, ((i9 >> 18) & 14) | 384 | ((i9 >> 3) & 112) | ((i9 >> 12) & 7168) | (57344 & (i9 << 3)) | ((i9 >> 9) & 458752));
            c0626q.p(true);
            if ((i9 & 896) == 256 || ((i9 & PegdownExtensions.STRIKETHROUGH) != 0 && c0626q.h(s3Var))) {
                z5 = true;
            }
            Object P7 = c0626q.P();
            if (z5 || P7 == obj) {
                P7 = new C0056a(s3Var, 25);
                c0626q.m0(P7);
            }
            T.r.d(s3Var, (l4.c) P7, c0626q);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new O.P(interfaceC1078B, c0873f, s3Var, c0873f2, i6);
        }
    }

    public static final void c(InterfaceC0846u interfaceC0846u, l4.c cVar, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        c0626q.d0(-1868327245);
        int i7 = (c0626q.h(interfaceC0846u) ? 4 : 2) | i6 | (c0626q.h(cVar) ? 32 : 16) | (c0626q.h(interfaceC1193a) ? 256 : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            boolean h3 = ((i7 & 112) == 32) | c0626q.h(interfaceC0846u) | ((i7 & 896) == 256);
            Object P5 = c0626q.P();
            if (h3 || P5 == C0616l.a) {
                P5 = new C0091s(14, interfaceC0846u, interfaceC1193a, cVar);
                c0626q.m0(P5);
            }
            T.r.d(interfaceC0846u, (l4.c) P5, c0626q);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new D.L(interfaceC0846u, cVar, interfaceC1193a, i6, 5);
        }
    }

    public static final void d(long j3, S0.P p5, l4.e eVar, C0626q c0626q, int i6) {
        c0626q.d0(-684938728);
        int i7 = (c0626q.e(j3) ? 4 : 2) | i6 | (c0626q.f(p5) ? 32 : 16);
        if ((i6 & 384) == 0) {
            i7 |= c0626q.h(eVar) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            T.B b5 = f3.a;
            T.r.b(new C0625p0[]{Q.U.a.a(new o0.s(j3)), b5.a(((S0.P) c0626q.j(b5)).d(p5))}, eVar, c0626q, ((i7 >> 3) & 112) | 8);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new c0(j3, p5, eVar, i6, 0);
        }
    }

    public static final void e(InterfaceC1078B interfaceC1078B, s3 s3Var, InterfaceC1942y interfaceC1942y, boolean z5, T.X x5, C0873f c0873f, C0626q c0626q, int i6) {
        InterfaceC1078B interfaceC1078B2;
        int i7;
        c0626q.d0(-1413720282);
        if ((i6 & 6) == 0) {
            interfaceC1078B2 = interfaceC1078B;
            i7 = (c0626q.f(interfaceC1078B2) ? 4 : 2) | i6;
        } else {
            interfaceC1078B2 = interfaceC1078B;
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= (i6 & 64) == 0 ? c0626q.f(s3Var) : c0626q.h(s3Var) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.h(null) ? 256 : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q.h(interfaceC1942y) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0626q.g(z5) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i7 |= c0626q.f(x5) ? 131072 : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if ((1572864 & i6) == 0) {
            i7 |= c0626q.h(c0873f) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT;
        }
        if (c0626q.S(i7 & 1, (599187 & i7) != 599186)) {
            String j02 = h5.e.j0(R.string.tooltip_description, c0626q);
            boolean h3 = ((i7 & 112) == 32 || ((i7 & 64) != 0 && c0626q.h(s3Var))) | ((i7 & 896) == 256) | c0626q.h(interfaceC1942y) | ((458752 & i7) == 131072);
            Object P5 = c0626q.P();
            if (h3 || P5 == C0616l.a) {
                P5 = new A.g(s3Var, interfaceC1942y, x5, 4);
                c0626q.m0(P5);
            }
            AbstractC1094n.a(interfaceC1078B2, (InterfaceC1193a) P5, new C1079C(z5, 14), AbstractC0874g.c(-1287705660, new J1.m(7, j02, c0873f), c0626q), c0626q, (i7 & 14) | 3072, 0);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new Q.L(interfaceC1078B, s3Var, interfaceC1942y, z5, x5, c0873f, i6, 4);
        }
    }

    public static final void f(s3 s3Var, T.X x5, C0873f c0873f, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(1873232064);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.g(true) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= (i6 & 64) == 0 ? c0626q.f(s3Var) : c0626q.h(s3Var) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.f(x5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q.g(false) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        int i8 = i6 & 24576;
        C1038o c1038o = C1038o.a;
        if (i8 == 0) {
            i7 |= c0626q.f(c1038o) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i7 |= c0626q.h(c0873f) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if (c0626q.S(i7 & 1, (74899 & i7) != 74898)) {
            Object P5 = c0626q.P();
            if (P5 == C0616l.a) {
                P5 = T.r.p(c0626q);
                c0626q.m0(P5);
            }
            InterfaceC1942y interfaceC1942y = (InterfaceC1942y) P5;
            InterfaceC1041r e6 = AbstractC2015c.e(AbstractC1249d.s(B0.Q.a(B0.Q.a(c1038o, s3Var, new D(s3Var, 0)), s3Var, new D(s3Var, 1)).c(new a0(new C0091s(h5.e.j0(R.string.tooltip_label, c0626q), interfaceC1942y, s3Var, 15))), new C0086p(19, interfaceC1942y, s3Var)), new C0069g0(7, s3Var, x5));
            F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, e6);
            InterfaceC0152h.a.getClass();
            InterfaceC1193a interfaceC1193a = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(interfaceC1193a);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d6, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            C0146e c0146e = C0150g.f1929g;
            if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode))) {
                B3.e.v(hashCode, c0626q, hashCode, c0146e);
            }
            T.r.G(c0626q, c6, C0150g.f1926d);
            c0873f.m(c0626q, Integer.valueOf((i7 >> 15) & 14));
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new e1(s3Var, x5, c0873f, i6);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(l4.InterfaceC1193a r4, l4.e r5, d4.c r6) {
        /*
            boolean r0 = r6 instanceof R.C0502g
            if (r0 == 0) goto L13
            r0 = r6
            R.g r0 = (R.C0502g) r0
            int r1 = r0.f6775h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6775h = r1
            goto L18
        L13:
            R.g r0 = new R.g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f6774g
            int r1 = r0.f6775h
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            X3.a.e(r6)     // Catch: R.C0500e -> L41
            goto L41
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            X3.a.e(r6)
            R.k r6 = new R.k     // Catch: R.C0500e -> L41
            r1 = 0
            r6.<init>(r4, r5, r1)     // Catch: R.C0500e -> L41
            r0.f6775h = r2     // Catch: R.C0500e -> L41
            java.lang.Object r4 = x4.AbstractC1888A.l(r6, r0)     // Catch: R.C0500e -> L41
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r4 != r5) goto L41
            return r5
        L41:
            X3.y r4 = X3.y.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: R.AbstractC0507l.g(l4.a, l4.e, d4.c):java.lang.Object");
    }

    public static final InterfaceC1041r h(InterfaceC1041r interfaceC1041r, C0513s c0513s, l4.e eVar) {
        return interfaceC1041r.c(new K(c0513s, eVar));
    }

    public static final Object i(F0.U u5) {
        Object H3 = u5.H();
        F0.A a6 = H3 instanceof F0.A ? (F0.A) H3 : null;
        if (a6 != null) {
            return a6.f1378r;
        }
        return null;
    }

    public static final String j(int i6, C0626q c0626q) {
        c0626q.j(AndroidCompositionLocals_androidKt.a);
        return ((Context) c0626q.j(AndroidCompositionLocals_androidKt.f10780b)).getResources().getString(i6);
    }

    public static final V k(int i6, int i7, C0626q c0626q) {
        boolean z5 = (i7 & 4) != 0;
        Object systemService = ((Context) c0626q.j(AndroidCompositionLocals_androidKt.f10780b)).getSystemService("accessibility");
        AbstractC1276k.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        Object obj = (AccessibilityManager) systemService;
        boolean z6 = ((((i6 & 896) ^ 384) > 256 && c0626q.g(z5)) || (i6 & 384) == 256) | ((((i6 & 14) ^ 6) > 4 && c0626q.g(true)) || (i6 & 6) == 4) | ((((i6 & 112) ^ 48) > 32 && c0626q.g(true)) || (i6 & 48) == 32);
        Object P5 = c0626q.P();
        Object obj2 = C0616l.a;
        if (z6 || P5 == obj2) {
            P5 = new V(true, true, z5);
            c0626q.m0(P5);
        }
        V v5 = (V) P5;
        InterfaceC0846u interfaceC0846u = (InterfaceC0846u) c0626q.j(D1.e.a);
        boolean f6 = c0626q.f(v5) | c0626q.h(obj);
        Object P6 = c0626q.P();
        if (f6 || P6 == obj2) {
            P6 = new C0086p(18, v5, obj);
            c0626q.m0(P6);
        }
        l4.c cVar = (l4.c) P6;
        boolean f7 = c0626q.f(v5) | c0626q.h(obj);
        Object P7 = c0626q.P();
        if (f7 || P7 == obj2) {
            P7 = new D.r(19, v5, obj);
            c0626q.m0(P7);
        }
        c(interfaceC0846u, cVar, (InterfaceC1193a) P7, c0626q, 0);
        return v5;
    }

    public static final int l(int i6, int i7) {
        if (i6 == Integer.MAX_VALUE) {
            return i6;
        }
        int i8 = i6 - i7;
        if (i8 < 0) {
            return 0;
        }
        return i8;
    }
}
