package I0;

import android.view.Choreographer;
import x4.C1928k;

/* loaded from: classes.dex */
public final class Y implements Choreographer.FrameCallback {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1928k f2265c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4.c f2266e;

    public Y(C1928k c1928k, Z z5, l4.c cVar) {
        this.f2265c = c1928k;
        this.f2266e = cVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        Object b5;
        try {
            b5 = this.f2266e.f(Long.valueOf(j3));
        } catch (Throwable th) {
            b5 = X3.a.b(th);
        }
        this.f2265c.k(b5);
    }
}
