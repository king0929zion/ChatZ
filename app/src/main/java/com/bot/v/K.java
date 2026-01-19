package v;

import e1.InterfaceC0961c;
import h0.AbstractC1040q;
import h0.C1031h;

/* loaded from: classes.dex */
public final class K extends AbstractC1040q implements H0.u0 {

    /* renamed from: r, reason: collision with root package name */
    public C1031h f15256r;

    @Override // H0.u0
    public final Object g(InterfaceC0961c interfaceC0961c, Object obj) {
        n0 n0Var = obj instanceof n0 ? (n0) obj : null;
        if (n0Var == null) {
            n0Var = new n0();
        }
        n0Var.f15332c = new C1815v(this.f15256r);
        return n0Var;
    }
}
