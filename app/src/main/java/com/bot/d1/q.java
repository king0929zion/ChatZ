package d1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final q f11398c = new q(s4.j.z(0), s4.j.z(0));
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11399b;

    public q(long j3, long j4) {
        this.a = j3;
        this.f11399b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return e1.o.a(this.a, qVar.a) && e1.o.a(this.f11399b, qVar.f11399b);
    }

    public final int hashCode() {
        e1.p[] pVarArr = e1.o.f11579b;
        return Long.hashCode(this.f11399b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) e1.o.d(this.a)) + ", restLine=" + ((Object) e1.o.d(this.f11399b)) + ')';
    }
}
