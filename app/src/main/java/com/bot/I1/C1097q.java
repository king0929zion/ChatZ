package i1;

import android.graphics.Insets;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* renamed from: i1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1097q {
    public static final C1097q a = new Object();

    public final int a(Window window) {
        WindowMetrics currentWindowMetrics = window.getWindowManager().getCurrentWindowMetrics();
        Insets insets = currentWindowMetrics.getWindowInsets().getInsets(WindowInsets.Type.systemBars());
        return currentWindowMetrics.getBounds().height() - (insets.top + insets.bottom);
    }

    public final void b(WindowManager.LayoutParams layoutParams, int i6) {
        layoutParams.setFitInsetsSides(i6);
    }

    public final void c(WindowManager.LayoutParams layoutParams, int i6) {
        layoutParams.setFitInsetsTypes(i6);
    }
}
