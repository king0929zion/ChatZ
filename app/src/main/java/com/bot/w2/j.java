package W2;

import A4.g0;
import X2.Y;
import X3.y;
import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8925c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y f8926e;

    public /* synthetic */ j(Y y5, int i6) {
        this.f8925c = i6;
        this.f8926e = y5;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f8925c) {
            case 0:
                g0 g0Var = this.f8926e.f9251i;
                do {
                } while (!g0Var.j(g0Var.getValue(), Boolean.valueOf(!((Boolean) r1).booleanValue())));
                return y.a;
            default:
                g0 g0Var2 = this.f8926e.f9249g;
                Boolean bool = Boolean.TRUE;
                g0Var2.getClass();
                g0Var2.l(null, bool);
                return y.a;
        }
    }
}
