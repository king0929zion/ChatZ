package O;

import B0.C0040p;
import D.AbstractC0090r0;
import D.C0067f0;
import D.C0086p;
import D.C0098v0;
import D.C0103y;
import D.b1;
import D.d1;
import D.e1;
import F0.AbstractC0137z;
import F0.InterfaceC0134w;
import H0.AbstractC0157l;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import I0.AbstractC0204q0;
import I0.InterfaceC0194l0;
import I0.X0;
import S0.C0554p;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b0.AbstractC0874g;
import b0.C0873f;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1024a;
import h0.C1030g;
import h0.C1038o;
import h0.InterfaceC1028e;
import h0.InterfaceC1041r;
import i1.AbstractC1094n;
import i1.C1079C;
import i1.EnumC1080D;
import i4.AbstractC1117a;
import l4.InterfaceC1193a;
import m0.AbstractC1249d;
import m4.AbstractC1276k;
import n0.C1353b;
import n0.C1354c;
import o0.C1391b;
import o0.C1395f;
import p.AbstractC1464z;
import q0.C1496b;
import r.AbstractC1573i;
import v.AbstractC1787b;
import w0.InterfaceC1830a;
import x4.InterfaceC1942y;
import z0.AbstractC2015c;

/* renamed from: O.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0336u0 {
    public static final C1354c a = new C1354c(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    public static C1395f f4226b;

    /* renamed from: c, reason: collision with root package name */
    public static C1391b f4227c;

    /* renamed from: d, reason: collision with root package name */
    public static C1496b f4228d;

    public static final C1354c A(InterfaceC0134w interfaceC0134w) {
        C1354c f6 = AbstractC0137z.f(interfaceC0134w, true);
        long z5 = interfaceC0134w.z(f6.e());
        float f7 = f6.f13296c;
        float f8 = f6.f13297d;
        long z6 = interfaceC0134w.z((Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L));
        return new C1354c(Float.intBitsToFloat((int) (z5 >> 32)), Float.intBitsToFloat((int) (z5 & 4294967295L)), Float.intBitsToFloat((int) (z6 >> 32)), Float.intBitsToFloat((int) (z6 & 4294967295L)));
    }

    public static final void a(InterfaceC0331s interfaceC0331s, InterfaceC1028e interfaceC1028e, C0873f c0873f, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(-1090171650);
        if ((i6 & 6) == 0) {
            i7 = ((i6 & 8) == 0 ? c0626q.f(interfaceC0331s) : c0626q.h(interfaceC0331s) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.f(interfaceC1028e) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.h(c0873f) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        boolean z5 = true;
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            boolean z6 = (i7 & 112) == 32;
            if ((i7 & 14) != 4 && ((i7 & 8) == 0 || !c0626q.f(interfaceC0331s))) {
                z5 = false;
            }
            boolean z7 = z6 | z5;
            Object P5 = c0626q.P();
            if (z7 || P5 == C0616l.a) {
                P5 = new C0324o(interfaceC1028e, interfaceC0331s);
                c0626q.m0(P5);
            }
            AbstractC1094n.a((C0324o) P5, null, new C1079C(false, EnumC1080D.f11959c, false), c0873f, c0626q, ((i7 << 3) & 7168) | 384, 2);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new e1(interfaceC0331s, interfaceC1028e, c0873f, i6, 3);
        }
    }

    public static final void b(InterfaceC1041r interfaceC1041r, G g3, l4.c cVar, C0873f c0873f, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(-917932944);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        int i8 = i7 | (c0626q.f(g3) ? 32 : 16);
        if ((i6 & 3072) == 0) {
            i8 |= c0626q.h(c0873f) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if (c0626q.S(i8 & 1, (i8 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object P5 = c0626q.P();
            Object obj = C0616l.a;
            if (P5 == obj) {
                P5 = new A(1);
                c0626q.m0(P5);
            }
            z0 z0Var = (z0) e0.l.c(objArr, z0.f4263l, (InterfaceC1193a) P5, c0626q, 384);
            Object P6 = c0626q.P();
            if (P6 == obj) {
                P6 = new C0332s0(z0Var);
                c0626q.m0(P6);
            }
            C0332s0 c0332s0 = (C0332s0) P6;
            Object obj2 = (InterfaceC0194l0) c0626q.j(AbstractC0204q0.f2356f);
            Object P7 = c0626q.P();
            if (P7 == obj) {
                P7 = T.r.p(c0626q);
                c0626q.m0(P7);
            }
            InterfaceC1942y interfaceC1942y = (InterfaceC1942y) P7;
            c0332s0.f4194e = (InterfaceC1830a) c0626q.j(AbstractC0204q0.f2362l);
            boolean f6 = c0626q.f(interfaceC1942y) | c0626q.f(obj2);
            Object P8 = c0626q.P();
            if (f6 || P8 == obj) {
                P8 = new C0086p(10, interfaceC1942y, obj2);
                c0626q.m0(P8);
            }
            c0332s0.f4195f = (l4.c) P8;
            c0332s0.f4193d = new C0086p(11, c0332s0, cVar);
            c0332s0.l(g3);
            c0626q.b0(-82280708);
            c0332s0.f4212w = C.b(E.f3931e, null, c0626q, 54);
            c0332s0.f4211v = interfaceC1942y;
            c0626q.p(false);
            c0332s0.h();
            C0067f0 c0067f0 = new C0067f0(1, c0332s0, new L(c0332s0, 2));
            InterfaceC1041r interfaceC1041r2 = C1038o.a;
            InterfaceC1041r d6 = AbstractC2015c.d(B0.Q.a(AbstractC1464z.n(AbstractC1249d.s(AbstractC1249d.j(AbstractC0137z.m(B0.Q.a(interfaceC1041r2, X3.y.a, c0067f0), new O(c0332s0, 4)), c0332s0.f4197h), new O(c0332s0, 5)), true, null), 8675309, new C0299b0(new O(c0332s0, 6), 0)), new B0.M(c0332s0, 2));
            if (c0332s0.e() != null && c0332s0.g()) {
                G f7 = c0332s0.f();
                if (!(f7 != null ? AbstractC1276k.b(f7.a, f7.f3945b) : true) && p.w0.a()) {
                    interfaceC1041r2 = AbstractC1024a.a(interfaceC1041r2, new b1(c0332s0, 5));
                }
            }
            f(interfaceC1041r.c(J.i.a(d6.c(interfaceC1041r2), new B4.D(c0332s0, 10))), AbstractC0874g.c(-1799563674, new N(c0332s0, z0Var, c0873f), c0626q), c0626q, 48);
            boolean h3 = c0626q.h(c0332s0);
            Object P9 = c0626q.P();
            if (h3 || P9 == obj) {
                P9 = new O(c0332s0, 0);
                c0626q.m0(P9);
            }
            T.r.d(c0332s0, (l4.c) P9, c0626q);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new P(interfaceC1041r, g3, cVar, c0873f, i6, 0);
        }
    }

    public static final void c(InterfaceC1041r interfaceC1041r, C0873f c0873f, C0626q c0626q, int i6) {
        C0873f c0873f2;
        C0626q c0626q2;
        c0626q.d0(1949207773);
        int i7 = i6 | 6;
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (P5 == c0602e) {
                P5 = T.r.A(null);
                c0626q.m0(P5);
            }
            T.X x5 = (T.X) P5;
            G g3 = (G) x5.getValue();
            Object P6 = c0626q.P();
            if (P6 == c0602e) {
                P6 = new C0103y(x5, 6);
                c0626q.m0(P6);
            }
            C1038o c1038o = C1038o.a;
            c0873f2 = c0873f;
            c0626q2 = c0626q;
            b(c1038o, g3, (l4.c) P6, c0873f2, c0626q2, 3462);
            interfaceC1041r = c1038o;
        } else {
            c0873f2 = c0873f;
            c0626q2 = c0626q;
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new M(interfaceC1041r, c0873f2, i6, 0);
        }
    }

    public static final void d(final InterfaceC0331s interfaceC0331s, final boolean z5, final d1.j jVar, final boolean z6, long j3, final float f6, final InterfaceC1041r interfaceC1041r, C0626q c0626q, final int i6) {
        int i7;
        long j4;
        int i8;
        long j5;
        boolean z7;
        c0626q.d0(-466280168);
        if ((i6 & 6) == 0) {
            i7 = ((i6 & 8) == 0 ? c0626q.f(interfaceC0331s) : c0626q.h(interfaceC0331s) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.g(z5) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.d(jVar.ordinal()) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q.g(z6) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= 8192;
        }
        if ((1572864 & i6) == 0) {
            i7 |= c0626q.f(interfaceC1041r) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT;
        }
        if (c0626q.S(i7 & 1, (533651 & i7) != 533650)) {
            c0626q.X();
            if ((i6 & 1) == 0 || c0626q.B()) {
                i8 = i7 & (-57345);
                j5 = 9205357640488583168L;
            } else {
                c0626q.V();
                i8 = i7 & (-57345);
                j5 = j3;
            }
            c0626q.q();
            d1.j jVar2 = d1.j.f11391e;
            d1.j jVar3 = d1.j.f11390c;
            if (z5) {
                float f7 = AbstractC0305e0.a;
                z7 = (jVar == jVar3 && !z6) || (jVar == jVar2 && z6);
            } else {
                float f8 = AbstractC0305e0.a;
                z7 = !((jVar == jVar3 && !z6) || (jVar == jVar2 && z6));
            }
            C1030g c1030g = z7 ? AbstractC1024a.f11783b : AbstractC1024a.a;
            int i9 = i8 & 14;
            boolean g3 = (i9 == 4 || ((i8 & 8) != 0 && c0626q.h(interfaceC0331s))) | ((i8 & 112) == 32) | c0626q.g(z7);
            Object P5 = c0626q.P();
            if (g3 || P5 == C0616l.a) {
                P5 = new C0298b(interfaceC0331s, z5, z7);
                c0626q.m0(P5);
            }
            long j6 = j5;
            C1030g c1030g2 = c1030g;
            j4 = j6;
            a(interfaceC0331s, c1030g2, AbstractC0874g.c(1365123137, new C0300c((X0) c0626q.j(AbstractC0204q0.f2369s), j4, z7, P0.n.a(interfaceC1041r, false, (l4.c) P5), interfaceC0331s), c0626q), c0626q, i9 | 384);
        } else {
            c0626q.V();
            j4 = j3;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            final long j7 = j4;
            t5.f8193d = new l4.e() { // from class: O.d
                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC0336u0.d(InterfaceC0331s.this, z5, jVar, z6, j7, f6, interfaceC1041r, (C0626q) obj, T.r.J(i6 | 1));
                    return X3.y.a;
                }
            };
        }
    }

    public static final void e(InterfaceC1041r interfaceC1041r, InterfaceC1193a interfaceC1193a, boolean z5, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(2111672474);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        int i8 = i7 | (c0626q.h(interfaceC1193a) ? 32 : 16) | (c0626q.g(z5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q.S(i8 & 1, (i8 & 147) != 146)) {
            AbstractC1787b.h(c0626q, AbstractC1024a.a(v.t0.k(interfaceC1041r, AbstractC0305e0.a, AbstractC0305e0.f4105b), new C0310h(interfaceC1193a, z5, 0)));
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0308g(i6, interfaceC1041r, interfaceC1193a, z5);
        }
    }

    public static final void f(InterfaceC1041r interfaceC1041r, C0873f c0873f, C0626q c0626q, int i6) {
        c0626q.d0(-1854833411);
        int i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            Object P5 = c0626q.P();
            if (P5 == C0616l.a) {
                P5 = B0.a;
                c0626q.m0(P5);
            }
            F0.V v5 = (F0.V) P5;
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
            T.r.G(c0626q, v5, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q, C0150g.f1930h);
            T.r.G(c0626q, c6, C0150g.f1926d);
            c0873f.m(c0626q, 6);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new M(interfaceC1041r, c0873f, i6, 1);
        }
    }

    public static final void g(boolean z5, d1.j jVar, N0 n02, C0626q c0626q, int i6) {
        int i7;
        d1 d6;
        c0626q.d0(-1344558920);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.g(z5) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.d(jVar.ordinal()) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.h(n02) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            int i8 = i7 & 14;
            boolean f6 = (i8 == 4) | c0626q.f(n02);
            Object P5 = c0626q.P();
            Object obj = C0616l.a;
            if (f6 || P5 == obj) {
                P5 = new C0327p0(n02, z5);
                c0626q.m0(P5);
            }
            D.H0 h02 = (D.H0) P5;
            boolean h3 = c0626q.h(n02) | (i8 == 4);
            Object P6 = c0626q.P();
            if (h3 || P6 == obj) {
                P6 = new O0(n02, z5);
                c0626q.m0(P6);
            }
            InterfaceC0331s interfaceC0331s = (InterfaceC0331s) P6;
            boolean g3 = S0.O.g(n02.n().f9125b);
            int i9 = (int) (z5 ? n02.n().f9125b >> 32 : n02.n().f9125b & 4294967295L);
            C0098v0 c0098v0 = n02.f3995d;
            float x5 = (c0098v0 == null || (d6 = c0098v0.d()) == null) ? S.l.f7374V : AbstractC0090r0.x(d6.a, i9);
            boolean h6 = c0626q.h(h02);
            Object P7 = c0626q.P();
            if (h6 || P7 == obj) {
                P7 = new S(h02, 1);
                c0626q.m0(P7);
            }
            d(interfaceC0331s, z5, jVar, g3, 0L, x5, B0.Q.a(C1038o.a, h02, (PointerInputEventHandler) P7), c0626q, (i7 << 3) & 1008);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0308g(z5, jVar, n02, i6);
        }
    }

    public static final G h(InterfaceC0307f0 interfaceC0307f0, InterfaceC0314j interfaceC0314j) {
        boolean z5 = interfaceC0307f0.h() == EnumC0318l.f4145c;
        return new G(l(interfaceC0307f0.k(), z5, true, interfaceC0307f0.l(), interfaceC0314j), l(interfaceC0307f0.g(), z5, false, interfaceC0307f0.f(), interfaceC0314j), z5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(B0.V r6, d4.a r7) {
        /*
            boolean r0 = r7 instanceof O.U
            if (r0 == 0) goto L13
            r0 = r7
            O.U r0 = (O.U) r0
            int r1 = r0.f4040i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4040i = r1
            goto L18
        L13:
            O.U r0 = new O.U
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4039h
            int r1 = r0.f4040i
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            B0.V r6 = r0.f4038g
            X3.a.e(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            X3.a.e(r7)
        L32:
            r0.f4038g = r6
            r0.f4040i = r2
            B0.q r7 = B0.EnumC0041q.f476e
            java.lang.Object r7 = r6.b(r7, r0)
            c4.a r1 = c4.EnumC0927a.f11114c
            if (r7 != r1) goto L41
            return r1
        L41:
            B0.p r7 = (B0.C0040p) r7
            java.lang.Object r1 = r7.a
            int r3 = r1.size()
            r4 = 0
        L4a:
            if (r4 >= r3) goto L5c
            java.lang.Object r5 = r1.get(r4)
            B0.y r5 = (B0.y) r5
            boolean r5 = B0.AbstractC0047x.a(r5)
            if (r5 != 0) goto L59
            goto L32
        L59:
            int r4 = r4 + 1
            goto L4a
        L5c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: O.AbstractC0336u0.i(B0.V, d4.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c4, code lost:
    
        if (r15 == r6) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097 A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:12:0x002d, B:13:0x00c7, B:15:0x00cf, B:17:0x00dc, B:19:0x00e8, B:21:0x00eb, B:24:0x00ee, B:27:0x00f2, B:35:0x0093, B:37:0x0097, B:38:0x0099, B:40:0x009d, B:42:0x00a1, B:44:0x00a5, B:46:0x00a9, B:48:0x00ad, B:49:0x00b2, B:58:0x0053, B:60:0x0061, B:61:0x0066, B:64:0x0064), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:12:0x002d, B:13:0x00c7, B:15:0x00cf, B:17:0x00dc, B:19:0x00e8, B:21:0x00eb, B:24:0x00ee, B:27:0x00f2, B:35:0x0093, B:37:0x0097, B:38:0x0099, B:40:0x009d, B:42:0x00a1, B:44:0x00a5, B:46:0x00a9, B:48:0x00ad, B:49:0x00b2, B:58:0x0053, B:60:0x0061, B:61:0x0066, B:64:0x0064), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1 A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:12:0x002d, B:13:0x00c7, B:15:0x00cf, B:17:0x00dc, B:19:0x00e8, B:21:0x00eb, B:24:0x00ee, B:27:0x00f2, B:35:0x0093, B:37:0x0097, B:38:0x0099, B:40:0x009d, B:42:0x00a1, B:44:0x00a5, B:46:0x00a9, B:48:0x00ad, B:49:0x00b2, B:58:0x0053, B:60:0x0061, B:61:0x0066, B:64:0x0064), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, m4.v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(B0.V r11, D.H0 r12, B0.C0040p r13, int r14, d4.a r15) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.AbstractC0336u0.j(B0.V, D.H0, B0.p, int, d4.a):java.lang.Object");
    }

    public static final F k(final InterfaceC0307f0 interfaceC0307f0, final D d6, F f6) {
        final int i6 = interfaceC0307f0.a() ? d6.f3924c : d6.f3925d;
        int l3 = interfaceC0307f0.a() ? interfaceC0307f0.l() : interfaceC0307f0.f();
        int i7 = d6.f3923b;
        S0.L l5 = d6.f3927f;
        int i8 = d6.f3926e;
        if (l3 != i7) {
            return d6.a(i6);
        }
        J j3 = new J(d6, i6);
        X3.g gVar = X3.g.f9391e;
        final X3.f c6 = X3.a.c(gVar, j3);
        final int i9 = interfaceC0307f0.a() ? d6.f3925d : d6.f3924c;
        X3.f c7 = X3.a.c(gVar, new InterfaceC1193a() { // from class: O.K
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X3.f] */
            @Override // l4.InterfaceC1193a
            public final Object b() {
                int intValue = ((Number) c6.getValue()).intValue();
                InterfaceC0307f0 interfaceC0307f02 = interfaceC0307f0;
                boolean a6 = interfaceC0307f02.a();
                boolean z5 = interfaceC0307f02.h() == EnumC0318l.f4145c;
                D d7 = D.this;
                S0.L l6 = d7.f3927f;
                int i10 = i6;
                long l7 = l6.l(i10);
                S0.L l8 = d7.f3927f;
                C0554p c0554p = l8.f7599b;
                int i11 = S0.O.f7611c;
                int i12 = (int) (l7 >> 32);
                int d8 = c0554p.d(i12);
                int i13 = c0554p.f7652f;
                if (d8 != intValue) {
                    i12 = intValue >= i13 ? l8.i(i13 - 1) : l8.i(intValue);
                }
                int i14 = (int) (l7 & 4294967295L);
                if (c0554p.d(i14) != intValue) {
                    i14 = intValue >= i13 ? c0554p.c(i13 - 1, false) : c0554p.c(intValue, false);
                }
                int i15 = i9;
                if (i12 == i15) {
                    return d7.a(i14);
                }
                if (i14 == i15) {
                    return d7.a(i12);
                }
                if (!(a6 ^ z5) ? i10 >= i12 : i10 > i14) {
                    i12 = i14;
                }
                return d7.a(i12);
            }
        });
        if (d6.a != f6.f3942c) {
            return (F) c7.getValue();
        }
        if (i6 == i8) {
            return f6;
        }
        if (((Number) c6.getValue()).intValue() != l5.f7599b.d(i8)) {
            return (F) c7.getValue();
        }
        int i10 = f6.f3941b;
        long l6 = l5.l(i10);
        boolean a6 = interfaceC0307f0.a();
        if (i8 != -1) {
            if (i6 != i8) {
                if (!(a6 ^ (d6.b() == EnumC0318l.f4145c))) {
                }
            }
            return d6.a(i6);
        }
        int i11 = S0.O.f7611c;
        return (i10 == ((int) (l6 >> 32)) || i10 == ((int) (l6 & 4294967295L))) ? (F) c7.getValue() : d6.a(i6);
    }

    public static final F l(D d6, boolean z5, boolean z6, int i6, InterfaceC0314j interfaceC0314j) {
        long j3;
        int i7 = z6 ? d6.f3924c : d6.f3925d;
        if (i6 != d6.f3923b) {
            return d6.a(i7);
        }
        long a6 = interfaceC0314j.a(d6, i7);
        if (z5 ^ z6) {
            int i8 = S0.O.f7611c;
            j3 = a6 >> 32;
        } else {
            int i9 = S0.O.f7611c;
            j3 = 4294967295L & a6;
        }
        return d6.a((int) j3);
    }

    public static final EnumC0320m m(EnumC0320m enumC0320m, EnumC0320m enumC0320m2, C0309g0 c0309g0, long j3, F f6) {
        if (f6 == null) {
            return y(enumC0320m, enumC0320m2);
        }
        int compare = c0309g0.f4118f.compare(Long.valueOf(f6.f3942c), Long.valueOf(j3));
        return compare < 0 ? EnumC0320m.f4151c : compare > 0 ? EnumC0320m.f4153f : EnumC0320m.f4152e;
    }

    public static final Object n(B0.D d6, InterfaceC0326p interfaceC0326p, D.H0 h02, InterfaceC0905c interfaceC0905c) {
        B0.X x5 = (B0.X) d6;
        x5.getClass();
        Object h3 = AbstractC1573i.h(d6, new V(new C0316k(AbstractC0157l.v(x5).f1716E), interfaceC0326p, h02, null), interfaceC0905c);
        return h3 == EnumC0927a.f11114c ? h3 : X3.y.a;
    }

    public static final F o(F f6, D d6, int i6) {
        return new F(d6.f3927f.a(i6), i6, f6.f3942c);
    }

    public static final boolean p(C1354c c1354c, long j3) {
        float f6 = c1354c.a;
        float f7 = c1354c.f13296c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        if (f6 > intBitsToFloat || intBitsToFloat > f7) {
            return false;
        }
        float f8 = c1354c.f13295b;
        float f9 = c1354c.f13297d;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        return f8 <= intBitsToFloat2 && intBitsToFloat2 <= f9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1 <= r6.getHeight()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final o0.C1395f q(l0.d r28, float r29) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.AbstractC0336u0.q(l0.d, float):o0.f");
    }

    public static final long r(C0332s0 c0332s0, long j3, F f6) {
        InterfaceC0134w interfaceC0134w;
        long b5;
        long j4;
        C0554p c0554p;
        int d6;
        float e6;
        C0554p c0554p2;
        int d7;
        C0554p c0554p3;
        int d8;
        float b6;
        C0554p c0554p4;
        int d9;
        r c6 = c0332s0.c(f6);
        if (c6 == null || (interfaceC0134w = c0332s0.f4201l) == null) {
            return 9205357640488583168L;
        }
        N.h hVar = c6.f4182c;
        InterfaceC0134w c7 = c6.c();
        if (c7 == null) {
            return 9205357640488583168L;
        }
        int i6 = f6.f3941b;
        S0.L l3 = (S0.L) hVar.b();
        if (i6 > (l3 == null ? 0 : c6.b(l3))) {
            return 9205357640488583168L;
        }
        C1353b c1353b = (C1353b) c0332s0.f4208s.getValue();
        AbstractC1276k.c(c1353b);
        float intBitsToFloat = Float.intBitsToFloat((int) (c7.R(interfaceC0134w, c1353b.a) >> 32));
        S0.L l5 = (S0.L) hVar.b();
        if (l5 == null) {
            b5 = S0.O.f7610b;
        } else {
            C0554p c0554p5 = l5.f7599b;
            int b7 = c6.b(l5);
            if (b7 < 1) {
                b5 = S0.O.f7610b;
            } else {
                int d10 = c0554p5.d(AbstractC1117a.f(i6, 0, b7 - 1));
                b5 = S0.F.b(l5.i(d10), c0554p5.c(d10, true));
            }
        }
        if (S0.O.c(b5)) {
            S0.L l6 = (S0.L) hVar.b();
            e6 = (l6 != null && (d9 = (c0554p4 = l6.f7599b).d(i6)) < c0554p4.f7652f) ? l6.g(d9) : -1.0f;
            j4 = 4294967295L;
        } else {
            j4 = 4294967295L;
            int i7 = (int) (b5 >> 32);
            S0.L l7 = (S0.L) hVar.b();
            float g3 = (l7 != null && (d7 = (c0554p2 = l7.f7599b).d(i7)) < c0554p2.f7652f) ? l7.g(d7) : -1.0f;
            int i8 = ((int) (b5 & 4294967295L)) - 1;
            S0.L l8 = (S0.L) hVar.b();
            float h3 = (l8 != null && (d6 = (c0554p = l8.f7599b).d(i8)) < c0554p.f7652f) ? l8.h(d6) : -1.0f;
            e6 = AbstractC1117a.e(intBitsToFloat, Math.min(g3, h3), Math.max(g3, h3));
        }
        if (e6 == -1.0f) {
            return 9205357640488583168L;
        }
        if (!e1.l.b(j3, 0L) && Math.abs(intBitsToFloat - e6) > ((int) (j3 >> 32)) / 2) {
            return 9205357640488583168L;
        }
        S0.L l9 = (S0.L) hVar.b();
        if (l9 != null && (d8 = (c0554p3 = l9.f7599b).d(i6)) < c0554p3.f7652f) {
            float f7 = c0554p3.f(d8);
            b6 = ((c0554p3.b(d8) - f7) / 2) + f7;
        } else {
            b6 = -1.0f;
        }
        if (b6 == -1.0f) {
            return 9205357640488583168L;
        }
        return interfaceC0134w.R(c7, (Float.floatToRawIntBits(e6) << 32) | (Float.floatToRawIntBits(b6) & j4));
    }

    public static final int s(long j3, S0.L l3) {
        int i6 = (int) (4294967295L & j3);
        if (Float.intBitsToFloat(i6) <= S.l.f7374V) {
            return 0;
        }
        float intBitsToFloat = Float.intBitsToFloat(i6);
        C0554p c0554p = l3.f7599b;
        return intBitsToFloat >= c0554p.f7651e ? l3.a.a.f7630e.length() : c0554p.g(j3);
    }

    public static final long t(S0.L l3, int i6, boolean z5, boolean z6) {
        C0554p c0554p = l3.f7599b;
        long j3 = l3.f7600c;
        if (c0554p.d(i6) >= c0554p.f7652f) {
            return 9205357640488583168L;
        }
        return (Float.floatToRawIntBits(AbstractC1117a.e(l3.e(i6, l3.a(((!z5 || z6) && (z5 || !z6)) ? Math.max(i6 + (-1), 0) : i6) == l3.j(i6)), S.l.f7374V, (int) (j3 >> 32))) << 32) | (Float.floatToRawIntBits(AbstractC1117a.e(c0554p.b(r3), S.l.f7374V, (int) (j3 & 4294967295L))) & 4294967295L);
    }

    public static final d1.j u(S0.L l3, int i6) {
        S0.K k3 = l3.a;
        C0554p c0554p = l3.f7599b;
        if (k3.a.f7630e.length() != 0) {
            int d6 = c0554p.d(i6);
            if ((i6 != 0 && d6 == c0554p.d(i6 - 1)) || (i6 != k3.a.f7630e.length() && d6 == c0554p.d(i6 + 1))) {
                return l3.a(i6);
            }
        }
        return l3.j(i6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public static final boolean v(C0040p c0040p) {
        MotionEvent a6;
        ?? r02 = c0040p.a;
        int size = r02.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                break;
            }
            if (((B0.y) r02.get(i6)).f489i == 2) {
                i6++;
            } else {
                MotionEvent a7 = c0040p.a();
                if ((a7 == null || !a7.isFromSource(8194)) && ((a6 = c0040p.a()) == null || !a6.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean w(N0 n02, boolean z5) {
        InterfaceC0134w c6;
        C0098v0 c0098v0 = n02.f3995d;
        if (c0098v0 == null || (c6 = c0098v0.c()) == null) {
            return false;
        }
        return p(A(c6), n02.l(z5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fd A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002d, B:13:0x00e5, B:15:0x00ed, B:17:0x00f1, B:19:0x00fd, B:21:0x0109, B:62:0x00be), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:34:0x0041, B:35:0x007a, B:37:0x0082, B:39:0x008e, B:41:0x009a, B:52:0x0061), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r11v3, types: [m4.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(B0.V r9, O.InterfaceC0326p r10, O.C0316k r11, B0.C0040p r12, d4.a r13) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.AbstractC0336u0.x(B0.V, O.p, O.k, B0.p, d4.a):java.lang.Object");
    }

    public static final EnumC0320m y(EnumC0320m enumC0320m, EnumC0320m enumC0320m2) {
        int ordinal = enumC0320m2.ordinal();
        EnumC0320m enumC0320m3 = EnumC0320m.f4151c;
        if (ordinal != 0) {
            EnumC0320m enumC0320m4 = EnumC0320m.f4153f;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return enumC0320m4;
                }
                throw new RuntimeException();
            }
            int ordinal2 = enumC0320m.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    return EnumC0320m.f4152e;
                }
                if (ordinal2 == 2) {
                    return enumC0320m4;
                }
                throw new RuntimeException();
            }
        }
        return enumC0320m3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        if (r14 == r5) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068 A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00a3, B:15:0x00ab, B:17:0x00b7, B:19:0x00c3, B:21:0x00c6, B:24:0x00c9, B:28:0x00cd, B:32:0x0041, B:34:0x0064, B:36:0x0068, B:40:0x0086, B:45:0x004b), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(B0.V r11, D.H0 r12, B0.C0040p r13, d4.a r14) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.AbstractC0336u0.z(B0.V, D.H0, B0.p, d4.a):java.lang.Object");
    }
}
