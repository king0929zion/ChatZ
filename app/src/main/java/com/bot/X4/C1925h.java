package x4;

import java.util.concurrent.ScheduledFuture;

/* renamed from: x4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1925h implements InterfaceC1926i {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15696c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f15697e;

    public /* synthetic */ C1925h(Object obj, int i6) {
        this.f15696c = i6;
        this.f15697e = obj;
    }

    @Override // x4.InterfaceC1926i
    public final void b(Throwable th) {
        switch (this.f15696c) {
            case 0:
                ((ScheduledFuture) this.f15697e).cancel(false);
                return;
            case 1:
                ((l4.c) this.f15697e).f(th);
                return;
            default:
                ((InterfaceC1900M) this.f15697e).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f15696c) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f15697e) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((l4.c) this.f15697e).getClass().getSimpleName() + '@' + AbstractC1888A.q(this) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC1900M) this.f15697e) + ']';
        }
    }
}
