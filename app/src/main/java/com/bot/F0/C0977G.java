package f0;

import b0.AbstractC0874g;

/* renamed from: f0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0977G extends AbstractC0983f {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0983f f11659e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11660f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11661g;

    /* renamed from: h, reason: collision with root package name */
    public l4.c f11662h;

    /* renamed from: i, reason: collision with root package name */
    public final long f11663i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0977G(AbstractC0983f abstractC0983f, l4.c cVar, boolean z5, boolean z6) {
        super(0L, C0989l.f11697h);
        l4.c e6;
        C0990m c0990m = AbstractC0992o.a;
        this.f11659e = abstractC0983f;
        this.f11660f = z5;
        this.f11661g = z6;
        this.f11662h = AbstractC0992o.k(cVar, (abstractC0983f == null || (e6 = abstractC0983f.e()) == null) ? AbstractC0992o.f11714j.f11665e : e6, z5);
        this.f11663i = AbstractC0874g.b();
    }

    @Override // f0.AbstractC0983f
    public final void c() {
        AbstractC0983f abstractC0983f;
        this.f11681c = true;
        if (!this.f11661g || (abstractC0983f = this.f11659e) == null) {
            return;
        }
        abstractC0983f.c();
    }

    @Override // f0.AbstractC0983f
    public final C0989l d() {
        return v().d();
    }

    @Override // f0.AbstractC0983f
    public final l4.c e() {
        return this.f11662h;
    }

    @Override // f0.AbstractC0983f
    public final boolean f() {
        return v().f();
    }

    @Override // f0.AbstractC0983f
    public final long g() {
        return v().g();
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
        v().m();
    }

    @Override // f0.AbstractC0983f
    public final void n(InterfaceC0972B interfaceC0972B) {
        v().n(interfaceC0972B);
    }

    @Override // f0.AbstractC0983f
    public final AbstractC0983f u(l4.c cVar) {
        l4.c k3 = AbstractC0992o.k(cVar, this.f11662h, true);
        return !this.f11660f ? AbstractC0992o.g(v().u(null), k3, true) : v().u(k3);
    }

    public final AbstractC0983f v() {
        AbstractC0983f abstractC0983f = this.f11659e;
        return abstractC0983f == null ? AbstractC0992o.f11714j : abstractC0983f;
    }
}
