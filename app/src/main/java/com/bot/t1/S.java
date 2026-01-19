package t1;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import i4.AbstractC1121e;

/* loaded from: classes.dex */
public class S extends AbstractC1121e {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsetsController f14864c;

    /* renamed from: d, reason: collision with root package name */
    public final Window f14865d;

    public S(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f14864c = insetsController;
        this.f14865d = window;
    }

    @Override // i4.AbstractC1121e
    public final void n(boolean z5) {
        Window window = this.f14865d;
        if (z5) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f14864c.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f14864c.setSystemBarsAppearance(0, 16);
    }

    @Override // i4.AbstractC1121e
    public final void o(boolean z5) {
        Window window = this.f14865d;
        if (z5) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f14864c.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f14864c.setSystemBarsAppearance(0, 8);
    }
}
