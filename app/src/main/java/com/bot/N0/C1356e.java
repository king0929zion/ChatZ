package n0;

import S.l;
import i1.AbstractC1087g;

/* renamed from: n0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1356e {
    public final long a;

    public /* synthetic */ C1356e(long j3) {
        this.a = j3;
    }

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static final float b(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    public static final float c(long j3) {
        return Math.min(Float.intBitsToFloat((int) ((j3 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j3 & 2147483647L)));
    }

    public static final float d(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    public static final boolean e(long j3) {
        return (j3 == 9205357640488583168L) | (Float.intBitsToFloat((int) (j3 >> 32)) <= l.f7374V) | (Float.intBitsToFloat((int) (j3 & 4294967295L)) <= l.f7374V);
    }

    public static String f(long j3) {
        if (j3 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + AbstractC1087g.o(Float.intBitsToFloat((int) (j3 >> 32))) + ", " + AbstractC1087g.o(Float.intBitsToFloat((int) (j3 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1356e) {
            return this.a == ((C1356e) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return f(this.a);
    }
}
