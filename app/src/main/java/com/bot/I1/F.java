package I1;

import android.os.Bundle;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class F {
    public static final C0225d a = new C0225d(false, 1);

    /* renamed from: b, reason: collision with root package name */
    public static final C0225d f2533b = new C0225d(false, 2);

    /* renamed from: c, reason: collision with root package name */
    public static final C0225d f2534c = new C0225d(false, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final C0225d f2535d = new C0225d(true, 3);

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public boolean f(Object obj, Object obj2) {
        return AbstractC1276k.b(obj, obj2);
    }

    public final String toString() {
        return b();
    }
}
