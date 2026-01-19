package m;

import F0.k0;
import n.q0;
import n.r0;

/* renamed from: m.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1235q extends AbstractC1216X {

    /* renamed from: s, reason: collision with root package name */
    public r0 f12825s;

    /* renamed from: t, reason: collision with root package name */
    public T.X f12826t;

    /* renamed from: u, reason: collision with root package name */
    public C1237s f12827u;

    /* renamed from: v, reason: collision with root package name */
    public long f12828v;

    @Override // h0.AbstractC1040q
    public final void G0() {
        this.f12828v = AbstractC1227i.a;
    }

    @Override // m.AbstractC1216X, H0.InterfaceC0170z
    public final F0.W d(F0.X x5, F0.U u5, long j3) {
        long j4;
        k0 w5 = u5.w(j3);
        if (x5.d0()) {
            j4 = (w5.f1485c << 32) | (w5.f1486e & 4294967295L);
        } else {
            r0 r0Var = this.f12825s;
            if (r0Var == null) {
                j4 = (w5.f1485c << 32) | (w5.f1486e & 4294967295L);
                this.f12828v = j4;
            } else {
                long j5 = (w5.f1486e & 4294967295L) | (w5.f1485c << 32);
                q0 a = r0Var.a(new C1234p(this, j5, 0), new C1234p(this, j5, 1));
                this.f12827u.f12835f = a;
                j4 = ((e1.l) a.getValue()).a;
                this.f12828v = ((e1.l) a.getValue()).a;
            }
        }
        return x5.D((int) (j4 >> 32), (int) (4294967295L & j4), Y3.w.f9813c, new C1233o(this, w5, j4));
    }
}
