package Z2;

import l4.InterfaceC1193a;
import n.C1316c;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* renamed from: Z2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0775s implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10314c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1942y f10315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ T.X f10316f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1316c f10317g;

    public /* synthetic */ C0775s(InterfaceC1942y interfaceC1942y, T.X x5, C1316c c1316c, int i6) {
        this.f10314c = i6;
        this.f10315e = interfaceC1942y;
        this.f10316f = x5;
        this.f10317g = c1316c;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f10314c) {
            case 0:
                this.f10316f.setValue(null);
                AbstractC1888A.y(this.f10315e, null, new r(this.f10317g, null), 3);
                return X3.y.a;
            case 1:
                this.f10316f.setValue(null);
                AbstractC1888A.y(this.f10315e, null, new V(this.f10317g, null), 3);
                return X3.y.a;
            default:
                this.f10316f.setValue(null);
                AbstractC1888A.y(this.f10315e, null, new V0(this.f10317g, null), 3);
                return X3.y.a;
        }
    }
}
