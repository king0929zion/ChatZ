package p0;

/* renamed from: p0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1474j {
    public static final C1483s a = new C1483s(0.31006f, 0.31616f);

    /* renamed from: b, reason: collision with root package name */
    public static final C1483s f13868b = new C1483s(0.34567f, 0.3585f);

    /* renamed from: c, reason: collision with root package name */
    public static final C1483s f13869c = new C1483s(0.32168f, 0.33767f);

    /* renamed from: d, reason: collision with root package name */
    public static final C1483s f13870d = new C1483s(0.31271f, 0.32902f);

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f13871e = {0.964212f, 1.0f, 0.825188f};

    public static AbstractC1467c a(AbstractC1467c abstractC1467c) {
        if (AbstractC1466b.a(abstractC1467c.f13836b, AbstractC1466b.a)) {
            C1481q c1481q = (C1481q) abstractC1467c;
            C1483s c1483s = c1481q.f13886d;
            C1483s c1483s2 = f13868b;
            if (!d(c1483s, c1483s2)) {
                return new C1481q(c1481q.a, c1481q.f13890h, c1483s2, g(c(C1465a.f13831b.a, c1483s.a(), c1483s2.a()), c1481q.f13891i), c1481q.f13893k, c1481q.f13896n, c1481q.f13887e, c1481q.f13888f, c1481q.f13889g, -1);
            }
        }
        return abstractC1467c;
    }

    public static float b(float[] fArr) {
        if (fArr.length < 6) {
            return S.l.f7374V;
        }
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = (((((f8 * f11) + ((f7 * f10) + (f6 * f9))) - (f9 * f10)) - (f7 * f8)) - (f6 * f11)) * 0.5f;
        return f12 < S.l.f7374V ? -f12 : f12;
    }

    public static final float[] c(float[] fArr, float[] fArr2, float[] fArr3) {
        h(fArr, fArr2);
        h(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] f6 = f(fArr);
        float f7 = fArr4[0];
        float f8 = fArr[0] * f7;
        float f9 = fArr4[1];
        float f10 = fArr[1] * f9;
        float f11 = fArr4[2];
        return g(f6, new float[]{f8, f10, fArr[2] * f11, fArr[3] * f7, fArr[4] * f9, fArr[5] * f11, f7 * fArr[6], f9 * fArr[7], f11 * fArr[8]});
    }

    public static final boolean d(C1483s c1483s, C1483s c1483s2) {
        if (c1483s == c1483s2) {
            return true;
        }
        return Math.abs(c1483s.a - c1483s2.a) < 0.001f && Math.abs(c1483s.f13906b - c1483s2.f13906b) < 0.001f;
    }

    public static final C1471g e(AbstractC1467c abstractC1467c, AbstractC1467c abstractC1467c2) {
        if (abstractC1467c == abstractC1467c2) {
            return new C1471g(abstractC1467c, abstractC1467c, 1);
        }
        long j3 = abstractC1467c.f13836b;
        long j4 = AbstractC1466b.a;
        return (AbstractC1466b.a(j3, j4) && AbstractC1466b.a(abstractC1467c2.f13836b, j4)) ? new C1470f((C1481q) abstractC1467c, (C1481q) abstractC1467c2) : new C1471g(abstractC1467c, abstractC1467c2, 0);
    }

    public static final float[] f(float[] fArr) {
        float f6 = fArr[0];
        float f7 = fArr[3];
        float f8 = fArr[6];
        float f9 = fArr[1];
        float f10 = fArr[4];
        float f11 = fArr[7];
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[8];
        float f15 = (f10 * f14) - (f11 * f13);
        float f16 = (f11 * f12) - (f9 * f14);
        float f17 = (f9 * f13) - (f10 * f12);
        float f18 = (f8 * f17) + (f7 * f16) + (f6 * f15);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f15 / f18;
        fArr2[1] = f16 / f18;
        fArr2[2] = f17 / f18;
        fArr2[3] = ((f8 * f13) - (f7 * f14)) / f18;
        fArr2[4] = ((f14 * f6) - (f8 * f12)) / f18;
        fArr2[5] = ((f12 * f7) - (f13 * f6)) / f18;
        fArr2[6] = ((f7 * f11) - (f8 * f10)) / f18;
        fArr2[7] = ((f8 * f9) - (f11 * f6)) / f18;
        fArr2[8] = ((f6 * f10) - (f7 * f9)) / f18;
        return fArr2;
    }

    public static final float[] g(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f6 = fArr[0] * fArr2[0];
        float f7 = fArr[3];
        float f8 = fArr2[1];
        float f9 = fArr[6];
        float f10 = fArr2[2];
        fArr3[0] = (f9 * f10) + (f7 * f8) + f6;
        float f11 = fArr[1];
        float f12 = fArr2[0];
        float f13 = fArr[4];
        float f14 = fArr[7];
        float f15 = f14 * f10;
        fArr3[1] = f15 + (f8 * f13) + (f11 * f12);
        float f16 = fArr[2] * f12;
        float f17 = fArr[5];
        float f18 = (fArr2[1] * f17) + f16;
        float f19 = fArr[8];
        fArr3[2] = (f10 * f19) + f18;
        float f20 = fArr[0];
        float f21 = fArr2[3] * f20;
        float f22 = fArr2[4];
        float f23 = (f7 * f22) + f21;
        float f24 = fArr2[5];
        fArr3[3] = (f9 * f24) + f23;
        float f25 = fArr[1];
        float f26 = fArr2[3];
        float f27 = f13 * f22;
        fArr3[4] = (f14 * f24) + f27 + (f25 * f26);
        float f28 = fArr[2];
        float f29 = f24 * f19;
        fArr3[5] = f29 + (f17 * fArr2[4]) + (f26 * f28);
        float f30 = f20 * fArr2[6];
        float f31 = fArr[3];
        float f32 = fArr2[7];
        float f33 = (f31 * f32) + f30;
        float f34 = fArr2[8];
        fArr3[6] = (f9 * f34) + f33;
        float f35 = fArr2[6];
        float f36 = f14 * f34;
        fArr3[7] = f36 + (fArr[4] * f32) + (f25 * f35);
        float f37 = f19 * f34;
        fArr3[8] = f37 + (fArr[5] * fArr2[7]) + (f28 * f35);
        return fArr3;
    }

    public static final float[] h(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f6 = fArr2[0];
        float f7 = fArr2[1];
        float f8 = fArr2[2];
        fArr2[0] = (fArr[6] * f8) + (fArr[3] * f7) + (fArr[0] * f6);
        fArr2[1] = (fArr[7] * f8) + (fArr[4] * f7) + (fArr[1] * f6);
        fArr2[2] = (fArr[8] * f8) + (fArr[5] * f7) + (fArr[2] * f6);
        return fArr2;
    }
}
