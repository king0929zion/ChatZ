package e1;

/* loaded from: classes.dex */
public final class g {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.a == ((g) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j3 = this.a;
        if (j3 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) f.d(Float.intBitsToFloat((int) (j3 >> 32)))) + ", " + ((Object) f.d(Float.intBitsToFloat((int) (j3 & 4294967295L)))) + ')';
    }
}
