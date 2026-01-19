package n;

/* renamed from: n.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1294C implements InterfaceC1292A {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final C1325g0 f12979b;

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, n.g0] */
    public C1294C(float f6, float f7, float f8) {
        this.a = f8;
        Object obj = new Object();
        obj.a = 1.0f;
        obj.f13157b = Math.sqrt(50.0d);
        obj.f13158c = 1.0f;
        if (f6 < S.l.f7374V) {
            AbstractC1309S.a("Damping ratio must be non-negative");
        }
        obj.f13158c = f6;
        double d6 = obj.f13157b;
        if (((float) (d6 * d6)) <= S.l.f7374V) {
            AbstractC1309S.a("Spring stiffness constant must be positive.");
        }
        obj.f13157b = Math.sqrt(f7);
        this.f12979b = obj;
    }

    @Override // n.InterfaceC1292A
    public final float b(long j3, float f6, float f7, float f8) {
        C1325g0 c1325g0 = this.f12979b;
        c1325g0.a = f7;
        return Float.intBitsToFloat((int) (c1325g0.a(f6, f8, j3 / 1000000) & 4294967295L));
    }

    @Override // n.InterfaceC1292A
    public final long c(float f6, float f7, float f8) {
        double d6;
        int i6;
        long j3;
        C1325g0 c1325g0 = this.f12979b;
        double d7 = c1325g0.f13157b;
        float f9 = (float) (d7 * d7);
        float f10 = c1325g0.f13158c;
        float f11 = this.a;
        float f12 = (f6 - f7) / f11;
        float f13 = f8 / f11;
        if (f10 == S.l.f7374V) {
            j3 = 9223372036854L;
        } else {
            double d8 = f9;
            double d9 = f10;
            double d10 = f13;
            double d11 = f12;
            double d12 = 1.0f;
            double sqrt = d9 * 2.0d * Math.sqrt(d8);
            double d13 = (sqrt * sqrt) - (d8 * 4.0d);
            double sqrt2 = d13 < 0.0d ? 0.0d : Math.sqrt(d13);
            double d14 = -sqrt;
            double d15 = (d14 + sqrt2) * 0.5d;
            double sqrt3 = (d13 < 0.0d ? Math.sqrt(Math.abs(d13)) : 0.0d) * 0.5d;
            double d16 = (d14 - sqrt2) * 0.5d;
            if (d11 == 0.0d && d10 == 0.0d) {
                j3 = 0;
            } else {
                if (d11 < 0.0d) {
                    d10 = -d10;
                }
                double abs = Math.abs(d11);
                double d17 = Double.MAX_VALUE;
                if (d9 > 1.0d) {
                    double d18 = (d15 * abs) - d10;
                    double d19 = d15 - d16;
                    double d20 = d18 / d19;
                    double d21 = abs - d20;
                    d6 = Math.log(Math.abs(d12 / d21)) / d15;
                    double log = Math.log(Math.abs(d12 / d20)) / d16;
                    if ((Double.doubleToRawLongBits(d6) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        d6 = log;
                    } else if ((Double.doubleToRawLongBits(log) & Long.MAX_VALUE) < 9218868437227405312L) {
                        d6 = Math.max(d6, log);
                    }
                    double d22 = d21 * d15;
                    double log2 = Math.log(d22 / ((-d20) * d16)) / (d16 - d15);
                    if (Double.isNaN(log2) || log2 <= 0.0d) {
                        d12 = -d12;
                    } else {
                        if (log2 > 0.0d) {
                            if ((-((Math.exp(log2 * d16) * d20) + (Math.exp(d15 * log2) * d21))) < d12) {
                                d12 = -d12;
                                d6 = (d20 <= 0.0d || d21 >= 0.0d) ? d6 : 0.0d;
                            }
                        }
                        d6 = Math.log((-((d20 * d16) * d16)) / (d22 * d15)) / d19;
                    }
                    double d23 = d20 * d16;
                    if (Math.abs((Math.exp(d16 * d6) * d23) + (Math.exp(d15 * d6) * d22)) >= 1.0E-4d) {
                        int i7 = 0;
                        while (d17 > 0.001d && i7 < 100) {
                            i7++;
                            double d24 = d15 * d6;
                            double d25 = d16 * d6;
                            double exp = d6 - ((((Math.exp(d25) * d20) + (Math.exp(d24) * d21)) + d12) / ((Math.exp(d25) * d23) + (Math.exp(d24) * d22)));
                            d17 = Math.abs(d6 - exp);
                            d6 = exp;
                        }
                    }
                } else if (d9 < 1.0d) {
                    double d26 = (d10 - (d15 * abs)) / sqrt3;
                    d6 = Math.log(d12 / Math.sqrt((d26 * d26) + (abs * abs))) / d15;
                } else {
                    double d27 = d15 * abs;
                    double d28 = d10 - d27;
                    double log3 = Math.log(Math.abs(d12 / abs)) / d15;
                    double log4 = Math.log(Math.abs(d12 / d28));
                    double d29 = log4;
                    for (int i8 = 0; i8 < 6; i8++) {
                        d29 = log4 - Math.log(Math.abs(d29 / d15));
                    }
                    double d30 = d29 / d15;
                    if ((Double.doubleToRawLongBits(log3) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        log3 = d30;
                    } else if ((Double.doubleToRawLongBits(d30) & Long.MAX_VALUE) < 9218868437227405312L) {
                        log3 = Math.max(log3, d30);
                    }
                    double d31 = (-(d27 + d28)) / (d15 * d28);
                    double d32 = d15 * d31;
                    double exp2 = (Math.exp(d32) * d28 * d31) + (Math.exp(d32) * abs);
                    if (!Double.isNaN(d31) && d31 > 0.0d) {
                        if (d31 <= 0.0d || (-exp2) >= d12) {
                            log3 = (-(2.0d / d15)) - (abs / d28);
                            d6 = log3;
                            i6 = 0;
                            while (d17 > 0.001d && i6 < 100) {
                                i6++;
                                double d33 = d15 * d6;
                                double exp3 = d6 - (((Math.exp(d33) * ((d28 * d6) + abs)) + d12) / (Math.exp(d33) * (((1 + d33) * d28) + d27)));
                                d17 = Math.abs(d6 - exp3);
                                d6 = exp3;
                            }
                        } else if (d28 < 0.0d && abs > 0.0d) {
                            log3 = 0.0d;
                        }
                    }
                    d12 = -d12;
                    d6 = log3;
                    i6 = 0;
                    while (d17 > 0.001d) {
                        i6++;
                        double d332 = d15 * d6;
                        double exp32 = d6 - (((Math.exp(d332) * ((d28 * d6) + abs)) + d12) / (Math.exp(d332) * (((1 + d332) * d28) + d27)));
                        d17 = Math.abs(d6 - exp32);
                        d6 = exp32;
                    }
                }
                j3 = (long) (d6 * 1000.0d);
            }
        }
        return j3 * 1000000;
    }

    @Override // n.InterfaceC1292A
    public final float d(float f6, float f7, float f8) {
        return S.l.f7374V;
    }

    @Override // n.InterfaceC1292A
    public final float e(long j3, float f6, float f7, float f8) {
        C1325g0 c1325g0 = this.f12979b;
        c1325g0.a = f7;
        return Float.intBitsToFloat((int) (c1325g0.a(f6, f8, j3 / 1000000) >> 32));
    }
}
