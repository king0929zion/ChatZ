package n1;

import S.l;

/* renamed from: n1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1361e {

    /* renamed from: k, reason: collision with root package name */
    public static final C1361e f13313k;
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13314b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13315c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13316d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13317e;

    /* renamed from: f, reason: collision with root package name */
    public final float f13318f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f13319g;

    /* renamed from: h, reason: collision with root package name */
    public final float f13320h;

    /* renamed from: i, reason: collision with root package name */
    public final float f13321i;

    /* renamed from: j, reason: collision with root package name */
    public final float f13322j;

    static {
        float g3 = (float) ((AbstractC1358b.g() * 63.66197723675813d) / 100.0d);
        float[] fArr = AbstractC1358b.f13311c;
        float f6 = fArr[0];
        float[][] fArr2 = AbstractC1358b.a;
        float[] fArr3 = fArr2[0];
        float f7 = fArr3[0] * f6;
        float f8 = fArr[1];
        float f9 = (fArr3[1] * f8) + f7;
        float f10 = fArr[2];
        float f11 = (fArr3[2] * f10) + f9;
        float[] fArr4 = fArr2[1];
        float f12 = (fArr4[2] * f10) + (fArr4[1] * f8) + (fArr4[0] * f6);
        float[] fArr5 = fArr2[2];
        float f13 = (f10 * fArr5[2]) + (f8 * fArr5[1]) + (f6 * fArr5[0]);
        float f14 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-g3) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d6 = exp;
        if (d6 > 1.0d) {
            exp = 1.0f;
        } else if (d6 < 0.0d) {
            exp = l.f7374V;
        }
        float f15 = 1.0f / ((5.0f * g3) + 1.0f);
        float f16 = f15 * f15 * f15 * f15;
        float f17 = 1.0f - f16;
        float cbrt = (0.1f * f17 * f17 * ((float) Math.cbrt(g3 * 5.0d))) + (f16 * g3);
        float g6 = AbstractC1358b.g() / fArr[1];
        double d7 = g6;
        float sqrt = ((float) Math.sqrt(d7)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d7, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * cbrt) * f11) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * cbrt) * f12) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * cbrt) * f13) / 100.0d, 0.42d)};
        float f18 = fArr6[0];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr6[1];
        float f21 = (f20 * 400.0f) / (f20 + 27.13f);
        float f22 = fArr6[2];
        float[] fArr7 = {f19, f21, (400.0f * f22) / (f22 + 27.13f)};
        f13313k = new C1361e(g6, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * pow, pow, pow, f14, 1.0f, new float[]{(((100.0f / f11) * exp) + 1.0f) - exp, (((100.0f / f12) * exp) + 1.0f) - exp, (((100.0f / f13) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public C1361e(float f6, float f7, float f8, float f9, float f10, float f11, float[] fArr, float f12, float f13, float f14) {
        this.f13318f = f6;
        this.a = f7;
        this.f13314b = f8;
        this.f13315c = f9;
        this.f13316d = f10;
        this.f13317e = f11;
        this.f13319g = fArr;
        this.f13320h = f12;
        this.f13321i = f13;
        this.f13322j = f14;
    }
}
