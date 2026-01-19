package S0;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: b, reason: collision with root package name */
    public static final long f7610b = F.b(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f7611c = 0;
    public final long a;

    public /* synthetic */ O(long j3) {
        this.a = j3;
    }

    public static boolean a(long j3, Object obj) {
        return (obj instanceof O) && j3 == ((O) obj).a;
    }

    public static final boolean b(long j3, long j4) {
        return j3 == j4;
    }

    public static final boolean c(long j3) {
        return ((int) (j3 >> 32)) == ((int) (j3 & 4294967295L));
    }

    public static final int d(long j3) {
        return e(j3) - f(j3);
    }

    public static final int e(long j3) {
        return Math.max((int) (j3 >> 32), (int) (j3 & 4294967295L));
    }

    public static final int f(long j3) {
        return Math.min((int) (j3 >> 32), (int) (j3 & 4294967295L));
    }

    public static final boolean g(long j3) {
        return ((int) (j3 >> 32)) > ((int) (j3 & 4294967295L));
    }

    public static String h(long j3) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j3 >> 32));
        sb.append(", ");
        return B3.e.q(sb, (int) (j3 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return a(this.a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return h(this.a);
    }
}
