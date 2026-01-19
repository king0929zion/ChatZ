package i0;

/* renamed from: i0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1065d {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof C1065d) {
            return this.a == ((C1065d) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "AndroidContentDataType(androidAutofillType=" + this.a + ')';
    }
}
