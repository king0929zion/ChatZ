package I0;

import android.os.Build;

/* renamed from: I0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0193l implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        k.I i6 = ViewTreeObserverOnGlobalLayoutListenerC0216x.f2404Q0;
        synchronized (i6) {
            try {
                int i7 = 0;
                if (Build.VERSION.SDK_INT < 30) {
                    Object[] objArr = i6.a;
                    int i8 = i6.f12466b;
                    while (i7 < i8) {
                        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = (ViewTreeObserverOnGlobalLayoutListenerC0216x) objArr[i7];
                        boolean showLayoutBounds = viewTreeObserverOnGlobalLayoutListenerC0216x.getShowLayoutBounds();
                        Class cls = ViewTreeObserverOnGlobalLayoutListenerC0216x.f2401N0;
                        viewTreeObserverOnGlobalLayoutListenerC0216x.setShowLayoutBounds(K.j());
                        if (showLayoutBounds != viewTreeObserverOnGlobalLayoutListenerC0216x.getShowLayoutBounds()) {
                            ViewTreeObserverOnGlobalLayoutListenerC0216x.p(viewTreeObserverOnGlobalLayoutListenerC0216x.getRoot());
                        }
                        i7++;
                    }
                } else {
                    Object[] objArr2 = i6.a;
                    int i9 = i6.f12466b;
                    while (i7 < i9) {
                        ViewTreeObserverOnGlobalLayoutListenerC0216x.p(((ViewTreeObserverOnGlobalLayoutListenerC0216x) objArr2[i7]).getRoot());
                        i7++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
