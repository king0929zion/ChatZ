package N1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class z implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f3801c;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f3802e;

    /* renamed from: f, reason: collision with root package name */
    public Runnable f3803f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3804g;

    public z(Executor executor) {
        AbstractC1276k.f(executor, "executor");
        this.f3801c = executor;
        this.f3802e = new ArrayDeque();
        this.f3804g = new Object();
    }

    public final void a() {
        synchronized (this.f3804g) {
            Object poll = this.f3802e.poll();
            Runnable runnable = (Runnable) poll;
            this.f3803f = runnable;
            if (poll != null) {
                this.f3801c.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC1276k.f(runnable, "command");
        synchronized (this.f3804g) {
            this.f3802e.offer(new y(0, runnable, this));
            if (this.f3803f == null) {
                a();
            }
        }
    }
}
