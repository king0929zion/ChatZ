package T2;

/* loaded from: classes.dex */
public final class l0 extends s4.j {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8462c;

    public l0(boolean z5) {
        this.f8462c = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && this.f8462c == ((l0) obj).f8462c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8462c);
    }

    public final String toString() {
        return "SquareBracketOpen(isImage=" + this.f8462c + ")";
    }
}
