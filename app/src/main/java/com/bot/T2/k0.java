package T2;

/* loaded from: classes.dex */
public final class k0 extends s4.j {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8459c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8460d;

    public k0(String str, boolean z5) {
        this.f8459c = z5;
        this.f8460d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f8459c == k0Var.f8459c && this.f8460d.equals(k0Var.f8460d);
    }

    public final int hashCode() {
        return this.f8460d.hashCode() + (Boolean.hashCode(this.f8459c) * 31);
    }

    public final String toString() {
        return "SquareBracketClose(isImage=" + this.f8459c + ", text=" + this.f8460d + ")";
    }
}
