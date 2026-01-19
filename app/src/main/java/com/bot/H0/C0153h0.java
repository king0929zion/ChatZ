package H0;

import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import m4.AbstractC1277l;

/* renamed from: H0.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153h0 extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i0 f1932f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0153h0(i0 i0Var, int i6) {
        super(0);
        this.f1931e = i6;
        this.f1932f = i0Var;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f1931e) {
            case 0:
                i0 i0Var = this.f1932f;
                o0.q qVar = i0Var.f1948K;
                AbstractC1276k.c(qVar);
                i0Var.Q0(qVar, i0Var.f1947J);
                return X3.y.a;
            default:
                i0 i0Var2 = this.f1932f.f1956t;
                if (i0Var2 != null) {
                    i0Var2.d1();
                }
                return X3.y.a;
        }
    }
}
