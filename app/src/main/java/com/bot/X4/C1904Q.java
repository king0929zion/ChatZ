package x4;

/* renamed from: x4.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1904Q extends AbstractRunnableC1905S {

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f15665f;

    public C1904Q(long j3, Runnable runnable) {
        super(j3);
        this.f15665f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15665f.run();
    }

    @Override // x4.AbstractRunnableC1905S
    public final String toString() {
        return super.toString() + this.f15665f;
    }
}
