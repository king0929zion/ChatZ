package U;

import T.InterfaceC0598c;
import T.M0;
import b0.C0875h;
import b0.C0879l;

/* renamed from: U.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0675f extends J {

    /* renamed from: c, reason: collision with root package name */
    public static final C0675f f8572c = new J(0, 2, 1);

    @Override // U.J
    public final void a(L l3, InterfaceC0598c interfaceC0598c, M0 m02, C0879l c0879l, K k3) {
        C0875h c0875h = (C0875h) l3.d(1);
        int i6 = c0875h != null ? c0875h.a : 0;
        C0670a c0670a = (C0670a) l3.d(0);
        if (i6 > 0) {
            interfaceC0598c = new B3.s(interfaceC0598c, i6);
        }
        c0670a.S(interfaceC0598c, m02, c0879l, k3 != null ? new M.q(24, k3, m02) : null);
    }
}
