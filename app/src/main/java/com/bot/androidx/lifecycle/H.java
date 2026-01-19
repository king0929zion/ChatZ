package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.J;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class H {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0841o enumC0841o) {
        AbstractC1276k.f(enumC0841o, "event");
        if (activity instanceof InterfaceC0846u) {
            O g3 = ((InterfaceC0846u) activity).g();
            if (g3 instanceof C0848w) {
                ((C0848w) g3).n(enumC0841o);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            J.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new J.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new J(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
