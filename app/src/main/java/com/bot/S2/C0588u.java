package S2;

import android.view.MotionEvent;
import android.webkit.WebView;

/* renamed from: S2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0588u extends WebView {
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
