package m0;

/* loaded from: classes.dex */
public final class f {
    public final int a;

    public static String a(int i6) {
        return i6 == 1 ? "Next" : i6 == 2 ? "Previous" : i6 == 3 ? "Left" : i6 == 4 ? "Right" : i6 == 5 ? "Up" : i6 == 6 ? "Down" : i6 == 7 ? "Enter" : i6 == 8 ? "Exit" : "Invalid FocusDirection";
    }

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
        return a(this.a);
    }
}
