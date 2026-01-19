package H0;

import java.util.Arrays;
import m4.AbstractC1276k;

/* renamed from: H0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166v {
    public int[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f2001b;

    public C0166v() {
        this.a = new int[10];
    }

    public int a(int i6) {
        int i7 = this.f2001b - 1;
        return i7 >= 0 ? this.a[i7] : i6;
    }

    public int b() {
        int[] iArr = this.a;
        int i6 = this.f2001b - 1;
        this.f2001b = i6;
        return iArr[i6];
    }

    public void c(int i6) {
        int[] iArr = this.a;
        if (this.f2001b >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC1276k.e(iArr, "copyOf(...)");
            this.a = iArr;
        }
        int i7 = this.f2001b;
        this.f2001b = i7 + 1;
        iArr[i7] = i6;
    }

    public void d(int i6, int i7, int i8) {
        int i9 = this.f2001b;
        int[] iArr = this.a;
        int i10 = i9 + 3;
        if (i10 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC1276k.e(iArr, "copyOf(...)");
            this.a = iArr;
        }
        iArr[i9] = i6 + i8;
        iArr[i9 + 1] = i7 + i8;
        iArr[i9 + 2] = i8;
        this.f2001b = i10;
    }

    public void e(int i6, int i7, int i8, int i9) {
        int i10 = this.f2001b;
        int[] iArr = this.a;
        int i11 = i10 + 4;
        if (i11 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC1276k.e(iArr, "copyOf(...)");
            this.a = iArr;
        }
        iArr[i10] = i6;
        iArr[i10 + 1] = i7;
        iArr[i10 + 2] = i8;
        iArr[i10 + 3] = i9;
        this.f2001b = i11;
    }

    public void f(int i6, int i7) {
        if (i6 < i7) {
            int i8 = i6 - 3;
            for (int i9 = i6; i9 < i7; i9 += 3) {
                int[] iArr = this.a;
                int i10 = iArr[i9];
                int i11 = iArr[i7];
                if (i10 < i11 || (i10 == i11 && iArr[i9 + 1] <= iArr[i7 + 1])) {
                    i8 += 3;
                    g(i8, i9);
                }
            }
            g(i8 + 3, i7);
            f(i6, i8);
            f(i8 + 6, i7);
        }
    }

    public void g(int i6, int i7) {
        int[] iArr = this.a;
        int i8 = iArr[i6];
        iArr[i6] = iArr[i7];
        iArr[i7] = i8;
        int i9 = i6 + 1;
        int i10 = i7 + 1;
        int i11 = iArr[i9];
        iArr[i9] = iArr[i10];
        iArr[i10] = i11;
        int i12 = i6 + 2;
        int i13 = i7 + 2;
        int i14 = iArr[i12];
        iArr[i12] = iArr[i13];
        iArr[i13] = i14;
    }

    public C0166v(int i6) {
        this.a = new int[i6];
    }
}
