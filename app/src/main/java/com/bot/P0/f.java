package P0;

/* loaded from: classes.dex */
public final class f {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.a == ((f) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i6 = this.a;
        return i6 == 0 ? "Polite" : i6 == 1 ? "Assertive" : "Unknown";
    }
}
