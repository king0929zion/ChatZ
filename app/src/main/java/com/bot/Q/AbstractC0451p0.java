package Q;

import F0.AbstractC0137z;
import H0.C0146e;
import H0.C0150g;
import H0.InterfaceC0152h;
import I0.AbstractC0204q0;
import P2.C0389z;
import R.AbstractC0507l;
import T.C0601d0;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import android.content.res.Configuration;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.C0873f;
import com.tencent.mmkv.R;
import e1.InterfaceC0961c;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import v.AbstractC1806l;
import z0.AbstractC2013a;
import z0.AbstractC2015c;

/* renamed from: Q.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0451p0 {
    public static final float a = 16;

    public static final void a(boolean z5, l4.c cVar, InterfaceC1041r interfaceC1041r, C0873f c0873f, C0626q c0626q, int i6) {
        C0873f c0873f2;
        InterfaceC1041r interfaceC1041r2;
        int i7;
        int i8;
        int i9;
        Object obj;
        v3 v3Var;
        T.X x5;
        boolean z6;
        boolean z7 = z5;
        l4.c cVar2 = cVar;
        c0626q.d0(1597265892);
        int i10 = i6 | (c0626q.g(z7) ? 4 : 2);
        if ((i6 & 48) == 0) {
            i10 |= c0626q.h(cVar2) ? 32 : 16;
        }
        int i11 = i10 | 384;
        if (c0626q.S(i11 & 1, (i11 & 1171) != 1170)) {
            Object obj2 = (Configuration) c0626q.j(AndroidCompositionLocals_androidKt.a);
            View view = (View) c0626q.j(AndroidCompositionLocals_androidKt.f10784f);
            boolean f6 = c0626q.f(obj2) | c0626q.f(view);
            Object P5 = c0626q.P();
            Object obj3 = C0616l.a;
            if (f6 || P5 == obj3) {
                P5 = new v3(view);
                c0626q.m0(P5);
            }
            v3 v3Var2 = (v3) P5;
            InterfaceC0961c interfaceC0961c = (InterfaceC0961c) c0626q.j(AbstractC0204q0.f2358h);
            int l02 = interfaceC0961c.l0(K0.a);
            Object P6 = c0626q.P();
            if (P6 == obj3) {
                P6 = T.r.A(null);
                c0626q.m0(P6);
            }
            T.X x6 = (T.X) P6;
            Object P7 = c0626q.P();
            if (P7 == obj3) {
                P7 = new C0601d0(0);
                c0626q.m0(P7);
            }
            C0601d0 c0601d0 = (C0601d0) P7;
            Object P8 = c0626q.P();
            if (P8 == obj3) {
                P8 = new C0601d0(0);
                c0626q.m0(P8);
            }
            C0601d0 c0601d02 = (C0601d0) P8;
            Object P9 = c0626q.P();
            if (P9 == obj3) {
                P9 = new m0.w();
                c0626q.m0(P9);
            }
            m0.w wVar = (m0.w) P9;
            I0.S0 s02 = (I0.S0) c0626q.j(AbstractC0204q0.f2366p);
            String j3 = AbstractC0507l.j(R.string.m3c_dropdown_menu_expanded, c0626q);
            String j4 = AbstractC0507l.j(R.string.m3c_dropdown_menu_collapsed, c0626q);
            String j5 = AbstractC0507l.j(R.string.m3c_dropdown_menu_toggle, c0626q);
            Object P10 = c0626q.P();
            if (P10 == obj3) {
                P10 = T.r.A(new Object());
                c0626q.m0(P10);
            }
            T.X x7 = (T.X) P10;
            Object P11 = c0626q.P();
            if (P11 == obj3) {
                P11 = T.r.A(Boolean.FALSE);
                c0626q.m0(P11);
            }
            T.X x8 = (T.X) P11;
            int i12 = i11 & 14;
            int i13 = i11 & 112;
            boolean f7 = (i12 == 4) | (i13 == 32) | c0626q.f(v3Var2) | c0626q.f(interfaceC0961c);
            Object P12 = c0626q.P();
            if (f7 || P12 == obj3) {
                i7 = i12;
                i8 = i13;
                i9 = l02;
                obj = obj3;
                v3Var = v3Var2;
                Object c0443n0 = new C0443n0(wVar, z7, x8, j3, j4, j5, s02, x7, cVar2, c0601d0, c0601d02);
                wVar = wVar;
                z7 = z7;
                cVar2 = cVar2;
                c0626q.m0(c0443n0);
                P12 = c0443n0;
            } else {
                v3Var = v3Var2;
                i7 = i12;
                i8 = i13;
                i9 = l02;
                obj = obj3;
            }
            C0443n0 c0443n02 = (C0443n0) P12;
            boolean h3 = c0626q.h(v3Var) | c0626q.d(i9);
            Object P13 = c0626q.P();
            if (h3 || P13 == obj) {
                P13 = new C0431k0(v3Var, i9, x6, c0601d0, c0601d02);
                x5 = x6;
                c0626q.m0(P13);
            } else {
                x5 = x6;
            }
            C1038o c1038o = C1038o.a;
            InterfaceC1041r m3 = AbstractC0137z.m(c1038o, (l4.c) P13);
            F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, m3);
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
            c0873f2 = c0873f;
            c0873f2.d(c0443n02, c0626q, 48);
            c0626q.p(true);
            if (z7) {
                c0626q.b0(209894723);
                boolean h6 = c0626q.h(v3Var) | c0626q.d(i9);
                Object P14 = c0626q.P();
                if (h6 || P14 == obj) {
                    P14 = new P2.Z(v3Var, i9, x5, c0601d02);
                    c0626q.m0(P14);
                }
                z6 = false;
                R1.j((InterfaceC1193a) P14, c0626q, 0);
                c0626q.p(false);
            } else {
                z6 = false;
                c0626q.b0(210228190);
                c0626q.p(false);
            }
            int i14 = i7;
            boolean z8 = i14 == 4 ? true : z6;
            Object P15 = c0626q.P();
            if (z8 || P15 == obj) {
                P15 = new B.h(z7, wVar, 3);
                c0626q.m0(P15);
            }
            T.r.j((InterfaceC1193a) P15, c0626q);
            boolean z9 = i8 == 32 ? true : z6;
            Object P16 = c0626q.P();
            if (z9 || P16 == obj) {
                P16 = new C0389z(cVar2, 2);
                c0626q.m0(P16);
            }
            AbstractC0507l.a(z7, (InterfaceC1193a) P16, c0626q, i14);
            interfaceC1041r2 = c1038o;
        } else {
            c0873f2 = c0873f;
            c0626q.V();
            interfaceC1041r2 = interfaceC1041r;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0435l0(z7, cVar2, interfaceC1041r2, c0873f2, i6);
        }
    }

    public static final boolean b(KeyEvent keyEvent) {
        long b5 = AbstractC2015c.b(keyEvent);
        int i6 = AbstractC2013a.f16191F;
        return AbstractC2013a.a(b5, AbstractC2013a.f16198h) || AbstractC2013a.a(b5, AbstractC2013a.f16208r) || AbstractC2013a.a(b5, AbstractC2013a.f16190E);
    }
}
