package y;

import D.c1;
import H0.AbstractC0157l;
import H0.InterfaceC0155j;
import H0.InterfaceC0170z;
import h0.AbstractC1040q;
import r.C1609u;
import r.X0;

/* loaded from: classes.dex */
public final class r extends AbstractC1040q implements InterfaceC0170z, InterfaceC0155j {

    /* renamed from: u, reason: collision with root package name */
    public static final C1976p f15933u = new Object();

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC1978s f15934r;

    /* renamed from: s, reason: collision with root package name */
    public C1609u f15935s;

    /* renamed from: t, reason: collision with root package name */
    public X0 f15936t;

    public final boolean M0(C1973m c1973m, int i6) {
        if (i6 == 5 || i6 == 6) {
            if (this.f15936t == X0.f14184e) {
                return false;
            }
        } else if (i6 == 3 || i6 == 4) {
            if (this.f15936t == X0.f14183c) {
                return false;
            }
        } else if (i6 != 1 && i6 != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (N0(i6)) {
            if (c1973m.f15892b >= this.f15934r.a() - 1) {
                return false;
            }
        } else if (c1973m.a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean N0(int i6) {
        if (i6 == 1) {
            return false;
        }
        if (i6 == 2) {
            return true;
        }
        if (i6 == 5) {
            return false;
        }
        if (i6 == 6) {
            return true;
        }
        if (i6 == 3) {
            int ordinal = AbstractC0157l.v(this).f1715D.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 1) {
                return true;
            }
            throw new RuntimeException();
        }
        if (i6 != 4) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        int ordinal2 = AbstractC0157l.v(this).f1715D.ordinal();
        if (ordinal2 == 0) {
            return true;
        }
        if (ordinal2 == 1) {
            return false;
        }
        throw new RuntimeException();
    }

    @Override // H0.InterfaceC0170z
    public final F0.W d(F0.X x5, F0.U u5, long j3) {
        F0.k0 w5 = u5.w(j3);
        return x5.D(w5.f1485c, w5.f1486e, Y3.w.f9813c, new c1(w5, 12));
    }
}
