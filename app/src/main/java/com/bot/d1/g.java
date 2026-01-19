package d1;

/* loaded from: classes.dex */
public final class g {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.a == ((g) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i6 = this.a;
        return i6 == 0 ? "LineHeightStyle.Mode.Fixed" : i6 == 1 ? "LineHeightStyle.Mode.Minimum" : i6 == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
