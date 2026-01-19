package b;

import android.window.OnBackInvokedCallback;
import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements OnBackInvokedCallback {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f10962b;

    public /* synthetic */ x(int i6, InterfaceC1193a interfaceC1193a) {
        this.a = i6;
        this.f10962b = interfaceC1193a;
    }

    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                ((w) this.f10962b).b();
                return;
            default:
                InterfaceC1193a interfaceC1193a = this.f10962b;
                if (interfaceC1193a != null) {
                    interfaceC1193a.b();
                    return;
                }
                return;
        }
    }
}
