package y;

import j1.AbstractC1135a;
import u.AbstractC1734b;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15885c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0 f15886e;

    public /* synthetic */ k0(n0 n0Var, int i6) {
        this.f15885c = i6;
        this.f15886e = n0Var;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f15885c) {
            case 0:
                InterfaceC1957N interfaceC1957N = (InterfaceC1957N) this.f15886e.f15898r.b();
                int a = interfaceC1957N.a();
                int i6 = 0;
                while (true) {
                    if (i6 >= a) {
                        i6 = -1;
                    } else if (!interfaceC1957N.b(i6).equals(obj)) {
                        i6++;
                    }
                }
                return Integer.valueOf(i6);
            default:
                int intValue = ((Integer) obj).intValue();
                n0 n0Var = this.f15886e;
                InterfaceC1957N interfaceC1957N2 = (InterfaceC1957N) n0Var.f15898r.b();
                if (intValue < 0 || intValue >= interfaceC1957N2.a()) {
                    StringBuilder k3 = AbstractC1135a.k("Can't scroll to index ", intValue, ", it is out of bounds [0, ");
                    k3.append(interfaceC1957N2.a());
                    k3.append(')');
                    AbstractC1734b.a(k3.toString());
                }
                AbstractC1888A.y(n0Var.A0(), null, new m0(n0Var, intValue, null), 3);
                return Boolean.TRUE;
        }
    }
}
