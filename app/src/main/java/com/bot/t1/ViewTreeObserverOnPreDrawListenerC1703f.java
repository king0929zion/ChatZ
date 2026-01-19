package t1;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: t1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1703f implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: c, reason: collision with root package name */
    public final View f14869c;

    /* renamed from: e, reason: collision with root package name */
    public ViewTreeObserver f14870e;

    /* renamed from: f, reason: collision with root package name */
    public final RunnableC1716t f14871f;

    public ViewTreeObserverOnPreDrawListenerC1703f(View view, RunnableC1716t runnableC1716t) {
        this.f14869c = view;
        this.f14870e = view.getViewTreeObserver();
        this.f14871f = runnableC1716t;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f14870e.isAlive();
        View view = this.f14869c;
        if (isAlive) {
            this.f14870e.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f14871f.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f14870e = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f14870e.isAlive();
        View view2 = this.f14869c;
        if (isAlive) {
            this.f14870e.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
