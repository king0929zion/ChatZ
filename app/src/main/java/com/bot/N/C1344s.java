package n;

import java.util.Arrays;

/* renamed from: n.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1344s {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13224b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13225c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13226d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13227e;

    /* renamed from: f, reason: collision with root package name */
    public final float f13228f;

    /* renamed from: g, reason: collision with root package name */
    public final float f13229g;

    /* renamed from: h, reason: collision with root package name */
    public float f13230h;

    /* renamed from: i, reason: collision with root package name */
    public float f13231i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f13232j;

    /* renamed from: k, reason: collision with root package name */
    public final float f13233k;

    /* renamed from: l, reason: collision with root package name */
    public final float f13234l;

    /* renamed from: m, reason: collision with root package name */
    public final float f13235m;

    /* renamed from: n, reason: collision with root package name */
    public final float f13236n;

    /* renamed from: o, reason: collision with root package name */
    public final float f13237o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f13238p;

    /* renamed from: q, reason: collision with root package name */
    public final float f13239q;

    /* renamed from: r, reason: collision with root package name */
    public final float f13240r;

    public C1344s(int i6, float f6, float f7, float f8, float f9, float f10, float f11) {
        boolean z5;
        int i7;
        float f12;
        float f13;
        this.a = f6;
        this.f13224b = f7;
        this.f13225c = f8;
        this.f13226d = f9;
        this.f13227e = f10;
        this.f13228f = f11;
        float f14 = f10 - f8;
        float f15 = f11 - f9;
        float f16 = S.l.f7374V;
        int i8 = 1;
        boolean z6 = i6 == 1 || (i6 == 4 ? f15 > S.l.f7374V : !(i6 != 5 || f15 >= S.l.f7374V));
        float f17 = z6 ? -1.0f : 1.0f;
        this.f13235m = f17;
        float f18 = 1 / (f7 - f6);
        this.f13233k = f18;
        float[] fArr = new float[101];
        this.f13232j = fArr;
        boolean z7 = i6 == 3;
        if (z7 || Math.abs(f14) < 0.001f || Math.abs(f15) < 0.001f) {
            float hypot = (float) Math.hypot(f15, f14);
            this.f13229g = hypot;
            this.f13234l = hypot * f18;
            this.f13239q = f14 * f18;
            this.f13240r = f15 * f18;
            this.f13236n = Float.NaN;
            this.f13237o = Float.NaN;
            z5 = true;
        } else {
            this.f13236n = f14 * f17;
            this.f13237o = f15 * (-f17);
            this.f13239q = z6 ? f10 : f8;
            this.f13240r = z6 ? f9 : f11;
            float f19 = f10 - f8;
            float f20 = f9 - f11;
            float[] fArr2 = AbstractC1318d.f13113i;
            int i9 = 90;
            float f21 = 90;
            float f22 = f20;
            float f23 = 0.0f;
            float f24 = 0.0f;
            int i10 = 1;
            while (true) {
                i7 = i8;
                f12 = f16;
                double radians = (float) Math.toRadians((i10 * 90.0d) / i9);
                float sin = ((float) Math.sin(radians)) * f19;
                float cos = ((float) Math.cos(radians)) * f20;
                float f25 = sin - f24;
                f13 = f21;
                f23 += (float) Math.hypot(f25, cos - f22);
                fArr2[i10] = f23;
                i9 = 90;
                if (i10 == 90) {
                    break;
                }
                i10++;
                f22 = cos;
                f21 = f13;
                f16 = f12;
                f24 = sin;
                i8 = i7;
            }
            this.f13229g = f23;
            int i11 = i7;
            while (true) {
                fArr2[i11] = fArr2[i11] / f23;
                if (i11 == 90) {
                    break;
                } else {
                    i11++;
                }
            }
            int length = fArr.length;
            for (int i12 = 0; i12 < length; i12++) {
                float f26 = i12 / 100.0f;
                int binarySearch = Arrays.binarySearch(fArr2, 0, 91, f26);
                if (binarySearch >= 0) {
                    fArr[i12] = binarySearch / f13;
                } else if (binarySearch == -1) {
                    fArr[i12] = f12;
                } else {
                    int i13 = -binarySearch;
                    int i14 = i13 - 2;
                    float f27 = i14;
                    float f28 = fArr2[i14];
                    fArr[i12] = (((f26 - f28) / (fArr2[i13 - 1] - f28)) + f27) / f13;
                }
            }
            this.f13234l = this.f13229g * this.f13233k;
            z5 = z7;
        }
        this.f13238p = z5;
    }

    public final float a() {
        float f6 = this.f13236n * this.f13231i;
        return f6 * this.f13235m * (this.f13234l / ((float) Math.hypot(f6, (-this.f13237o) * this.f13230h)));
    }

    public final float b() {
        float f6 = this.f13236n * this.f13231i;
        float f7 = (-this.f13237o) * this.f13230h;
        return f7 * this.f13235m * (this.f13234l / ((float) Math.hypot(f6, f7)));
    }

    public final void c(float f6) {
        float f7 = (this.f13235m == -1.0f ? this.f13224b - f6 : f6 - this.a) * this.f13233k;
        float f8 = S.l.f7374V;
        if (f7 > S.l.f7374V) {
            f8 = 1.0f;
            if (f7 < 1.0f) {
                float f9 = f7 * 100;
                int i6 = (int) f9;
                float[] fArr = this.f13232j;
                float f10 = fArr[i6];
                f8 = ((fArr[i6 + 1] - f10) * (f9 - i6)) + f10;
            }
        }
        double d6 = f8 * 1.5707964f;
        this.f13230h = (float) Math.sin(d6);
        this.f13231i = (float) Math.cos(d6);
    }
}
