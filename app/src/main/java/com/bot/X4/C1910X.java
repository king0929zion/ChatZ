package x4;

import b4.InterfaceC0910h;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: x4.X, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1910X extends AbstractC1909W implements InterfaceC1893F {

    /* renamed from: f, reason: collision with root package name */
    public final Executor f15676f;

    public C1910X(Executor executor) {
        this.f15676f = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // x4.InterfaceC1893F
    public final InterfaceC1900M c(long j3, Runnable runnable, InterfaceC0910h interfaceC0910h) {
        Executor executor = this.f15676f;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e6) {
                AbstractC1888A.i(interfaceC0910h, AbstractC1888A.a("The task was rejected", e6));
            }
        }
        return scheduledFuture != null ? new C1899L(scheduledFuture) : RunnableC1889B.f15648m.c(j3, runnable, interfaceC0910h);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f15676f;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // x4.AbstractC1939v
    public final void d0(InterfaceC0910h interfaceC0910h, Runnable runnable) {
        try {
            this.f15676f.execute(runnable);
        } catch (RejectedExecutionException e6) {
            AbstractC1888A.i(interfaceC0910h, AbstractC1888A.a("The task was rejected", e6));
            E4.e eVar = AbstractC1898K.a;
            E4.d.f1360f.d0(interfaceC0910h, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1910X) && ((C1910X) obj).f15676f == this.f15676f;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f15676f);
    }

    @Override // x4.InterfaceC1893F
    public final void p(long j3, C1928k c1928k) {
        Executor executor = this.f15676f;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            C4.g gVar = new C4.g(3, this, c1928k);
            InterfaceC0910h interfaceC0910h = c1928k.f15708h;
            try {
                scheduledFuture = scheduledExecutorService.schedule(gVar, j3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e6) {
                AbstractC1888A.i(interfaceC0910h, AbstractC1888A.a("The task was rejected", e6));
            }
        }
        if (scheduledFuture != null) {
            c1928k.x(new C1925h(scheduledFuture, 0));
        } else {
            RunnableC1889B.f15648m.p(j3, c1928k);
        }
    }

    @Override // x4.AbstractC1939v
    public final String toString() {
        return this.f15676f.toString();
    }
}
