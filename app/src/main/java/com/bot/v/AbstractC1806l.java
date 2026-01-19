package v;

import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import b3.C0899o;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1033j;
import h0.InterfaceC1028e;
import h0.InterfaceC1041r;

/* renamed from: v.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1806l {
    public static final k.M a = c(true);

    /* renamed from: b, reason: collision with root package name */
    public static final k.M f15321b = c(false);

    /* renamed from: c, reason: collision with root package name */
    public static final C1805k f15322c;

    static {
        new C1808n(C1026c.f11786c, false);
        f15322c = C1805k.f15316b;
    }

    public static final void a(InterfaceC1041r interfaceC1041r, C0626q c0626q, int i6) {
        c0626q.d0(-211209833);
        int i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        if (c0626q.S(i7 & 1, (i7 & 3) != 2)) {
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, interfaceC1041r);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, f15322c, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            T.r.C(c0626q, C0150g.f1930h);
            T.r.G(c0626q, c6, C0150g.f1926d);
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0899o(interfaceC1041r, i6, 3);
        }
    }

    public static final void b(F0.j0 j0Var, F0.k0 k0Var, F0.U u5, e1.m mVar, int i6, int i7, InterfaceC1028e interfaceC1028e) {
        C1033j c1033j;
        Object H3 = u5.H();
        C1803j c1803j = H3 instanceof C1803j ? (C1803j) H3 : null;
        F0.j0.k(j0Var, k0Var, ((c1803j == null || (c1033j = c1803j.f15314r) == null) ? interfaceC1028e : c1033j).a((k0Var.f1485c << 32) | (k0Var.f1486e & 4294967295L), (i6 << 32) | (i7 & 4294967295L), mVar));
    }

    public static final k.M c(boolean z5) {
        k.M m3 = new k.M(9);
        C1033j c1033j = C1026c.f11786c;
        m3.m(c1033j, new C1808n(c1033j, z5));
        C1033j c1033j2 = C1026c.f11787e;
        m3.m(c1033j2, new C1808n(c1033j2, z5));
        C1033j c1033j3 = C1026c.f11788f;
        m3.m(c1033j3, new C1808n(c1033j3, z5));
        C1033j c1033j4 = C1026c.f11789g;
        m3.m(c1033j4, new C1808n(c1033j4, z5));
        C1033j c1033j5 = C1026c.f11790h;
        m3.m(c1033j5, new C1808n(c1033j5, z5));
        C1033j c1033j6 = C1026c.f11791i;
        m3.m(c1033j6, new C1808n(c1033j6, z5));
        C1033j c1033j7 = C1026c.f11792j;
        m3.m(c1033j7, new C1808n(c1033j7, z5));
        C1033j c1033j8 = C1026c.f11793k;
        m3.m(c1033j8, new C1808n(c1033j8, z5));
        C1033j c1033j9 = C1026c.f11794l;
        m3.m(c1033j9, new C1808n(c1033j9, z5));
        return m3;
    }

    public static final F0.V d(InterfaceC1028e interfaceC1028e, boolean z5) {
        F0.V v5 = (F0.V) (z5 ? a : f15321b).g(interfaceC1028e);
        return v5 == null ? new C1808n(interfaceC1028e, z5) : v5;
    }
}
