package M1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import j1.AbstractFutureC1142h;
import j1.C1143i;

/* loaded from: classes.dex */
public abstract class l {
    public static final C1143i a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f3265b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static F2.h f3266c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? j.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static F2.h b() {
        F2.h hVar = new F2.h(9);
        f3266c = hVar;
        C1143i c1143i = a;
        c1143i.getClass();
        if (AbstractFutureC1142h.f12356i.f(c1143i, null, hVar)) {
            AbstractFutureC1142h.b(c1143i);
        }
        return f3266c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.l.c(android.content.Context, boolean):void");
    }
}
