package D;

import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import S0.C0543e;
import S0.C0545g;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import h0.AbstractC1024a;
import h0.C1038o;
import h0.InterfaceC1041r;
import java.util.List;

/* renamed from: D.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0078l {
    public static final X3.i a;

    static {
        Y3.v vVar = Y3.v.f9812c;
        a = new X3.i(vVar, vVar);
    }

    public static final void a(C0545g c0545g, List list, C0626q c0626q, int i6) {
        c0626q.d0(-1794596951);
        int i7 = (i6 & 6) == 0 ? (c0626q.f(c0545g) ? 4 : 2) | i6 : i6;
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(list) ? 32 : 16;
        }
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                C0543e c0543e = (C0543e) list.get(i8);
                l4.f fVar = (l4.f) c0543e.a;
                int i9 = c0543e.f7626b;
                int i10 = c0543e.f7627c;
                Object P5 = c0626q.P();
                if (P5 == C0616l.a) {
                    P5 = C0076k.f1049b;
                    c0626q.m0(P5);
                }
                F0.V v5 = (F0.V) P5;
                int hashCode = Long.hashCode(c0626q.f8164T);
                InterfaceC0617l0 l3 = c0626q.l();
                InterfaceC1041r c6 = AbstractC1024a.c(c0626q, C1038o.a);
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
                fVar.d(c0545g.subSequence(i9, i10).f7630e, c0626q, 0);
                c0626q.p(true);
            }
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0072i(i6, 0, c0545g, list);
        }
    }
}
