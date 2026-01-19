package x4;

/* loaded from: classes.dex */
public final class y0 extends C4.r implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final long f15738h;

    public y0(long j3, d4.c cVar) {
        super(cVar, cVar.o());
        this.f15738h = j3;
    }

    @Override // x4.l0
    public final String b0() {
        return super.b0() + "(timeMillis=" + this.f15738h + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC1888A.p(this.f15679f);
        B(new x0("Timed out waiting for " + this.f15738h + " ms", this));
    }
}
