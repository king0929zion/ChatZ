package Q;

import R.AbstractC0507l;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import b0.AbstractC0874g;
import b0.C0873f;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.C1038o;
import h0.InterfaceC1041r;
import i1.InterfaceC1078B;

/* loaded from: classes.dex */
public abstract class o3 {
    public static final float a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f6027b = 24;

    /* renamed from: c, reason: collision with root package name */
    public static final float f6028c = 40;

    /* renamed from: d, reason: collision with root package name */
    public static final v.k0 f6029d;

    static {
        float f6 = 4;
        a = f6;
        float f7 = 8;
        f6029d = new v.k0(f7, f6, f7, f6);
    }

    public static final void a(final q3 q3Var, InterfaceC1041r interfaceC1041r, float f6, o0.L l3, long j3, long j4, float f7, float f8, final C0873f c0873f, C0626q c0626q, final int i6) {
        int i7;
        InterfaceC1041r interfaceC1041r2;
        final float f9;
        final o0.L l5;
        final long j5;
        final long j6;
        final float f10;
        final float f11;
        float f12;
        long d6;
        int i8;
        long j7;
        float f13;
        o0.L l6;
        float f14;
        c0626q.d0(-343758958);
        if ((i6 & 6) == 0) {
            i7 = ((i6 & 8) == 0 ? c0626q.f(q3Var) : c0626q.h(q3Var) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        int i9 = i7 | 3504;
        if ((i6 & 24576) == 0) {
            i9 = i7 | 11696;
        }
        if ((196608 & i6) == 0) {
            i9 |= PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if ((1572864 & i6) == 0) {
            i9 |= PegdownExtensions.SUBSCRIPT;
        }
        int i10 = 113246208 | i9;
        if ((805306368 & i6) == 0) {
            i10 |= c0626q.h(c0873f) ? PegdownExtensions.NOT_USED : PegdownExtensions.FORCELISTITEMPARA;
        }
        if (c0626q.S(i10 & 1, (306783379 & i10) != 306783378)) {
            c0626q.X();
            if ((i6 & 1) == 0 || c0626q.B()) {
                f12 = l3.a;
                o0.L a6 = W1.a(S.l.f7368P, c0626q);
                d6 = O.d(S.l.f7369Q, c0626q);
                long d7 = O.d(S.l.f7367O, c0626q);
                i8 = i10 & (-4186113);
                interfaceC1041r2 = C1038o.a;
                j7 = d7;
                f13 = 0;
                l6 = a6;
                f14 = 0;
            } else {
                c0626q.V();
                i8 = i10 & (-4186113);
                interfaceC1041r2 = interfaceC1041r;
                f12 = f6;
                l6 = l3;
                d6 = j3;
                j7 = j4;
                f13 = f7;
                f14 = f8;
            }
            c0626q.q();
            c0626q.b0(-1719831991);
            c0626q.p(false);
            int i11 = i8 >> 9;
            X2.a(interfaceC1041r2, l6, j7, 0L, f13, f14, AbstractC0874g.c(-1573998995, new n3(f12, d6, c0873f), c0626q), c0626q, (57344 & i11) | 12582912 | (i11 & 458752), 72);
            f9 = f12;
            j5 = d6;
            l5 = l6;
            j6 = j7;
            f10 = f13;
            f11 = f14;
        } else {
            c0626q.V();
            interfaceC1041r2 = interfaceC1041r;
            f9 = f6;
            l5 = l3;
            j5 = j3;
            j6 = j4;
            f10 = f7;
            f11 = f8;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            final InterfaceC1041r interfaceC1041r3 = interfaceC1041r2;
            t5.f8193d = new l4.e() { // from class: Q.m3
                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o3.a(q3.this, interfaceC1041r3, f9, l5, j5, j6, f10, f11, c0873f, (C0626q) obj, T.r.J(i6 | 1));
                    return X3.y.a;
                }
            };
        }
    }

    public static final void b(InterfaceC1078B interfaceC1078B, C0873f c0873f, s3 s3Var, InterfaceC1041r interfaceC1041r, boolean z5, C0873f c0873f2, C0626q c0626q, int i6) {
        int i7;
        InterfaceC1041r interfaceC1041r2;
        boolean z6;
        c0626q.d0(-293753984);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(interfaceC1078B) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(c0873f) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= (i6 & PegdownExtensions.STRIKETHROUGH) == 0 ? c0626q.f(s3Var) : c0626q.h(s3Var) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        int i8 = i7 | 14380032;
        if ((100663296 & i6) == 0) {
            i8 |= c0626q.h(c0873f2) ? PegdownExtensions.MULTI_LINE_IMAGE_URLS : PegdownExtensions.TOC;
        }
        if (c0626q.S(i8 & 1, (38347923 & i8) != 38347922)) {
            n.y0 d6 = n.C0.d(s3Var.f6103b, "tooltip transition", c0626q, 48);
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (P5 == c0602e) {
                P5 = T.r.A(null);
                c0626q.m0(P5);
            }
            T.X x5 = (T.X) P5;
            Object P6 = c0626q.P();
            if (P6 == c0602e) {
                new D.C(x5, 8);
                P6 = new Object();
                c0626q.m0(P6);
            }
            AbstractC0507l.b(interfaceC1078B, AbstractC0874g.c(-527401546, new I0(d6, c0873f, (q3) P6), c0626q), s3Var, AbstractC0874g.c(-23901870, new J1.m(6, x5, c0873f2), c0626q), c0626q, (i8 & 14) | 100663344 | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8) | (3670016 & i8) | (i8 & 29360128));
            interfaceC1041r2 = C1038o.a;
            z6 = true;
        } else {
            c0626q.V();
            interfaceC1041r2 = interfaceC1041r;
            z6 = z5;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new L(interfaceC1078B, c0873f, s3Var, interfaceC1041r2, z6, c0873f2, i6);
        }
    }
}
