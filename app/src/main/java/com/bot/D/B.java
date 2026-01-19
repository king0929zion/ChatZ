package D;

import S0.C0545g;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final /* synthetic */ class B implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f732c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i1 f733e;

    public /* synthetic */ B(i1 i1Var, int i6) {
        this.f732c = i6;
        this.f733e = i1Var;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        S0.K k3;
        switch (this.f732c) {
            case 0:
                i1 i1Var = this.f733e;
                return Boolean.valueOf(i1Var != null ? ((Boolean) new B(i1Var, 2).b()).booleanValue() : false);
            case 1:
                i1 i1Var2 = this.f733e;
                return Boolean.valueOf(i1Var2 != null ? ((Boolean) new B(i1Var2, 2).b()).booleanValue() : false);
            default:
                i1 i1Var3 = this.f733e;
                C0545g c0545g = i1Var3.f1038b;
                S0.L l3 = (S0.L) i1Var3.a.getValue();
                return Boolean.valueOf(AbstractC1276k.b(c0545g, (l3 == null || (k3 = l3.a) == null) ? null : k3.a));
        }
    }
}
