package G2;

import S.l;
import android.app.LocaleManager;
import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import android.view.inputmethod.EditorBoundsInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ LocaleManager b(Object obj) {
        return (LocaleManager) obj;
    }

    public static /* synthetic */ LineBreakConfig.Builder c() {
        return new LineBreakConfig.Builder();
    }

    public static /* synthetic */ BoringLayout g(CharSequence charSequence, TextPaint textPaint, int i6, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z5, TextUtils.TruncateAt truncateAt, int i7) {
        return new BoringLayout(charSequence, textPaint, i6, alignment, 1.0f, l.f7374V, metrics, z5, truncateAt, i7, true);
    }

    public static /* bridge */ /* synthetic */ AccessibilityManager$AccessibilityServicesStateChangeListener h(Object obj) {
        return (AccessibilityManager$AccessibilityServicesStateChangeListener) obj;
    }

    public static /* synthetic */ EditorBoundsInfo.Builder k() {
        return new EditorBoundsInfo.Builder();
    }

    public static /* bridge */ /* synthetic */ Class o() {
        return LocaleManager.class;
    }
}
