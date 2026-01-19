package b;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.bot.MainActivity;
import e.C0954b;
import i1.C1105y;
import java.util.ArrayList;
import m4.AbstractC1276k;

/* renamed from: b.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0863g {
    public static OnBackInvokedDispatcher a(MainActivity mainActivity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = mainActivity.getOnBackInvokedDispatcher();
        AbstractC1276k.e(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }

    public static Object b(String str, Bundle bundle) {
        return bundle.getParcelable(str, C0954b.class);
    }

    public static ArrayList c(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static String d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static final void f(C1105y c1105y, x xVar) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (xVar == null || (findOnBackInvokedDispatcher = c1105y.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, xVar);
    }

    public static final void g(C1105y c1105y, x xVar) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (xVar == null || (findOnBackInvokedDispatcher = c1105y.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(xVar);
    }

    public static void h(Object obj, Object obj2) {
        AbstractC1276k.f(obj, "dispatcher");
        AbstractC1276k.f(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj2);
    }

    public static void i(Object obj, Object obj2) {
        AbstractC1276k.f(obj, "dispatcher");
        AbstractC1276k.f(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
