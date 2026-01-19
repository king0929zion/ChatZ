package e1;

/* renamed from: e1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0960b {
    public static final long a(int i6, int i7, int i8, int i9) {
        if (!((i8 >= 0) & (i7 >= i6) & (i9 >= i8) & (i6 >= 0))) {
            i.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i6, i7, i8, i9);
    }

    public static /* synthetic */ long b(int i6, int i7, int i8) {
        if ((i8 & 2) != 0) {
            i6 = Integer.MAX_VALUE;
        }
        if ((i8 & 8) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        return a(0, i6, 0, i7);
    }

    public static final int c(int i6) {
        if (i6 < 8191) {
            return 13;
        }
        if (i6 < 32767) {
            return 15;
        }
        if (i6 < 65535) {
            return 16;
        }
        return i6 < 262143 ? 18 : 255;
    }

    public static final long d(long j3, long j4) {
        int i6 = (int) (j4 >> 32);
        int j5 = C0959a.j(j3);
        int h3 = C0959a.h(j3);
        if (i6 < j5) {
            i6 = j5;
        }
        if (i6 <= h3) {
            h3 = i6;
        }
        int i7 = (int) (j4 & 4294967295L);
        int i8 = C0959a.i(j3);
        int g3 = C0959a.g(j3);
        if (i7 < i8) {
            i7 = i8;
        }
        if (i7 <= g3) {
            g3 = i7;
        }
        return (h3 << 32) | (g3 & 4294967295L);
    }

    public static final long e(long j3, long j4) {
        int j5 = C0959a.j(j3);
        int h3 = C0959a.h(j3);
        int i6 = C0959a.i(j3);
        int g3 = C0959a.g(j3);
        int j6 = C0959a.j(j4);
        if (j6 < j5) {
            j6 = j5;
        }
        if (j6 > h3) {
            j6 = h3;
        }
        int h6 = C0959a.h(j4);
        if (h6 >= j5) {
            j5 = h6;
        }
        if (j5 <= h3) {
            h3 = j5;
        }
        int i7 = C0959a.i(j4);
        if (i7 < i6) {
            i7 = i6;
        }
        if (i7 > g3) {
            i7 = g3;
        }
        int g6 = C0959a.g(j4);
        if (g6 >= i6) {
            i6 = g6;
        }
        if (i6 <= g3) {
            g3 = i6;
        }
        return a(j6, h3, i7, g3);
    }

    public static final int f(long j3, int i6) {
        int i7 = C0959a.i(j3);
        int g3 = C0959a.g(j3);
        if (i6 < i7) {
            i6 = i7;
        }
        return i6 > g3 ? g3 : i6;
    }

    public static final int g(long j3, int i6) {
        int j4 = C0959a.j(j3);
        int h3 = C0959a.h(j3);
        if (i6 < j4) {
            i6 = j4;
        }
        return i6 > h3 ? h3 : i6;
    }

    public static final long h(int i6, int i7, int i8, int i9) {
        int i10 = i9 == Integer.MAX_VALUE ? i8 : i9;
        int c6 = c(i10);
        int i11 = i7 == Integer.MAX_VALUE ? i6 : i7;
        int c7 = c(i11);
        if (c6 + c7 > 31) {
            k(i11, i10);
        }
        int i12 = i7 + 1;
        int i13 = i9 + 1;
        int i14 = c7 - 13;
        return ((i12 & (~(i12 >> 31))) << 33) | ((i14 >> 1) + (i14 & 1)) | (i6 << 2) | (i8 << (c7 + 2)) | ((i13 & (~(i13 >> 31))) << (c7 + 33));
    }

    public static final long i(int i6, int i7, long j3) {
        int j4 = C0959a.j(j3) + i6;
        if (j4 < 0) {
            j4 = 0;
        }
        int h3 = C0959a.h(j3);
        if (h3 != Integer.MAX_VALUE && (h3 = h3 + i6) < 0) {
            h3 = 0;
        }
        int i8 = C0959a.i(j3) + i7;
        if (i8 < 0) {
            i8 = 0;
        }
        int g3 = C0959a.g(j3);
        return a(j4, h3, i8, (g3 == Integer.MAX_VALUE || (g3 = g3 + i7) >= 0) ? g3 : 0);
    }

    public static /* synthetic */ long j(int i6, int i7, int i8, long j3) {
        if ((i8 & 1) != 0) {
            i6 = 0;
        }
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        return i(i6, i7, j3);
    }

    public static final void k(int i6, int i7) {
        throw new IllegalArgumentException(B3.e.i(i6, "Can't represent a width of ", i7, " and height of ", " in Constraints"));
    }

    public static final Void l(int i6) {
        throw new IllegalArgumentException(B3.e.l("Can't represent a size of ", i6, " in Constraints"));
    }
}
