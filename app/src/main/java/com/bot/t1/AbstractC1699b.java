package t1;

import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;
import f0.C0987j;
import u1.C1754d;

/* renamed from: t1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1699b {

    /* renamed from: f, reason: collision with root package name */
    public static final View.AccessibilityDelegate f14866f = new View.AccessibilityDelegate();

    /* renamed from: c, reason: collision with root package name */
    public final View.AccessibilityDelegate f14867c = f14866f;

    /* renamed from: e, reason: collision with root package name */
    public final C1698a f14868e = new C1698a(this);

    public C0987j a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f14867c.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0987j(accessibilityNodeProvider, 23);
        }
        return null;
    }

    public void b(View view, C1754d c1754d) {
        this.f14867c.onInitializeAccessibilityNodeInfo(view, c1754d.a);
    }
}
