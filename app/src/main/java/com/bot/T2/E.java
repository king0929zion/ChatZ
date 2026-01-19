package T2;

/* loaded from: classes.dex */
public final class E extends s4.j {

    /* renamed from: c, reason: collision with root package name */
    public final int f8402c;

    public E(int i6) {
        this.f8402c = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E) && this.f8402c == ((E) obj).f8402c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8402c);
    }

    public final String toString() {
        return B3.e.l("BacktickStart(count=", this.f8402c, ")");
    }
}
