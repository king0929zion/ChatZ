package I0;

import android.view.MotionEvent;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import m4.AbstractC1276k;

/* renamed from: I0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0210u implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2387c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2388e;

    public /* synthetic */ RunnableC0210u(Object obj, int i6) {
        this.f2387c = i6;
        this.f2388e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T4.a c6;
        long j3;
        switch (this.f2387c) {
            case 0:
                ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = (ViewTreeObserverOnGlobalLayoutListenerC0216x) this.f2388e;
                viewTreeObserverOnGlobalLayoutListenerC0216x.removeCallbacks(this);
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC0216x.f2484x0;
                if (motionEvent != null) {
                    boolean z5 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z5) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i6 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i6 = 2;
                    }
                    ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x2 = (ViewTreeObserverOnGlobalLayoutListenerC0216x) this.f2388e;
                    viewTreeObserverOnGlobalLayoutListenerC0216x2.L(motionEvent, i6, viewTreeObserverOnGlobalLayoutListenerC0216x2.f2486y0, false);
                    return;
                }
                return;
        }
        while (true) {
            T4.d dVar = (T4.d) this.f2388e;
            synchronized (dVar) {
                c6 = dVar.c();
            }
            if (c6 == null) {
                return;
            }
            T4.c cVar = c6.f8518c;
            AbstractC1276k.c(cVar);
            T4.d dVar2 = (T4.d) this.f2388e;
            boolean isLoggable = T4.d.f8529j.isLoggable(Level.FINE);
            if (isLoggable) {
                j3 = System.nanoTime();
                Y3.C.f(c6, cVar, "starting");
            } else {
                j3 = -1;
            }
            try {
                T4.d.a(dVar2, c6);
                if (isLoggable) {
                    Y3.C.f(c6, cVar, "finished run in ".concat(Y3.C.o(System.nanoTime() - j3)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) dVar2.a.f119e).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        Y3.C.f(c6, cVar, "failed a run in ".concat(Y3.C.o(System.nanoTime() - j3)));
                    }
                    throw th2;
                }
            }
        }
    }
}
