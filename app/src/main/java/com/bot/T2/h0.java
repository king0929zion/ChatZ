package T2;

/* loaded from: classes.dex */
public final class h0 extends s4.j {

    /* renamed from: c, reason: collision with root package name */
    public final int f8447c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8448d;

    public h0(int i6, int i7) {
        this.f8447c = i6;
        this.f8448d = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f8447c == h0Var.f8447c && this.f8448d == h0Var.f8448d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8448d) + (Integer.hashCode(this.f8447c) * 31);
    }

    public final String toString() {
        return B3.e.i(this.f8447c, "InlineCodeEndCandidate(backtickCount=", this.f8448d, ", closingCount=", ")");
    }
}
