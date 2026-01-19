package W0;

/* loaded from: classes.dex */
public final class i {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.a == ((i) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i6 = this.a;
        return i6 == 0 ? "Normal" : i6 == 1 ? "Italic" : "Invalid";
    }
}
