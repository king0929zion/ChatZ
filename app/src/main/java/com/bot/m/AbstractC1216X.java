package m;

import D.c1;
import F0.k0;
import H0.InterfaceC0170z;
import e1.AbstractC0960b;
import h0.AbstractC1040q;

/* renamed from: m.X, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1216X implements AbstractC1040q, InterfaceC0170z {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f12766r;

    public abstract long M0(F0.U u5, long j3);

    public abstract boolean N0();

    @Override // H0.InterfaceC0170z
    public int P(H0.S s5, F0.U u5, int i6) {
        switch (this.f12766r) {
            case 0:
                return u5.a0(i6);
            default:
                return u5.a0(i6);
        }
    }

    public F0.W d(F0.X x5, F0.U u5, long j3) {
        long M02 = M0(u5, j3);
        if (N0()) {
            M02 = AbstractC0960b.e(j3, M02);
        }
        k0 w5 = u5.w(M02);
        return x5.D(w5.f1485c, w5.f1486e, Y3.w.f9813c, new c1(w5, 9));
    }

    @Override // H0.InterfaceC0170z
    public int j(H0.S s5, F0.U u5, int i6) {
        switch (this.f12766r) {
            case 0:
                return u5.o(i6);
            default:
                return u5.o(i6);
        }
    }

    @Override // H0.InterfaceC0170z
    public int m0(H0.S s5, F0.U u5, int i6) {
        switch (this.f12766r) {
            case 0:
                return u5.d(i6);
            default:
                return u5.d(i6);
        }
    }

    @Override // H0.InterfaceC0170z
    public int z0(H0.S s5, F0.U u5, int i6) {
        switch (this.f12766r) {
            case 0:
                return u5.q(i6);
            default:
                return u5.q(i6);
        }
    }
}
