package Q;

import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import m4.AbstractC1276k;
import n.C1323f0;
import p.AbstractC1450o0;
import p.AbstractC1464z;
import p.C1416F;
import t.C1682j;
import v.AbstractC1806l;
import v.C1810p;

/* loaded from: classes.dex */
public abstract class a3 {
    public static final float a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f5650b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f5651c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f5652d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f5653e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1323f0 f5654f;

    static {
        float f6 = S.z.f7522p;
        a = f6;
        f5650b = S.z.f7532z;
        f5651c = S.z.f7529w;
        float f7 = S.z.f7526t;
        f5652d = f7;
        f5653e = (f7 - f6) / 2;
        f5654f = new C1323f0(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r48, l4.c r49, h0.InterfaceC1041r r50, boolean r51, Q.Y2 r52, T.C0626q r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.a3.a(boolean, l4.c, h0.r, boolean, Q.Y2, T.q, int, int):void");
    }

    public static final void b(final InterfaceC1041r interfaceC1041r, final boolean z5, final boolean z6, final Y2 y22, final C1682j c1682j, final o0.L l3, C0626q c0626q, final int i6) {
        int i7;
        c0626q.d0(-670917213);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.g(z5) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.g(z6) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q.f(y22) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0626q.h(null) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i7 |= c0626q.f(c1682j) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if ((1572864 & i6) == 0) {
            i7 |= c0626q.f(l3) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT;
        }
        if (c0626q.S(i7 & 1, (599187 & i7) != 599186)) {
            long j3 = z6 ? z5 ? y22.f5615b : y22.f5619f : z5 ? y22.f5623j : y22.f5627n;
            long j4 = z6 ? z5 ? y22.a : y22.f5618e : z5 ? y22.f5622i : y22.f5626m;
            o0.L a6 = W1.a(S.z.f7528v, c0626q);
            InterfaceC1041r f6 = AbstractC1464z.f(interfaceC1041r.c(new C1416F(S.z.f7527u, new o0.N(z6 ? z5 ? y22.f5616c : y22.f5620g : z5 ? y22.f5624k : y22.f5628o), a6)), j3, a6);
            F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l5 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, f6);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            C0146e c0146e = C0150g.f1928f;
            T.r.G(c0626q, d6, c0146e);
            C0146e c0146e2 = C0150g.f1927e;
            T.r.G(c0626q, l5, c0146e2);
            C0146e c0146e3 = C0150g.f1929g;
            if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode))) {
                B3.e.v(hashCode, c0626q, hashCode, c0146e3);
            }
            C0146e c0146e4 = C0150g.f1926d;
            T.r.G(c0626q, c6, c0146e4);
            InterfaceC1041r f7 = AbstractC1464z.f(AbstractC1450o0.a(C1810p.f15333b.e(C1038o.a, C1026c.f11789g).c(new g3(c1682j, z5, R1.u(S.p.f7414e, c0626q))), c1682j, S1.a(S.z.f7525s / 2, 4, 0L, false)), j4, l3);
            F0.V d7 = AbstractC1806l.d(C1026c.f11790h, false);
            int hashCode2 = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l6 = c0626q.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q, f7);
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d7, c0146e);
            T.r.G(c0626q, l6, c0146e2);
            if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode2))) {
                B3.e.v(hashCode2, c0626q, hashCode2, c0146e3);
            }
            T.r.G(c0626q, c7, c0146e4);
            c0626q.b0(1236071411);
            c0626q.p(false);
            c0626q.p(true);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e() { // from class: Q.Z2
                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a3.b(InterfaceC1041r.this, z5, z6, y22, c1682j, l3, (C0626q) obj, T.r.J(i6 | 1));
                    return X3.y.a;
                }
            };
        }
    }
}
