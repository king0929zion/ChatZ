package Z2;

import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final class U implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10096c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f10097e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l4.c f10098f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f10099g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ T.X f10100h;

    public /* synthetic */ U(InterfaceC1193a interfaceC1193a, l4.c cVar, String str, T.X x5, int i6) {
        this.f10096c = i6;
        this.f10097e = interfaceC1193a;
        this.f10098f = cVar;
        this.f10099g = str;
        this.f10100h = x5;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f10096c) {
            case 0:
                if (((String) this.f10100h.getValue()) != null) {
                    this.f10097e.b();
                } else {
                    this.f10098f.f(this.f10099g);
                }
                return X3.y.a;
            default:
                if (((String) this.f10100h.getValue()) != null) {
                    this.f10097e.b();
                } else {
                    this.f10098f.f(this.f10099g);
                }
                return X3.y.a;
        }
    }
}
