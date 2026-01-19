package d1;

/* loaded from: classes.dex */
public final class r {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.a == ((r) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i6 = this.a;
        return i6 == 1 ? "Linearity.Linear" : i6 == 2 ? "Linearity.FontHinting" : i6 == 3 ? "Linearity.None" : "Invalid";
    }
}
