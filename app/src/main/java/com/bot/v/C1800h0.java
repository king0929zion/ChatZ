package v;

import H0.InterfaceC0170z;
import e1.AbstractC0960b;
import h0.AbstractC1040q;

/* renamed from: v.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1800h0 extends AbstractC1040q implements InterfaceC0170z {

    /* renamed from: r, reason: collision with root package name */
    public float f15308r;

    /* renamed from: s, reason: collision with root package name */
    public float f15309s;

    /* renamed from: t, reason: collision with root package name */
    public float f15310t;

    /* renamed from: u, reason: collision with root package name */
    public float f15311u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f15312v;

    @Override // H0.InterfaceC0170z
    public final F0.W d(F0.X x5, F0.U u5, long j3) {
        int l02 = x5.l0(this.f15310t) + x5.l0(this.f15308r);
        int l03 = x5.l0(this.f15311u) + x5.l0(this.f15309s);
        F0.k0 w5 = u5.w(AbstractC0960b.i(-l02, -l03, j3));
        return x5.D(AbstractC0960b.g(j3, w5.f1485c + l02), AbstractC0960b.f(j3, w5.f1486e + l03), Y3.w.f9813c, new Z2.X(20, this, w5));
    }
}
