package x4;

/* renamed from: x4.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1908V extends AbstractC1939v {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f15672i = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f15673f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15674g;

    /* renamed from: h, reason: collision with root package name */
    public Y3.j f15675h;

    @Override // x4.AbstractC1939v
    public final AbstractC1939v g0(int i6) {
        C4.a.a(i6);
        return this;
    }

    public final void h0(boolean z5) {
        long j3 = this.f15673f - (z5 ? 4294967296L : 1L);
        this.f15673f = j3;
        if (j3 <= 0 && this.f15674g) {
            shutdown();
        }
    }

    public final void i0(AbstractC1896I abstractC1896I) {
        Y3.j jVar = this.f15675h;
        if (jVar == null) {
            jVar = new Y3.j();
            this.f15675h = jVar;
        }
        jVar.addLast(abstractC1896I);
    }

    public abstract Thread j0();

    public final void k0(boolean z5) {
        this.f15673f = (z5 ? 4294967296L : 1L) + this.f15673f;
        if (z5) {
            return;
        }
        this.f15674g = true;
    }

    public abstract long l0();

    public final boolean m0() {
        Y3.j jVar = this.f15675h;
        if (jVar == null) {
            return false;
        }
        AbstractC1896I abstractC1896I = (AbstractC1896I) (jVar.isEmpty() ? null : jVar.removeFirst());
        if (abstractC1896I == null) {
            return false;
        }
        abstractC1896I.run();
        return true;
    }

    public void n0(long j3, AbstractRunnableC1905S abstractRunnableC1905S) {
        RunnableC1889B.f15648m.s0(j3, abstractRunnableC1905S);
    }

    public abstract void shutdown();
}
