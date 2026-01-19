package U;

import T.AbstractC0629s;
import T.AbstractC0633u;
import T.InterfaceC0598c;
import T.M0;
import T.W;
import b0.C0879l;

/* renamed from: U.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0677h extends J {

    /* renamed from: c, reason: collision with root package name */
    public static final C0677h f8574c = new J(0, 4, 1);

    @Override // U.J
    public final void a(L l3, InterfaceC0598c interfaceC0598c, M0 m02, C0879l c0879l, K k3) {
        W w5 = (W) l3.d(2);
        AbstractC0633u abstractC0633u = (AbstractC0633u) l3.d(1);
        abstractC0633u.m(w5);
        AbstractC0629s.b("Could not resolve state for movable content");
        throw new RuntimeException();
    }
}
