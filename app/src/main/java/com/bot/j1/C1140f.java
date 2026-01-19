package j1;

import i4.AbstractC1118b;

/* renamed from: j1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1140f extends AbstractC1118b {
    @Override // i4.AbstractC1118b
    public final boolean e(AbstractFutureC1142h abstractFutureC1142h, C1138d c1138d) {
        C1138d c1138d2 = C1138d.f12346b;
        synchronized (abstractFutureC1142h) {
            try {
                if (abstractFutureC1142h.f12359e != c1138d) {
                    return false;
                }
                abstractFutureC1142h.f12359e = c1138d2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i4.AbstractC1118b
    public final boolean f(AbstractFutureC1142h abstractFutureC1142h, Object obj, Object obj2) {
        synchronized (abstractFutureC1142h) {
            try {
                if (abstractFutureC1142h.f12358c != obj) {
                    return false;
                }
                abstractFutureC1142h.f12358c = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i4.AbstractC1118b
    public final boolean g(AbstractFutureC1142h abstractFutureC1142h, C1141g c1141g, C1141g c1141g2) {
        synchronized (abstractFutureC1142h) {
            try {
                if (abstractFutureC1142h.f12360f != c1141g) {
                    return false;
                }
                abstractFutureC1142h.f12360f = c1141g2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i4.AbstractC1118b
    public final void r(C1141g c1141g, C1141g c1141g2) {
        c1141g.f12353b = c1141g2;
    }

    @Override // i4.AbstractC1118b
    public final void s(C1141g c1141g, Thread thread) {
        c1141g.a = thread;
    }
}
