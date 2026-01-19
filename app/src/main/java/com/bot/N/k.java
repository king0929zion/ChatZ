package N;

import D.H0;
import F0.InterfaceC0134w;
import O.A0;
import O.C0319l0;
import O.H;
import O.I;
import O.L;
import O.z0;
import n0.C1353b;

/* loaded from: classes.dex */
public final class k implements H0 {
    public long a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f3574b = 0;

    /* renamed from: c, reason: collision with root package name */
    public H f3575c = I.f3953d;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f3576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0 f3577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f3578f;

    public k(h hVar, z0 z0Var, long j3) {
        this.f3576d = hVar;
        this.f3577e = z0Var;
        this.f3578f = j3;
    }

    @Override // D.H0
    public final void a(long j3, H h3) {
        this.f3575c = h3;
        InterfaceC0134w interfaceC0134w = (InterfaceC0134w) this.f3576d.b();
        z0 z0Var = this.f3577e;
        if (interfaceC0134w != null) {
            if (!interfaceC0134w.j()) {
                return;
            }
            H h6 = this.f3575c;
            C0319l0 c0319l0 = z0Var.f4268f;
            if (c0319l0 != null) {
                c0319l0.i(Boolean.TRUE, interfaceC0134w, new C1353b(j3), h6);
            }
            this.a = j3;
        }
        if (A0.a(z0Var, this.f3578f)) {
            this.f3574b = 0L;
        }
    }

    @Override // D.H0
    public final void b() {
        L l3;
        long j3 = this.f3578f;
        z0 z0Var = this.f3577e;
        if (!A0.a(z0Var, j3) || (l3 = z0Var.f4270h) == null) {
            return;
        }
        l3.b();
    }

    @Override // D.H0
    public final void c() {
    }

    @Override // D.H0
    public final void d() {
    }

    @Override // D.H0
    public final void e(long j3) {
        InterfaceC0134w interfaceC0134w = (InterfaceC0134w) this.f3576d.b();
        if (interfaceC0134w == null || !interfaceC0134w.j()) {
            return;
        }
        z0 z0Var = this.f3577e;
        if (A0.a(z0Var, this.f3578f)) {
            long f6 = C1353b.f(this.f3574b, j3);
            this.f3574b = f6;
            long f7 = C1353b.f(this.a, f6);
            if (z0Var.b(interfaceC0134w, f7, this.a, this.f3575c, true)) {
                this.a = f7;
                this.f3574b = 0L;
            }
        }
    }

    @Override // D.H0
    public final void onCancel() {
        L l3;
        long j3 = this.f3578f;
        z0 z0Var = this.f3577e;
        if (!A0.a(z0Var, j3) || (l3 = z0Var.f4270h) == null) {
            return;
        }
        l3.b();
    }
}
