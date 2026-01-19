package I0;

import android.os.Handler;
import android.os.Looper;
import l4.InterfaceC1193a;
import m4.AbstractC1277l;
import x4.InterfaceC1942y;

/* renamed from: I0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203q extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2350e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0216x f2351f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0203q(ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x, int i6) {
        super(1);
        this.f2350e = i6;
        this.f2351f = viewTreeObserverOnGlobalLayoutListenerC0216x;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f2350e) {
            case 0:
                ((m0.q) this.f2351f.getFocusOwner()).i(((m0.f) obj).a, false);
                return X3.y.a;
            case 1:
                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) obj;
                ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = this.f2351f;
                viewTreeObserverOnGlobalLayoutListenerC0216x.getUncaughtExceptionHandler$ui();
                Handler handler = viewTreeObserverOnGlobalLayoutListenerC0216x.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC1193a.b();
                } else {
                    Handler handler2 = viewTreeObserverOnGlobalLayoutListenerC0216x.getHandler();
                    if (handler2 != null) {
                        handler2.post(new I.c(1, interfaceC1193a));
                    }
                }
                return X3.y.a;
            default:
                ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x2 = this.f2351f;
                return new S(viewTreeObserverOnGlobalLayoutListenerC0216x2, viewTreeObserverOnGlobalLayoutListenerC0216x2.getTextInputService(), (InterfaceC1942y) obj);
        }
    }
}
