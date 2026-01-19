package p0;

import o0.y;

/* renamed from: p0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1470f extends C1471g {

    /* renamed from: e, reason: collision with root package name */
    public final C1481q f13862e;

    /* renamed from: f, reason: collision with root package name */
    public final C1481q f13863f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f13864g;

    public C1470f(C1481q c1481q, C1481q c1481q2) {
        super(c1481q2, c1481q, c1481q2, null);
        float[] g3;
        this.f13862e = c1481q;
        this.f13863f = c1481q2;
        float[] fArr = C1465a.f13831b.a;
        C1483s c1483s = c1481q.f13886d;
        float[] fArr2 = c1481q.f13891i;
        C1483s c1483s2 = c1481q2.f13886d;
        float[] fArr3 = c1481q2.f13892j;
        if (AbstractC1474j.d(c1483s, c1483s2)) {
            g3 = AbstractC1474j.g(fArr3, fArr2);
        } else {
            float[] a = c1483s.a();
            float[] a6 = c1483s2.a();
            C1483s c1483s3 = AbstractC1474j.f13868b;
            g3 = AbstractC1474j.g(AbstractC1474j.d(c1483s2, c1483s3) ? fArr3 : AbstractC1474j.f(AbstractC1474j.g(AbstractC1474j.c(fArr, a6, new float[]{0.964212f, 1.0f, 0.825188f}), c1481q2.f13891i)), AbstractC1474j.d(c1483s, c1483s3) ? fArr2 : AbstractC1474j.g(AbstractC1474j.c(fArr, a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f13864g = g3;
    }

    @Override // p0.C1471g
    public final long a(long j3) {
        float i6 = o0.s.i(j3);
        float h3 = o0.s.h(j3);
        float f6 = o0.s.f(j3);
        float e6 = o0.s.e(j3);
        C1477m c1477m = this.f13862e.f13898p;
        float e7 = (float) c1477m.e(i6);
        float e8 = (float) c1477m.e(h3);
        float e9 = (float) c1477m.e(f6);
        float[] fArr = this.f13864g;
        float f7 = (fArr[6] * e9) + (fArr[3] * e8) + (fArr[0] * e7);
        float f8 = (fArr[7] * e9) + (fArr[4] * e8) + (fArr[1] * e7);
        float f9 = (fArr[8] * e9) + (fArr[5] * e8) + (fArr[2] * e7);
        C1481q c1481q = this.f13863f;
        float e10 = (float) c1481q.f13895m.e(f7);
        C1477m c1477m2 = c1481q.f13895m;
        return y.b(e10, (float) c1477m2.e(f8), (float) c1477m2.e(f9), e6, c1481q);
    }
}
