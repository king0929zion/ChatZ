package n0;

import S.l;
import i1.AbstractC1087g;

/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1353b {
    public final long a;

    public static long a(float f6, int i6, long j3) {
        float intBitsToFloat = (i6 & 1) != 0 ? Float.intBitsToFloat((int) (j3 >> 32)) : l.f7374V;
        if ((i6 & 2) != 0) {
            f6 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        }
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
    }

    public static final long b(float f6, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / f6;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) / f6;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final boolean c(long j3, long j4) {
        return j3 == j4;
    }

    public static final float d(long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    public static final long e(long j3, long j4) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (j4 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - Float.intBitsToFloat((int) (j4 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long f(long j3, long j4) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32)) + Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L)) + Float.intBitsToFloat((int) (j3 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long g(float f6, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) * f6;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * f6;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static String h(long j3) {
        if ((9223372034707292159L & j3) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + AbstractC1087g.o(Float.intBitsToFloat((int) (j3 >> 32))) + ", " + AbstractC1087g.o(Float.intBitsToFloat((int) (j3 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1353b) {
            return this.a == ((C1353b) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return h(this.a);
    }
}
