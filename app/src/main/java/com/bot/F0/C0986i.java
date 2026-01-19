package f0;

import m4.AbstractC1276k;

/* renamed from: f0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0986i {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f11685b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f11686c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f11687d;

    /* renamed from: e, reason: collision with root package name */
    public int f11688e;

    public final int a(long j3) {
        int i6 = this.a + 1;
        long[] jArr = this.f11685b;
        int length = jArr.length;
        if (i6 > length) {
            int i7 = length * 2;
            long[] jArr2 = new long[i7];
            int[] iArr = new int[i7];
            Y3.k.i0(jArr, jArr2, 0, 0, jArr.length);
            Y3.k.k0(this.f11686c, iArr, 0, 0, 14);
            this.f11685b = jArr2;
            this.f11686c = iArr;
        }
        int i8 = this.a;
        this.a = i8 + 1;
        int length2 = this.f11687d.length;
        if (this.f11688e >= length2) {
            int i9 = length2 * 2;
            int[] iArr2 = new int[i9];
            int i10 = 0;
            while (i10 < i9) {
                int i11 = i10 + 1;
                iArr2[i10] = i11;
                i10 = i11;
            }
            Y3.k.k0(this.f11687d, iArr2, 0, 0, 14);
            this.f11687d = iArr2;
        }
        int i12 = this.f11688e;
        int[] iArr3 = this.f11687d;
        this.f11688e = iArr3[i12];
        long[] jArr3 = this.f11685b;
        jArr3[i8] = j3;
        this.f11686c[i8] = i12;
        iArr3[i12] = i8;
        while (i8 > 0) {
            int i13 = ((i8 + 1) >> 1) - 1;
            if (AbstractC1276k.h(jArr3[i13], j3) <= 0) {
                break;
            }
            b(i13, i8);
            i8 = i13;
        }
        return i12;
    }

    public final void b(int i6, int i7) {
        long[] jArr = this.f11685b;
        int[] iArr = this.f11686c;
        int[] iArr2 = this.f11687d;
        long j3 = jArr[i6];
        jArr[i6] = jArr[i7];
        jArr[i7] = j3;
        int i8 = iArr[i6];
        int i9 = iArr[i7];
        iArr[i6] = i9;
        iArr[i7] = i8;
        iArr2[i9] = i6;
        iArr2[i8] = i7;
    }
}
