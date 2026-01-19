package Q;

import android.view.View;
import android.view.ViewTreeObserver;
import l4.InterfaceC1193a;

/* renamed from: Q.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0462s0 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: c, reason: collision with root package name */
    public boolean f6093c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f6094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f6095f;

    public ViewOnAttachStateChangeListenerC0462s0(View view, InterfaceC1193a interfaceC1193a) {
        this.f6094e = view;
        this.f6095f = interfaceC1193a;
        view.addOnAttachStateChangeListener(this);
        if (this.f6093c || !view.isAttachedToWindow()) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f6093c = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f6095f.b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f6093c) {
            return;
        }
        View view2 = this.f6094e;
        if (view2.isAttachedToWindow()) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f6093c = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f6093c) {
            this.f6094e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f6093c = false;
        }
    }
}
