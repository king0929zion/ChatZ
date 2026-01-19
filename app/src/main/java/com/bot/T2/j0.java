package T2;

/* loaded from: classes.dex */
public final class j0 extends s4.j {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8454c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8455d;

    public j0(String str, boolean z5) {
        this.f8454c = z5;
        this.f8455d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f8454c == j0Var.f8454c && this.f8455d.equals(j0Var.f8455d);
    }

    public final int hashCode() {
        return this.f8455d.hashCode() + (Boolean.hashCode(this.f8454c) * 31);
    }

    public final String toString() {
        return "ParenOpen(isImage=" + this.f8454c + ", text=" + this.f8455d + ")";
    }
}
