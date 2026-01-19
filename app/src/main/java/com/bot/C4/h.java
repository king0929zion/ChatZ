package C4;

import b4.InterfaceC0910h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import x4.AbstractC1890C;
import x4.AbstractC1939v;
import x4.C1928k;
import x4.InterfaceC1893F;
import x4.InterfaceC1900M;

/* loaded from: classes.dex */
public final class h extends AbstractC1939v implements InterfaceC1893F {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f696k = AtomicIntegerFieldUpdater.newUpdater(h.class, "runningWorkers$volatile");

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1893F f697f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC1939v f698g;

    /* renamed from: h, reason: collision with root package name */
    public final int f699h;

    /* renamed from: i, reason: collision with root package name */
    public final l f700i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f701j;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public h(AbstractC1939v abstractC1939v, int i6) {
        InterfaceC1893F interfaceC1893F = abstractC1939v instanceof InterfaceC1893F ? (InterfaceC1893F) abstractC1939v : null;
        this.f697f = interfaceC1893F == null ? AbstractC1890C.a : interfaceC1893F;
        this.f698g = abstractC1939v;
        this.f699h = i6;
        this.f700i = new l();
        this.f701j = new Object();
    }

    @Override // x4.InterfaceC1893F
    public final InterfaceC1900M c(long j3, Runnable runnable, InterfaceC0910h interfaceC0910h) {
        return this.f697f.c(j3, runnable, interfaceC0910h);
    }

    @Override // x4.AbstractC1939v
    public final void d0(InterfaceC0910h interfaceC0910h, Runnable runnable) {
        Runnable h02;
        this.f700i.a(runnable);
        if (f696k.get(this) >= this.f699h || !i0() || (h02 = h0()) == null) {
            return;
        }
        this.f698g.d0(this, new g(this, h02));
    }

    @Override // x4.AbstractC1939v
    public final void e0(InterfaceC0910h interfaceC0910h, Runnable runnable) {
        Runnable h02;
        this.f700i.a(runnable);
        if (f696k.get(this) >= this.f699h || !i0() || (h02 = h0()) == null) {
            return;
        }
        this.f698g.e0(this, new g(this, h02));
    }

    @Override // x4.AbstractC1939v
    public final AbstractC1939v g0(int i6) {
        a.a(i6);
        return i6 >= this.f699h ? this : super.g0(i6);
    }

    public final Runnable h0() {
        while (true) {
            Runnable runnable = (Runnable) this.f700i.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f701j) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f696k;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f700i.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean i0() {
        synchronized (this.f701j) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f696k;
            if (atomicIntegerFieldUpdater.get(this) >= this.f699h) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // x4.InterfaceC1893F
    public final void p(long j3, C1928k c1928k) {
        this.f697f.p(j3, c1928k);
    }

    @Override // x4.AbstractC1939v
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f698g);
        sb.append(".limitedParallelism(");
        return B3.e.q(sb, this.f699h, ')');
    }
}
