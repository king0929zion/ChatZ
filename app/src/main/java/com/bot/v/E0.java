package v;

import e1.InterfaceC0961c;
import h0.AbstractC1040q;
import h0.C1032i;

/* loaded from: classes.dex */
public final class E0 extends AbstractC1040q implements H0.u0 {

    /* renamed from: r, reason: collision with root package name */
    public C1032i f15210r;

    @Override // H0.u0
    public final Object g(InterfaceC0961c interfaceC0961c, Object obj) {
        n0 n0Var = obj instanceof n0 ? (n0) obj : null;
        if (n0Var == null) {
            n0Var = new n0();
        }
        n0Var.f15332c = new C1816w(this.f15210r);
        return n0Var;
    }
}
