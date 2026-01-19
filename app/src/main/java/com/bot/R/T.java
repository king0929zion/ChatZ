package R;

import T.C0607g0;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;

/* loaded from: classes.dex */
public final class T implements AccessibilityManager$AccessibilityServicesStateChangeListener {
    public final C0607g0 a;

    /* renamed from: b, reason: collision with root package name */
    public final C0607g0 f6725b;

    public T(V v5) {
        Boolean bool = Boolean.FALSE;
        this.a = T.r.A(bool);
        this.f6725b = T.r.A(bool);
    }

    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        this.a.setValue(Boolean.valueOf(V.a(accessibilityManager)));
        this.f6725b.setValue(Boolean.valueOf(V.c(accessibilityManager)));
    }
}
