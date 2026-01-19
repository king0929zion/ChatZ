package v;

import e1.InterfaceC0961c;
import h0.AbstractC1040q;

/* renamed from: v.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1786a0 extends AbstractC1040q implements H0.u0 {

    /* renamed from: r, reason: collision with root package name */
    public float f15283r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15284s;

    @Override // H0.u0
    public final Object g(InterfaceC0961c interfaceC0961c, Object obj) {
        n0 n0Var = obj instanceof n0 ? (n0) obj : null;
        if (n0Var == null) {
            n0Var = new n0();
        }
        n0Var.a = this.f15283r;
        n0Var.f15331b = this.f15284s;
        return n0Var;
    }
}
