package r;

import b4.InterfaceC0905c;
import n.C1347v;
import x4.AbstractC1888A;

/* renamed from: r.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1521G implements InterfaceC1619x0 {
    public C1347v a;

    /* renamed from: b, reason: collision with root package name */
    public final C1572h1 f14036b;

    public C1521G(C1347v c1347v) {
        C1572h1 c1572h1 = AbstractC1587m1.f14390c;
        this.a = c1347v;
        this.f14036b = c1572h1;
    }

    @Override // r.InterfaceC1619x0
    public final Object a(InterfaceC1563e1 interfaceC1563e1, float f6, InterfaceC0905c interfaceC0905c) {
        return AbstractC1888A.H(this.f14036b, new C1519F(f6, this, interfaceC1563e1, null), interfaceC0905c);
    }
}
