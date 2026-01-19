package x4;

/* renamed from: x4.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1903P extends AbstractRunnableC1905S {

    /* renamed from: f, reason: collision with root package name */
    public final C1928k f15663f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC1907U f15664g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1903P(AbstractC1907U abstractC1907U, long j3, C1928k c1928k) {
        super(j3);
        this.f15664g = abstractC1907U;
        this.f15663f = c1928k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15663f.F(this.f15664g);
    }

    @Override // x4.AbstractRunnableC1905S
    public final String toString() {
        return super.toString() + this.f15663f;
    }
}
