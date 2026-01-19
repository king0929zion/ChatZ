package n;

import T.d1;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class q0 implements d1 {

    /* renamed from: c, reason: collision with root package name */
    public final u0 f13218c;

    /* renamed from: e, reason: collision with root package name */
    public l4.c f13219e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC1277l f13220f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r0 f13221g;

    /* JADX WARN: Multi-variable type inference failed */
    public q0(r0 r0Var, u0 u0Var, l4.c cVar, l4.c cVar2) {
        this.f13221g = r0Var;
        this.f13218c = u0Var;
        this.f13219e = cVar;
        this.f13220f = (AbstractC1277l) cVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m4.l, l4.c] */
    /* JADX WARN: Type inference failed for: r1v5, types: [m4.l, l4.c] */
    public final void a(s0 s0Var) {
        Object f6 = this.f13220f.f(s0Var.c());
        boolean g3 = this.f13221g.f13223c.g();
        u0 u0Var = this.f13218c;
        if (g3) {
            u0Var.g(this.f13220f.f(s0Var.b()), f6, (InterfaceC1351z) this.f13219e.f(s0Var));
        } else {
            u0Var.h(f6, (InterfaceC1351z) this.f13219e.f(s0Var));
        }
    }

    @Override // T.d1
    public final Object getValue() {
        a(this.f13221g.f13223c.f());
        return this.f13218c.f13264m.getValue();
    }
}
