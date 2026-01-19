package v;

import H0.AbstractC0157l;
import H0.InterfaceC0170z;
import Q.M0;
import e1.AbstractC0960b;

/* loaded from: classes.dex */
public class P extends M implements InterfaceC0170z {

    /* renamed from: t, reason: collision with root package name */
    public F0 f15265t;

    public P(F0 f02) {
        this.f15265t = f02;
    }

    @Override // v.M
    public final x0 M0(F0 f02) {
        return new x0(f02, this.f15265t);
    }

    @Override // v.M
    public final void N0() {
        super.N0();
        AbstractC0157l.l(this);
    }

    @Override // H0.InterfaceC0170z
    public final F0.W d(F0.X x5, F0.U u5, long j3) {
        int c6 = this.f15260s.c(x5, x5.getLayoutDirection()) - this.f15259r.c(x5, x5.getLayoutDirection());
        int d6 = this.f15260s.d(x5) - this.f15259r.d(x5);
        int b5 = (this.f15260s.b(x5, x5.getLayoutDirection()) - this.f15259r.b(x5, x5.getLayoutDirection())) + c6;
        int a = (this.f15260s.a(x5) - this.f15259r.a(x5)) + d6;
        F0.k0 w5 = u5.w(AbstractC0960b.i(-b5, -a, j3));
        return x5.D(AbstractC0960b.g(j3, w5.f1485c + b5), AbstractC0960b.f(j3, w5.f1486e + a), Y3.w.f9813c, new M0(w5, c6, d6, 1));
    }
}
