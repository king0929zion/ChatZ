package x4;

import java.util.concurrent.ScheduledFuture;

/* renamed from: x4.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1899L implements InterfaceC1900M {

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledFuture f15659c;

    public C1899L(ScheduledFuture scheduledFuture) {
        this.f15659c = scheduledFuture;
    }

    @Override // x4.InterfaceC1900M
    public final void dispose() {
        this.f15659c.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f15659c + ']';
    }
}
