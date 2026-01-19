package x4;

import b4.InterfaceC0910h;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: x4.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1889B extends AbstractC1907U implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: m, reason: collision with root package name */
    public static final RunnableC1889B f15648m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f15649n;

    /* JADX WARN: Type inference failed for: r0v0, types: [x4.V, x4.U, x4.B] */
    static {
        Long l3;
        ?? abstractC1907U = new AbstractC1907U();
        f15648m = abstractC1907U;
        abstractC1907U.k0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l3 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l3 = 1000L;
        }
        f15649n = timeUnit.toNanos(l3.longValue());
    }

    @Override // x4.AbstractC1907U, x4.InterfaceC1893F
    public final InterfaceC1900M c(long j3, Runnable runnable, InterfaceC0910h interfaceC0910h) {
        long j4 = j3 > 0 ? j3 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j3 : 0L;
        if (j4 >= 4611686018427387903L) {
            return p0.f15721c;
        }
        long nanoTime = System.nanoTime();
        C1904Q c1904q = new C1904Q(j4 + nanoTime, runnable);
        s0(nanoTime, c1904q);
        return c1904q;
    }

    @Override // x4.AbstractC1908V
    public final Thread j0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f15648m.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // x4.AbstractC1908V
    public final void n0(long j3, AbstractRunnableC1905S abstractRunnableC1905S) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // x4.AbstractC1907U
    public final void o0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.o0(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean r02;
        v0.a.set(this);
        try {
            synchronized (this) {
                int i6 = debugStatus;
                if (i6 == 2 || i6 == 3) {
                    if (r02) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j3 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long l02 = l0();
                    if (l02 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j3 == Long.MAX_VALUE) {
                            j3 = f15649n + nanoTime;
                        }
                        long j4 = j3 - nanoTime;
                        if (j4 <= 0) {
                            _thread = null;
                            t0();
                            if (r0()) {
                                return;
                            }
                            j0();
                            return;
                        }
                        if (l02 > j4) {
                            l02 = j4;
                        }
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (l02 > 0) {
                        int i7 = debugStatus;
                        if (i7 == 2 || i7 == 3) {
                            _thread = null;
                            t0();
                            if (r0()) {
                                return;
                            }
                            j0();
                            return;
                        }
                        LockSupport.parkNanos(this, l02);
                    }
                }
            }
        } finally {
            _thread = null;
            t0();
            if (!r0()) {
                j0();
            }
        }
    }

    @Override // x4.AbstractC1907U, x4.AbstractC1908V
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void t0() {
        int i6 = debugStatus;
        if (i6 == 2 || i6 == 3) {
            debugStatus = 3;
            AbstractC1907U.f15669j.set(this, null);
            AbstractC1907U.f15670k.set(this, null);
            notifyAll();
        }
    }

    @Override // x4.AbstractC1939v
    public final String toString() {
        return "DefaultExecutor";
    }
}
