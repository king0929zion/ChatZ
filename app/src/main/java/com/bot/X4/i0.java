package x4;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class i0 extends C1928k {

    /* renamed from: l, reason: collision with root package name */
    public final l0 f15699l;

    public i0(InterfaceC0905c interfaceC0905c, l0 l0Var) {
        super(1, interfaceC0905c);
        this.f15699l = l0Var;
    }

    @Override // x4.C1928k
    public final String C() {
        return "AwaitContinuation";
    }

    @Override // x4.C1928k
    public final Throwable r(l0 l0Var) {
        Throwable b5;
        l0 l0Var2 = this.f15699l;
        l0Var2.getClass();
        Object obj = l0.f15714c.get(l0Var2);
        return (!(obj instanceof k0) || (b5 = ((k0) obj).b()) == null) ? obj instanceof C1936s ? ((C1936s) obj).a : l0Var.y() : b5;
    }
}
