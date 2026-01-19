package n;

import T.C0607g0;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class r0 {
    public final E0 a;

    /* renamed from: b, reason: collision with root package name */
    public final C0607g0 f13222b = T.r.A(null);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0 f13223c;

    public r0(y0 y0Var, E0 e02, String str) {
        this.f13223c = y0Var;
        this.a = e02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final q0 a(l4.c cVar, l4.c cVar2) {
        C0607g0 c0607g0 = this.f13222b;
        q0 q0Var = (q0) c0607g0.getValue();
        y0 y0Var = this.f13223c;
        if (q0Var == null) {
            Object f6 = cVar2.f(y0Var.a.k());
            Object f7 = cVar2.f(y0Var.a.k());
            E0 e02 = this.a;
            AbstractC1343r abstractC1343r = (AbstractC1343r) e02.a.f(f7);
            abstractC1343r.d();
            u0 u0Var = new u0(y0Var, f6, abstractC1343r, e02);
            q0Var = new q0(this, u0Var, cVar, cVar2);
            c0607g0.setValue(q0Var);
            y0Var.f13285i.add(u0Var);
        }
        q0Var.f13220f = (AbstractC1277l) cVar2;
        q0Var.f13219e = cVar;
        q0Var.a(y0Var.f());
        return q0Var;
    }
}
