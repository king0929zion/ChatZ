package r;

import c4.EnumC0927a;
import m4.AbstractC1276k;
import x4.AbstractC1888A;

/* renamed from: r.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1613v0 extends AbstractC1592o0 {

    /* renamed from: L, reason: collision with root package name */
    public InterfaceC1616w0 f14491L;

    /* renamed from: M, reason: collision with root package name */
    public X0 f14492M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f14493N;

    /* renamed from: O, reason: collision with root package name */
    public l4.f f14494O;

    /* renamed from: P, reason: collision with root package name */
    public l4.f f14495P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f14496Q;

    @Override // r.AbstractC1592o0
    public final Object T0(C1586m0 c1586m0, C1589n0 c1589n0) {
        Object g3 = this.f14491L.g(new C1604s0(c1586m0, this, null), c1589n0);
        return g3 == EnumC0927a.f11114c ? g3 : X3.y.a;
    }

    @Override // r.AbstractC1592o0
    public final void Y0(long j3) {
        if (!this.f11819q || AbstractC1276k.b(this.f14494O, AbstractC1601r0.a)) {
            return;
        }
        AbstractC1888A.y(A0(), null, new C1607t0(this, j3, null), 1);
    }

    @Override // r.AbstractC1592o0
    public final void Z0(C1543U c1543u) {
        if (!this.f11819q || AbstractC1276k.b(this.f14495P, AbstractC1601r0.f14455b)) {
            return;
        }
        AbstractC1888A.y(A0(), null, new C1610u0(this, c1543u, null), 1);
    }

    @Override // r.AbstractC1592o0
    public final boolean e1() {
        return this.f14493N;
    }
}
