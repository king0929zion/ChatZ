package F0;

import m4.AbstractC1276k;
import n0.C1353b;
import n0.C1354c;

/* loaded from: classes.dex */
public final class T implements InterfaceC0134w {

    /* renamed from: c, reason: collision with root package name */
    public final H0.T f1460c;

    public T(H0.T t5) {
        this.f1460c = t5;
    }

    @Override // F0.InterfaceC0134w
    public final InterfaceC0134w I() {
        H0.T U02;
        if (!j()) {
            E0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        H0.i0 i0Var = this.f1460c.f1805r.f1954r.f1721J.f1917d.f1956t;
        if (i0Var == null || (U02 = i0Var.U0()) == null) {
            return null;
        }
        return U02.f1808u;
    }

    @Override // F0.InterfaceC0134w
    public final void L(InterfaceC0134w interfaceC0134w, float[] fArr) {
        this.f1460c.f1805r.L(interfaceC0134w, fArr);
    }

    @Override // F0.InterfaceC0134w
    public final long P(long j3) {
        return C1353b.f(this.f1460c.f1805r.P(j3), a());
    }

    @Override // F0.InterfaceC0134w
    public final C1354c Q(InterfaceC0134w interfaceC0134w, boolean z5) {
        return this.f1460c.f1805r.Q(interfaceC0134w, z5);
    }

    @Override // F0.InterfaceC0134w
    public final long R(InterfaceC0134w interfaceC0134w, long j3) {
        return l(interfaceC0134w, j3);
    }

    @Override // F0.InterfaceC0134w
    public final long U(long j3) {
        return this.f1460c.f1805r.U(C1353b.f(j3, a()));
    }

    public final long a() {
        H0.T t5 = this.f1460c;
        H0.T j3 = AbstractC0137z.j(t5);
        return C1353b.e(l(j3.f1808u, 0L), t5.f1805r.l(j3.f1805r, 0L));
    }

    @Override // F0.InterfaceC0134w
    public final long e(long j3) {
        return this.f1460c.f1805r.e(C1353b.f(j3, a()));
    }

    @Override // F0.InterfaceC0134w
    public final boolean j() {
        return this.f1460c.f1805r.W0().f11819q;
    }

    @Override // F0.InterfaceC0134w
    public final void k(float[] fArr) {
        this.f1460c.f1805r.k(fArr);
    }

    @Override // F0.InterfaceC0134w
    public final long l(InterfaceC0134w interfaceC0134w, long j3) {
        boolean z5 = interfaceC0134w instanceof T;
        H0.T t5 = this.f1460c;
        if (!z5) {
            H0.T j4 = AbstractC0137z.j(t5);
            H0.i0 i0Var = j4.f1805r;
            long l3 = l(j4.f1808u, j3);
            long j5 = j4.f1806s;
            long e6 = C1353b.e(l3, (4294967295L & Float.floatToRawIntBits((int) (j5 & 4294967295L))) | (Float.floatToRawIntBits((int) (j5 >> 32)) << 32));
            if (!i0Var.W0().f11819q) {
                E0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            i0Var.f1();
            H0.i0 i0Var2 = i0Var.f1956t;
            if (i0Var2 != null) {
                i0Var = i0Var2;
            }
            return C1353b.f(e6, i0Var.l(interfaceC0134w, 0L));
        }
        H0.T t6 = ((T) interfaceC0134w).f1460c;
        H0.i0 i0Var3 = t6.f1805r;
        i0Var3.f1();
        H0.T U02 = t5.f1805r.S0(i0Var3).U0();
        if (U02 != null) {
            long d6 = e1.j.d(e1.j.e(t6.O0(U02, false), Y3.C.Q(j3)), t5.O0(U02, false));
            return (Float.floatToRawIntBits((int) (d6 >> 32)) << 32) | (Float.floatToRawIntBits((int) (d6 & 4294967295L)) & 4294967295L);
        }
        H0.T j6 = AbstractC0137z.j(t6);
        long e7 = e1.j.e(e1.j.e(t6.O0(j6, false), j6.f1806s), Y3.C.Q(j3));
        H0.T j7 = AbstractC0137z.j(t5);
        long d7 = e1.j.d(e7, e1.j.e(t5.O0(j7, false), j7.f1806s));
        long floatToRawIntBits = Float.floatToRawIntBits((int) (d7 >> 32));
        long floatToRawIntBits2 = Float.floatToRawIntBits((int) (d7 & 4294967295L)) & 4294967295L;
        H0.i0 i0Var4 = j7.f1805r.f1956t;
        AbstractC1276k.c(i0Var4);
        H0.i0 i0Var5 = j6.f1805r.f1956t;
        AbstractC1276k.c(i0Var5);
        return i0Var4.l(i0Var5, floatToRawIntBits2 | (floatToRawIntBits << 32));
    }

    @Override // F0.InterfaceC0134w
    public final long m() {
        H0.T t5 = this.f1460c;
        return (t5.f1485c << 32) | (t5.f1486e & 4294967295L);
    }

    @Override // F0.InterfaceC0134w
    public final long r(long j3) {
        return this.f1460c.f1805r.r(C1353b.f(0L, a()));
    }

    @Override // F0.InterfaceC0134w
    public final long z(long j3) {
        return C1353b.f(this.f1460c.f1805r.z(j3), a());
    }
}
