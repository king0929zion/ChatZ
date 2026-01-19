package p;

import F0.InterfaceC0121i;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import Z2.C0782v0;
import android.os.Build;
import android.view.KeyEvent;
import android.widget.EdgeEffect;
import com.vladsch.flexmark.parser.PegdownExtensions;
import e1.C0959a;
import e1.InterfaceC0961c;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1033j;
import h0.C1038o;
import h0.InterfaceC1028e;
import h0.InterfaceC1041r;
import i1.AbstractC1087g;
import l4.InterfaceC1193a;
import o0.C1381C;
import o0.C1395f;
import o4.AbstractC1410a;
import r.InterfaceC1619x0;
import r.InterfaceC1623y1;
import r.X0;
import t.C1682j;
import t0.AbstractC1688b;
import t0.C1687a;
import u.AbstractC1734b;
import v.AbstractC1787b;
import z.C2012j;
import z0.AbstractC2013a;
import z0.AbstractC2015c;

/* renamed from: p.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1464z {
    public static final void a(InterfaceC1041r interfaceC1041r, l4.c cVar, C0626q c0626q, int i6) {
        c0626q.d0(-932836462);
        int i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6 | (c0626q.h(cVar) ? 32 : 16);
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            AbstractC1787b.h(c0626q, l0.h.e(interfaceC1041r, cVar));
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new I.m(i6, 21, interfaceC1041r, cVar);
        }
    }

    public static final void b(final AbstractC1688b abstractC1688b, final String str, final InterfaceC1041r interfaceC1041r, InterfaceC1028e interfaceC1028e, final InterfaceC0121i interfaceC0121i, float f6, C0626q c0626q, final int i6, final int i7) {
        final InterfaceC1028e interfaceC1028e2;
        int i8;
        final float f7;
        int i9;
        c0626q.d0(1142754848);
        int i10 = ((i6 & 8) == 0 ? c0626q.f(abstractC1688b) : c0626q.h(abstractC1688b) ? 4 : 2) | i6;
        if ((i6 & 48) == 0) {
            i10 |= c0626q.f(str) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i10 |= c0626q.f(interfaceC1041r) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        int i11 = i7 & 8;
        if (i11 != 0) {
            i8 = i10 | 3072;
            interfaceC1028e2 = interfaceC1028e;
        } else {
            interfaceC1028e2 = interfaceC1028e;
            i8 = i10 | (c0626q.f(interfaceC1028e2) ? 2048 : PegdownExtensions.ANCHORLINKS);
        }
        int i12 = i7 & 32;
        if (i12 != 0) {
            i9 = i8 | PegdownExtensions.SUPPRESS_ALL_HTML;
            f7 = f6;
        } else {
            f7 = f6;
            i9 = i8 | (c0626q.c(f7) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS);
        }
        int i13 = i9 | ((i7 & 64) != 0 ? 1572864 : c0626q.f(null) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT);
        if (c0626q.S(i13 & 1, (599187 & i13) != 599186)) {
            InterfaceC1028e interfaceC1028e3 = i11 != 0 ? C1026c.f11790h : interfaceC1028e2;
            float f8 = i12 != 0 ? 1.0f : f7;
            InterfaceC1041r interfaceC1041r2 = C1038o.a;
            C0602e c0602e = C0616l.a;
            if (str != null) {
                c0626q.b0(1899222916);
                boolean z5 = (i13 & 112) == 32;
                Object P5 = c0626q.P();
                if (z5 || P5 == c0602e) {
                    P5 = new M2.b(str, 9);
                    c0626q.m0(P5);
                }
                interfaceC1041r2 = P0.n.a(interfaceC1041r2, false, (l4.c) P5);
                c0626q.p(false);
            } else {
                c0626q.b0(1899381698);
                c0626q.p(false);
            }
            InterfaceC1041r h3 = l0.h.h(l0.h.d(interfaceC1041r.c(interfaceC1041r2)), abstractC1688b, interfaceC1028e3, interfaceC0121i, f8, null, 2);
            Object P6 = c0626q.P();
            if (P6 == c0602e) {
                P6 = C1448n0.a;
                c0626q.m0(P6);
            }
            F0.V v5 = (F0.V) P6;
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, h3);
            InterfaceC0617l0 l3 = c0626q.l();
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
            T.r.C(c0626q, C0150g.f1930h);
            T.r.G(c0626q, c6, C0150g.f1926d);
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            c0626q.p(true);
            f7 = f8;
            interfaceC1028e2 = interfaceC1028e3;
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e() { // from class: p.m0
                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC1464z.b(AbstractC1688b.this, str, interfaceC1041r, interfaceC1028e2, interfaceC0121i, f7, (C0626q) obj, T.r.J(i6 | 1), i7);
                    return X3.y.a;
                }
            };
        }
    }

    public static final void c(C1395f c1395f, String str, InterfaceC1041r interfaceC1041r, InterfaceC0121i interfaceC0121i, C0626q c0626q, int i6) {
        C1033j c1033j = C1026c.f11790h;
        boolean f6 = c0626q.f(c1395f);
        Object P5 = c0626q.P();
        if (f6 || P5 == C0616l.a) {
            P5 = AbstractC1087g.a(c1395f, 1);
            c0626q.m0(P5);
        }
        b((C1687a) P5, str, interfaceC1041r, c1033j, interfaceC0121i, 1.0f, c0626q, (i6 & 112) | 8 | (i6 & 896) | 24576, 0);
    }

    public static float d(EdgeEffect edgeEffect, float f6, float f7, InterfaceC0961c interfaceC0961c) {
        float f8 = W.a;
        double a = interfaceC0961c.a() * 386.0878f * 160.0f * 0.84f;
        double d6 = W.a * a;
        float exp = (float) (Math.exp((W.f13656b / W.f13657c) * Math.log((Math.abs(f6) * 0.35f) / d6)) * d6);
        int i6 = Build.VERSION.SDK_INT;
        if (exp > (i6 >= 31 ? AbstractC1462x.b(edgeEffect) : 0.0f) * f7) {
            return S.l.f7374V;
        }
        int K2 = AbstractC1410a.K(f6);
        if (i6 >= 31) {
            edgeEffect.onAbsorb(K2);
            return f6;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(K2);
        }
        return f6;
    }

    public static InterfaceC1041r e(InterfaceC1041r interfaceC1041r, C1381C c1381c) {
        return interfaceC1041r.c(new C1463y(0L, c1381c, o0.y.f13496b, 1));
    }

    public static final InterfaceC1041r f(InterfaceC1041r interfaceC1041r, long j3, o0.L l3) {
        return interfaceC1041r.c(new C1463y(j3, null, l3, 2));
    }

    public static final void h(long j3, X0 x02) {
        if (x02 == X0.f14183c) {
            if (C0959a.g(j3) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC1734b.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (C0959a.h(j3) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC1734b.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final InterfaceC1041r i(InterfaceC1041r interfaceC1041r, C1682j c1682j, InterfaceC1455r0 interfaceC1455r0, boolean z5, P0.i iVar, InterfaceC1193a interfaceC1193a) {
        InterfaceC1041r c6;
        if (interfaceC1455r0 != null) {
            c6 = new C1418H(c1682j, interfaceC1455r0, false, z5, null, iVar, interfaceC1193a);
        } else if (interfaceC1455r0 == null) {
            c6 = new C1418H(c1682j, null, false, z5, null, iVar, interfaceC1193a);
        } else {
            C1038o c1038o = C1038o.a;
            c6 = c1682j != null ? AbstractC1450o0.a(c1038o, c1682j, interfaceC1455r0).c(new C1418H(c1682j, null, false, z5, null, iVar, interfaceC1193a)) : AbstractC1024a.a(c1038o, new C1419I(interfaceC1455r0, z5, iVar, interfaceC1193a));
        }
        return interfaceC1041r.c(c6);
    }

    public static /* synthetic */ InterfaceC1041r j(InterfaceC1041r interfaceC1041r, C1682j c1682j, InterfaceC1455r0 interfaceC1455r0, boolean z5, P0.i iVar, InterfaceC1193a interfaceC1193a, int i6) {
        if ((i6 & 4) != 0) {
            z5 = true;
        }
        boolean z6 = z5;
        if ((i6 & 16) != 0) {
            iVar = null;
        }
        return i(interfaceC1041r, c1682j, interfaceC1455r0, z6, iVar, interfaceC1193a);
    }

    public static InterfaceC1041r k(InterfaceC1041r interfaceC1041r, boolean z5, String str, InterfaceC1193a interfaceC1193a, int i6) {
        if ((i6 & 1) != 0) {
            z5 = true;
        }
        boolean z6 = z5;
        if ((i6 & 2) != 0) {
            str = null;
        }
        return interfaceC1041r.c(new C1418H(null, null, true, z6, str, null, interfaceC1193a));
    }

    public static InterfaceC1041r l(InterfaceC1041r interfaceC1041r, C1682j c1682j, InterfaceC1193a interfaceC1193a) {
        return interfaceC1041r.c(new M(interfaceC1193a, null, c1682j, false, true));
    }

    public static InterfaceC1041r m(InterfaceC1041r interfaceC1041r, boolean z5, InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, int i6) {
        return interfaceC1041r.c(new M(interfaceC1193a2, interfaceC1193a, null, true, (i6 & 1) != 0 ? true : z5));
    }

    public static final InterfaceC1041r n(InterfaceC1041r interfaceC1041r, boolean z5, C1682j c1682j) {
        return interfaceC1041r.c(z5 ? new Y(c1682j) : C1038o.a);
    }

    public static InterfaceC1041r o(InterfaceC1041r interfaceC1041r, C1682j c1682j) {
        return interfaceC1041r.c(new C1434g0(c1682j));
    }

    public static final boolean p(KeyEvent keyEvent) {
        long b5 = AbstractC2015c.b(keyEvent);
        int i6 = AbstractC2013a.f16191F;
        return AbstractC2013a.a(b5, AbstractC2013a.f16198h) || AbstractC2013a.a(b5, AbstractC2013a.f16208r) || AbstractC2013a.a(b5, AbstractC2013a.f16190E) || AbstractC2013a.a(b5, AbstractC2013a.f16207q);
    }

    public static final P0 q(C0626q c0626q) {
        Object[] objArr = new Object[0];
        boolean d6 = c0626q.d(0);
        Object P5 = c0626q.P();
        if (d6 || P5 == C0616l.a) {
            P5 = new C0782v0(21);
            c0626q.m0(P5);
        }
        return (P0) e0.l.c(objArr, P0.f13614j, (InterfaceC1193a) P5, c0626q, 0);
    }

    public static InterfaceC1041r r(InterfaceC1041r interfaceC1041r, P0 p02, boolean z5) {
        X0 x02 = X0.f14183c;
        X0 x03 = z5 ? x02 : X0.f14184e;
        C1682j c1682j = p02.f13617d;
        float f6 = L.a;
        C1038o c1038o = C1038o.a;
        return interfaceC1041r.c(x03 == x02 ? l0.h.c(c1038o, C1432f0.f13708c) : l0.h.c(c1038o, C1432f0.f13707b)).c(new Q0(null, null, null, x03, p02, c1682j, true, true)).c(new S0(p02, z5));
    }

    public static final InterfaceC1041r s(InterfaceC1041r interfaceC1041r, InterfaceC1623y1 interfaceC1623y1, X0 x02, C1459u c1459u, boolean z5, InterfaceC1619x0 interfaceC1619x0, C1682j c1682j, C2012j c2012j) {
        float f6 = L.a;
        X0 x03 = X0.f14183c;
        C1038o c1038o = C1038o.a;
        return interfaceC1041r.c(x02 == x03 ? l0.h.c(c1038o, C1432f0.f13708c) : l0.h.c(c1038o, C1432f0.f13707b)).c(new Q0(c1459u, c2012j, interfaceC1619x0, x02, interfaceC1623y1, c1682j, z5, false));
    }

    public static final long t(float f6, long j3) {
        float max = Math.max(S.l.f7374V, Float.intBitsToFloat((int) (j3 >> 32)) - f6);
        float max2 = Math.max(S.l.f7374V, Float.intBitsToFloat((int) (j3 & 4294967295L)) - f6);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public static InterfaceC1041r u(InterfaceC1041r interfaceC1041r, P0 p02) {
        return r(interfaceC1041r, p02, true);
    }
}
