package I0;

/* renamed from: I0.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209t0 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2386b;

    public C0209t0(long j3, long j4) {
        this.a = j3;
        this.f2386b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0209t0) {
            C0209t0 c0209t0 = (C0209t0) obj;
            return e1.l.b(this.a, c0209t0.a) && this.f2386b == c0209t0.f2386b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2386b) + (Long.hashCode(this.a) * 31);
    }
}
