package n;

import j1.AbstractC1135a;

/* renamed from: n.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1345t implements InterfaceC1349x {

    /* renamed from: c, reason: collision with root package name */
    public final float f13241c;

    /* renamed from: e, reason: collision with root package name */
    public final float f13242e;

    /* renamed from: f, reason: collision with root package name */
    public final float f13243f;

    /* renamed from: g, reason: collision with root package name */
    public final float f13244g;

    /* renamed from: h, reason: collision with root package name */
    public final float f13245h;

    /* renamed from: i, reason: collision with root package name */
    public final float f13246i;

    public C1345t(float f6, float f7, float f8, float f9) {
        int i6;
        this.f13241c = f6;
        this.f13242e = f7;
        this.f13243f = f8;
        this.f13244g = f9;
        if (!((Float.isNaN(f6) || Float.isNaN(f7) || Float.isNaN(f8) || Float.isNaN(f9)) ? false : true)) {
            AbstractC1309S.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f6 + ", " + f7 + ", " + f8 + ", " + f9 + '.');
        }
        float[] fArr = new float[5];
        float f10 = (f7 - S.l.f7374V) * 3.0f;
        float f11 = (f9 - f7) * 3.0f;
        float f12 = (1.0f - f9) * 3.0f;
        double d6 = f10;
        double d7 = f11;
        double d8 = f12;
        double d9 = d7 * 2.0d;
        double d10 = (d6 - d9) + d8;
        if (d10 == 0.0d) {
            i6 = d7 == d8 ? 0 : o0.y.H((float) ((d9 - d8) / (d9 - (d8 * 2.0d))), fArr, 0);
        } else {
            double d11 = -Math.sqrt((d7 * d7) - (d8 * d6));
            double d12 = (-d6) + d7;
            int H3 = o0.y.H((float) ((-(d11 + d12)) / d10), fArr, 0);
            int H5 = o0.y.H((float) ((d11 - d12) / d10), fArr, H3) + H3;
            if (H5 > 1) {
                float f13 = fArr[0];
                float f14 = fArr[1];
                if (f13 > f14) {
                    fArr[0] = f14;
                    fArr[1] = f13;
                } else if (f13 == f14) {
                    i6 = H5 - 1;
                }
            }
            i6 = H5;
        }
        float f15 = (f11 - f10) * 2.0f;
        int H6 = o0.y.H((-f15) / (((f12 - f11) * 2.0f) - f15), fArr, i6) + i6;
        float min = Math.min(S.l.f7374V, 1.0f);
        float max = Math.max(S.l.f7374V, 1.0f);
        for (int i7 = 0; i7 < H6; i7++) {
            float f16 = fArr[i7];
            float f17 = (((((((((f7 - f9) * 3.0f) + 1.0f) - S.l.f7374V) * f16) + (((f9 - (f7 * 2.0f)) + S.l.f7374V) * 3.0f)) * f16) + f10) * f16) + S.l.f7374V;
            min = Math.min(min, f17);
            max = Math.max(max, f17);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.f13245h = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.f13246i = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0206, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0236, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        r15 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e5, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bb, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0261  */
    @Override // n.InterfaceC1349x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float c(float r27) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C1345t.c(float):float");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1345t)) {
            return false;
        }
        C1345t c1345t = (C1345t) obj;
        return this.f13241c == c1345t.f13241c && this.f13242e == c1345t.f13242e && this.f13243f == c1345t.f13243f && this.f13244g == c1345t.f13244g;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13244g) + AbstractC1135a.a(this.f13243f, AbstractC1135a.a(this.f13242e, Float.hashCode(this.f13241c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.f13241c);
        sb.append(", b=");
        sb.append(this.f13242e);
        sb.append(", c=");
        sb.append(this.f13243f);
        sb.append(", d=");
        return AbstractC1135a.h(sb, this.f13244g, ')');
    }
}
