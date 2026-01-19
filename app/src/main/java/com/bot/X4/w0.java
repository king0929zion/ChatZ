package x4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class w0 extends h0 {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15732j = AtomicIntegerFieldUpdater.newUpdater(w0.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: h, reason: collision with root package name */
    public final Thread f15733h = Thread.currentThread();

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC1900M f15734i;

    public static void m(int i6) {
        throw new IllegalStateException(("Illegal state " + i6).toString());
    }

    @Override // x4.h0
    public final boolean j() {
        return true;
    }

    @Override // x4.h0
    public final void k(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i6;
        do {
            atomicIntegerFieldUpdater = f15732j;
            i6 = atomicIntegerFieldUpdater.get(this);
            if (i6 != 0) {
                if (i6 == 1 || i6 == 2 || i6 == 3) {
                    return;
                }
                m(i6);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i6, 2));
        this.f15733h.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void l() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15732j;
            int i6 = atomicIntegerFieldUpdater.get(this);
            if (i6 != 0) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m(i6);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i6, 1)) {
                InterfaceC1900M interfaceC1900M = this.f15734i;
                if (interfaceC1900M != null) {
                    interfaceC1900M.dispose();
                    return;
                }
                return;
            }
        }
    }
}
