package B0;

/* loaded from: classes.dex */
public final class K {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof K) {
            return this.a == ((K) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.a + ')';
    }
}
