package v;

/* loaded from: classes.dex */
public final class S {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15267b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15268c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15269d;

    public S(int i6, int i7, int i8, int i9) {
        this.a = i6;
        this.f15267b = i7;
        this.f15268c = i8;
        this.f15269d = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s5 = (S) obj;
        return this.a == s5.a && this.f15267b == s5.f15267b && this.f15268c == s5.f15268c && this.f15269d == s5.f15269d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.f15267b) * 31) + this.f15268c) * 31) + this.f15269d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.f15267b);
        sb.append(", right=");
        sb.append(this.f15268c);
        sb.append(", bottom=");
        return B3.e.q(sb, this.f15269d, ')');
    }
}
