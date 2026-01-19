package Q;

/* loaded from: classes.dex */
public abstract class S1 {
    public static final T.B a = new T.B(new O.A(14));

    /* renamed from: b, reason: collision with root package name */
    public static final T1 f5510b;

    /* renamed from: c, reason: collision with root package name */
    public static final T1 f5511c;

    static {
        long j3 = o0.s.f13481h;
        f5510b = new T1(true, Float.NaN, j3);
        f5511c = new T1(false, Float.NaN, j3);
    }

    public static T1 a(float f6, int i6, long j3, boolean z5) {
        if ((i6 & 1) != 0) {
            z5 = true;
        }
        if ((i6 & 2) != 0) {
            f6 = Float.NaN;
        }
        if ((i6 & 4) != 0) {
            j3 = o0.s.f13481h;
        }
        return (e1.f.c(f6, Float.NaN) && o0.s.d(j3, o0.s.f13481h)) ? z5 ? f5510b : f5511c : new T1(z5, f6, j3);
    }
}
