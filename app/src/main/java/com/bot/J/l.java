package J;

import F0.InterfaceC0134w;
import H0.AbstractC0156k;
import H0.InterfaceC0154i;
import M.q;
import T.E;
import T.r;
import n0.C1354c;
import x4.s0;

/* loaded from: classes.dex */
public final class l extends AbstractC0156k implements InterfaceC0154i, K.e {

    /* renamed from: t, reason: collision with root package name */
    public q f2799t;

    /* renamed from: u, reason: collision with root package name */
    public d4.i f2800u;

    /* renamed from: v, reason: collision with root package name */
    public l4.c f2801v;

    /* renamed from: w, reason: collision with root package name */
    public l4.c f2802w;

    /* renamed from: x, reason: collision with root package name */
    public s0 f2803x;

    /* renamed from: y, reason: collision with root package name */
    public final E f2804y = r.s(new A.b(this, 12));

    /* renamed from: z, reason: collision with root package name */
    public C1354c f2805z = C1354c.f13294e;

    /* JADX WARN: Multi-variable type inference failed */
    public l(q qVar, l4.c cVar, l4.c cVar2, l4.c cVar3) {
        this.f2799t = qVar;
        this.f2800u = (d4.i) cVar;
        this.f2801v = cVar2;
        this.f2802w = cVar3;
    }

    @Override // h0.AbstractC1040q
    public final void E0() {
        q qVar = this.f2799t;
        qVar.f3180f = m.f2808f;
        qVar.f3179e = this;
    }

    @Override // h0.AbstractC1040q
    public final void F0() {
        q qVar = this.f2799t;
        qVar.f3180f = m.f2807e;
        qVar.f3179e = null;
    }

    @Override // K.e
    public final G.c data() {
        return (G.c) this.f2804y.getValue();
    }

    @Override // K.e
    public final long l(InterfaceC0134w interfaceC0134w) {
        return r(interfaceC0134w).e();
    }

    @Override // K.e
    public final C1354c r(InterfaceC0134w interfaceC0134w) {
        C1354c c1354c;
        if (this.f11819q && (c1354c = (C1354c) this.f2802w.f(interfaceC0134w)) != null) {
            this.f2805z = c1354c;
            return c1354c;
        }
        return this.f2805z;
    }
}
