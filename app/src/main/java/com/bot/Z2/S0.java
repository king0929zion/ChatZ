package Z2;

import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final class S0 implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10085c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z0 f10086e;

    public /* synthetic */ S0(Z0 z02, int i6) {
        this.f10085c = i6;
        this.f10086e = z02;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f10085c) {
            case 0:
                Z0 z02 = this.f10086e;
                z02.f10138g.h(S.l.f7374V);
                z02.f10137f.setValue(null);
                if (z02.f10139h) {
                    z02.f10135d.b();
                }
                z02.f10139h = false;
                return X3.y.a;
            default:
                Z0 z03 = this.f10086e;
                z03.f10138g.h(S.l.f7374V);
                z03.f10137f.setValue(null);
                if (z03.f10139h) {
                    z03.f10135d.b();
                }
                z03.f10139h = false;
                return X3.y.a;
        }
    }
}
