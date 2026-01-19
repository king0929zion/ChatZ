package o1;

import android.os.Build;
import android.os.Trace;
import io.ktor.utils.io.u;
import o4.AbstractC1410a;

/* loaded from: classes.dex */
public abstract class e {
    public static final u a;

    static {
        AbstractC1410a.g("TypefaceCompat static init");
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            a = new u();
        } else if (i6 >= 28) {
            a = new f();
        } else {
            a = new f();
        }
        new F1.e(3);
        Trace.endSection();
    }
}
