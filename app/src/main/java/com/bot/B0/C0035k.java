package B0;

/* renamed from: B0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035k {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0035k) {
            return this.a == ((C0035k) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "IndirectPointerEventData(packedValue=" + this.a + ')';
    }
}
