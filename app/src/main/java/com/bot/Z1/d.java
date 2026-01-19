package Z1;

/* loaded from: classes.dex */
public final class d extends RuntimeException {

    /* renamed from: c, reason: collision with root package name */
    public final e f9862c;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f9863e;

    public d(e eVar, Throwable th) {
        super(th);
        this.f9862c = eVar;
        this.f9863e = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f9863e;
    }
}
