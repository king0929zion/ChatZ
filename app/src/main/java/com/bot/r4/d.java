package r4;

/* loaded from: classes.dex */
public final class d {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14678b;

    public d(float f6, float f7) {
        this.a = f6;
        this.f14678b = f7;
    }

    public static boolean a(Float f6, Float f7) {
        return f6.floatValue() <= f7.floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        float f6 = this.a;
        float f7 = this.f14678b;
        if (f6 > f7) {
            d dVar = (d) obj;
            if (dVar.a > dVar.f14678b) {
                return true;
            }
        }
        d dVar2 = (d) obj;
        return f6 == dVar2.a && f7 == dVar2.f14678b;
    }

    public final int hashCode() {
        float f6 = this.a;
        float f7 = this.f14678b;
        if (f6 > f7) {
            return -1;
        }
        return Float.hashCode(f7) + (Float.hashCode(f6) * 31);
    }

    public final String toString() {
        return this.a + ".." + this.f14678b;
    }
}
