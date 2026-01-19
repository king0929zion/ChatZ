package I0;

import android.os.Trace;
import android.view.MotionEvent;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* renamed from: I0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0191k implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2318c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0216x f2319e;

    public /* synthetic */ RunnableC0191k(ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x, int i6) {
        this.f2318c = i6;
        this.f2319e = viewTreeObserverOnGlobalLayoutListenerC0216x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2318c) {
            case 0:
                ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = this.f2319e;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!viewTreeObserverOnGlobalLayoutListenerC0216x.f2457k.isEmpty()) {
                    try {
                        ((InterfaceC1193a) viewTreeObserverOnGlobalLayoutListenerC0216x.f2457k.removeLast()).b();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            default:
                ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x2 = this.f2319e;
                viewTreeObserverOnGlobalLayoutListenerC0216x2.f2417F0 = false;
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC0216x2.f2484x0;
                AbstractC1276k.c(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                viewTreeObserverOnGlobalLayoutListenerC0216x2.K(motionEvent);
                return;
        }
    }
}
