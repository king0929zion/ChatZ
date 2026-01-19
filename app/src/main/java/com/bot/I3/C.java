package I3;

/* loaded from: classes.dex */
public final class C extends IllegalStateException {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2714c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(String str, int i6) {
        super(str);
        this.f2714c = i6;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        switch (this.f2714c) {
            case 2:
                return null;
            default:
                return super.getCause();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(String str, Throwable th) {
        super(str, th);
        this.f2714c = 0;
    }
}
