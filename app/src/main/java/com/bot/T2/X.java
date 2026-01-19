package T2;

/* loaded from: classes.dex */
public final class X extends s4.j {

    /* renamed from: c, reason: collision with root package name */
    public final int f8423c;

    public X(int i6) {
        this.f8423c = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof X) && this.f8423c == ((X) obj).f8423c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8423c);
    }

    public final String toString() {
        return B3.e.l("InInlineCode(backtickCount=", this.f8423c, ")");
    }
}
