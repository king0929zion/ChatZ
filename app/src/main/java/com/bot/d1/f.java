package d1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final float f11384b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f11385c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f11386d;
    public final float a;

    static {
        a(S.l.f7374V);
        a(0.5f);
        f11384b = 0.5f;
        a(-1.0f);
        f11385c = -1.0f;
        a(1.0f);
        f11386d = 1.0f;
    }

    public static void a(float f6) {
        if ((S.l.f7374V > f6 || f6 > 1.0f) && f6 != -1.0f) {
            Y0.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    public static String b(float f6) {
        if (f6 == S.l.f7374V) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f6 == f11384b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f6 == f11385c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f6 == f11386d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f6 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.a, ((f) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
