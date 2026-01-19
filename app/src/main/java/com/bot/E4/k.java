package E4;

import C4.v;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class k {
    public static final String a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f1367b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1368c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f1369d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f1370e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f1371f;

    static {
        String str;
        int i6 = v.a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        a = str;
        f1367b = C4.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i7 = v.a;
        if (i7 < 2) {
            i7 = 2;
        }
        f1368c = C4.a.j(i7, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f1369d = C4.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f1370e = TimeUnit.SECONDS.toNanos(C4.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f1371f = g.a;
    }
}
