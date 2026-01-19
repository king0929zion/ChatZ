package p0;

import Y3.C;
import o0.y;

/* renamed from: p0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1476l extends AbstractC1467c {

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f13873d;

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f13874e;

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f13875f;

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f13876g;

    static {
        float[] g3 = AbstractC1474j.g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC1474j.c(C1465a.f13831b.a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f13873d = g3;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f13874e = fArr;
        f13875f = AbstractC1474j.f(g3);
        f13876g = AbstractC1474j.f(fArr);
    }

    @Override // p0.AbstractC1467c
    public final float a(int i6) {
        return i6 == 0 ? 1.0f : 0.5f;
    }

    @Override // p0.AbstractC1467c
    public final float b(int i6) {
        if (i6 == 0) {
            return S.l.f7374V;
        }
        return -0.5f;
    }

    @Override // p0.AbstractC1467c
    public final long d(float f6, float f7, float f8) {
        if (f6 < S.l.f7374V) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f7 < -0.5f) {
            f7 = -0.5f;
        }
        if (f7 > 0.5f) {
            f7 = 0.5f;
        }
        if (f8 < -0.5f) {
            f8 = -0.5f;
        }
        float f9 = f8 <= 0.5f ? f8 : 0.5f;
        float[] fArr = f13876g;
        float f10 = (fArr[6] * f9) + (fArr[3] * f7) + (fArr[0] * f6);
        float f11 = (fArr[7] * f9) + (fArr[4] * f7) + (fArr[1] * f6);
        float f12 = (fArr[8] * f9) + (fArr[5] * f7) + (fArr[2] * f6);
        float f13 = f11 * f11 * f11;
        float f14 = f12 * f12 * f12;
        float[] fArr2 = f13875f;
        float f15 = (fArr2[6] * f14) + (fArr2[3] * f13) + (fArr2[0] * f10 * f10 * f10);
        return (Float.floatToRawIntBits((fArr2[7] * f14) + (fArr2[4] * f13) + (fArr2[1] * r11)) & 4294967295L) | (Float.floatToRawIntBits(f15) << 32);
    }

    @Override // p0.AbstractC1467c
    public final float e(float f6, float f7, float f8) {
        if (f6 < S.l.f7374V) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f7 < -0.5f) {
            f7 = -0.5f;
        }
        if (f7 > 0.5f) {
            f7 = 0.5f;
        }
        if (f8 < -0.5f) {
            f8 = -0.5f;
        }
        float f9 = f8 <= 0.5f ? f8 : 0.5f;
        float[] fArr = f13876g;
        float f10 = (fArr[6] * f9) + (fArr[3] * f7) + (fArr[0] * f6);
        float f11 = (fArr[7] * f9) + (fArr[4] * f7) + (fArr[1] * f6);
        float f12 = (fArr[8] * f9) + (fArr[5] * f7) + (fArr[2] * f6);
        float f13 = f10 * f10 * f10;
        float f14 = f11 * f11 * f11;
        float f15 = f12 * f12 * f12;
        float[] fArr2 = f13875f;
        return (fArr2[8] * f15) + (fArr2[5] * f14) + (fArr2[2] * f13);
    }

    @Override // p0.AbstractC1467c
    public final long f(float f6, float f7, float f8, float f9, AbstractC1467c abstractC1467c) {
        float[] fArr = f13873d;
        float f10 = (fArr[6] * f8) + (fArr[3] * f7) + (fArr[0] * f6);
        float f11 = (fArr[7] * f8) + (fArr[4] * f7) + (fArr[1] * f6);
        float f12 = (fArr[8] * f8) + (fArr[5] * f7) + (fArr[2] * f6);
        float n3 = C.n(f10);
        float n5 = C.n(f11);
        float n6 = C.n(f12);
        float[] fArr2 = f13874e;
        return y.b((fArr2[6] * n6) + (fArr2[3] * n5) + (fArr2[0] * n3), (fArr2[7] * n6) + (fArr2[4] * n5) + (fArr2[1] * n3), (fArr2[8] * n6) + (fArr2[5] * n5) + (fArr2[2] * n3), f9, abstractC1467c);
    }
}
