package x4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m4.AbstractC1276k;

/* renamed from: x4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1930m extends h0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f15716h;

    /* renamed from: i, reason: collision with root package name */
    public final C1928k f15717i;

    public /* synthetic */ C1930m(C1928k c1928k, int i6) {
        this.f15716h = i6;
        this.f15717i = c1928k;
    }

    @Override // x4.h0
    public final boolean j() {
        switch (this.f15716h) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // x4.h0
    public final void k(Throwable th) {
        switch (this.f15716h) {
            case 0:
                l0 i6 = i();
                C1928k c1928k = this.f15717i;
                Throwable r5 = c1928k.r(i6);
                if (c1928k.A()) {
                    C4.f fVar = (C4.f) c1928k.f15707g;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4.f.f688k;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        C4.u uVar = C4.a.f679c;
                        if (AbstractC1276k.b(obj, uVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, uVar, r5)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != uVar) {
                                    break;
                                }
                            }
                            return;
                        } else {
                            if (obj instanceof Throwable) {
                                return;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                c1928k.w(r5);
                if (c1928k.A()) {
                    return;
                }
                c1928k.p();
                return;
            default:
                this.f15717i.k(X3.y.a);
                return;
        }
    }
}
