package b0;

import android.os.Looper;

/* renamed from: b0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0881n {
    public static final long a;

    static {
        long j3;
        try {
            j3 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j3 = -1;
        }
        a = j3;
    }
}
