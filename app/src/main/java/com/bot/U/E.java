package U;

import T.AbstractC0629s;
import T.C0;
import T.C0627q0;
import T.InterfaceC0598c;
import T.M0;
import b0.C0879l;

/* loaded from: classes.dex */
public final class E extends J {

    /* renamed from: c, reason: collision with root package name */
    public static final E f8540c = new J(1, 0, 2);

    @Override // U.J
    public final void a(L l3, InterfaceC0598c interfaceC0598c, M0 m02, C0879l c0879l, K k3) {
        int c6 = l3.c(0);
        int i6 = m02.f8006v;
        int N5 = m02.N(m02.f7986b, m02.r(i6));
        int g3 = m02.g(m02.f7986b, m02.r(i6 + 1));
        for (int max = Math.max(N5, g3 - c6); max < g3; max++) {
            Object obj = m02.f7987c[m02.h(max)];
            if (obj instanceof C0) {
                c0879l.e((C0) obj);
            } else if (obj instanceof C0627q0) {
                ((C0627q0) obj).d();
            }
        }
        if (c6 <= 0) {
            AbstractC0629s.a("Check failed");
        }
        int i7 = m02.f8006v;
        int N6 = m02.N(m02.f7986b, m02.r(i7));
        int g6 = m02.g(m02.f7986b, m02.r(i7 + 1)) - c6;
        if (g6 < N6) {
            AbstractC0629s.a("Check failed");
        }
        m02.J(g6, c6, i7);
        int i8 = m02.f7993i;
        if (i8 >= N6) {
            m02.f7993i = i8 - c6;
        }
    }
}
