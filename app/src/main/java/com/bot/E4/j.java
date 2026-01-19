package E4;

import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f1366f;

    public j(Runnable runnable, long j3, boolean z5) {
        super(j3, z5);
        this.f1366f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1366f.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f1366f;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC1888A.q(runnable));
        sb.append(", ");
        sb.append(this.f1364c);
        sb.append(", ");
        return B3.e.r(sb, this.f1365e ? "Blocking" : "Non-blocking", ']');
    }
}
