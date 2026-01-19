package d1;

/* renamed from: d1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0937d {
    public final int a;

    public static String a(int i6) {
        return i6 == 1 ? "Hyphens.None" : i6 == 2 ? "Hyphens.Auto" : i6 == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0937d) {
            return this.a == ((C0937d) obj).a;
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
