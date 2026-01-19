package I;

import D.C;
import D.L;
import F0.V;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import T.C0602e;
import T.C0607g0;
import T.C0616l;
import T.C0625p0;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import T.X;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.AbstractC0874g;
import b0.C0873f;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.InterfaceC1041r;
import i1.C1079C;
import l4.InterfaceC1193a;
import v.AbstractC1806l;

/* loaded from: classes.dex */
public abstract class k {
    public static final C0873f a = new C0873f(new E.a(1), false, 636288403);

    /* renamed from: b, reason: collision with root package name */
    public static final C0873f f2099b = new C0873f(new E.a(2), false, -1357803046);

    public static final void a(InterfaceC1041r interfaceC1041r, C0873f c0873f, C0626q c0626q, int i6) {
        int i7;
        InterfaceC1041r interfaceC1041r2;
        C0873f c0873f2;
        c0626q.d0(790527681);
        int i8 = 4;
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(c0873f) ? 32 : 16;
        }
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (P5 == c0602e) {
                C0607g0 c0607g0 = new C0607g0(null, C0602e.f8080g);
                c0626q.m0(c0607g0);
                P5 = c0607g0;
            }
            X x5 = (X) P5;
            Object P6 = c0626q.P();
            if (P6 == c0602e) {
                P6 = new C(x5, 3);
                c0626q.m0(P6);
            }
            InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P6;
            C1079C c1079c = p.a;
            K.c n3 = Y4.l.n(f2099b, c0626q, 6);
            interfaceC1041r2 = interfaceC1041r;
            c0873f2 = c0873f;
            T.r.b(new C0625p0[]{K.g.f2920b.a(e(interfaceC1193a, c0626q, 2)), K.g.a.a(n3)}, AbstractC0874g.c(1070596993, new s(interfaceC1041r2, x5, c0873f2, n3, interfaceC1193a), c0626q), c0626q, 56);
        } else {
            interfaceC1041r2 = interfaceC1041r;
            c0873f2 = c0873f;
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new j(interfaceC1041r2, c0873f2, i6, i8);
        }
    }

    public static final void b(InterfaceC1041r interfaceC1041r, C0873f c0873f, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(155925518);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(c0873f) ? 32 : 16;
        }
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            boolean z5 = c0626q.j(K.g.a) != null;
            boolean z6 = c0626q.j(K.g.f2920b) != null;
            if (z5 && z6) {
                c0626q.b0(-1977187922);
                V d6 = AbstractC1806l.d(C1026c.f11786c, true);
                int hashCode = Long.hashCode(c0626q.f8164T);
                InterfaceC0617l0 l3 = c0626q.l();
                InterfaceC1041r c6 = AbstractC1024a.c(c0626q, interfaceC1041r);
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
                c0873f.m(c0626q, Integer.valueOf((i7 >> 3) & 14));
                c0626q.p(true);
                c0626q.p(false);
            } else if (z5) {
                c0626q.b0(-1976997706);
                c(interfaceC1041r, c0873f, c0626q, i7 & 126);
                c0626q.p(false);
            } else if (z6) {
                c0626q.b0(-1976846922);
                p.d(interfaceC1041r, c0873f, c0626q, i7 & 126);
                c0626q.p(false);
            } else {
                c0626q.b0(-1976716505);
                a(interfaceC1041r, c0873f, c0626q, i7 & 126);
                c0626q.p(false);
            }
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new j(interfaceC1041r, c0873f, i6, 3);
        }
    }

    public static final void c(InterfaceC1041r interfaceC1041r, C0873f c0873f, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(2064964257);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(c0873f) ? 32 : 16;
        }
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            d(interfaceC1041r, c0873f, c0626q, ((i7 << 3) & 896) | (i7 & 14) | 48);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new j(interfaceC1041r, c0873f, i6, 0);
        }
    }

    public static final void d(InterfaceC1041r interfaceC1041r, C0873f c0873f, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(771959668);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(null) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.h(c0873f) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (P5 == c0602e) {
                C0607g0 c0607g0 = new C0607g0(null, C0602e.f8080g);
                c0626q.m0(c0607g0);
                P5 = c0607g0;
            }
            X x5 = (X) P5;
            Object P6 = c0626q.P();
            if (P6 == c0602e) {
                P6 = new C(x5, 2);
                c0626q.m0(P6);
            }
            T.r.a(K.g.f2920b.a(e((InterfaceC1193a) P6, c0626q, 0)), AbstractC0874g.c(-291176396, new L(interfaceC1041r, x5, c0873f, 1), c0626q), c0626q, 56);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new j(interfaceC1041r, c0873f, i6, 1);
        }
    }

    public static final i e(InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        View view = (View) c0626q.j(AndroidCompositionLocals_androidKt.f10784f);
        boolean f6 = c0626q.f(view);
        Object P5 = c0626q.P();
        Object obj = C0616l.a;
        if (f6 || P5 == obj) {
            P5 = new i(view, null, interfaceC1193a);
            c0626q.m0(P5);
        }
        i iVar = (i) P5;
        boolean h3 = c0626q.h(iVar);
        Object P6 = c0626q.P();
        if (h3 || P6 == obj) {
            P6 = new a(iVar, 3);
            c0626q.m0(P6);
        }
        T.r.d(iVar, (l4.c) P6, c0626q);
        return iVar;
    }
}
