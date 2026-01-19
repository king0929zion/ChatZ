package p0;

import o0.y;

/* renamed from: p0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1475k extends AbstractC1467c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13872d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1475k(long j3, String str, int i6, int i7) {
        super(j3, str, i6);
        this.f13872d = i7;
    }

    @Override // p0.AbstractC1467c
    public final float a(int i6) {
        switch (this.f13872d) {
            case 0:
                return i6 == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // p0.AbstractC1467c
    public final float b(int i6) {
        switch (this.f13872d) {
            case 0:
                if (i6 == 0) {
                    return S.l.f7374V;
                }
                return -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // p0.AbstractC1467c
    public final long d(float f6, float f7, float f8) {
        switch (this.f13872d) {
            case 0:
                if (f6 < S.l.f7374V) {
                    f6 = 0.0f;
                }
                if (f6 > 100.0f) {
                    f6 = 100.0f;
                }
                if (f7 < -128.0f) {
                    f7 = -128.0f;
                }
                if (f7 > 128.0f) {
                    f7 = 128.0f;
                }
                float f9 = (f6 + 16.0f) / 116.0f;
                float f10 = (f7 * 0.002f) + f9;
                float f11 = f10 > 0.20689656f ? f10 * f10 * f10 : (f10 - 0.13793103f) * 0.12841855f;
                float f12 = f9 > 0.20689656f ? f9 * f9 * f9 : (f9 - 0.13793103f) * 0.12841855f;
                float f13 = f11 * AbstractC1474j.f13871e[0];
                return (Float.floatToRawIntBits(f12 * r7[1]) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
            default:
                if (f6 < -2.0f) {
                    f6 = -2.0f;
                }
                if (f6 > 2.0f) {
                    f6 = 2.0f;
                }
                if (f7 < -2.0f) {
                    f7 = -2.0f;
                }
                return (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f7 <= 2.0f ? f7 : 2.0f) & 4294967295L);
        }
    }

    @Override // p0.AbstractC1467c
    public final float e(float f6, float f7, float f8) {
        switch (this.f13872d) {
            case 0:
                if (f6 < S.l.f7374V) {
                    f6 = 0.0f;
                }
                if (f6 > 100.0f) {
                    f6 = 100.0f;
                }
                if (f8 < -128.0f) {
                    f8 = -128.0f;
                }
                if (f8 > 128.0f) {
                    f8 = 128.0f;
                }
                float f9 = ((f6 + 16.0f) / 116.0f) - (f8 * 0.005f);
                return (f9 > 0.20689656f ? f9 * f9 * f9 : 0.12841855f * (f9 - 0.13793103f)) * AbstractC1474j.f13871e[2];
            default:
                if (f8 < -2.0f) {
                    f8 = -2.0f;
                }
                if (f8 > 2.0f) {
                    return 2.0f;
                }
                return f8;
        }
    }

    @Override // p0.AbstractC1467c
    public final long f(float f6, float f7, float f8, float f9, AbstractC1467c abstractC1467c) {
        switch (this.f13872d) {
            case 0:
                float[] fArr = AbstractC1474j.f13871e;
                float f10 = f6 / fArr[0];
                float f11 = f7 / fArr[1];
                float f12 = f8 / fArr[2];
                float cbrt = f10 > 0.008856452f ? (float) Math.cbrt(f10) : (f10 * 7.787037f) + 0.13793103f;
                float cbrt2 = f11 > 0.008856452f ? (float) Math.cbrt(f11) : (f11 * 7.787037f) + 0.13793103f;
                float f13 = (116.0f * cbrt2) - 16.0f;
                float f14 = (cbrt - cbrt2) * 500.0f;
                float cbrt3 = (cbrt2 - (f12 > 0.008856452f ? (float) Math.cbrt(f12) : (f12 * 7.787037f) + 0.13793103f)) * 200.0f;
                if (f13 < S.l.f7374V) {
                    f13 = 0.0f;
                }
                if (f13 > 100.0f) {
                    f13 = 100.0f;
                }
                if (f14 < -128.0f) {
                    f14 = -128.0f;
                }
                if (f14 > 128.0f) {
                    f14 = 128.0f;
                }
                if (cbrt3 < -128.0f) {
                    cbrt3 = -128.0f;
                }
                return y.b(f13, f14, cbrt3 <= 128.0f ? cbrt3 : 128.0f, f9, abstractC1467c);
            default:
                if (f6 < -2.0f) {
                    f6 = -2.0f;
                }
                if (f6 > 2.0f) {
                    f6 = 2.0f;
                }
                if (f7 < -2.0f) {
                    f7 = -2.0f;
                }
                if (f7 > 2.0f) {
                    f7 = 2.0f;
                }
                if (f8 < -2.0f) {
                    f8 = -2.0f;
                }
                return y.b(f6, f7, f8 <= 2.0f ? f8 : 2.0f, f9, abstractC1467c);
        }
    }
}
