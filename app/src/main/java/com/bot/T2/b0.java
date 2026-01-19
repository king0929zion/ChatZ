package T2;

/* loaded from: classes.dex */
public final class b0 extends s4.j {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8429c;

    public b0(boolean z5) {
        this.f8429c = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && this.f8429c == ((b0) obj).f8429c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8429c);
    }

    public final String toString() {
        return "InLinkText(isImage=" + this.f8429c + ")";
    }
}
