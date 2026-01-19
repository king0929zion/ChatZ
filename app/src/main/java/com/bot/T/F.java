package T;

/* loaded from: classes.dex */
public final class F implements B0 {

    /* renamed from: c, reason: collision with root package name */
    public final l4.c f7951c;

    /* renamed from: e, reason: collision with root package name */
    public G f7952e;

    public F(l4.c cVar) {
        this.f7951c = cVar;
    }

    @Override // T.B0
    public final void a() {
    }

    @Override // T.B0
    public final void b() {
        G g3 = this.f7952e;
        if (g3 != null) {
            g3.dispose();
        }
        this.f7952e = null;
    }

    @Override // T.B0
    public final void e() {
        this.f7952e = (G) this.f7951c.f(r.f8198c);
    }
}
