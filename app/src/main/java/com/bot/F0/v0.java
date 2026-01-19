package F0;

/* loaded from: classes.dex */
public final class v0 {
    public final y0 a;

    /* renamed from: b, reason: collision with root package name */
    public Q f1537b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f1538c = new u0(this, 2);

    /* renamed from: d, reason: collision with root package name */
    public final u0 f1539d = new u0(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final u0 f1540e = new u0(this, 1);

    public v0(y0 y0Var) {
        this.a = y0Var;
    }

    public final Q a() {
        Q q3 = this.f1537b;
        if (q3 != null) {
            return q3;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
