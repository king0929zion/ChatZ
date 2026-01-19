package l;

import java.util.NoSuchElementException;
import m4.AbstractC1276k;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1180a {
    public static final int[] a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f12634b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f12635c = new Object[0];

    public static final int a(int[] iArr, int i6, int i7) {
        AbstractC1276k.f(iArr, "array");
        int i8 = i6 - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            int i11 = iArr[i10];
            if (i11 < i7) {
                i9 = i10 + 1;
            } else {
                if (i11 <= i7) {
                    return i10;
                }
                i8 = i10 - 1;
            }
        }
        return ~i9;
    }

    public static final int b(long[] jArr, int i6, long j3) {
        AbstractC1276k.f(jArr, "array");
        int i7 = i6 - 1;
        int i8 = 0;
        while (i8 <= i7) {
            int i9 = (i8 + i7) >>> 1;
            long j4 = jArr[i9];
            if (j4 < j3) {
                i8 = i9 + 1;
            } else {
                if (j4 <= j3) {
                    return i9;
                }
                i7 = i9 - 1;
            }
        }
        return ~i8;
    }

    public static final void c(String str) {
        AbstractC1276k.f(str, "message");
        throw new IllegalArgumentException(str);
    }

    public static final void d(String str) {
        AbstractC1276k.f(str, "message");
        throw new IndexOutOfBoundsException(str);
    }

    public static final void e(String str) {
        AbstractC1276k.f(str, "message");
        throw new NoSuchElementException(str);
    }
}
