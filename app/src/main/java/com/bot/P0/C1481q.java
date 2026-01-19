package p0;

import F0.F;
import java.util.Arrays;
import m4.AbstractC1276k;
import o0.y;

/* renamed from: p0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1481q extends AbstractC1467c {

    /* renamed from: r, reason: collision with root package name */
    public static final F f13885r = new F(17);

    /* renamed from: d, reason: collision with root package name */
    public final C1483s f13886d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13887e;

    /* renamed from: f, reason: collision with root package name */
    public final float f13888f;

    /* renamed from: g, reason: collision with root package name */
    public final C1482r f13889g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f13890h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f13891i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f13892j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC1473i f13893k;

    /* renamed from: l, reason: collision with root package name */
    public final C1480p f13894l;

    /* renamed from: m, reason: collision with root package name */
    public final C1477m f13895m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC1473i f13896n;

    /* renamed from: o, reason: collision with root package name */
    public final C1480p f13897o;

    /* renamed from: p, reason: collision with root package name */
    public final C1477m f13898p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f13899q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1481q(java.lang.String r16, float[] r17, p0.C1483s r18, final p0.C1482r r19, int r20) {
        /*
            r15 = this;
            r9 = r19
            double r0 = r9.a
            r2 = -4609434218613702656(0xc008000000000000, double:-3.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r4 = 1
            goto Ld
        Lc:
            r4 = 0
        Ld:
            double r5 = r9.f13905g
            double r7 = r9.f13904f
            r10 = -4611686018427387904(0xc000000000000000, double:-2.0)
            r12 = 0
            if (r4 == 0) goto L1e
            p0.o r4 = new p0.o
            r14 = 4
            r4.<init>()
            goto L3e
        L1e:
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 != 0) goto L29
            p0.o r4 = new p0.o
            r14 = 5
            r4.<init>()
            goto L3e
        L29:
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 != 0) goto L38
            int r4 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r4 != 0) goto L38
            p0.o r4 = new p0.o
            r14 = 6
            r4.<init>()
            goto L3e
        L38:
            p0.o r4 = new p0.o
            r14 = 7
            r4.<init>()
        L3e:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L4a
            p0.o r0 = new p0.o
            r1 = 0
            r0.<init>()
        L48:
            r6 = r0
            goto L6b
        L4a:
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 != 0) goto L55
            p0.o r0 = new p0.o
            r1 = 1
            r0.<init>()
            goto L48
        L55:
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 != 0) goto L64
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 != 0) goto L64
            p0.o r0 = new p0.o
            r1 = 2
            r0.<init>()
            goto L48
        L64:
            p0.o r0 = new p0.o
            r1 = 3
            r0.<init>()
            goto L48
        L6b:
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r5 = r4
            r4 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C1481q.<init>(java.lang.String, float[], p0.s, p0.r, int):void");
    }

    @Override // p0.AbstractC1467c
    public final float a(int i6) {
        return this.f13888f;
    }

    @Override // p0.AbstractC1467c
    public final float b(int i6) {
        return this.f13887e;
    }

    @Override // p0.AbstractC1467c
    public final boolean c() {
        return this.f13899q;
    }

    @Override // p0.AbstractC1467c
    public final long d(float f6, float f7, float f8) {
        double d6 = f6;
        C1477m c1477m = this.f13898p;
        float e6 = (float) c1477m.e(d6);
        float e7 = (float) c1477m.e(f7);
        float e8 = (float) c1477m.e(f8);
        float[] fArr = this.f13891i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f9 = (fArr[6] * e8) + (fArr[3] * e7) + (fArr[0] * e6);
        float f10 = (fArr[7] * e8) + (fArr[4] * e7) + (fArr[1] * e6);
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32);
    }

    @Override // p0.AbstractC1467c
    public final float e(float f6, float f7, float f8) {
        double d6 = f6;
        C1477m c1477m = this.f13898p;
        float e6 = (float) c1477m.e(d6);
        float e7 = (float) c1477m.e(f7);
        float e8 = (float) c1477m.e(f8);
        float[] fArr = this.f13891i;
        return (fArr[8] * e8) + (fArr[5] * e7) + (fArr[2] * e6);
    }

    @Override // p0.AbstractC1467c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1481q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C1481q c1481q = (C1481q) obj;
        C1482r c1482r = c1481q.f13889g;
        if (Float.compare(c1481q.f13887e, this.f13887e) != 0 || Float.compare(c1481q.f13888f, this.f13888f) != 0 || !AbstractC1276k.b(this.f13886d, c1481q.f13886d) || !Arrays.equals(this.f13890h, c1481q.f13890h)) {
            return false;
        }
        C1482r c1482r2 = this.f13889g;
        if (c1482r2 != null) {
            return AbstractC1276k.b(c1482r2, c1482r);
        }
        if (c1482r == null) {
            return true;
        }
        if (AbstractC1276k.b(this.f13893k, c1481q.f13893k)) {
            return AbstractC1276k.b(this.f13896n, c1481q.f13896n);
        }
        return false;
    }

    @Override // p0.AbstractC1467c
    public final long f(float f6, float f7, float f8, float f9, AbstractC1467c abstractC1467c) {
        float[] fArr = this.f13892j;
        float f10 = (fArr[6] * f8) + (fArr[3] * f7) + (fArr[0] * f6);
        float f11 = (fArr[7] * f8) + (fArr[4] * f7) + (fArr[1] * f6);
        float f12 = (fArr[8] * f8) + (fArr[5] * f7) + (fArr[2] * f6);
        C1477m c1477m = this.f13895m;
        return y.b((float) c1477m.e(f10), (float) c1477m.e(f11), (float) c1477m.e(f12), f9, abstractC1467c);
    }

    @Override // p0.AbstractC1467c
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.f13890h) + ((this.f13886d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f6 = this.f13887e;
        int floatToIntBits = (hashCode + (f6 == S.l.f7374V ? 0 : Float.floatToIntBits(f6))) * 31;
        float f7 = this.f13888f;
        int floatToIntBits2 = (floatToIntBits + (f7 == S.l.f7374V ? 0 : Float.floatToIntBits(f7))) * 31;
        C1482r c1482r = this.f13889g;
        int hashCode2 = floatToIntBits2 + (c1482r != null ? c1482r.hashCode() : 0);
        if (c1482r == null) {
            return this.f13896n.hashCode() + ((this.f13893k.hashCode() + (hashCode2 * 31)) * 31);
        }
        return hashCode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01e2, code lost:
    
        if ((((r25 - r12) * r3) - ((r1 - r15) * r11)) >= S.l.f7374V) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1481q(java.lang.String r33, float[] r34, p0.C1483s r35, float[] r36, p0.InterfaceC1473i r37, p0.InterfaceC1473i r38, float r39, float r40, p0.C1482r r41, int r42) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C1481q.<init>(java.lang.String, float[], p0.s, float[], p0.i, p0.i, float, float, p0.r, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1481q(java.lang.String r18, float[] r19, p0.C1483s r20, final double r21, float r23, float r24, int r25) {
        /*
            r17 = this;
            r1 = r21
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            F0.F r3 = p0.C1481q.f13885r
            if (r0 != 0) goto Lc
            r11 = r3
            goto L13
        Lc:
            p0.n r4 = new p0.n
            r5 = 0
            r4.<init>()
            r11 = r4
        L13:
            if (r0 != 0) goto L17
        L15:
            r12 = r3
            goto L1e
        L17:
            p0.n r3 = new p0.n
            r0 = 1
            r3.<init>()
            goto L15
        L1e:
            p0.r r15 = new p0.r
            r7 = 0
            r9 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r0 = r15
            r0.<init>(r1, r3, r5, r7, r9)
            r10 = 0
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r13 = r23
            r14 = r24
            r16 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C1481q.<init>(java.lang.String, float[], p0.s, double, float, float, int):void");
    }
}
