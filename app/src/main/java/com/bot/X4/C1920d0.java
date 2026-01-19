package x4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: x4.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1920d0 extends h0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15688i = AtomicIntegerFieldUpdater.newUpdater(C1920d0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* renamed from: h, reason: collision with root package name */
    public final l4.c f15689h;

    public C1920d0(l4.c cVar) {
        this.f15689h = cVar;
    }

    @Override // x4.h0
    public final boolean j() {
        return true;
    }

    @Override // x4.h0
    public final void k(Throwable th) {
        if (f15688i.compareAndSet(this, 0, 1)) {
            this.f15689h.f(th);
        }
    }
}
