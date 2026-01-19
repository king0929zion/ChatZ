package D;

import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f994c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F0.k0 f995e;

    public /* synthetic */ c1(F0.k0 k0Var, int i6) {
        this.f994c = i6;
        this.f995e = k0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // l4.c
    public final Object f(Object obj) {
        F0.j0 j0Var = (F0.j0) obj;
        switch (this.f994c) {
            case 0:
                F0.j0.l(j0Var, this.f995e, 0, 0);
                return X3.y.a;
            case 1:
                j0Var.h(this.f995e, 0, 0, S.l.f7374V);
                return X3.y.a;
            case 2:
                j0Var.h(this.f995e, 0, 0, S.l.f7374V);
                return X3.y.a;
            case 3:
                j0Var.h(this.f995e, 0, 0, S.l.f7374V);
                return X3.y.a;
            case 4:
                j0Var.h(this.f995e, 0, 0, S.l.f7374V);
                return X3.y.a;
            case AbstractC1787b.f15290g /* 5 */:
                j0Var.h(this.f995e, 0, 0, S.l.f7374V);
                return X3.y.a;
            case 6:
                j0Var.h(this.f995e, 0, 0, S.l.f7374V);
                return X3.y.a;
            case 7:
                F0.j0.l(j0Var, this.f995e, 0, 0);
                return X3.y.a;
            case 8:
                F0.j0.l(j0Var, this.f995e, 0, 0);
                return X3.y.a;
            case AbstractC1787b.f15287d /* 9 */:
                e1.m e6 = j0Var.e();
                e1.m mVar = e1.m.f11576c;
                F0.k0 k0Var = this.f995e;
                if (e6 == mVar || j0Var.g() == 0) {
                    F0.j0.b(j0Var, k0Var);
                    k0Var.m0(e1.j.e(0L, k0Var.f1489h), S.l.f7374V, null);
                } else {
                    long g3 = ((j0Var.g() - k0Var.f1485c) - r1) << 32;
                    F0.j0.b(j0Var, k0Var);
                    k0Var.m0(e1.j.e((((int) 0) & 4294967295L) | g3, k0Var.f1489h), S.l.f7374V, null);
                }
                return X3.y.a;
            case AbstractC1787b.f15289f /* 10 */:
                F0.j0.l(j0Var, this.f995e, 0, 0);
                return X3.y.a;
            case 11:
                F0.j0.l(j0Var, this.f995e, 0, 0);
                return X3.y.a;
            default:
                j0Var.h(this.f995e, 0, 0, S.l.f7374V);
                return X3.y.a;
        }
    }
}
