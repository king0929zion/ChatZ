package f0;

/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0981d extends AbstractC0983f {

    /* renamed from: e, reason: collision with root package name */
    public final l4.c f11676e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0983f f11677f;

    public C0981d(long j3, C0989l c0989l, l4.c cVar, AbstractC0983f abstractC0983f) {
        super(j3, c0989l);
        this.f11676e = cVar;
        this.f11677f = abstractC0983f;
        abstractC0983f.k();
    }

    @Override // f0.AbstractC0983f
    public final void c() {
        AbstractC0983f abstractC0983f = this.f11677f;
        if (this.f11681c) {
            return;
        }
        if (this.f11680b != abstractC0983f.g()) {
            a();
        }
        abstractC0983f.l();
        this.f11681c = true;
        synchronized (AbstractC0992o.f11707c) {
            o();
        }
    }

    @Override // f0.AbstractC0983f
    public final l4.c e() {
        return this.f11676e;
    }

    @Override // f0.AbstractC0983f
    public final boolean f() {
        return true;
    }

    @Override // f0.AbstractC0983f
    public final l4.c i() {
        return null;
    }

    @Override // f0.AbstractC0983f
    public final void k() {
        AbstractC0997t.l();
        throw null;
    }

    @Override // f0.AbstractC0983f
    public final void l() {
        AbstractC0997t.l();
        throw null;
    }

    @Override // f0.AbstractC0983f
    public final void m() {
    }

    @Override // f0.AbstractC0983f
    public final void n(InterfaceC0972B interfaceC0972B) {
        C0990m c0990m = AbstractC0992o.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // f0.AbstractC0983f
    public final AbstractC0983f u(l4.c cVar) {
        return new C0981d(this.f11680b, this.a, AbstractC0992o.k(cVar, this.f11676e, true), this.f11677f);
    }
}
