package d1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final s f11400c = new s(2, false);

    /* renamed from: d, reason: collision with root package name */
    public static final s f11401d = new s(1, true);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11402b;

    public s(int i6, boolean z5) {
        this.a = i6;
        this.f11402b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.a == sVar.a && this.f11402b == sVar.f11402b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11402b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return equals(f11400c) ? "TextMotion.Static" : equals(f11401d) ? "TextMotion.Animated" : "Invalid";
    }
}
