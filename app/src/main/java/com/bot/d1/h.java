package d1;

/* loaded from: classes.dex */
public final class h {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.a == ((h) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i6 = this.a;
        return i6 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i6 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i6 == 17 ? "LineHeightStyle.Trim.Both" : i6 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
