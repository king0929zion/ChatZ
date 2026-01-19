package p0;

/* renamed from: p0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1471g {
    public final AbstractC1467c a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1467c f13865b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1467c f13866c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f13867d;

    public C1471g(AbstractC1467c abstractC1467c, AbstractC1467c abstractC1467c2, AbstractC1467c abstractC1467c3, float[] fArr) {
        this.a = abstractC1467c;
        this.f13865b = abstractC1467c2;
        this.f13866c = abstractC1467c3;
        this.f13867d = fArr;
    }

    public long a(long j3) {
        float i6 = o0.s.i(j3);
        float h3 = o0.s.h(j3);
        float f6 = o0.s.f(j3);
        float e6 = o0.s.e(j3);
        AbstractC1467c abstractC1467c = this.f13865b;
        long d6 = abstractC1467c.d(i6, h3, f6);
        float intBitsToFloat = Float.intBitsToFloat((int) (d6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d6 & 4294967295L));
        float e7 = abstractC1467c.e(i6, h3, f6);
        float[] fArr = this.f13867d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e7 *= fArr[2];
        }
        float f7 = intBitsToFloat;
        float f8 = intBitsToFloat2;
        return this.f13866c.f(f7, f8, e7, e6, this.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1471g(p0.AbstractC1467c r9, p0.AbstractC1467c r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.f13836b
            long r2 = p0.AbstractC1466b.a
            boolean r0 = p0.AbstractC1466b.a(r0, r2)
            if (r0 == 0) goto Lf
            p0.c r0 = p0.AbstractC1474j.a(r9)
            goto L10
        Lf:
            r0 = r9
        L10:
            long r4 = r10.f13836b
            boolean r1 = p0.AbstractC1466b.a(r4, r2)
            if (r1 == 0) goto L1d
            p0.c r1 = p0.AbstractC1474j.a(r10)
            goto L1e
        L1d:
            r1 = r10
        L1e:
            r4 = 3
            if (r11 != r4) goto L69
            long r5 = r9.f13836b
            boolean r11 = p0.AbstractC1466b.a(r5, r2)
            long r5 = r10.f13836b
            boolean r2 = p0.AbstractC1466b.a(r5, r2)
            if (r11 == 0) goto L32
            if (r2 == 0) goto L32
            goto L69
        L32:
            if (r11 != 0) goto L36
            if (r2 == 0) goto L69
        L36:
            if (r11 == 0) goto L39
            goto L3a
        L39:
            r9 = r10
        L3a:
            p0.q r9 = (p0.C1481q) r9
            p0.s r9 = r9.f13886d
            float[] r3 = p0.AbstractC1474j.f13871e
            if (r11 == 0) goto L47
            float[] r11 = r9.a()
            goto L48
        L47:
            r11 = r3
        L48:
            if (r2 == 0) goto L4e
            float[] r3 = r9.a()
        L4e:
            r9 = 0
            r2 = r11[r9]
            r5 = r3[r9]
            float r2 = r2 / r5
            r5 = 1
            r6 = r11[r5]
            r7 = r3[r5]
            float r6 = r6 / r7
            r7 = 2
            r11 = r11[r7]
            r3 = r3[r7]
            float r11 = r11 / r3
            float[] r3 = new float[r4]
            r3[r9] = r2
            r3[r5] = r6
            r3[r7] = r11
            goto L6a
        L69:
            r3 = 0
        L6a:
            r8.<init>(r10, r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C1471g.<init>(p0.c, p0.c, int):void");
    }
}
