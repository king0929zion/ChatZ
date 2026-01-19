package I0;

import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class W implements Choreographer.FrameCallback, Runnable {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X f2252c;

    public W(X x5) {
        this.f2252c = x5;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        this.f2252c.f2256g.removeCallbacks(this);
        X.h0(this.f2252c);
        X x5 = this.f2252c;
        synchronized (x5.f2257h) {
            if (x5.f2262m) {
                x5.f2262m = false;
                ArrayList arrayList = x5.f2259j;
                x5.f2259j = x5.f2260k;
                x5.f2260k = arrayList;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((Choreographer.FrameCallback) arrayList.get(i6)).doFrame(j3);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        X.h0(this.f2252c);
        X x5 = this.f2252c;
        synchronized (x5.f2257h) {
            if (x5.f2259j.isEmpty()) {
                x5.f2255f.removeFrameCallback(this);
                x5.f2262m = false;
            }
        }
    }
}
