package v;

import Z2.C0789z;

/* renamed from: v.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1799h {
    public static final C1810p a = new C1810p(5);

    /* renamed from: b, reason: collision with root package name */
    public static final C1810p f15304b = new C1810p(4);

    /* renamed from: c, reason: collision with root package name */
    public static final C1789c f15305c = new C1789c();

    /* renamed from: d, reason: collision with root package name */
    public static final C1791d f15306d = new C1791d(0);

    /* renamed from: e, reason: collision with root package name */
    public static final C1791d f15307e;

    static {
        new C1791d(3);
        f15307e = new C1791d(2);
        new C1791d(1);
    }

    public static void a(int i6, int[] iArr, int[] iArr2, boolean z5) {
        int i7 = 0;
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += i9;
        }
        float f6 = (i6 - i8) / 2;
        if (!z5) {
            int length = iArr.length;
            int i10 = 0;
            while (i7 < length) {
                int i11 = iArr[i7];
                iArr2[i10] = Math.round(f6);
                f6 += i11;
                i7++;
                i10++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i12 = iArr[length2];
            iArr2[length2] = Math.round(f6);
            f6 += i12;
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z5) {
        int i6 = 0;
        if (!z5) {
            int length = iArr.length;
            int i7 = 0;
            int i8 = 0;
            while (i6 < length) {
                int i9 = iArr[i6];
                iArr2[i7] = i8;
                i8 += i9;
                i6++;
                i7++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i10 = iArr[length2];
            iArr2[length2] = i6;
            i6 += i10;
        }
    }

    public static void c(int i6, int[] iArr, int[] iArr2, boolean z5) {
        int i7 = 0;
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += i9;
        }
        int i10 = i6 - i8;
        if (!z5) {
            int length = iArr.length;
            int i11 = 0;
            while (i7 < length) {
                int i12 = iArr[i7];
                iArr2[i11] = i10;
                i10 += i12;
                i7++;
                i11++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i13 = iArr[length2];
            iArr2[length2] = i10;
            i10 += i13;
        }
    }

    public static void d(int i6, int[] iArr, int[] iArr2, boolean z5) {
        int i7 = 0;
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += i9;
        }
        float length = iArr.length == 0 ? S.l.f7374V : (i6 - i8) / iArr.length;
        float f6 = length / 2;
        if (!z5) {
            int length2 = iArr.length;
            int i10 = 0;
            while (i7 < length2) {
                int i11 = iArr[i7];
                iArr2[i10] = Math.round(f6);
                f6 += i11 + length;
                i7++;
                i10++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i12 = iArr[length3];
            iArr2[length3] = Math.round(f6);
            f6 += i12 + length;
        }
    }

    public static void e(int i6, int[] iArr, int[] iArr2, boolean z5) {
        if (iArr.length == 0) {
            return;
        }
        int i7 = 0;
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += i9;
        }
        float max = (i6 - i8) / Math.max(iArr.length - 1, 1);
        float f6 = (z5 && iArr.length == 1) ? max : S.l.f7374V;
        if (z5) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i10 = iArr[length];
                iArr2[length] = Math.round(f6);
                f6 += i10 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i11 = 0;
        while (i7 < length2) {
            int i12 = iArr[i7];
            iArr2[i11] = Math.round(f6);
            f6 += i12 + max;
            i7++;
            i11++;
        }
    }

    public static void f(int i6, int[] iArr, int[] iArr2, boolean z5) {
        int i7 = 0;
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += i9;
        }
        float length = (i6 - i8) / (iArr.length + 1);
        if (z5) {
            float f6 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i10 = iArr[length2];
                iArr2[length2] = Math.round(f6);
                f6 += i10 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f7 = length;
        int i11 = 0;
        while (i7 < length3) {
            int i12 = iArr[i7];
            iArr2[i11] = Math.round(f7);
            f7 += i12 + length;
            i7++;
            i11++;
        }
    }

    public static C1795f g(float f6) {
        return new C1795f(f6, true, new C0789z(19));
    }
}
