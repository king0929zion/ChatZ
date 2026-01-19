package b;

import android.os.Build;
import android.view.View;
import android.view.Window;
import i4.AbstractC1118b;
import i4.AbstractC1121e;
import m4.AbstractC1276k;
import t1.Q;
import t1.S;

/* loaded from: classes.dex */
public class p {
    public void a(Window window) {
    }

    public void b(C0856E c0856e, C0856E c0856e2, Window window, View view, boolean z5, boolean z6) {
        AbstractC1276k.f(c0856e, "statusBarStyle");
        AbstractC1276k.f(c0856e2, "navigationBarStyle");
        AbstractC1276k.f(window, "window");
        AbstractC1276k.f(view, "view");
        AbstractC1118b.u(window, false);
        window.setStatusBarColor(z5 ? c0856e.f10908b : c0856e.a);
        window.setNavigationBarColor(z6 ? c0856e2.f10908b : c0856e2.a);
        int i6 = Build.VERSION.SDK_INT;
        AbstractC1121e s5 = i6 >= 35 ? new S(window) : i6 >= 30 ? new S(window) : new Q(window);
        s5.o(!z5);
        s5.n(!z6);
    }
}
