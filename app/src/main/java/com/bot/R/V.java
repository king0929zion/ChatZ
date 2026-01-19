package R;

import T.C0607g0;
import T.d1;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.List;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class V implements AccessibilityManager.AccessibilityStateChangeListener, d1 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6727c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6728e;

    /* renamed from: f, reason: collision with root package name */
    public final C0607g0 f6729f = T.r.A(Boolean.FALSE);

    /* renamed from: g, reason: collision with root package name */
    public final U f6730g;

    /* renamed from: h, reason: collision with root package name */
    public final T f6731h;

    public V(boolean z5, boolean z6, boolean z7) {
        this.f6727c = z6;
        this.f6728e = z7;
        T t5 = null;
        this.f6730g = z5 ? new U() : null;
        if ((z6 || z7) && Build.VERSION.SDK_INT >= 33) {
            t5 = new T(this);
        }
        this.f6731h = t5;
    }

    public static boolean a(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i6 = 0; i6 < size; i6++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i6).getSettingsActivityName();
            if (settingsActivityName != null && AbstractC1776n.G(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i6 = 0; i6 < size; i6++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i6).getSettingsActivityName();
            if (settingsActivityName != null && AbstractC1776n.G(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (((java.lang.Boolean) r2.a.getValue()).booleanValue() == true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (((java.lang.Boolean) r2.f6725b.getValue()).booleanValue() == true) goto L22;
     */
    @Override // T.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getValue() {
        /*
            r3 = this;
            T.g0 r0 = r3.f6729f
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4e
            r0 = 1
            R.U r1 = r3.f6730g
            if (r1 == 0) goto L22
            T.g0 r1 = r1.f6726c
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != r0) goto L22
            goto L4f
        L22:
            boolean r1 = r3.f6727c
            R.T r2 = r3.f6731h
            if (r1 == 0) goto L39
            if (r2 == 0) goto L39
            T.g0 r1 = r2.a
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != r0) goto L39
            goto L4f
        L39:
            boolean r1 = r3.f6728e
            if (r1 == 0) goto L4e
            if (r2 == 0) goto L4e
            T.g0 r1 = r2.f6725b
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != r0) goto L4e
            goto L4f
        L4e:
            r0 = 0
        L4f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R.V.getValue():java.lang.Object");
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z5) {
        this.f6729f.setValue(Boolean.valueOf(z5));
    }
}
