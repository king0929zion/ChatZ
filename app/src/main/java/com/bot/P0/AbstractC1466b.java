package p0;

/* renamed from: p0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1466b {
    public static final long a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f13832b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f13833c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f13834d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f13835e = 0;

    static {
        long j3 = 3;
        long j4 = j3 << 32;
        a = (0 & 4294967295L) | j4;
        f13832b = (1 & 4294967295L) | j4;
        f13833c = j4 | (2 & 4294967295L);
        f13834d = (j3 & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static String b(long j3) {
        return a(j3, a) ? "Rgb" : a(j3, f13832b) ? "Xyz" : a(j3, f13833c) ? "Lab" : a(j3, f13834d) ? "Cmyk" : "Unknown";
    }
}
