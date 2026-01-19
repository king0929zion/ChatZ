package v;

import D.c1;
import H0.InterfaceC0170z;
import e1.AbstractC0960b;
import e1.C0959a;
import h0.AbstractC1040q;

/* loaded from: classes.dex */
public final class B0 extends AbstractC1040q implements InterfaceC0170z {

    /* renamed from: r, reason: collision with root package name */
    public float f15199r;

    /* renamed from: s, reason: collision with root package name */
    public float f15200s;

    @Override // H0.InterfaceC0170z
    public final int P(H0.S s5, F0.U u5, int i6) {
        int a02 = u5.a0(i6);
        int l02 = !Float.isNaN(this.f15200s) ? s5.l0(this.f15200s) : 0;
        return a02 < l02 ? l02 : a02;
    }

    @Override // H0.InterfaceC0170z
    public final F0.W d(F0.X x5, F0.U u5, long j3) {
        int j4;
        int i6;
        if (Float.isNaN(this.f15199r) || C0959a.j(j3) != 0) {
            j4 = C0959a.j(j3);
        } else {
            int l02 = x5.l0(this.f15199r);
            j4 = C0959a.h(j3);
            if (l02 < 0) {
                l02 = 0;
            }
            if (l02 <= j4) {
                j4 = l02;
            }
        }
        int h3 = C0959a.h(j3);
        if (Float.isNaN(this.f15200s) || C0959a.i(j3) != 0) {
            i6 = C0959a.i(j3);
        } else {
            int l03 = x5.l0(this.f15200s);
            i6 = C0959a.g(j3);
            int i7 = l03 >= 0 ? l03 : 0;
            if (i7 <= i6) {
                i6 = i7;
            }
        }
        F0.k0 w5 = u5.w(AbstractC0960b.a(j4, h3, i6, C0959a.g(j3)));
        return x5.D(w5.f1485c, w5.f1486e, Y3.w.f9813c, new c1(w5, 11));
    }

    @Override // H0.InterfaceC0170z
    public final int j(H0.S s5, F0.U u5, int i6) {
        int o5 = u5.o(i6);
        int l02 = !Float.isNaN(this.f15199r) ? s5.l0(this.f15199r) : 0;
        return o5 < l02 ? l02 : o5;
    }

    @Override // H0.InterfaceC0170z
    public final int m0(H0.S s5, F0.U u5, int i6) {
        int d6 = u5.d(i6);
        int l02 = !Float.isNaN(this.f15200s) ? s5.l0(this.f15200s) : 0;
        return d6 < l02 ? l02 : d6;
    }

    @Override // H0.InterfaceC0170z
    public final int z0(H0.S s5, F0.U u5, int i6) {
        int q3 = u5.q(i6);
        int l02 = !Float.isNaN(this.f15199r) ? s5.l0(this.f15199r) : 0;
        return q3 < l02 ? l02 : q3;
    }
}
