package Q;

import O.C0325o0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n.C1304M;
import x4.AbstractC1888A;
import x4.C1928k;

/* loaded from: classes.dex */
public final class s3 {
    public final p.C0 a;

    /* renamed from: b, reason: collision with root package name */
    public final C1304M f6103b = new C1304M(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    public C1928k f6104c;

    public s3(p.C0 c02) {
        this.a = c02;
    }

    public final void a() {
        this.f6103b.f13029c.setValue(Boolean.FALSE);
    }

    public final boolean b() {
        C1304M c1304m = this.f6103b;
        return ((Boolean) c1304m.f13028b.getValue()).booleanValue() || ((Boolean) c1304m.f13029c.getValue()).booleanValue();
    }

    public final Object c(p.x0 x0Var, d4.i iVar) {
        InterfaceC0905c interfaceC0905c = null;
        I2.u uVar = new I2.u(this, new C0325o0(this, interfaceC0905c, 2), x0Var, interfaceC0905c, 1);
        p.C0 c02 = this.a;
        c02.getClass();
        Object l3 = AbstractC1888A.l(new p.A0(x0Var, c02, uVar, null), iVar);
        return l3 == EnumC0927a.f11114c ? l3 : X3.y.a;
    }
}
