package N;

import B0.AbstractC0047x;
import B0.C0040p;
import B0.InterfaceC0045v;
import B0.P;
import B0.Q;
import O.O;
import O.z0;
import S0.L;
import T.B0;
import h0.InterfaceC1041r;
import k.C1151E;
import m4.AbstractC1276k;
import u.AbstractC1734b;

/* loaded from: classes.dex */
public final class i implements B0 {

    /* renamed from: c, reason: collision with root package name */
    public final long f3567c;

    /* renamed from: e, reason: collision with root package name */
    public final z0 f3568e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3569f;

    /* renamed from: g, reason: collision with root package name */
    public m f3570g = m.f3583c;

    /* renamed from: h, reason: collision with root package name */
    public O.r f3571h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC1041r f3572i;

    public i(long j3, z0 z0Var, long j4) {
        this.f3567c = j3;
        this.f3568e = z0Var;
        this.f3569f = j4;
        h hVar = new h(this, 2);
        k kVar = new k(hVar, z0Var, j3);
        l lVar = new l(hVar, z0Var, j3);
        j jVar = new j(lVar, kVar);
        C0040p c0040p = Q.a;
        P p5 = new P(lVar, kVar, jVar, 4);
        InterfaceC0045v.a.getClass();
        this.f3572i = AbstractC0047x.g(p5, AbstractC0047x.f479b);
    }

    @Override // T.B0
    public final void a() {
        O.r rVar = this.f3571h;
        if (rVar != null) {
            this.f3568e.d(rVar);
            this.f3571h = null;
        }
    }

    @Override // T.B0
    public final void b() {
        O.r rVar = this.f3571h;
        if (rVar != null) {
            this.f3568e.d(rVar);
            this.f3571h = null;
        }
    }

    public final void c(L l3) {
        O o5;
        L l5 = this.f3570g.f3584b;
        if (l5 != null && !AbstractC1276k.b(l5.a.a, l3.a.a) && (o5 = this.f3568e.f4271i) != null) {
            o5.f(Long.valueOf(this.f3567c));
        }
        this.f3570g = m.a(this.f3570g, null, l3, 1);
    }

    @Override // T.B0
    public final void e() {
        h hVar = new h(this, 0);
        h hVar2 = new h(this, 1);
        long j3 = this.f3567c;
        O.r rVar = new O.r(j3, hVar, hVar2);
        z0 z0Var = this.f3568e;
        C1151E c1151e = z0Var.f4265c;
        if (j3 == 0) {
            AbstractC1734b.a("The selectable contains an invalid id: " + j3);
        }
        if (c1151e.b(j3)) {
            AbstractC1734b.a("Another selectable with the id: " + rVar + ".selectableId has already subscribed.");
        }
        c1151e.h(j3, rVar);
        z0Var.f4264b.add(rVar);
        z0Var.a = false;
        this.f3571h = rVar;
    }
}
