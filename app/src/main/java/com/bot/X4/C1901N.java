package x4;

/* renamed from: x4.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1901N extends h0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f15660h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f15661i;

    public /* synthetic */ C1901N(Object obj, int i6) {
        this.f15660h = i6;
        this.f15661i = obj;
    }

    @Override // x4.h0
    public final boolean j() {
        switch (this.f15660h) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override // x4.h0
    public final void k(Throwable th) {
        switch (this.f15660h) {
            case 0:
                ((InterfaceC1900M) this.f15661i).dispose();
                return;
            case 1:
                ((l4.c) this.f15661i).f(th);
                return;
            default:
                i0 i0Var = (i0) this.f15661i;
                Object obj = l0.f15714c.get(i());
                if (obj instanceof C1936s) {
                    i0Var.k(X3.a.b(((C1936s) obj).a));
                    return;
                } else {
                    i0Var.k(AbstractC1888A.F(obj));
                    return;
                }
        }
    }
}
