package l0;

import B0.C0028d;
import H0.AbstractC0157l;
import H0.InterfaceC0160o;
import H0.L;
import H0.m0;
import e1.InterfaceC0961c;
import f0.C0987j;
import h0.AbstractC1040q;
import m4.AbstractC1276k;
import o4.AbstractC1410a;

/* renamed from: l0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1183c extends AbstractC1040q implements m0, InterfaceC1182b, InterfaceC0160o {

    /* renamed from: r, reason: collision with root package name */
    public final d f12640r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f12641s;

    /* renamed from: t, reason: collision with root package name */
    public l4.c f12642t;

    public C1183c(d dVar, l4.c cVar) {
        this.f12640r = dVar;
        this.f12642t = cVar;
        dVar.f12643c = this;
    }

    @Override // h0.AbstractC1040q
    public final void F0() {
    }

    @Override // h0.AbstractC1040q
    public final void G0() {
        M0();
    }

    public final void M0() {
        this.f12641s = false;
        this.f12640r.f12644e = null;
        AbstractC0157l.k(this);
    }

    @Override // H0.InterfaceC0160o
    public final void Q() {
        M0();
    }

    @Override // H0.InterfaceC0155j
    public final void U() {
        M0();
    }

    @Override // l0.InterfaceC1182b
    public final InterfaceC0961c a() {
        return AbstractC0157l.v(this).f1714C;
    }

    @Override // H0.InterfaceC0155j, H0.w0
    public final void b() {
        M0();
    }

    @Override // l0.InterfaceC1182b
    public final long c() {
        return AbstractC1410a.S(AbstractC0157l.t(this, 4).f1487f);
    }

    @Override // l0.InterfaceC1182b
    public final e1.m getLayoutDirection() {
        return AbstractC0157l.v(this).f1715D;
    }

    @Override // H0.m0
    public final void i0() {
        M0();
    }

    @Override // H0.InterfaceC0160o
    public final void k0(L l3) {
        boolean z5 = this.f12641s;
        d dVar = this.f12640r;
        if (!z5) {
            dVar.f12644e = null;
            AbstractC0157l.r(this, new C0028d(7, this, dVar));
            if (dVar.f12644e == null) {
                throw B3.e.f("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f12641s = true;
        }
        C0987j c0987j = dVar.f12644e;
        AbstractC1276k.c(c0987j);
        ((l4.c) c0987j.f11690e).f(l3);
    }
}
