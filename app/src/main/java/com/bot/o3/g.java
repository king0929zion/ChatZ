package o3;

import android.os.Looper;
import i4.AbstractC1121e;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g {
    public final HashSet a = new HashSet();

    public final void a() {
        if (AbstractC1121e.f12085b == null) {
            AbstractC1121e.f12085b = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != AbstractC1121e.f12085b) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }
}
