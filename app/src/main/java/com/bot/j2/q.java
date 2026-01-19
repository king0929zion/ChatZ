package j2;

import A4.W;
import A4.g0;
import D.c1;
import F0.D;
import F0.U;
import F0.X;
import F0.k0;
import e1.C0959a;
import i2.C1112f;
import t2.InterfaceC1724h;

/* loaded from: classes.dex */
public final class q implements InterfaceC1724h, D {
    public final g0 a = W.b(new C0959a(B.a));

    @Override // F0.D
    public final F0.W d(X x5, U u5, long j3) {
        C0959a c0959a = new C0959a(j3);
        g0 g0Var = this.a;
        g0Var.getClass();
        g0Var.l(null, c0959a);
        k0 w5 = u5.w(j3);
        return x5.D(w5.f1485c, w5.f1486e, Y3.w.f9813c, new c1(w5, 6));
    }

    @Override // t2.InterfaceC1724h
    public final Object e(C1112f c1112f) {
        return W.i(new k(this.a, 1), c1112f);
    }
}
