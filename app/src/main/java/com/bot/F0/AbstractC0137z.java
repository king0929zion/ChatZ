package F0;

import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import T.C0616l;
import T.C0622o;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1024a;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n0.C1354c;

/* renamed from: F0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0137z {
    public static final C0110b0 a = new C0110b0(4);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1543b = new Object();

    public static final void a(v0 v0Var, InterfaceC1041r interfaceC1041r, l4.e eVar, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(-511989831);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.h(v0Var) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.f(interfaceC1041r) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.h(eVar) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            int hashCode = Long.hashCode(c0626q.f8164T);
            C0622o D4 = T.r.D(c0626q);
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, interfaceC1041r);
            InterfaceC0617l0 l3 = c0626q.l();
            C0148f c0148f = C0148f.f1913g;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, v0Var, v0Var.f1538c);
            T.r.G(c0626q, D4, v0Var.f1539d);
            T.r.G(c0626q, eVar, v0Var.f1540e);
            InterfaceC0152h.a.getClass();
            T.r.G(c0626q, l3, C0150g.f1927e);
            T.r.C(c0626q, C0150g.f1930h);
            T.r.G(c0626q, c6, C0150g.f1926d);
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            c0626q.p(true);
            if (c0626q.E()) {
                c0626q.b0(-1266202711);
            } else {
                c0626q.b0(-1259244916);
                boolean h3 = c0626q.h(v0Var);
                Object P5 = c0626q.P();
                if (h3 || P5 == C0616l.a) {
                    P5 = new A0.b(v0Var, 3);
                    c0626q.m0(P5);
                }
                T.r.j((InterfaceC1193a) P5, c0626q);
            }
            c0626q.p(false);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new s0(v0Var, interfaceC1041r, eVar, i6, 0);
        }
    }

    public static final void b(InterfaceC1041r interfaceC1041r, l4.e eVar, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(-1298353104);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(eVar) ? 32 : 16;
        }
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            Object P5 = c0626q.P();
            if (P5 == C0616l.a) {
                P5 = new v0(C0110b0.f1468e);
                c0626q.m0(P5);
            }
            a((v0) P5, interfaceC1041r, eVar, c0626q, (i7 << 3) & 1008);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new r0(interfaceC1041r, eVar, i6, 0);
        }
    }

    public static final float c(long j3, long j4) {
        return Math.min(Float.intBitsToFloat((int) (j4 >> 32)) / Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)) / Float.intBitsToFloat((int) (j3 & 4294967295L)));
    }

    public static final float d(j0 j0Var, boolean z5, C0127o[] c0127oArr, float f6) {
        float f7 = Float.NaN;
        for (C0127o c0127o : c0127oArr) {
            float d6 = j0Var.d(c0127o);
            if (!Float.isNaN(f7)) {
                int i6 = z5 != (d6 > f7) ? i6 + 1 : 0;
            }
            f7 = d6;
        }
        return Float.isNaN(f7) ? f6 : f7;
    }

    public static final C1354c e(InterfaceC0134w interfaceC0134w) {
        InterfaceC0134w I5 = interfaceC0134w.I();
        return I5 != null ? I5.Q(interfaceC0134w, true) : new C1354c(S.l.f7374V, S.l.f7374V, (int) (interfaceC0134w.m() >> 32), (int) (interfaceC0134w.m() & 4294967295L));
    }

    public static final C1354c f(InterfaceC0134w interfaceC0134w, boolean z5) {
        InterfaceC0134w h3 = h(interfaceC0134w);
        float m3 = (int) (h3.m() >> 32);
        float m5 = (int) (h3.m() & 4294967295L);
        C1354c Q5 = h3.Q(interfaceC0134w, z5);
        float f6 = Q5.f13297d;
        float f7 = Q5.f13296c;
        float f8 = Q5.f13295b;
        float f9 = Q5.a;
        if (z5) {
            if (f9 < S.l.f7374V) {
                f9 = 0.0f;
            }
            if (f9 > m3) {
                f9 = m3;
            }
        }
        if (z5) {
            if (f8 < S.l.f7374V) {
                f8 = 0.0f;
            }
            if (f8 > m5) {
                f8 = m5;
            }
        }
        if (z5) {
            if (f7 < S.l.f7374V) {
                f7 = 0.0f;
            }
            if (f7 <= m3) {
                m3 = f7;
            }
            f7 = m3;
        }
        if (z5) {
            if (f6 < S.l.f7374V) {
                f6 = 0.0f;
            }
            if (f6 <= m5) {
                m5 = f6;
            }
            f6 = m5;
        }
        if (f9 == f7 || f8 == f6) {
            return C1354c.f13294e;
        }
        long e6 = h3.e((Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L));
        long e7 = h3.e((Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L));
        long e8 = h3.e((Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L));
        long e9 = h3.e((Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L));
        float intBitsToFloat = Float.intBitsToFloat((int) (e6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (e7 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (e9 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (e8 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (e6 & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (e7 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (e9 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (e8 & 4294967295L));
        return new C1354c(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final boolean g(long j3, long j4) {
        return j3 == j4;
    }

    public static final InterfaceC0134w h(InterfaceC0134w interfaceC0134w) {
        InterfaceC0134w interfaceC0134w2;
        InterfaceC0134w I5 = interfaceC0134w.I();
        while (true) {
            InterfaceC0134w interfaceC0134w3 = I5;
            interfaceC0134w2 = interfaceC0134w;
            interfaceC0134w = interfaceC0134w3;
            if (interfaceC0134w == null) {
                break;
            }
            I5 = interfaceC0134w.I();
        }
        H0.i0 i0Var = interfaceC0134w2 instanceof H0.i0 ? (H0.i0) interfaceC0134w2 : null;
        if (i0Var == null) {
            return interfaceC0134w2;
        }
        H0.i0 i0Var2 = i0Var.f1956t;
        while (true) {
            H0.i0 i0Var3 = i0Var2;
            H0.i0 i0Var4 = i0Var;
            i0Var = i0Var3;
            if (i0Var == null) {
                return i0Var4;
            }
            i0Var2 = i0Var.f1956t;
        }
    }

    public static final Object i(U u5) {
        Object H3 = u5.H();
        A a6 = H3 instanceof A ? (A) H3 : null;
        if (a6 != null) {
            return a6.f1378r;
        }
        return null;
    }

    public static final H0.T j(H0.T t5) {
        H0.J j3 = t5.f1805r.f1954r;
        while (true) {
            H0.J v5 = j3.v();
            H0.J j4 = null;
            if ((v5 != null ? v5.f1741l : null) == null) {
                H0.T U02 = j3.f1721J.f1917d.U0();
                AbstractC1276k.c(U02);
                return U02;
            }
            H0.J v6 = j3.v();
            if (v6 != null) {
                j4 = v6.f1741l;
            }
            AbstractC1276k.c(j4);
            H0.J v7 = j3.v();
            AbstractC1276k.c(v7);
            j3 = v7.f1741l;
            AbstractC1276k.c(j3);
        }
    }

    public static final InterfaceC1041r k(InterfaceC1041r interfaceC1041r, l4.f fVar) {
        return interfaceC1041r.c(new C0135x(fVar));
    }

    public static final InterfaceC1041r l(InterfaceC1041r interfaceC1041r, Object obj) {
        return interfaceC1041r.c(new C0136y(obj));
    }

    public static final InterfaceC1041r m(InterfaceC1041r interfaceC1041r, l4.c cVar) {
        return interfaceC1041r.c(new C0112c0(cVar));
    }

    public static final InterfaceC1041r n(InterfaceC1041r interfaceC1041r, l4.c cVar) {
        return interfaceC1041r.c(new C0116e0(cVar));
    }

    public static final long o(long j3, long j4) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32)) * Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L)) * Float.intBitsToFloat((int) (j3 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
