package d1;

/* loaded from: classes.dex */
public final class m {
    public final int a;

    public static String a(int i6) {
        return i6 == 1 ? "Ltr" : i6 == 2 ? "Rtl" : i6 == 3 ? "Content" : i6 == 4 ? "ContentOrLtr" : i6 == 5 ? "ContentOrRtl" : i6 == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.a == ((m) obj).a;
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
