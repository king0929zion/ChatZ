package Q0;

/* loaded from: classes.dex */
public abstract class a {
    public static final long a = (1023 << 50) ^ (-1);

    /* renamed from: b, reason: collision with root package name */
    public static final long f6313b = (-1) ^ (33554431 << 25);

    /* renamed from: c, reason: collision with root package name */
    public static final long f6314c;

    static {
        long j3 = 33554431;
        f6314c = j3 | (Math.min(0, 1023) << 50) | (j3 << 25);
    }
}
