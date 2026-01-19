package v;

import H0.InterfaceC0170z;
import Q.M0;
import e1.AbstractC0960b;
import h0.AbstractC1040q;
import w.AbstractC1829a;

/* loaded from: classes.dex */
public final class l0 extends AbstractC1040q implements InterfaceC0170z {

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC1802i0 f15323r;

    @Override // H0.InterfaceC0170z
    public final F0.W d(F0.X x5, F0.U u5, long j3) {
        float b5 = this.f15323r.b(x5.getLayoutDirection());
        float c6 = this.f15323r.c();
        float d6 = this.f15323r.d(x5.getLayoutDirection());
        float a = this.f15323r.a();
        float f6 = 0;
        if (!((e1.f.b(a, f6) >= 0) & (e1.f.b(b5, f6) >= 0) & (e1.f.b(c6, f6) >= 0) & (e1.f.b(d6, f6) >= 0))) {
            AbstractC1829a.a("Padding must be non-negative");
        }
        int l02 = x5.l0(b5);
        int l03 = x5.l0(d6) + l02;
        int l04 = x5.l0(c6);
        int l05 = x5.l0(a) + l04;
        F0.k0 w5 = u5.w(AbstractC0960b.i(-l03, -l05, j3));
        return x5.D(AbstractC0960b.g(j3, w5.f1485c + l03), AbstractC0960b.f(j3, w5.f1486e + l05), Y3.w.f9813c, new M0(w5, l02, l04, 2));
    }
}
