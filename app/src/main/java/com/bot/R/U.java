package R;

import T.C0607g0;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class U implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: c, reason: collision with root package name */
    public final C0607g0 f6726c = T.r.A(Boolean.FALSE);

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z5) {
        this.f6726c.setValue(Boolean.valueOf(z5));
    }
}
