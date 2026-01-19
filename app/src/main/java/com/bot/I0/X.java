package I0;

import android.os.Handler;
import android.view.Choreographer;
import b4.InterfaceC0910h;
import java.util.ArrayList;
import x4.AbstractC1939v;

/* loaded from: classes.dex */
public final class X extends AbstractC1939v {

    /* renamed from: p, reason: collision with root package name */
    public static final X3.n f2253p = X3.a.d(L.f2198k);

    /* renamed from: q, reason: collision with root package name */
    public static final V f2254q = new V(0);

    /* renamed from: f, reason: collision with root package name */
    public final Choreographer f2255f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f2256g;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2261l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2262m;

    /* renamed from: o, reason: collision with root package name */
    public final Z f2264o;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2257h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public final Y3.j f2258i = new Y3.j();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f2259j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2260k = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final W f2263n = new W(this);

    public X(Choreographer choreographer, Handler handler) {
        this.f2255f = choreographer;
        this.f2256g = handler;
        this.f2264o = new Z(choreographer, this);
    }

    public static final void h0(X x5) {
        Runnable runnable;
        boolean z5;
        do {
            synchronized (x5.f2257h) {
                Y3.j jVar = x5.f2258i;
                runnable = (Runnable) (jVar.isEmpty() ? null : jVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (x5.f2257h) {
                    Y3.j jVar2 = x5.f2258i;
                    runnable = (Runnable) (jVar2.isEmpty() ? null : jVar2.removeFirst());
                }
            }
            synchronized (x5.f2257h) {
                if (x5.f2258i.isEmpty()) {
                    z5 = false;
                    x5.f2261l = false;
                } else {
                    z5 = true;
                }
            }
        } while (z5);
    }

    @Override // x4.AbstractC1939v
    public final void d0(InterfaceC0910h interfaceC0910h, Runnable runnable) {
        synchronized (this.f2257h) {
            this.f2258i.addLast(runnable);
            if (!this.f2261l) {
                this.f2261l = true;
                this.f2256g.post(this.f2263n);
                if (!this.f2262m) {
                    this.f2262m = true;
                    this.f2255f.postFrameCallback(this.f2263n);
                }
            }
        }
    }
}
