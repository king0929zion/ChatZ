package b;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bot.MainActivity;
import java.util.concurrent.Executor;
import m4.AbstractC1276k;

/* renamed from: b.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0866j implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: c, reason: collision with root package name */
    public final long f10918c = SystemClock.uptimeMillis() + 10000;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f10919e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10920f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MainActivity f10921g;

    public ViewTreeObserverOnDrawListenerC0866j(MainActivity mainActivity) {
        this.f10921g = mainActivity;
    }

    public final void a(View view) {
        if (this.f10920f) {
            return;
        }
        this.f10920f = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC1276k.f(runnable, "runnable");
        this.f10919e = runnable;
        View decorView = this.f10921g.getWindow().getDecorView();
        AbstractC1276k.e(decorView, "window.decorView");
        if (!this.f10920f) {
            decorView.postOnAnimation(new I.h(this, 5));
        } else if (AbstractC1276k.b(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z5;
        Runnable runnable = this.f10919e;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f10918c) {
                this.f10920f = false;
                this.f10921g.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f10919e = null;
        t tVar = (t) this.f10921g.f10938j.getValue();
        synchronized (tVar.a) {
            z5 = tVar.f10954b;
        }
        if (z5) {
            this.f10920f = false;
            this.f10921g.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10921g.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
