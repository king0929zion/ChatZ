package t1;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: t1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1709l {
    public static P a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        P c6 = P.c(null, rootWindowInsets);
        L l3 = c6.a;
        l3.t(c6);
        l3.d(view.getRootView());
        return c6;
    }
}
