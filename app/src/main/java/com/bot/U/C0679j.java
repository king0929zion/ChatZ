package U;

import T.AbstractC0629s;
import T.C0594a;
import T.InterfaceC0598c;
import T.M0;
import b0.C0875h;
import b0.C0879l;

/* renamed from: U.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0679j extends J {

    /* renamed from: c, reason: collision with root package name */
    public static final C0679j f8576c = new J(0, 2, 1);

    @Override // U.J
    public final void a(L l3, InterfaceC0598c interfaceC0598c, M0 m02, C0879l c0879l, K k3) {
        int i6;
        C0875h c0875h = (C0875h) l3.d(0);
        int c6 = m02.c((C0594a) l3.d(1));
        if (m02.f8004t >= c6) {
            AbstractC0629s.a("Check failed");
        }
        h5.e.e0(m02, interfaceC0598c, c6);
        int i7 = m02.f8004t;
        int i8 = m02.f8006v;
        while (i8 >= 0 && !m02.y(i8)) {
            i8 = m02.E(m02.f7986b, i8);
        }
        int i9 = i8 + 1;
        int i10 = 0;
        while (i9 < i7) {
            if (m02.v(i7, i9)) {
                if (m02.y(i9)) {
                    i10 = 0;
                }
                i9++;
            } else {
                i10 += m02.y(i9) ? 1 : m02.f7986b[(m02.r(i9) * 5) + 1] & 67108863;
                i9 += m02.u(i9);
            }
        }
        while (true) {
            i6 = m02.f8004t;
            if (i6 >= c6) {
                break;
            }
            if (m02.v(c6, i6)) {
                int i11 = m02.f8004t;
                if (i11 < m02.f8005u && (m02.f7986b[(m02.r(i11) * 5) + 1] & 1073741824) != 0) {
                    interfaceC0598c.d(m02.D(m02.f8004t));
                    i10 = 0;
                }
                m02.P();
            } else {
                i10 += m02.L();
            }
        }
        if (i6 != c6) {
            AbstractC0629s.a("Check failed");
        }
        c0875h.a = i10;
    }
}
