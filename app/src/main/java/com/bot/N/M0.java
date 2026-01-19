package n;

/* loaded from: classes.dex */
public final class M0 implements H0 {

    /* renamed from: c, reason: collision with root package name */
    public final int f13030c;

    public M0(int i6) {
        this.f13030c = i6;
    }

    @Override // n.F0
    public final AbstractC1343r i(long j3, AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2, AbstractC1343r abstractC1343r3) {
        return j3 < ((long) this.f13030c) * 1000000 ? abstractC1343r : abstractC1343r2;
    }

    @Override // n.H0
    public final int p() {
        return this.f13030c;
    }

    @Override // n.F0
    public final AbstractC1343r q(long j3, AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2, AbstractC1343r abstractC1343r3) {
        return abstractC1343r3;
    }

    @Override // n.H0
    public final int r() {
        return 0;
    }
}
