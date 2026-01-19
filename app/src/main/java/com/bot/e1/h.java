package e1;

/* loaded from: classes.dex */
public final class h {
    public final long a;

    public static final float a(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    public static final float b(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.a == ((h) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j3 = this.a;
        if (j3 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) f.d(b(j3))) + " x " + ((Object) f.d(a(j3)));
    }
}
