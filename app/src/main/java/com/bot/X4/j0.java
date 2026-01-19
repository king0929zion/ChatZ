package x4;

/* loaded from: classes.dex */
public final class j0 extends h0 {

    /* renamed from: h, reason: collision with root package name */
    public final l0 f15700h;

    /* renamed from: i, reason: collision with root package name */
    public final k0 f15701i;

    /* renamed from: j, reason: collision with root package name */
    public final C1932o f15702j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f15703k;

    public j0(l0 l0Var, k0 k0Var, C1932o c1932o, Object obj) {
        this.f15700h = l0Var;
        this.f15701i = k0Var;
        this.f15702j = c1932o;
        this.f15703k = obj;
    }

    @Override // x4.h0
    public final boolean j() {
        return false;
    }

    @Override // x4.h0
    public final void k(Throwable th) {
        C1932o c1932o = this.f15702j;
        C1932o c02 = l0.c0(c1932o);
        l0 l0Var = this.f15700h;
        k0 k0Var = this.f15701i;
        Object obj = this.f15703k;
        if (c02 == null || !l0Var.m0(k0Var, c02, obj)) {
            k0Var.f15712c.b(new C4.i(2), 2);
            C1932o c03 = l0.c0(c1932o);
            if (c03 == null || !l0Var.m0(k0Var, c03, obj)) {
                l0Var.v(l0Var.K(k0Var, obj));
            }
        }
    }
}
