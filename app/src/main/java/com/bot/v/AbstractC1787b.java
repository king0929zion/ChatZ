package v;

import D.e1;
import F0.AbstractC0137z;
import F0.C0108a0;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import I0.AbstractC0204q0;
import Q.C0398c;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import b0.C0873f;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.format.TableCell;
import e1.AbstractC0960b;
import e1.C0959a;
import e1.InterfaceC0961c;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1032i;
import h0.InterfaceC1028e;
import h0.InterfaceC1041r;
import java.util.ArrayList;
import java.util.List;
import l4.InterfaceC1193a;
import p.O0;
import w.AbstractC1829a;

/* renamed from: v.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1787b {
    public static final C1810p a = new C1810p(2);

    /* renamed from: b, reason: collision with root package name */
    public static final C1810p f15285b = new C1810p(3);

    /* renamed from: c, reason: collision with root package name */
    public static final C1777A f15286c = new C1777A(0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f15287d = 9;

    /* renamed from: e, reason: collision with root package name */
    public static final int f15288e = 6;

    /* renamed from: f, reason: collision with root package name */
    public static final int f15289f = 10;

    /* renamed from: g, reason: collision with root package name */
    public static final int f15290g = 5;

    public static InterfaceC1041r A(float f6, float f7, int i6, InterfaceC1041r interfaceC1041r) {
        if ((i6 & 1) != 0) {
            f6 = 0;
        }
        if ((i6 & 2) != 0) {
            f7 = 0;
        }
        return z(interfaceC1041r, f6, f7);
    }

    public static final InterfaceC1041r B(InterfaceC1041r interfaceC1041r, float f6, float f7, float f8, float f9) {
        return interfaceC1041r.c(new C1798g0(f6, f7, f8, f9));
    }

    public static InterfaceC1041r C(InterfaceC1041r interfaceC1041r, float f6, float f7, float f8, float f9, int i6) {
        if ((i6 & 1) != 0) {
            f6 = 0;
        }
        if ((i6 & 2) != 0) {
            f7 = 0;
        }
        if ((i6 & 4) != 0) {
            f8 = 0;
        }
        if ((i6 & 8) != 0) {
            f9 = 0;
        }
        return B(interfaceC1041r, f6, f7, f8, f9);
    }

    public static final long D(long j3) {
        return AbstractC0960b.a(C0959a.j(j3), C0959a.h(j3), C0959a.i(j3), C0959a.g(j3));
    }

    public static final S E(o1.c cVar) {
        return new S(cVar.a, cVar.f13501b, cVar.f13502c, cVar.f13503d);
    }

    public static final void F(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, h0.r] */
    public static final InterfaceC1041r G(InterfaceC1041r interfaceC1041r) {
        return interfaceC1041r.c(new Object());
    }

    public static final InterfaceC1041r H(InterfaceC1041r interfaceC1041r, F0 f02) {
        return interfaceC1041r.c(new O(f02));
    }

    public static final void a(final InterfaceC1041r interfaceC1041r, InterfaceC1028e interfaceC1028e, boolean z5, final C0873f c0873f, C0626q c0626q, final int i6, final int i7) {
        int i8;
        final boolean z6;
        c0626q.d0(380139498);
        if ((i6 & 6) == 0) {
            i8 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        } else {
            i8 = i6;
        }
        int i9 = i7 & 2;
        if (i9 != 0) {
            i8 |= 48;
        } else if ((i6 & 48) == 0) {
            i8 |= c0626q.f(interfaceC1028e) ? 32 : 16;
        }
        int i10 = i7 & 4;
        if (i10 != 0) {
            i8 |= 384;
        } else if ((i6 & 384) == 0) {
            i8 |= c0626q.g(z5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i8 |= c0626q.h(c0873f) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if (c0626q.S(i8 & 1, (i8 & 1171) != 1170)) {
            if (i9 != 0) {
                interfaceC1028e = C1026c.f11786c;
            }
            boolean z7 = i10 != 0 ? false : z5;
            F0.V d6 = AbstractC1806l.d(interfaceC1028e, z7);
            boolean f6 = c0626q.f(d6) | ((i8 & 7168) == 2048);
            Object P5 = c0626q.P();
            if (f6 || P5 == C0616l.a) {
                P5 = new I.m(25, d6, c0873f);
                c0626q.m0(P5);
            }
            AbstractC0137z.b(interfaceC1041r, (l4.e) P5, c0626q, i8 & 14);
            z6 = z7;
        } else {
            c0626q.V();
            z6 = z5;
        }
        final InterfaceC1028e interfaceC1028e2 = interfaceC1028e;
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e() { // from class: v.q
                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC1787b.a(InterfaceC1041r.this, interfaceC1028e2, z6, c0873f, (C0626q) obj, T.r.J(i6 | 1), i7);
                    return X3.y.a;
                }
            };
        }
    }

    public static final void b(InterfaceC1041r interfaceC1041r, InterfaceC1793e interfaceC1793e, InterfaceC1797g interfaceC1797g, C1032i c1032i, int i6, int i7, C0873f c0873f, C0626q c0626q, int i8) {
        C0873f c0873f2;
        InterfaceC1793e interfaceC1793e2;
        InterfaceC1797g interfaceC1797g2;
        C1032i c1032i2;
        int i9;
        int i10;
        c0626q.d0(-1303174015);
        int i11 = i8 | 224688;
        if (c0626q.S(i11 & 1, (599187 & i11) != 599186)) {
            C1810p c1810p = AbstractC1799h.a;
            C1789c c1789c = AbstractC1799h.f15305c;
            C1032i c1032i3 = C1026c.f11795m;
            c0873f2 = c0873f;
            c(interfaceC1041r, C1810p.f15334c, c0873f2, c0626q, 14380470);
            interfaceC1793e2 = c1810p;
            interfaceC1797g2 = c1789c;
            c1032i2 = c1032i3;
            i9 = Integer.MAX_VALUE;
            i10 = Integer.MAX_VALUE;
        } else {
            c0873f2 = c0873f;
            c0626q.V();
            interfaceC1793e2 = interfaceC1793e;
            interfaceC1797g2 = interfaceC1797g;
            c1032i2 = c1032i;
            i9 = i6;
            i10 = i7;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new Q.D(interfaceC1041r, interfaceC1793e2, interfaceC1797g2, c1032i2, i9, i10, c0873f2, i8);
        }
    }

    public static final void c(InterfaceC1041r interfaceC1041r, C1810p c1810p, C0873f c0873f, C0626q c0626q, int i6) {
        int i7;
        Object obj;
        boolean z5;
        Object obj2;
        C1032i c1032i = C1026c.f11795m;
        C1789c c1789c = AbstractC1799h.f15305c;
        C1810p c1810p2 = AbstractC1799h.a;
        c0626q.d0(-1956591841);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.f(c1810p2) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.f(c1789c) ? 256 : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q.f(c1032i) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0626q.d(TableCell.NOT_TRACKED) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i7 |= c0626q.d(TableCell.NOT_TRACKED) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if ((12582912 & i6) == 0) {
            i7 |= c0626q.h(c0873f) ? PegdownExtensions.EXTANCHORLINKS_WRAP : PegdownExtensions.EXTANCHORLINKS;
        }
        int i8 = i7;
        if (c0626q.S(i8 & 1, (i8 & 4793491) != 4793490)) {
            Object P5 = c0626q.P();
            Object obj3 = C0616l.a;
            if (P5 == obj3) {
                c1810p.getClass();
                P5 = new Object();
                c0626q.m0(P5);
            }
            C1782F c1782f = (C1782F) P5;
            int i9 = i8 >> 3;
            boolean f6 = ((((i9 & 14) ^ 6) > 4 && c0626q.f(c1810p2)) || (i9 & 6) == 4) | ((((i9 & 112) ^ 48) > 32 && c0626q.f(c1789c)) || (i9 & 48) == 32) | ((((i9 & 896) ^ 384) > 256 && c0626q.f(c1032i)) || (i9 & 384) == 256) | ((((i9 & 7168) ^ 3072) > 2048 && c0626q.d(TableCell.NOT_TRACKED)) || (i9 & 3072) == 2048) | ((((57344 & i9) ^ 24576) > 16384 && c0626q.d(TableCell.NOT_TRACKED)) || (i9 & 24576) == 16384) | c0626q.f(c1782f);
            Object P6 = c0626q.P();
            if (f6 || P6 == obj3) {
                float f7 = 0;
                C1816w c1816w = new C1816w(c1032i);
                obj = obj3;
                Object c1784h = new C1784H(c1810p2, c1789c, f7, c1816w, f7, c1782f);
                c0626q.m0(c1784h);
                P6 = c1784h;
            } else {
                obj = obj3;
            }
            C1784H c1784h2 = (C1784H) P6;
            boolean z6 = ((i8 & 29360128) == 8388608) | ((i8 & 458752) == 131072);
            Object P7 = c0626q.P();
            if (z6 || P7 == obj) {
                ArrayList arrayList = new ArrayList();
                z5 = true;
                arrayList.add(new C0873f(new C0398c(c0873f, 4, (byte) 0), true, -1192950673));
                c1810p.getClass();
                c0626q.m0(arrayList);
                obj2 = arrayList;
            } else {
                z5 = true;
                obj2 = P7;
            }
            C0873f c0873f2 = new C0873f(new F0.B((List) obj2, 0), z5, 1271844412);
            boolean f8 = c0626q.f(c1784h2);
            Object P8 = c0626q.P();
            if (f8 || P8 == obj) {
                P8 = new C0108a0(c1784h2);
                c0626q.m0(P8);
            }
            F0.V v5 = (F0.V) P8;
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, interfaceC1041r);
            InterfaceC0152h.a.getClass();
            InterfaceC1193a interfaceC1193a = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(interfaceC1193a);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, v5, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q, C0150g.f1930h);
            T.r.G(c0626q, c6, C0150g.f1926d);
            c0873f2.m(c0626q, 0);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new e1(interfaceC1041r, c1810p, c0873f, i6);
        }
    }

    public static final k0 d(float f6, float f7) {
        return new k0(f6, f7, f6, f7);
    }

    public static k0 e(float f6, int i6) {
        float f7 = 0;
        if ((i6 & 2) != 0) {
            f6 = 0;
        }
        return new k0(f7, f6, f7, f6);
    }

    public static final k0 f(float f6, float f7, float f8, float f9) {
        return new k0(f6, f7, f8, f9);
    }

    public static k0 g(float f6, float f7, float f8, int i6) {
        if ((i6 & 1) != 0) {
            f6 = 0;
        }
        float f9 = 0;
        if ((i6 & 4) != 0) {
            f7 = 0;
        }
        return new k0(f6, f9, f7, f8);
    }

    public static final void h(C0626q c0626q, InterfaceC1041r interfaceC1041r) {
        C1805k c1805k = C1805k.f15317c;
        int hashCode = Long.hashCode(c0626q.f8164T);
        InterfaceC1041r c6 = AbstractC1024a.c(c0626q, interfaceC1041r);
        InterfaceC0617l0 l3 = c0626q.l();
        InterfaceC0152h.a.getClass();
        C0148f c0148f = C0150g.f1924b;
        H0.G0 g02 = c0626q.a;
        c0626q.f0();
        if (c0626q.f8163S) {
            c0626q.k(c0148f);
        } else {
            c0626q.p0();
        }
        T.r.G(c0626q, c1805k, C0150g.f1928f);
        T.r.G(c0626q, l3, C0150g.f1927e);
        T.r.C(c0626q, C0150g.f1930h);
        T.r.G(c0626q, c6, C0150g.f1926d);
        T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
        c0626q.p(true);
    }

    public static final Q j(F0 f02, C0626q c0626q) {
        return new Q(f02, (InterfaceC0961c) c0626q.j(AbstractC0204q0.f2358h));
    }

    public static final float k(InterfaceC1802i0 interfaceC1802i0, e1.m mVar) {
        return mVar == e1.m.f11576c ? interfaceC1802i0.d(mVar) : interfaceC1802i0.b(mVar);
    }

    public static final float l(InterfaceC1802i0 interfaceC1802i0, e1.m mVar) {
        return mVar == e1.m.f11576c ? interfaceC1802i0.b(mVar) : interfaceC1802i0.d(mVar);
    }

    public static long m(long j3, Y y5) {
        Y y6 = Y.f15277c;
        return AbstractC0960b.a(y5 == y6 ? C0959a.j(j3) : C0959a.i(j3), y5 == y6 ? C0959a.h(j3) : C0959a.g(j3), y5 == y6 ? C0959a.i(j3) : C0959a.j(j3), y5 == y6 ? C0959a.g(j3) : C0959a.h(j3));
    }

    public static final InterfaceC1041r n(InterfaceC1041r interfaceC1041r, C1777A c1777a) {
        return interfaceC1041r.c(new y0(c1777a));
    }

    public static long o(long j3, int i6) {
        return AbstractC0960b.a(0, C0959a.h(j3), (i6 & 4) != 0 ? C0959a.i(j3) : 0, C0959a.g(j3));
    }

    public static final n0 p(F0.U u5) {
        Object H3 = u5.H();
        if (H3 instanceof n0) {
            return (n0) H3;
        }
        return null;
    }

    public static final float q(n0 n0Var) {
        return n0Var != null ? n0Var.a : S.l.f7374V;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, h0.r] */
    public static final InterfaceC1041r r(InterfaceC1041r interfaceC1041r) {
        return interfaceC1041r.c(new Object());
    }

    public static final InterfaceC1041r s(InterfaceC1041r interfaceC1041r) {
        return interfaceC1041r.c(new v0(new O0(11)));
    }

    public static final F0.W t(m0 m0Var, int i6, int i7, int i8, int i9, int i10, F0.X x5, List list, F0.k0[] k0VarArr, int i11, int i12, int[] iArr, int i13) {
        int i14;
        float f6;
        long j3;
        int i15;
        int i16;
        int i17;
        List list2 = list;
        long j4 = i10;
        int i18 = i12 - i11;
        int[] iArr2 = new int[i18];
        int i19 = i11;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        float f7 = S.l.f7374V;
        while (i19 < i12) {
            F0.U u5 = (F0.U) list2.get(i19);
            float q3 = q(p(u5));
            if (q3 > S.l.f7374V) {
                f7 += q3;
                i21++;
                j3 = j4;
                i15 = i19;
            } else {
                int i24 = i8 - i22;
                F0.k0 k0Var = k0VarArr[i19];
                j3 = j4;
                if (k0Var == null) {
                    if (i8 == Integer.MAX_VALUE) {
                        i15 = i19;
                        i16 = i21;
                        i17 = TableCell.NOT_TRACKED;
                    } else {
                        i15 = i19;
                        i16 = i21;
                        i17 = i24 < 0 ? 0 : i24;
                    }
                    k0Var = u5.w(m0Var.c(0, i17, i9, false));
                } else {
                    i15 = i19;
                    i16 = i21;
                }
                F0.k0 k0Var2 = k0Var;
                int b5 = m0Var.b(k0Var2);
                int f8 = m0Var.f(k0Var2);
                iArr2[i15 - i11] = b5;
                int i25 = i24 - b5;
                if (i25 < 0) {
                    i25 = 0;
                }
                i23 = Math.min(i10, i25);
                i22 += b5 + i23;
                i20 = Math.max(i20, f8);
                k0VarArr[i15] = k0Var2;
                i21 = i16;
            }
            i19 = i15 + 1;
            j4 = j3;
        }
        long j5 = j4;
        if (i21 == 0) {
            i22 -= i23;
            i14 = 0;
        } else {
            long j6 = (r22 - 1) * j5;
            long j7 = ((i8 != Integer.MAX_VALUE ? i8 : i6) - i22) - j6;
            if (j7 < 0) {
                j7 = 0;
            }
            float f9 = ((float) j7) / f7;
            for (int i26 = i11; i26 < i12; i26++) {
                j7 -= Math.round(q(p((F0.U) list2.get(i26))) * f9);
            }
            int i27 = i11;
            int i28 = i20;
            int i29 = 0;
            while (i27 < i12) {
                if (k0VarArr[i27] == null) {
                    F0.U u6 = (F0.U) list2.get(i27);
                    f6 = f9;
                    n0 p5 = p(u6);
                    float q5 = q(p5);
                    if (q5 <= S.l.f7374V) {
                        AbstractC1829a.b("All weights <= 0 should have placeables");
                    }
                    int signum = Long.signum(j7);
                    long j8 = j7 - signum;
                    int max = Math.max(0, Math.round(q5 * f6) + signum);
                    F0.k0 w5 = u6.w(m0Var.c((!(p5 != null ? p5.f15331b : true) || max == Integer.MAX_VALUE) ? 0 : max, max, i9, true));
                    int b6 = m0Var.b(w5);
                    int f10 = m0Var.f(w5);
                    iArr2[i27 - i11] = b6;
                    i29 += b6;
                    int max2 = Math.max(i28, f10);
                    k0VarArr[i27] = w5;
                    i28 = max2;
                    j7 = j8;
                } else {
                    f6 = f9;
                }
                i27++;
                list2 = list;
                f9 = f6;
            }
            i14 = (int) (i29 + j6);
            int i30 = i8 - i22;
            if (i14 < 0) {
                i14 = 0;
            }
            if (i14 > i30) {
                i14 = i30;
            }
            i20 = i28;
        }
        int i31 = i14 + i22;
        if (i31 < 0) {
            i31 = 0;
        }
        int max3 = Math.max(i31, i6);
        int max4 = Math.max(i20, Math.max(i7, 0));
        int[] iArr3 = new int[i18];
        m0Var.g(max3, iArr2, iArr3, x5);
        return m0Var.i(k0VarArr, x5, iArr3, max3, max4, iArr, i13, i11, i12);
    }

    public static final void u(F0.U u5, C1784H c1784h, long j3, l4.c cVar) {
        if (q(p(u5)) != S.l.f7374V) {
            c1784h.getClass();
            u5.a0(u5.o(TableCell.NOT_TRACKED));
            return;
        }
        p(u5);
        F0.k0 w5 = u5.w(j3);
        cVar.f(w5);
        c1784h.getClass();
        w5.j0();
        w5.i0();
    }

    public static final InterfaceC1041r v(InterfaceC1041r interfaceC1041r, l4.c cVar) {
        return interfaceC1041r.c(new C1794e0(cVar));
    }

    public static final InterfaceC1041r w(InterfaceC1041r interfaceC1041r, float f6, float f7) {
        return interfaceC1041r.c(new C1790c0(f6, f7));
    }

    public static final InterfaceC1041r x(InterfaceC1041r interfaceC1041r, InterfaceC1802i0 interfaceC1802i0) {
        return interfaceC1041r.c(new C1804j0(interfaceC1802i0));
    }

    public static final InterfaceC1041r y(InterfaceC1041r interfaceC1041r, float f6) {
        return interfaceC1041r.c(new C1798g0(f6, f6, f6, f6));
    }

    public static final InterfaceC1041r z(InterfaceC1041r interfaceC1041r, float f6, float f7) {
        return interfaceC1041r.c(new C1798g0(f6, f7, f6, f7));
    }

    public abstract int i(int i6, e1.m mVar, F0.k0 k0Var);
}
