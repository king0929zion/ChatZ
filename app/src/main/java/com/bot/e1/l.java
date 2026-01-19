package e1;

/* loaded from: classes.dex */
public final class l {
    public final long a;

    public /* synthetic */ l(long j3) {
        this.a = j3;
    }

    public static final /* synthetic */ l a() {
        return new l(0L);
    }

    public static final boolean b(long j3, long j4) {
        return j3 == j4;
    }

    public static String c(long j3) {
        return ((int) (j3 >> 32)) + " x " + ((int) (j3 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.a == ((l) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
