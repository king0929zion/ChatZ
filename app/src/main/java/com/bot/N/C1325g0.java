package n;

/* renamed from: n.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1325g0 {
    public float a;

    /* renamed from: b, reason: collision with root package name */
    public double f13157b;

    /* renamed from: c, reason: collision with root package name */
    public float f13158c;

    public final long a(float f6, float f7, long j3) {
        double sin;
        double cos;
        double exp;
        double exp2;
        float f8 = f6 - this.a;
        double d6 = j3 / 1000.0d;
        float f9 = this.f13158c;
        double d7 = f9 * f9;
        double d8 = this.f13157b;
        double d9 = (-f9) * d8;
        if (f9 > 1.0f) {
            double sqrt = Math.sqrt(d7 - 1) * d8;
            double d10 = d9 + sqrt;
            double d11 = d9 - sqrt;
            double d12 = f8;
            double d13 = ((d11 * d12) - f7) / (d11 - d10);
            double d14 = d12 - d13;
            double d15 = d11 * d6;
            double d16 = d6 * d10;
            sin = (Math.exp(d16) * d13) + (Math.exp(d15) * d14);
            exp = Math.exp(d15) * d14 * d11;
            exp2 = Math.exp(d16) * d13 * d10;
        } else {
            if (f9 != 1.0f) {
                double d17 = 1;
                double sqrt2 = Math.sqrt(d17 - d7) * d8;
                double d18 = f8;
                double d19 = (((-d9) * d18) + f7) * (d17 / sqrt2);
                double d20 = sqrt2 * d6;
                double d21 = d6 * d9;
                sin = ((Math.sin(d20) * d19) + (Math.cos(d20) * d18)) * Math.exp(d21);
                cos = (((Math.cos(d20) * sqrt2 * d19) + (Math.sin(d20) * (-sqrt2) * d18)) * Math.exp(d21)) + (d9 * sin);
                float f10 = (float) cos;
                return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits((float) (sin + this.a)) << 32);
            }
            double d22 = f8;
            double d23 = (d8 * d22) + f7;
            double d24 = (-d8) * d6;
            double d25 = (d6 * d23) + d22;
            sin = Math.exp(d24) * d25;
            exp = Math.exp(d24) * d25 * (-this.f13157b);
            exp2 = Math.exp(d24) * d23;
        }
        cos = exp2 + exp;
        float f102 = (float) cos;
        return (Float.floatToRawIntBits(f102) & 4294967295L) | (Float.floatToRawIntBits((float) (sin + this.a)) << 32);
    }
}
