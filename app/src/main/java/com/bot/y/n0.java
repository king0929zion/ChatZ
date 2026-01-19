package y;

import H0.A0;
import h0.AbstractC1040q;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import r.X0;

/* loaded from: classes.dex */
public final class n0 extends AbstractC1040q implements A0 {

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC1193a f15898r;

    /* renamed from: s, reason: collision with root package name */
    public i0 f15899s;

    /* renamed from: t, reason: collision with root package name */
    public X0 f15900t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f15901u;

    /* renamed from: v, reason: collision with root package name */
    public P0.j f15902v;

    /* renamed from: w, reason: collision with root package name */
    public final k0 f15903w = new k0(this, 0);

    /* renamed from: x, reason: collision with root package name */
    public k0 f15904x;

    public n0(InterfaceC1193a interfaceC1193a, i0 i0Var, X0 x02, boolean z5) {
        this.f15898r = interfaceC1193a;
        this.f15899s = i0Var;
        this.f15900t = x02;
        this.f15901u = z5;
        M0();
    }

    @Override // h0.AbstractC1040q
    public final boolean B0() {
        return false;
    }

    @Override // H0.A0
    public final void I(P0.x xVar) {
        P0.v.h(xVar);
        xVar.a(P0.t.f4519M, this.f15903w);
        if (this.f15900t == X0.f14183c) {
            P0.j jVar = this.f15902v;
            if (jVar == null) {
                AbstractC1276k.k("scrollAxisRange");
                throw null;
            }
            P0.w wVar = P0.t.f4543v;
            s4.e eVar = P0.v.a[13];
            xVar.a(wVar, jVar);
        } else {
            P0.j jVar2 = this.f15902v;
            if (jVar2 == null) {
                AbstractC1276k.k("scrollAxisRange");
                throw null;
            }
            P0.w wVar2 = P0.t.f4542u;
            s4.e eVar2 = P0.v.a[12];
            xVar.a(wVar2, jVar2);
        }
        k0 k0Var = this.f15904x;
        if (k0Var != null) {
            xVar.a(P0.l.f4471f, new P0.a(null, k0Var));
        }
        xVar.a(P0.l.f4466C, new P0.a(null, new B0.G(new l0(this, 2), 16)));
        P0.c e6 = this.f15899s.e();
        P0.w wVar3 = P0.t.f4527f;
        s4.e eVar3 = P0.v.a[23];
        xVar.a(wVar3, e6);
    }

    public final void M0() {
        this.f15902v = new P0.j(new l0(this, 0), new l0(this, 1));
        this.f15904x = this.f15901u ? new k0(this, 1) : null;
    }
}
