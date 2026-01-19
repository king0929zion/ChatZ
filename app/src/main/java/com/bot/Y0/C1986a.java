package y0;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1986a {
    public final int a;

    public /* synthetic */ C1986a(int i6) {
        this.a = i6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1986a) {
            return this.a == ((C1986a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "IndirectPointerEventPrimaryDirectionalMotionAxis(value=" + this.a + ')';
    }
}
