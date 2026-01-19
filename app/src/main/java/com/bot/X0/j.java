package X0;

/* loaded from: classes.dex */
public final class j {
    public final int a;

    public static String a(int i6) {
        return i6 == -1 ? "Unspecified" : i6 == 0 ? "None" : i6 == 1 ? "Default" : i6 == 2 ? "Go" : i6 == 3 ? "Search" : i6 == 4 ? "Send" : i6 == 5 ? "Previous" : i6 == 6 ? "Next" : i6 == 7 ? "Done" : "Invalid";
    }

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
        return a(this.a);
    }
}
