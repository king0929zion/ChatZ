package x0;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1861a {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof C1861a) {
            return this.a == ((C1861a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i6 = this.a;
        return i6 == 1 ? "Touch" : i6 == 2 ? "Keyboard" : "Error";
    }
}
