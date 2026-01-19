package t1;

import android.view.View;
import android.view.Window;
import com.vladsch.flexmark.parser.PegdownExtensions;
import i4.AbstractC1121e;

/* loaded from: classes.dex */
public final class Q extends AbstractC1121e {

    /* renamed from: c, reason: collision with root package name */
    public final Window f14863c;

    public Q(Window window) {
        this.f14863c = window;
    }

    @Override // i4.AbstractC1121e
    public final void n(boolean z5) {
        Window window = this.f14863c;
        if (!z5) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(PegdownExtensions.SUPERSCRIPT);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }

    @Override // i4.AbstractC1121e
    public final void o(boolean z5) {
        Window window = this.f14863c;
        if (!z5) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(PegdownExtensions.MULTI_LINE_IMAGE_URLS);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
