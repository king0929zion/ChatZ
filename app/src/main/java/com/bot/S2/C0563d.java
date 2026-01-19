package S2;

/* renamed from: S2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0563d {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7743b;

    public C0563d(float f6, float f7) {
        this.a = f6;
        this.f7743b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0563d)) {
            return false;
        }
        C0563d c0563d = (C0563d) obj;
        return Float.compare(this.a, c0563d.a) == 0 && Float.compare(this.f7743b, c0563d.f7743b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7743b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ClusterPosition(x=" + this.a + ", baseline=" + this.f7743b + ")";
    }
}
