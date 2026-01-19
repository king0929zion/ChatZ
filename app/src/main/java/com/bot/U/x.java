package U;

import T.C0;
import T.C0627q0;
import T.InterfaceC0598c;
import T.M0;
import b0.C0876i;
import b0.C0879l;
import java.util.Set;
import k.V;

/* loaded from: classes.dex */
public final class x extends J {

    /* renamed from: c, reason: collision with root package name */
    public static final x f8594c = new J(0, 1, 1);

    @Override // U.J
    public final void a(L l3, InterfaceC0598c interfaceC0598c, M0 m02, C0879l c0879l, K k3) {
        C0627q0 c0627q0 = (C0627q0) l3.d(0);
        Set set = c0879l.a;
        if (set == null) {
            return;
        }
        C0876i c0876i = new C0876i(set);
        k.M m3 = c0879l.f10996i;
        if (m3 == null) {
            long[] jArr = V.a;
            m3 = new k.M();
            c0879l.f10996i = m3;
        }
        m3.m(c0627q0, c0876i);
        c0879l.f10992e.b(new C0(c0876i, -1));
    }
}
