package d1;

/* loaded from: classes.dex */
public final class k {
    public final int a;

    public static String a(int i6) {
        return i6 == 1 ? "Left" : i6 == 2 ? "Right" : i6 == 3 ? "Center" : i6 == 4 ? "Justify" : i6 == 5 ? "Start" : i6 == 6 ? "End" : i6 == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.a == ((k) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
