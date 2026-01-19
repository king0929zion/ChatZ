package U;

import T.AbstractC0629s;
import T.InterfaceC0598c;
import T.M0;
import b0.C0879l;

/* loaded from: classes.dex */
public final class A extends J {

    /* renamed from: c, reason: collision with root package name */
    public static final A f8536c = new J(0, 0, 3);

    @Override // U.J
    public final void a(L l3, InterfaceC0598c interfaceC0598c, M0 m02, C0879l c0879l, K k3) {
        if (m02.f7998n != 0) {
            AbstractC0629s.a("Cannot reset when inserting");
        }
        m02.G();
        m02.f8004t = 0;
        m02.f8005u = m02.o() - m02.f7992h;
        m02.f7993i = 0;
        m02.f7994j = 0;
        m02.f7999o = 0;
    }
}
