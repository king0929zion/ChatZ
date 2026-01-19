package y4;

import X3.k;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import m4.AbstractC1276k;

/* renamed from: y4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1999e {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object b5;
        try {
            b5 = new C1998d(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            b5 = X3.a.b(th);
        }
        if (b5 instanceof k) {
            b5 = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            AbstractC1276k.d(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
