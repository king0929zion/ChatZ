package H0;

import F0.AbstractC0107a;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1040q;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class B extends i0 {

    /* renamed from: X, reason: collision with root package name */
    public static final L1.d f1687X;

    /* renamed from: V, reason: collision with root package name */
    public InterfaceC0170z f1688V;

    /* renamed from: W, reason: collision with root package name */
    public A f1689W;

    static {
        L1.d g3 = o0.y.g();
        g3.e(o0.s.f13479f);
        g3.k(1.0f);
        g3.l(1);
        f1687X = g3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public B(J j3, InterfaceC0170z interfaceC0170z) {
        super(j3);
        this.f1688V = interfaceC0170z;
        this.f1689W = j3.f1741l != null ? new A(this) : null;
        if ((((AbstractC1040q) interfaceC0170z).f11806c.f11808f & PegdownExtensions.STRIKETHROUGH) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // H0.i0
    public final void R0() {
        if (this.f1689W == null) {
            this.f1689W = new A(this);
        }
    }

    @Override // H0.i0
    public final T U0() {
        return this.f1689W;
    }

    @Override // H0.i0
    public final AbstractC1040q W0() {
        return ((AbstractC1040q) this.f1688V).f11806c;
    }

    @Override // F0.U
    public final int a0(int i6) {
        InterfaceC0170z interfaceC0170z = this.f1688V;
        i0 i0Var = this.f1955s;
        AbstractC1276k.c(i0Var);
        return interfaceC0170z.P(this, i0Var, i6);
    }

    @Override // F0.U
    public final int d(int i6) {
        InterfaceC0170z interfaceC0170z = this.f1688V;
        i0 i0Var = this.f1955s;
        AbstractC1276k.c(i0Var);
        return interfaceC0170z.m0(this, i0Var, i6);
    }

    @Override // H0.i0
    public final void l1(o0.q qVar, r0.b bVar) {
        i0 i0Var;
        i0 i0Var2 = this.f1955s;
        AbstractC1276k.c(i0Var2);
        i0Var2.P0(qVar, bVar);
        if (!((ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(this.f1954r)).getShowLayoutBounds() || (i0Var = this.f1955s) == null) {
            return;
        }
        if (e1.l.b(this.f1487f, i0Var.f1487f) && e1.j.c(i0Var.f1940C, 0L)) {
            return;
        }
        long j3 = this.f1487f;
        qVar.r(0.5f, 0.5f, ((int) (j3 >> 32)) - 0.5f, ((int) (j3 & 4294967295L)) - 0.5f, f1687X);
    }

    @Override // F0.k0
    public final void m0(long j3, float f6, l4.c cVar) {
        m1(j3, f6, cVar, null);
        x1();
    }

    @Override // F0.U
    public final int o(int i6) {
        InterfaceC0170z interfaceC0170z = this.f1688V;
        i0 i0Var = this.f1955s;
        AbstractC1276k.c(i0Var);
        return interfaceC0170z.j(this, i0Var, i6);
    }

    @Override // H0.i0, F0.k0
    public final void p0(long j3, float f6, r0.b bVar) {
        m1(j3, f6, null, bVar);
        x1();
    }

    @Override // F0.U
    public final int q(int i6) {
        InterfaceC0170z interfaceC0170z = this.f1688V;
        i0 i0Var = this.f1955s;
        AbstractC1276k.c(i0Var);
        return interfaceC0170z.z0(this, i0Var, i6);
    }

    @Override // F0.U
    public final F0.k0 w(long j3) {
        t0(j3);
        InterfaceC0170z interfaceC0170z = this.f1688V;
        i0 i0Var = this.f1955s;
        AbstractC1276k.c(i0Var);
        p1(interfaceC0170z.d(this, i0Var, j3));
        g1();
        return this;
    }

    @Override // H0.S
    public final int x0(AbstractC0107a abstractC0107a) {
        A a = this.f1689W;
        if (a == null) {
            return AbstractC0157l.c(this, abstractC0107a);
        }
        k.H h3 = a.f1810w;
        int d6 = h3.d(abstractC0107a);
        if (d6 >= 0) {
            return h3.f12462c[d6];
        }
        return Integer.MIN_VALUE;
    }

    public final void x1() {
        if (this.f1800m) {
            return;
        }
        h1();
        i0 i0Var = this.f1955s;
        AbstractC1276k.c(i0Var);
        i0Var.f1801n = this.f1801n;
        E0().c();
        i0Var.f1801n = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y1(InterfaceC0170z interfaceC0170z) {
        if (!interfaceC0170z.equals(this.f1688V) && (((AbstractC1040q) interfaceC0170z).f11806c.f11808f & PegdownExtensions.STRIKETHROUGH) != 0) {
            throw new ClassCastException();
        }
        this.f1688V = interfaceC0170z;
    }
}
