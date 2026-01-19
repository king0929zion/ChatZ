package T;

import Z2.C0741a0;
import b4.InterfaceC0908f;
import b4.InterfaceC0909g;
import b4.InterfaceC0910h;
import kotlinx.coroutines.CoroutineExceptionHandler;
import x4.AbstractC1888A;
import x4.C1940w;

/* loaded from: classes.dex */
public final class S implements B0, CoroutineExceptionHandler {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0910h f8024c;

    /* renamed from: e, reason: collision with root package name */
    public final l4.e f8025e;

    /* renamed from: f, reason: collision with root package name */
    public final C4.c f8026f;

    /* renamed from: g, reason: collision with root package name */
    public x4.s0 f8027g;

    public S(InterfaceC0910h interfaceC0910h, l4.e eVar) {
        this.f8024c = interfaceC0910h;
        this.f8025e = eVar;
        this.f8026f = AbstractC1888A.c(interfaceC0910h.Y(this));
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void N(InterfaceC0910h interfaceC0910h, Throwable th) {
        g0.d dVar = (g0.d) interfaceC0910h.r(g0.d.f11769e);
        if (dVar != null) {
            s4.j.O(th, new C0741a0(1, dVar, this));
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.f8024c.r(C1940w.f15730c);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.N(interfaceC0910h, th);
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0910h Y(InterfaceC0910h interfaceC0910h) {
        return Y4.d.P(this, interfaceC0910h);
    }

    @Override // T.B0
    public final void a() {
        x4.s0 s0Var = this.f8027g;
        if (s0Var != null) {
            s0Var.C(new J(1));
        }
        this.f8027g = null;
    }

    @Override // T.B0
    public final void b() {
        x4.s0 s0Var = this.f8027g;
        if (s0Var != null) {
            s0Var.C(new J(1));
        }
        this.f8027g = null;
    }

    @Override // T.B0
    public final void e() {
        x4.s0 s0Var = this.f8027g;
        if (s0Var != null) {
            s0Var.f(AbstractC1888A.a("Old job was still running!", null));
        }
        this.f8027g = AbstractC1888A.y(this.f8026f, null, this.f8025e, 3);
    }

    @Override // b4.InterfaceC0908f
    public final InterfaceC0909g getKey() {
        return C1940w.f15730c;
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0910h h(InterfaceC0909g interfaceC0909g) {
        return Y4.d.L(this, interfaceC0909g);
    }

    @Override // b4.InterfaceC0910h
    public final Object q(Object obj, l4.e eVar) {
        return eVar.m(obj, this);
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0908f r(InterfaceC0909g interfaceC0909g) {
        return Y4.d.F(this, interfaceC0909g);
    }
}
