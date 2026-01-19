package n1;

import S.l;
import android.graphics.Color;
import o1.AbstractC1405a;

/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1357a {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13305b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13306c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13307d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13308e;

    /* renamed from: f, reason: collision with root package name */
    public final float f13309f;

    public C1357a(float f6, float f7, float f8, float f9, float f10, float f11) {
        this.a = f6;
        this.f13305b = f7;
        this.f13306c = f8;
        this.f13307d = f9;
        this.f13308e = f10;
        this.f13309f = f11;
    }

    public static C1357a a(int i6) {
        C1361e c1361e = C1361e.f13313k;
        float d6 = AbstractC1358b.d(Color.red(i6));
        float d7 = AbstractC1358b.d(Color.green(i6));
        float d8 = AbstractC1358b.d(Color.blue(i6));
        float[][] fArr = AbstractC1358b.f13312d;
        float[] fArr2 = fArr[0];
        float f6 = (fArr2[2] * d8) + (fArr2[1] * d7) + (fArr2[0] * d6);
        float[] fArr3 = fArr[1];
        float f7 = (fArr3[2] * d8) + (fArr3[1] * d7) + (fArr3[0] * d6);
        float[] fArr4 = fArr[2];
        float f8 = (d8 * fArr4[2]) + (d7 * fArr4[1]) + (d6 * fArr4[0]);
        float[][] fArr5 = AbstractC1358b.a;
        float[] fArr6 = fArr5[0];
        float f9 = (fArr6[2] * f8) + (fArr6[1] * f7) + (fArr6[0] * f6);
        float[] fArr7 = fArr5[1];
        float f10 = (fArr7[2] * f8) + (fArr7[1] * f7) + (fArr7[0] * f6);
        float[] fArr8 = fArr5[2];
        float f11 = (f8 * fArr8[2]) + (f7 * fArr8[1]) + (f6 * fArr8[0]);
        float[] fArr9 = c1361e.f13319g;
        float f12 = c1361e.f13321i;
        float f13 = c1361e.f13316d;
        float f14 = c1361e.a;
        float f15 = fArr9[0] * f9;
        float f16 = fArr9[1] * f10;
        float f17 = fArr9[2] * f11;
        float f18 = c1361e.f13320h;
        float pow = (float) Math.pow((Math.abs(f15) * f18) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f16) * f18) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f17) * f18) / 100.0d, 0.42d);
        float signum = ((Math.signum(f15) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f16) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f17) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d9 = signum3;
        float f19 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d9)) / 11.0f;
        float f20 = ((float) ((signum + signum2) - (d9 * 2.0d))) / 9.0f;
        float f21 = signum2 * 20.0f;
        float f22 = ((21.0f * signum3) + ((signum * 20.0f) + f21)) / 20.0f;
        float f23 = (((signum * 40.0f) + f21) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f20, f19)) * 180.0f) / 3.1415927f;
        if (atan2 < l.f7374V) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f24 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f23 * c1361e.f13314b) / f14, c1361e.f13322j * f13)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f25 = f14 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c1361e.f13318f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c1361e.f13317e) * c1361e.f13315c) * ((float) Math.sqrt((f20 * f20) + (f19 * f19)))) / (f22 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        Math.sqrt((r0 * f13) / f25);
        float f26 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f12 * pow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d10 = f24;
        return new C1357a(atan2, pow5, pow4, f26, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public static C1357a b(float f6, float f7, float f8) {
        C1361e c1361e = C1361e.f13313k;
        float f9 = c1361e.f13316d;
        Math.sqrt(f6 / 100.0d);
        float f10 = c1361e.a + 4.0f;
        float f11 = c1361e.f13321i * f7;
        Math.sqrt(((f7 / ((float) Math.sqrt(r1))) * c1361e.f13316d) / f10);
        float f12 = (1.7f * f6) / ((0.007f * f6) + 1.0f);
        float log = ((float) Math.log((f11 * 0.0228d) + 1.0d)) * 43.85965f;
        double d6 = (3.1415927f * f8) / 180.0f;
        return new C1357a(f8, f7, f6, f12, log * ((float) Math.cos(d6)), log * ((float) Math.sin(d6)));
    }

    public final int c(C1361e c1361e) {
        float f6;
        float f7 = this.f13305b;
        double d6 = f7;
        float f8 = this.f13306c;
        if (d6 != 0.0d) {
            double d7 = f8;
            if (d7 != 0.0d) {
                f6 = f7 / ((float) Math.sqrt(d7 / 100.0d));
                float f9 = c1361e.f13318f;
                float f10 = c1361e.f13320h;
                float pow = (float) Math.pow(f6 / Math.pow(1.64d - Math.pow(0.29d, f9), 0.73d), 1.1111111111111112d);
                double d8 = (this.a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d8) + 3.8d)) * 0.25f;
                float pow2 = c1361e.a * ((float) Math.pow(f8 / 100.0d, (1.0d / c1361e.f13316d) / c1361e.f13322j));
                float f11 = cos * 3846.1538f * c1361e.f13317e * c1361e.f13315c;
                float f12 = pow2 / c1361e.f13314b;
                float sin = (float) Math.sin(d8);
                float cos2 = (float) Math.cos(d8);
                float f13 = (((0.305f + f12) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f11 * 23.0f)));
                float f14 = cos2 * f13;
                float f15 = f13 * sin;
                float f16 = f12 * 460.0f;
                float f17 = ((288.0f * f15) + ((451.0f * f14) + f16)) / 1403.0f;
                float f18 = ((f16 - (891.0f * f14)) - (261.0f * f15)) / 1403.0f;
                float f19 = ((f16 - (f14 * 220.0f)) - (f15 * 6300.0f)) / 1403.0f;
                float f20 = 100.0f / f10;
                float signum = Math.signum(f17) * f20 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f17) * 27.13d) / (400.0d - Math.abs(f17))), 2.380952380952381d));
                float signum2 = Math.signum(f18) * f20 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f18) * 27.13d) / (400.0d - Math.abs(f18))), 2.380952380952381d));
                float signum3 = Math.signum(f19) * f20 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f19) * 27.13d) / (400.0d - Math.abs(f19))), 2.380952380952381d));
                float[] fArr = c1361e.f13319g;
                float f21 = signum / fArr[0];
                float f22 = signum2 / fArr[1];
                float f23 = signum3 / fArr[2];
                float[][] fArr2 = AbstractC1358b.f13310b;
                float[] fArr3 = fArr2[0];
                float f24 = (fArr3[2] * f23) + (fArr3[1] * f22) + (fArr3[0] * f21);
                float[] fArr4 = fArr2[1];
                float f25 = (fArr4[2] * f23) + (fArr4[1] * f22) + (fArr4[0] * f21);
                float[] fArr5 = fArr2[2];
                return AbstractC1405a.a(f24, f25, (f23 * fArr5[2]) + (f22 * fArr5[1]) + (f21 * fArr5[0]));
            }
        }
        f6 = l.f7374V;
        float f92 = c1361e.f13318f;
        float f102 = c1361e.f13320h;
        float pow3 = (float) Math.pow(f6 / Math.pow(1.64d - Math.pow(0.29d, f92), 0.73d), 1.1111111111111112d);
        double d82 = (this.a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d82) + 3.8d)) * 0.25f;
        float pow22 = c1361e.a * ((float) Math.pow(f8 / 100.0d, (1.0d / c1361e.f13316d) / c1361e.f13322j));
        float f112 = cos3 * 3846.1538f * c1361e.f13317e * c1361e.f13315c;
        float f122 = pow22 / c1361e.f13314b;
        float sin2 = (float) Math.sin(d82);
        float cos22 = (float) Math.cos(d82);
        float f132 = (((0.305f + f122) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + (((11.0f * pow3) * cos22) + (f112 * 23.0f)));
        float f142 = cos22 * f132;
        float f152 = f132 * sin2;
        float f162 = f122 * 460.0f;
        float f172 = ((288.0f * f152) + ((451.0f * f142) + f162)) / 1403.0f;
        float f182 = ((f162 - (891.0f * f142)) - (261.0f * f152)) / 1403.0f;
        float f192 = ((f162 - (f142 * 220.0f)) - (f152 * 6300.0f)) / 1403.0f;
        float f202 = 100.0f / f102;
        float signum4 = Math.signum(f172) * f202 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f172) * 27.13d) / (400.0d - Math.abs(f172))), 2.380952380952381d));
        float signum22 = Math.signum(f182) * f202 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f182) * 27.13d) / (400.0d - Math.abs(f182))), 2.380952380952381d));
        float signum32 = Math.signum(f192) * f202 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f192) * 27.13d) / (400.0d - Math.abs(f192))), 2.380952380952381d));
        float[] fArr6 = c1361e.f13319g;
        float f212 = signum4 / fArr6[0];
        float f222 = signum22 / fArr6[1];
        float f232 = signum32 / fArr6[2];
        float[][] fArr22 = AbstractC1358b.f13310b;
        float[] fArr32 = fArr22[0];
        float f242 = (fArr32[2] * f232) + (fArr32[1] * f222) + (fArr32[0] * f212);
        float[] fArr42 = fArr22[1];
        float f252 = (fArr42[2] * f232) + (fArr42[1] * f222) + (fArr42[0] * f212);
        float[] fArr52 = fArr22[2];
        return AbstractC1405a.a(f242, f252, (f232 * fArr52[2]) + (f222 * fArr52[1]) + (f212 * fArr52[0]));
    }
}
