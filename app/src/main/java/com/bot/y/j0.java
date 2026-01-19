package y;

import H0.AbstractC0141b0;
import H0.AbstractC0157l;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import r.X0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j0 extends AbstractC0141b0 {
    public final InterfaceC1193a a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f15880b;

    /* renamed from: c, reason: collision with root package name */
    public final X0 f15881c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15882d;

    public j0(InterfaceC1193a interfaceC1193a, i0 i0Var, X0 x02, boolean z5) {
        this.a = interfaceC1193a;
        this.f15880b = i0Var;
        this.f15881c = x02;
        this.f15882d = z5;
    }

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new n0(this.a, this.f15880b, this.f15881c, this.f15882d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.a == j0Var.a && AbstractC1276k.b(this.f15880b, j0Var.f15880b) && this.f15881c == j0Var.f15881c && this.f15882d == j0Var.f15882d;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        n0 n0Var = (n0) abstractC1040q;
        n0Var.f15898r = this.a;
        n0Var.f15899s = this.f15880b;
        X0 x02 = n0Var.f15900t;
        X0 x03 = this.f15881c;
        if (x02 != x03) {
            n0Var.f15900t = x03;
            AbstractC0157l.m(n0Var);
        }
        boolean z5 = n0Var.f15901u;
        boolean z6 = this.f15882d;
        if (z5 == z6) {
            return;
        }
        n0Var.f15901u = z6;
        n0Var.M0();
        AbstractC0157l.m(n0Var);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC1135a.d((this.f15881c.hashCode() + ((this.f15880b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.f15882d);
    }
}
