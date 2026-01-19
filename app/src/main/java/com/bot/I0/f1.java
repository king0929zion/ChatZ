package I0;

import T.C0642y0;
import android.view.View;

/* loaded from: classes.dex */
public final class f1 implements View.OnAttachStateChangeListener {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2299c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0642y0 f2300e;

    public f1(View view, C0642y0 c0642y0) {
        this.f2299c = view;
        this.f2300e = c0642y0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2299c.removeOnAttachStateChangeListener(this);
        this.f2300e.x();
    }
}
