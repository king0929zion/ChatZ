package u1;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import f0.C0987j;
import java.util.List;

/* renamed from: u1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1755e extends AccessibilityNodeProvider {
    public final C0987j a;

    public C1755e(C0987j c0987j) {
        this.a = c0987j;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i6, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.a.s(i6, new C1754d(accessibilityNodeInfo), str, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i6) {
        C1754d u5 = this.a.u(i6);
        if (u5 == null) {
            return null;
        }
        return u5.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i6) {
        this.a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i6) {
        C1754d v5 = this.a.v(i6);
        if (v5 == null) {
            return null;
        }
        return v5.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i6, int i7, Bundle bundle) {
        return this.a.B(i6, i7, bundle);
    }
}
