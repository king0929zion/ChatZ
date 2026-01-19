package z3;

import b4.InterfaceC0910h;

/* renamed from: z3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2048s implements E3.b {

    /* renamed from: c, reason: collision with root package name */
    public final I3.u f16302c;

    /* renamed from: e, reason: collision with root package name */
    public final I3.H f16303e;

    /* renamed from: f, reason: collision with root package name */
    public final N3.j f16304f;

    /* renamed from: g, reason: collision with root package name */
    public final I3.o f16305g;

    public C2048s(E3.d dVar) {
        this.f16302c = dVar.f1305b;
        this.f16303e = dVar.a.b();
        this.f16304f = dVar.f1309f;
        this.f16305g = dVar.f1306c.t();
    }

    @Override // I3.s
    public final I3.m a() {
        return this.f16305g;
    }

    @Override // E3.b, x4.InterfaceC1942y
    public final InterfaceC0910h c() {
        throw new IllegalStateException("Call is not initialized");
    }

    @Override // E3.b
    public final N3.j getAttributes() {
        return this.f16304f;
    }

    @Override // E3.b
    public final I3.u getMethod() {
        return this.f16302c;
    }

    @Override // E3.b
    public final I3.H getUrl() {
        return this.f16303e;
    }
}
