package p0;

/* renamed from: p0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1482r {
    public final double a;

    /* renamed from: b, reason: collision with root package name */
    public final double f13900b;

    /* renamed from: c, reason: collision with root package name */
    public final double f13901c;

    /* renamed from: d, reason: collision with root package name */
    public final double f13902d;

    /* renamed from: e, reason: collision with root package name */
    public final double f13903e;

    /* renamed from: f, reason: collision with root package name */
    public final double f13904f;

    /* renamed from: g, reason: collision with root package name */
    public final double f13905g;

    public C1482r(double d6, double d7, double d8, double d9, double d10, double d11, double d12) {
        this.a = d6;
        this.f13900b = d7;
        this.f13901c = d8;
        this.f13902d = d9;
        this.f13903e = d10;
        this.f13904f = d11;
        this.f13905g = d12;
        if (Double.isNaN(d7) || Double.isNaN(d8) || Double.isNaN(d9) || Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d6)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d6 == -2.0d || d6 == -3.0d) {
            return;
        }
        if (d10 < 0.0d || d10 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d10);
        }
        if (d10 == 0.0d && (d7 == 0.0d || d6 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d10 >= 1.0d && d9 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d7 == 0.0d || d6 == 0.0d) && d9 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d9 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d7 < 0.0d || d6 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1482r)) {
            return false;
        }
        C1482r c1482r = (C1482r) obj;
        return Double.compare(this.a, c1482r.a) == 0 && Double.compare(this.f13900b, c1482r.f13900b) == 0 && Double.compare(this.f13901c, c1482r.f13901c) == 0 && Double.compare(this.f13902d, c1482r.f13902d) == 0 && Double.compare(this.f13903e, c1482r.f13903e) == 0 && Double.compare(this.f13904f, c1482r.f13904f) == 0 && Double.compare(this.f13905g, c1482r.f13905g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f13905g) + ((Double.hashCode(this.f13904f) + ((Double.hashCode(this.f13903e) + ((Double.hashCode(this.f13902d) + ((Double.hashCode(this.f13901c) + ((Double.hashCode(this.f13900b) + (Double.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.a + ", a=" + this.f13900b + ", b=" + this.f13901c + ", c=" + this.f13902d + ", d=" + this.f13903e + ", e=" + this.f13904f + ", f=" + this.f13905g + ')';
    }

    public /* synthetic */ C1482r(double d6, double d7, double d8, double d9, double d10) {
        this(d6, d7, d8, d9, d10, 0.0d, 0.0d);
    }
}
