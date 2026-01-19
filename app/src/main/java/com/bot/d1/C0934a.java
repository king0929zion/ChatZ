package d1;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0934a {
    public final float a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0934a) {
            return Float.compare(this.a, ((C0934a) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ')';
    }
}
