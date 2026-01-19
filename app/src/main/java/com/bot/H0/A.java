package H0;

import F0.AbstractC0107a;
import e1.C0959a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class A extends T {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ B f1686x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b5) {
        super(b5);
        this.f1686x = b5;
    }

    @Override // F0.U
    public final int a0(int i6) {
        B b5 = this.f1686x;
        InterfaceC0170z interfaceC0170z = b5.f1688V;
        i0 i0Var = b5.f1955s;
        AbstractC1276k.c(i0Var);
        T U02 = i0Var.U0();
        AbstractC1276k.c(U02);
        return interfaceC0170z.P(this, U02, i6);
    }

    @Override // F0.U
    public final int d(int i6) {
        B b5 = this.f1686x;
        InterfaceC0170z interfaceC0170z = b5.f1688V;
        i0 i0Var = b5.f1955s;
        AbstractC1276k.c(i0Var);
        T U02 = i0Var.U0();
        AbstractC1276k.c(U02);
        return interfaceC0170z.m0(this, U02, i6);
    }

    @Override // F0.U
    public final int o(int i6) {
        B b5 = this.f1686x;
        InterfaceC0170z interfaceC0170z = b5.f1688V;
        i0 i0Var = b5.f1955s;
        AbstractC1276k.c(i0Var);
        T U02 = i0Var.U0();
        AbstractC1276k.c(U02);
        return interfaceC0170z.j(this, U02, i6);
    }

    @Override // F0.U
    public final int q(int i6) {
        B b5 = this.f1686x;
        InterfaceC0170z interfaceC0170z = b5.f1688V;
        i0 i0Var = b5.f1955s;
        AbstractC1276k.c(i0Var);
        T U02 = i0Var.U0();
        AbstractC1276k.c(U02);
        return interfaceC0170z.z0(this, U02, i6);
    }

    @Override // F0.U
    public final F0.k0 w(long j3) {
        t0(j3);
        new C0959a(j3);
        B b5 = this.f1686x;
        InterfaceC0170z interfaceC0170z = b5.f1688V;
        i0 i0Var = b5.f1955s;
        AbstractC1276k.c(i0Var);
        T U02 = i0Var.U0();
        AbstractC1276k.c(U02);
        T.L0(this, interfaceC0170z.d(this, U02, j3));
        return this;
    }

    @Override // H0.S
    public final int x0(AbstractC0107a abstractC0107a) {
        int c6 = AbstractC0157l.c(this, abstractC0107a);
        this.f1810w.g(c6, abstractC0107a);
        return c6;
    }
}
