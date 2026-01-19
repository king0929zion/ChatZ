package Z2;

import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final /* synthetic */ class O0 implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10059c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f10060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f10061f;

    public /* synthetic */ O0(boolean z5, InterfaceC1193a interfaceC1193a, int i6) {
        this.f10059c = i6;
        this.f10060e = z5;
        this.f10061f = interfaceC1193a;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f10059c) {
            case 0:
                if (!this.f10060e) {
                    this.f10061f.b();
                }
                return X3.y.a;
            default:
                if (this.f10060e) {
                    this.f10061f.b();
                }
                return X3.y.a;
        }
    }
}
