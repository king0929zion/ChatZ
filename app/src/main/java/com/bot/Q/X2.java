package Q;

import T.C0616l;
import T.C0625p0;
import T.C0626q;
import b0.AbstractC0874g;
import b0.C0873f;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.C1038o;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import p.AbstractC1464z;
import p.C1416F;
import p.C1417G;
import t.C1682j;

/* loaded from: classes.dex */
public abstract class X2 {
    public static final T.B a = new T.B(new O.A(16));

    public static final void a(InterfaceC1041r interfaceC1041r, o0.L l3, long j3, long j4, float f6, float f7, C0873f c0873f, C0626q c0626q, int i6, int i7) {
        if ((i7 & 2) != 0) {
            l3 = o0.y.f13496b;
        }
        o0.L l5 = l3;
        long b5 = (i7 & 8) != 0 ? O.b(j3, c0626q) : j4;
        float f8 = (i7 & 16) != 0 ? 0 : f6;
        float f9 = (i7 & 32) != 0 ? 0 : f7;
        T.B b6 = a;
        float f10 = ((e1.f) c0626q.j(b6)).f11571c + f8;
        T.r.b(new C0625p0[]{U.a.a(new o0.s(b5)), b6.a(new e1.f(f10))}, AbstractC0874g.c(421772006, new V2(interfaceC1041r, l5, j3, f10, null, f9, c0873f), c0626q), c0626q, 56);
    }

    public static final void b(InterfaceC1193a interfaceC1193a, InterfaceC1041r interfaceC1041r, boolean z5, o0.L l3, long j3, long j4, float f6, C1417G c1417g, C1682j c1682j, C0873f c0873f, C0626q c0626q, int i6, int i7) {
        C1682j c1682j2;
        float f7 = 0;
        float f8 = (i7 & PegdownExtensions.FENCED_CODE_BLOCKS) != 0 ? 0 : f6;
        if (c1682j == null) {
            c0626q.b0(-1701037204);
            Object P5 = c0626q.P();
            if (P5 == C0616l.a) {
                P5 = new C1682j();
                c0626q.m0(P5);
            }
            c0626q.p(false);
            c1682j2 = (C1682j) P5;
        } else {
            c0626q.b0(2023337163);
            c0626q.p(false);
            c1682j2 = c1682j;
        }
        T.B b5 = a;
        float f9 = ((e1.f) c0626q.j(b5)).f11571c + f7;
        T.r.b(new C0625p0[]{U.a.a(new o0.s(j4)), b5.a(new e1.f(f9))}, AbstractC0874g.c(849208527, new W2(interfaceC1041r, l3, j3, f9, c1417g, c1682j2, z5, interfaceC1193a, f8, c0873f), c0626q), c0626q, 56);
    }

    public static final InterfaceC1041r c(InterfaceC1041r interfaceC1041r, o0.L l3, long j3, C1417G c1417g, float f6) {
        o0.L l5;
        InterfaceC1041r interfaceC1041r2;
        InterfaceC1041r interfaceC1041r3 = C1038o.a;
        if (f6 > S.l.f7374V) {
            l5 = l3;
            interfaceC1041r2 = o0.y.p(interfaceC1041r3, S.l.f7374V, S.l.f7374V, S.l.f7374V, f6, l5, 124895);
        } else {
            l5 = l3;
            interfaceC1041r2 = interfaceC1041r3;
        }
        InterfaceC1041r c6 = interfaceC1041r.c(interfaceC1041r2);
        if (c1417g != null) {
            interfaceC1041r3 = new C1416F(c1417g.a, c1417g.f13581b, l5);
        }
        return l0.h.c(AbstractC1464z.f(c6.c(interfaceC1041r3), j3, l5), l5);
    }

    public static final long d(long j3, float f6, C0626q c0626q) {
        N n3 = (N) c0626q.j(O.a);
        boolean booleanValue = ((Boolean) c0626q.j(O.f5451b)).booleanValue();
        long j4 = n3.f5426p;
        return (o0.s.d(j3, j4) && booleanValue) ? e1.f.c(f6, (float) 0) ? j4 : o0.y.k(o0.s.c(((((float) Math.log(f6 + 1)) * 4.5f) + 2.0f) / 100.0f, n3.f5430t), j4) : j3;
    }
}
