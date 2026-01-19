package b;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.BackEvent;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0857a {
    public static AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static boolean e(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static float f(BackEvent backEvent) {
        return backEvent.getProgress();
    }

    public static void g(AccessibilityEvent accessibilityEvent, boolean z5) {
        accessibilityEvent.setAccessibilityDataSensitive(z5);
    }

    public static void h(AccessibilityNodeInfo accessibilityNodeInfo, boolean z5) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z5);
    }

    public static int i(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    public static float j(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    public static float k(BackEvent backEvent) {
        return backEvent.getTouchY();
    }
}
