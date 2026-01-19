package Q;

import l4.InterfaceC1193a;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final /* synthetic */ class X0 implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5585c = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0405d2 f5586e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f5587f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1942y f5588g;

    public /* synthetic */ X0(C0405d2 c0405d2, InterfaceC1193a interfaceC1193a, InterfaceC1942y interfaceC1942y) {
        this.f5586e = c0405d2;
        this.f5587f = interfaceC1193a;
        this.f5588g = interfaceC1942y;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f5585c) {
            case 0:
                C0405d2 c0405d2 = this.f5586e;
                if (((Boolean) c0405d2.f5767d.f6827d.f(EnumC0409e2.f5776c)).booleanValue()) {
                    AbstractC1888A.y(this.f5588g, null, new C0412f1(c0405d2, null), 3).S(new Z0(c0405d2, this.f5587f, 0));
                }
                return X3.y.a;
            default:
                C0405d2 c0405d22 = this.f5586e;
                int ordinal = ((EnumC0409e2) c0405d22.f5767d.f6830g.getValue()).ordinal();
                if (ordinal != 1) {
                    InterfaceC1942y interfaceC1942y = this.f5588g;
                    if (ordinal != 2) {
                        AbstractC1888A.y(interfaceC1942y, null, new C0432k1(c0405d22, null), 3);
                    } else {
                        AbstractC1888A.y(interfaceC1942y, null, new C0428j1(c0405d22, null), 3);
                    }
                } else {
                    this.f5587f.b();
                }
                return X3.y.a;
        }
    }

    public /* synthetic */ X0(C0405d2 c0405d2, InterfaceC1942y interfaceC1942y, InterfaceC1193a interfaceC1193a) {
        this.f5586e = c0405d2;
        this.f5588g = interfaceC1942y;
        this.f5587f = interfaceC1193a;
    }
}
