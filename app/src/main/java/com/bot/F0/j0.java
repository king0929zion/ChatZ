package F0;

import H0.InterfaceC0143c0;
import e1.InterfaceC0961c;

/* loaded from: classes.dex */
public abstract class j0 implements InterfaceC0961c {

    /* renamed from: c, reason: collision with root package name */
    public boolean f1484c;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(j0 j0Var, k0 k0Var) {
        j0Var.getClass();
        if (k0Var instanceof InterfaceC0143c0) {
            ((InterfaceC0143c0) k0Var).M(j0Var.f1484c);
        }
    }

    public static /* synthetic */ void j(j0 j0Var, k0 k0Var, int i6, int i7) {
        j0Var.h(k0Var, i6, i7, S.l.f7374V);
    }

    public static void k(j0 j0Var, k0 k0Var, long j3) {
        j0Var.getClass();
        b(j0Var, k0Var);
        k0Var.m0(e1.j.e(j3, k0Var.f1489h), S.l.f7374V, null);
    }

    public static void l(j0 j0Var, k0 k0Var, int i6, int i7) {
        long j3 = (i6 << 32) | (i7 & 4294967295L);
        if (j0Var.e() == e1.m.f11576c || j0Var.g() == 0) {
            b(j0Var, k0Var);
            k0Var.m0(e1.j.e(j3, k0Var.f1489h), S.l.f7374V, null);
        } else {
            int g3 = (j0Var.g() - k0Var.f1485c) - ((int) (j3 >> 32));
            b(j0Var, k0Var);
            k0Var.m0(e1.j.e((g3 << 32) | (((int) (j3 & 4294967295L)) & 4294967295L), k0Var.f1489h), S.l.f7374V, null);
        }
    }

    public static void m(j0 j0Var, k0 k0Var, int i6, int i7) {
        int i8 = m0.f1494b;
        l0 l0Var = l0.f1491f;
        long j3 = (i6 << 32) | (i7 & 4294967295L);
        if (j0Var.e() == e1.m.f11576c || j0Var.g() == 0) {
            b(j0Var, k0Var);
            k0Var.m0(e1.j.e(j3, k0Var.f1489h), S.l.f7374V, l0Var);
        } else {
            int g3 = (j0Var.g() - k0Var.f1485c) - ((int) (j3 >> 32));
            b(j0Var, k0Var);
            k0Var.m0(e1.j.e((g3 << 32) | (((int) (j3 & 4294967295L)) & 4294967295L), k0Var.f1489h), S.l.f7374V, l0Var);
        }
    }

    public static void o(j0 j0Var, k0 k0Var, long j3) {
        int i6 = m0.f1494b;
        l0 l0Var = l0.f1491f;
        if (j0Var.e() == e1.m.f11576c || j0Var.g() == 0) {
            b(j0Var, k0Var);
            k0Var.m0(e1.j.e(j3, k0Var.f1489h), S.l.f7374V, l0Var);
        } else {
            int g3 = (j0Var.g() - k0Var.f1485c) - ((int) (j3 >> 32));
            b(j0Var, k0Var);
            k0Var.m0(e1.j.e((((int) (j3 & 4294967295L)) & 4294967295L) | (g3 << 32), k0Var.f1489h), S.l.f7374V, l0Var);
        }
    }

    public static void p(j0 j0Var, k0 k0Var, int i6, int i7, l4.c cVar, int i8) {
        if ((i8 & 8) != 0) {
            int i9 = m0.f1494b;
            cVar = l0.f1491f;
        }
        j0Var.getClass();
        b(j0Var, k0Var);
        k0Var.m0(e1.j.e((i7 & 4294967295L) | (i6 << 32), k0Var.f1489h), S.l.f7374V, cVar);
    }

    public static void q(j0 j0Var, k0 k0Var, long j3) {
        int i6 = m0.f1494b;
        l0 l0Var = l0.f1491f;
        j0Var.getClass();
        b(j0Var, k0Var);
        k0Var.m0(e1.j.e(j3, k0Var.f1489h), S.l.f7374V, l0Var);
    }

    public float d(C0127o c0127o) {
        return Float.NaN;
    }

    public abstract e1.m e();

    public abstract int g();

    public final void h(k0 k0Var, int i6, int i7, float f6) {
        b(this, k0Var);
        k0Var.m0(e1.j.e((i7 & 4294967295L) | (i6 << 32), k0Var.f1489h), f6, null);
    }
}
