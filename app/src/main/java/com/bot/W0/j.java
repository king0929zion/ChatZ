package W0;

/* loaded from: classes.dex */
public final class j {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.a == ((j) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i6 = this.a;
        return i6 == 0 ? "None" : i6 == 1 ? "Weight" : i6 == 2 ? "Style" : i6 == 65535 ? "All" : "Invalid";
    }
}
