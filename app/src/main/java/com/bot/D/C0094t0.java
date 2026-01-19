package D;

/* renamed from: D.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094t0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0094t0 f1176b = new C0094t0(null, 63);
    public final l4.c a;

    public C0094t0(l4.c cVar, int i6) {
        this.a = (i6 & 1) != 0 ? null : cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0094t0) {
            return this.a == ((C0094t0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        l4.c cVar = this.a;
        return (cVar != null ? cVar.hashCode() : 0) * 28629151;
    }
}
