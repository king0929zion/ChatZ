package T;

/* renamed from: T.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0625p0 {
    public final AbstractC0623o0 a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8140b;

    /* renamed from: c, reason: collision with root package name */
    public final R0 f8141c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8142d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8143e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8144f = true;

    public C0625p0(AbstractC0623o0 abstractC0623o0, Object obj, boolean z5, R0 r02, boolean z6) {
        this.a = abstractC0623o0;
        this.f8140b = z5;
        this.f8141c = r02;
        this.f8142d = z6;
        this.f8143e = obj;
    }

    public final Object a() {
        if (this.f8140b) {
            return null;
        }
        Object obj = this.f8143e;
        if (obj != null) {
            return obj;
        }
        AbstractC0629s.b("Unexpected form of a provided value");
        throw new RuntimeException();
    }
}
