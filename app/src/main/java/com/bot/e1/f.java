package e1;

/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public final float f11571c;

    public /* synthetic */ f(float f6) {
        this.f11571c = f6;
    }

    public static final /* synthetic */ f a(float f6) {
        return new f(f6);
    }

    public static int b(float f6, float f7) {
        if (Float.isNaN(f6) || Float.isNaN(f7)) {
            return 0;
        }
        return Float.compare(f6, f7);
    }

    public static final boolean c(float f6, float f7) {
        return Float.compare(f6, f7) == 0;
    }

    public static String d(float f6) {
        if (Float.isNaN(f6)) {
            return "Dp.Unspecified";
        }
        return f6 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return b(this.f11571c, ((f) obj).f11571c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f11571c, ((f) obj).f11571c) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11571c);
    }

    public final String toString() {
        return d(this.f11571c);
    }
}
