package x4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: x4.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1895H extends C4.r {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15656h = AtomicIntegerFieldUpdater.newUpdater(C1895H.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // C4.r, x4.l0
    public final void v(Object obj) {
        x(obj);
    }

    @Override // C4.r, x4.l0
    public final void x(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f15656h;
            int i6 = atomicIntegerFieldUpdater.get(this);
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                C4.a.h(Y4.d.K(this.f713g), AbstractC1888A.A(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
