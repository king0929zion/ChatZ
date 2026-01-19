package Q;

import P2.C0343a0;
import T.AbstractC0623o0;
import T.C0616l;
import T.C0625p0;
import T.C0626q;
import T.C0627q0;
import b0.AbstractC0874g;
import b0.C0873f;
import com.vladsch.flexmark.parser.PegdownExtensions;
import p.AbstractC1450o0;

/* loaded from: classes.dex */
public abstract class E0 {
    public static final T.e1 a;

    /* JADX WARN: Type inference failed for: r1v2, types: [T.e1, T.o0] */
    static {
        X3.a.d(new O.A(11));
        a = new AbstractC0623o0(new O.A(12));
    }

    public static final void a(N n3, InterfaceC0471u1 interfaceC0471u1, V1 v12, t3 t3Var, C0873f c0873f, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(904511636);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(n3) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.f(interfaceC0471u1) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.f(v12) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q.f(t3Var) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0626q.h(c0873f) ? 16384 : 8192;
        }
        if (c0626q.S(i7 & 1, (i7 & 9363) != 9362)) {
            c0626q.X();
            if ((i6 & 1) != 0 && !c0626q.B()) {
                c0626q.V();
            }
            c0626q.q();
            T1 a6 = S1.a(S.l.f7374V, 7, 0L, false);
            long j3 = n3.a;
            boolean e6 = c0626q.e(j3);
            Object P5 = c0626q.P();
            if (e6 || P5 == C0616l.a) {
                P5 = new O.T0(j3, o0.s.c(0.4f, j3));
                c0626q.m0(P5);
            }
            T.r.b(new C0625p0[]{O.a.a(n3), a.a(interfaceC0471u1), AbstractC1450o0.a.a(a6), W1.a.a(v12), O.U0.a.a((O.T0) P5), u3.a.a(t3Var)}, AbstractC0874g.c(-1750539308, new J1.m(4, t3Var, c0873f), c0626q), c0626q, 56);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0343a0(n3, interfaceC0471u1, v12, t3Var, c0873f, i6, 1);
        }
    }

    public static final void b(N n3, V1 v12, t3 t3Var, C0873f c0873f, C0626q c0626q, int i6) {
        N n5;
        C0626q c0626q2;
        C0873f c0873f2;
        t3 t3Var2;
        V1 v13;
        c0626q.d0(-449719819);
        int i7 = (c0626q.f(n3) ? 4 : 2) | i6 | 16 | (c0626q.h(c0873f) ? 2048 : PegdownExtensions.ANCHORLINKS);
        if (c0626q.S(i7 & 1, (i7 & 1171) != 1170)) {
            c0626q.X();
            if ((i6 & 1) == 0 || c0626q.B()) {
                v12 = (V1) c0626q.j(W1.a);
            } else {
                c0626q.V();
            }
            int i8 = i7 & (-113);
            V1 v14 = v12;
            c0626q.q();
            n5 = n3;
            c0626q2 = c0626q;
            a(n5, (InterfaceC0471u1) c0626q.j(a), v14, t3Var, c0873f, c0626q2, (i8 & 14) | 3072 | ((i8 << 3) & 57344));
            t3Var2 = t3Var;
            c0873f2 = c0873f;
            v13 = v14;
        } else {
            n5 = n3;
            c0626q2 = c0626q;
            c0873f2 = c0873f;
            t3Var2 = t3Var;
            c0626q2.V();
            v13 = v12;
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new K.d(n5, v13, t3Var2, c0873f2, i6);
        }
    }
}
