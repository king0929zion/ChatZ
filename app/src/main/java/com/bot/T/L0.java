package T;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class L0 {
    public static final int a(int[] iArr, int i6) {
        return iArr[(i6 * 5) + 3];
    }

    public static final int b(ArrayList arrayList, int i6, int i7) {
        int e6 = e(arrayList, i6, i7);
        return e6 >= 0 ? e6 : -(e6 + 1);
    }

    public static final int c(int[] iArr, int i6) {
        int i7 = i6 * 5;
        return Integer.bitCount(iArr[i7 + 1] >> 28) + iArr[i7 + 4];
    }

    public static final void d(int[] iArr, int i6, int i7) {
        if (i7 >= 0) {
        }
        int i8 = (i6 * 5) + 1;
        iArr[i8] = i7 | (iArr[i8] & (-67108864));
    }

    public static final int e(ArrayList arrayList, int i6, int i7) {
        int size = arrayList.size() - 1;
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) >>> 1;
            int i10 = ((C0594a) arrayList.get(i9)).a;
            if (i10 < 0) {
                i10 += i7;
            }
            int g3 = AbstractC1276k.g(i10, i6);
            if (g3 < 0) {
                i8 = i9 + 1;
            } else {
                if (g3 <= 0) {
                    return i9;
                }
                size = i9 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static final void f() {
        throw new ConcurrentModificationException();
    }
}
