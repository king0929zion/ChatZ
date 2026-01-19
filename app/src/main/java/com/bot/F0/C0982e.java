package f0;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0982e extends AbstractC0983f {

    /* renamed from: e, reason: collision with root package name */
    public final l4.c f11678e;

    /* renamed from: f, reason: collision with root package name */
    public int f11679f;

    public C0982e(long j3, C0989l c0989l, l4.c cVar) {
        super(j3, c0989l);
        this.f11678e = cVar;
        this.f11679f = 1;
    }

    @Override // f0.AbstractC0983f
    public final void c() {
        if (this.f11681c) {
            return;
        }
        l();
        this.f11681c = true;
        synchronized (AbstractC0992o.f11707c) {
            o();
        }
    }

    @Override // f0.AbstractC0983f
    public final l4.c e() {
        return this.f11678e;
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
        this.f11679f++;
    }

    @Override // f0.AbstractC0983f
    public final void l() {
        int i6 = this.f11679f - 1;
        this.f11679f = i6;
        if (i6 == 0) {
            a();
        }
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
        AbstractC0992o.c(this);
        return new C0981d(this.f11680b, this.a, AbstractC0992o.k(cVar, this.f11678e, true), this);
    }
}
