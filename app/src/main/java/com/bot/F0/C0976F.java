package f0;

import k.N;

/* renamed from: f0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0976F extends C0979b {

    /* renamed from: o, reason: collision with root package name */
    public final C0979b f11653o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f11654p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f11655q;

    /* renamed from: r, reason: collision with root package name */
    public l4.c f11656r;

    /* renamed from: s, reason: collision with root package name */
    public l4.c f11657s;

    /* renamed from: t, reason: collision with root package name */
    public final long f11658t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0976F(f0.C0979b r8, l4.c r9, l4.c r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            f0.m r0 = f0.AbstractC0992o.a
            if (r8 == 0) goto La
            l4.c r0 = r8.e()
            if (r0 != 0) goto Le
        La:
            f0.a r0 = f0.AbstractC0992o.f11714j
            l4.c r0 = r0.f11665e
        Le:
            l4.c r5 = f0.AbstractC0992o.k(r9, r0, r11)
            if (r8 == 0) goto L1a
            l4.c r9 = r8.i()
            if (r9 != 0) goto L1e
        L1a:
            f0.a r9 = f0.AbstractC0992o.f11714j
            l4.c r9 = r9.f11666f
        L1e:
            l4.c r6 = f0.AbstractC0992o.l(r10, r9)
            r2 = 0
            f0.l r4 = f0.C0989l.f11697h
            r1 = r7
            r1.<init>(r2, r4, r5, r6)
            r1.f11653o = r8
            r1.f11654p = r11
            r1.f11655q = r12
            l4.c r8 = r1.f11665e
            r1.f11656r = r8
            l4.c r8 = r1.f11666f
            r1.f11657s = r8
            long r8 = b0.AbstractC0874g.b()
            r1.f11658t = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0976F.<init>(f0.b, l4.c, l4.c, boolean, boolean):void");
    }

    @Override // f0.C0979b
    public final void B(N n3) {
        AbstractC0997t.l();
        throw null;
    }

    @Override // f0.C0979b
    public final C0979b C(l4.c cVar, l4.c cVar2) {
        l4.c k3 = AbstractC0992o.k(cVar, this.f11656r, true);
        l4.c l3 = AbstractC0992o.l(cVar2, this.f11657s);
        return !this.f11654p ? new C0976F(D().C(null, l3), k3, l3, false, true) : D().C(k3, l3);
    }

    public final C0979b D() {
        C0979b c0979b = this.f11653o;
        return c0979b == null ? AbstractC0992o.f11714j : c0979b;
    }

    @Override // f0.C0979b, f0.AbstractC0983f
    public final void c() {
        C0979b c0979b;
        this.f11681c = true;
        if (!this.f11655q || (c0979b = this.f11653o) == null) {
            return;
        }
        c0979b.c();
    }

    @Override // f0.AbstractC0983f
    public final C0989l d() {
        return D().d();
    }

    @Override // f0.C0979b, f0.AbstractC0983f
    public final l4.c e() {
        return this.f11656r;
    }

    @Override // f0.C0979b, f0.AbstractC0983f
    public final boolean f() {
        return D().f();
    }

    @Override // f0.AbstractC0983f
    public final long g() {
        return D().g();
    }

    @Override // f0.C0979b, f0.AbstractC0983f
    public final int h() {
        return D().h();
    }

    @Override // f0.C0979b, f0.AbstractC0983f
    public final l4.c i() {
        return this.f11657s;
    }

    @Override // f0.C0979b, f0.AbstractC0983f
    public final void k() {
        AbstractC0997t.l();
        throw null;
    }

    @Override // f0.C0979b, f0.AbstractC0983f
    public final void l() {
        AbstractC0997t.l();
        throw null;
    }

    @Override // f0.C0979b, f0.AbstractC0983f
    public final void m() {
        D().m();
    }

    @Override // f0.C0979b, f0.AbstractC0983f
    public final void n(InterfaceC0972B interfaceC0972B) {
        D().n(interfaceC0972B);
    }

    @Override // f0.AbstractC0983f
    public final void r(C0989l c0989l) {
        AbstractC0997t.l();
        throw null;
    }

    @Override // f0.AbstractC0983f
    public final void s(long j3) {
        AbstractC0997t.l();
        throw null;
    }

    @Override // f0.C0979b, f0.AbstractC0983f
    public final void t(int i6) {
        D().t(i6);
    }

    @Override // f0.C0979b, f0.AbstractC0983f
    public final AbstractC0983f u(l4.c cVar) {
        l4.c k3 = AbstractC0992o.k(cVar, this.f11656r, true);
        return !this.f11654p ? AbstractC0992o.g(D().u(null), k3, true) : D().u(k3);
    }

    @Override // f0.C0979b
    public final AbstractC0997t w() {
        return D().w();
    }

    @Override // f0.C0979b
    public final N x() {
        return D().x();
    }

    @Override // f0.C0979b
    /* renamed from: y */
    public final l4.c e() {
        return this.f11656r;
    }
}
