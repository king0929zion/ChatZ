package S0;

/* renamed from: S0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0549k {
    public final int a;

    public static String a(int i6) {
        if (i6 == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i6 == 1) {
            return "EmojiSupportMatch.None";
        }
        if (i6 == 2) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i6 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0549k) {
            return this.a == ((C0549k) obj).a;
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
