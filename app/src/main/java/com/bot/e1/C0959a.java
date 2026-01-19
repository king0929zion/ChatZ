package e1;

import com.vladsch.flexmark.util.format.TableCell;

/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0959a {
    public final long a;

    public /* synthetic */ C0959a(long j3) {
        this.a = j3;
    }

    public static long a(long j3, int i6, int i7, int i8, int i9, int i10) {
        if ((i10 & 1) != 0) {
            i6 = j(j3);
        }
        if ((i10 & 2) != 0) {
            i7 = h(j3);
        }
        if ((i10 & 4) != 0) {
            i8 = i(j3);
        }
        if ((i10 & 8) != 0) {
            i9 = g(j3);
        }
        if (i7 < i6 || i9 < i8 || i6 < 0 || i8 < 0) {
            i.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return AbstractC0960b.h(i6, i7, i8, i9);
    }

    public static final boolean b(long j3, long j4) {
        return j3 == j4;
    }

    public static final boolean c(long j3) {
        int i6 = (int) (3 & j3);
        int i7 = (((i6 & 2) >> 1) * 3) + ((i6 & 1) << 1);
        return (((int) (j3 >> (i7 + 46))) & ((1 << (18 - i7)) - 1)) != 0;
    }

    public static final boolean d(long j3) {
        int i6 = (int) (3 & j3);
        return (((int) (j3 >> 33)) & ((1 << (((((i6 & 2) >> 1) * 3) + ((i6 & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean e(long j3) {
        int i6 = (int) (3 & j3);
        int i7 = (((i6 & 2) >> 1) * 3) + ((i6 & 1) << 1);
        int i8 = (1 << (18 - i7)) - 1;
        int i9 = ((int) (j3 >> (i7 + 15))) & i8;
        int i10 = ((int) (j3 >> (i7 + 46))) & i8;
        return i9 == (i10 == 0 ? TableCell.NOT_TRACKED : i10 - 1);
    }

    public static final boolean f(long j3) {
        int i6 = (int) (3 & j3);
        int i7 = (1 << (((((i6 & 2) >> 1) * 3) + ((i6 & 1) << 1)) + 13)) - 1;
        int i8 = ((int) (j3 >> 2)) & i7;
        int i9 = ((int) (j3 >> 33)) & i7;
        return i8 == (i9 == 0 ? TableCell.NOT_TRACKED : i9 - 1);
    }

    public static final int g(long j3) {
        int i6 = (int) (3 & j3);
        int i7 = (((i6 & 2) >> 1) * 3) + ((i6 & 1) << 1);
        int i8 = ((int) (j3 >> (i7 + 46))) & ((1 << (18 - i7)) - 1);
        return i8 == 0 ? TableCell.NOT_TRACKED : i8 - 1;
    }

    public static final int h(long j3) {
        int i6 = (int) (3 & j3);
        int i7 = ((int) (j3 >> 33)) & ((1 << (((((i6 & 2) >> 1) * 3) + ((i6 & 1) << 1)) + 13)) - 1);
        return i7 == 0 ? TableCell.NOT_TRACKED : i7 - 1;
    }

    public static final int i(long j3) {
        int i6 = (int) (3 & j3);
        int i7 = (((i6 & 2) >> 1) * 3) + ((i6 & 1) << 1);
        return ((int) (j3 >> (i7 + 15))) & ((1 << (18 - i7)) - 1);
    }

    public static final int j(long j3) {
        int i6 = (int) (3 & j3);
        return ((int) (j3 >> 2)) & ((1 << (((((i6 & 2) >> 1) * 3) + ((i6 & 1) << 1)) + 13)) - 1);
    }

    public static String k(long j3) {
        int h3 = h(j3);
        String valueOf = h3 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(h3);
        int g3 = g(j3);
        String valueOf2 = g3 != Integer.MAX_VALUE ? String.valueOf(g3) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(j(j3));
        sb.append(", maxWidth = ");
        sb.append(valueOf);
        sb.append(", minHeight = ");
        sb.append(i(j3));
        sb.append(", maxHeight = ");
        return B3.e.r(sb, valueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0959a) {
            return this.a == ((C0959a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return k(this.a);
    }
}
