package I0;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import m4.AbstractC1276k;

/* renamed from: I0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183g implements InterfaceC0181f {
    public final AccessibilityManager a;

    public C0183g(Context context) {
        Object systemService = context.getSystemService("accessibility");
        AbstractC1276k.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.a = (AccessibilityManager) systemService;
    }
}
