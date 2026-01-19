package e1;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final p[] f11579b = {new p(0), new p(4294967296L), new p(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f11580c = s4.j.B(Float.NaN, 0);
    public final long a;

    public /* synthetic */ o(long j3) {
        this.a = j3;
    }

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static final long b(long j3) {
        return f11579b[(int) ((j3 & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    public static String d(long j3) {
        long b5 = b(j3);
        if (p.a(b5, 0L)) {
            return "Unspecified";
        }
        if (p.a(b5, 4294967296L)) {
            return c(j3) + ".sp";
        }
        if (!p.a(b5, 8589934592L)) {
            return "Invalid";
        }
        return c(j3) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.a == ((o) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
