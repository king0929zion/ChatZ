package H0;

import F0.AbstractC0107a;
import m4.AbstractC1276k;

/* renamed from: H0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0164t extends T {
    @Override // H0.T
    public final void M0() {
        W w5 = this.f1805r.f1954r.f1722K.f1782q;
        AbstractC1276k.c(w5);
        w5.B0();
    }

    @Override // F0.U
    public final int a0(int i6) {
        M.q t5 = this.f1805r.f1954r.t();
        F0.V p5 = t5.p();
        J j3 = (J) t5.f3179e;
        return p5.d(j3.f1721J.f1917d, j3.l(), i6);
    }

    @Override // F0.U
    public final int d(int i6) {
        M.q t5 = this.f1805r.f1954r.t();
        F0.V p5 = t5.p();
        J j3 = (J) t5.f3179e;
        return p5.a(j3.f1721J.f1917d, j3.l(), i6);
    }

    @Override // F0.U
    public final int o(int i6) {
        M.q t5 = this.f1805r.f1954r.t();
        F0.V p5 = t5.p();
        J j3 = (J) t5.f3179e;
        return p5.h(j3.f1721J.f1917d, j3.l(), i6);
    }

    @Override // F0.U
    public final int q(int i6) {
        M.q t5 = this.f1805r.f1954r.t();
        F0.V p5 = t5.p();
        J j3 = (J) t5.f3179e;
        return p5.j(j3.f1721J.f1917d, j3.l(), i6);
    }

    @Override // F0.U
    public final F0.k0 w(long j3) {
        t0(j3);
        i0 i0Var = this.f1805r;
        V.e z5 = i0Var.f1954r.z();
        Object[] objArr = z5.f8759c;
        int i6 = z5.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            W w5 = ((J) objArr[i7]).f1722K.f1782q;
            AbstractC1276k.c(w5);
            w5.f1827m = H.f1707f;
        }
        J j4 = i0Var.f1954r;
        T.L0(this, j4.f1712A.e(this, j4.l(), j3));
        return this;
    }

    @Override // H0.S
    public final int x0(AbstractC0107a abstractC0107a) {
        W w5 = this.f1805r.f1954r.f1722K.f1782q;
        AbstractC1276k.c(w5);
        K k3 = w5.f1836v;
        if (!w5.f1828n) {
            N n3 = w5.f1823i;
            if (n3.f1769d == F.f1697e) {
                k3.f1760f = true;
                if (k3.f1756b) {
                    n3.f1771f = true;
                    n3.f1772g = true;
                }
            } else {
                k3.f1761g = true;
            }
        }
        C0164t c0164t = w5.g().f2000W;
        if (c0164t != null) {
            c0164t.f1801n = true;
        }
        w5.N();
        C0164t c0164t2 = w5.g().f2000W;
        if (c0164t2 != null) {
            c0164t2.f1801n = false;
        }
        Integer num = (Integer) k3.f1763i.get(abstractC0107a);
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f1810w.g(intValue, abstractC0107a);
        return intValue;
    }
}
