package O;

import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4232c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f4233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f4234f;

    public /* synthetic */ v0(InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, int i6) {
        this.f4232c = i6;
        this.f4233e = interfaceC1193a;
        this.f4234f = interfaceC1193a2;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        G.g gVar = (G.g) obj;
        switch (this.f4232c) {
            case 0:
                this.f4233e.b();
                InterfaceC1193a interfaceC1193a = this.f4234f;
                if (interfaceC1193a != null ? ((Boolean) interfaceC1193a.b()).booleanValue() : true) {
                    gVar.close();
                }
                return X3.y.a;
            default:
                this.f4233e.b();
                InterfaceC1193a interfaceC1193a2 = this.f4234f;
                if (interfaceC1193a2 != null ? ((Boolean) interfaceC1193a2.b()).booleanValue() : true) {
                    gVar.close();
                }
                return X3.y.a;
        }
    }
}
