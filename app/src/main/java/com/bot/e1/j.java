package e1;

/* loaded from: classes.dex */
public final class j {
    public final long a;

    public /* synthetic */ j(long j3) {
        this.a = j3;
    }

    public static final /* synthetic */ j a() {
        return new j(0L);
    }

    public static long b(int i6, int i7, int i8, long j3) {
        if ((i8 & 1) != 0) {
            i6 = (int) (j3 >> 32);
        }
        if ((i8 & 2) != 0) {
            i7 = (int) (j3 & 4294967295L);
        }
        return (i7 & 4294967295L) | (i6 << 32);
    }

    public static final boolean c(long j3, long j4) {
        return j3 == j4;
    }

    public static final long d(long j3, long j4) {
        return ((((int) (j3 >> 32)) - ((int) (j4 >> 32))) << 32) | ((((int) (j3 & 4294967295L)) - ((int) (j4 & 4294967295L))) & 4294967295L);
    }

    public static final long e(long j3, long j4) {
        return ((((int) (j3 >> 32)) + ((int) (j4 >> 32))) << 32) | ((((int) (j3 & 4294967295L)) + ((int) (j4 & 4294967295L))) & 4294967295L);
    }

    public static String f(long j3) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j3 >> 32));
        sb.append(", ");
        return B3.e.q(sb, (int) (j3 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.a == ((j) obj).a;
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
