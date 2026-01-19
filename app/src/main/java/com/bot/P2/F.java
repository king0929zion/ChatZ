package P2;

import l4.InterfaceC1193a;
import u4.AbstractC1776n;
import w0.InterfaceC1830a;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final /* synthetic */ class F implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4683c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f4684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4685f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4686g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4687h;

    public /* synthetic */ F(InterfaceC1830a interfaceC1830a, boolean z5, InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2) {
        this.f4685f = interfaceC1830a;
        this.f4684e = z5;
        this.f4686g = interfaceC1193a;
        this.f4687h = interfaceC1193a2;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f4683c) {
            case 0:
                InterfaceC1830a interfaceC1830a = (InterfaceC1830a) this.f4685f;
                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) this.f4686g;
                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) this.f4687h;
                interfaceC1830a.a(0);
                if (this.f4684e) {
                    interfaceC1193a.b();
                } else {
                    interfaceC1193a2.b();
                }
                return X3.y.a;
            default:
                X2.Y y5 = (X2.Y) this.f4685f;
                String str = (String) this.f4686g;
                String str2 = (String) this.f4687h;
                if (this.f4684e) {
                    y5.getClass();
                    if (!AbstractC1776n.Q(str) && !((X2.U) y5.f9245c.getValue()).f9230b) {
                        AbstractC1888A.y(androidx.lifecycle.O.i(y5), null, new X2.X(y5, str, str2, null), 3);
                    }
                }
                return X3.y.a;
        }
    }

    public /* synthetic */ F(boolean z5, X2.Y y5, String str, String str2) {
        this.f4684e = z5;
        this.f4685f = y5;
        this.f4686g = str;
        this.f4687h = str2;
    }
}
