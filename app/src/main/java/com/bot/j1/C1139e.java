package j1;

import i4.AbstractC1118b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: j1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1139e extends AbstractC1118b {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12347b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12348c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12349d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12350e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12351f;

    public C1139e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f12347b = atomicReferenceFieldUpdater;
        this.f12348c = atomicReferenceFieldUpdater2;
        this.f12349d = atomicReferenceFieldUpdater3;
        this.f12350e = atomicReferenceFieldUpdater4;
        this.f12351f = atomicReferenceFieldUpdater5;
    }

    @Override // i4.AbstractC1118b
    public final boolean e(AbstractFutureC1142h abstractFutureC1142h, C1138d c1138d) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f12350e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1142h, c1138d, C1138d.f12346b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1142h) == c1138d);
        return false;
    }

    @Override // i4.AbstractC1118b
    public final boolean f(AbstractFutureC1142h abstractFutureC1142h, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f12351f;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1142h, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1142h) == obj);
        return false;
    }

    @Override // i4.AbstractC1118b
    public final boolean g(AbstractFutureC1142h abstractFutureC1142h, C1141g c1141g, C1141g c1141g2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f12349d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1142h, c1141g, c1141g2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1142h) == c1141g);
        return false;
    }

    @Override // i4.AbstractC1118b
    public final void r(C1141g c1141g, C1141g c1141g2) {
        this.f12348c.lazySet(c1141g, c1141g2);
    }

    @Override // i4.AbstractC1118b
    public final void s(C1141g c1141g, Thread thread) {
        this.f12347b.lazySet(c1141g, thread);
    }
}
