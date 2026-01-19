package s3;

/* renamed from: s3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1669a implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f14814c = new Object();
    public volatile c a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f14815b;

    /* JADX WARN: Type inference failed for: r0v1, types: [s3.c, s3.a, java.lang.Object] */
    public static c a(c cVar) {
        if (cVar instanceof C1669a) {
            return cVar;
        }
        Object obj = new Object();
        obj.f14815b = f14814c;
        obj.a = cVar;
        return obj;
    }

    @Override // s3.c
    public final Object get() {
        Object obj;
        Object obj2 = this.f14815b;
        Object obj3 = f14814c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.f14815b;
            if (obj == obj3) {
                obj = this.a.get();
                Object obj4 = this.f14815b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.f14815b = obj;
                this.a = null;
            }
        }
        return obj;
    }
}
