package T2;

/* loaded from: classes.dex */
public final class c0 extends s4.j {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8434c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8435d;

    public c0(String str, boolean z5) {
        this.f8434c = z5;
        this.f8435d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f8434c == c0Var.f8434c && this.f8435d.equals(c0Var.f8435d);
    }

    public final int hashCode() {
        return this.f8435d.hashCode() + (Boolean.hashCode(this.f8434c) * 31);
    }

    public final String toString() {
        return "InLinkUrl(isImage=" + this.f8434c + ", text=" + this.f8435d + ")";
    }
}
