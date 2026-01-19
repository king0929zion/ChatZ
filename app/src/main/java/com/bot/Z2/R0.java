package Z2;

import a3.C0810H;
import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final class R0 implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10076c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f10077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0810H f10078f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ T.X f10079g;

    public R0(boolean z5, InterfaceC1193a interfaceC1193a, C0810H c0810h, T.X x5) {
        this.f10076c = z5;
        this.f10077e = interfaceC1193a;
        this.f10078f = c0810h;
        this.f10079g = x5;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        if (this.f10076c) {
            this.f10077e.b();
            this.f10079g.setValue(this.f10078f);
        }
        return X3.y.a;
    }
}
