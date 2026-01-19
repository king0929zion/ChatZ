package k;

/* loaded from: classes.dex */
public abstract class V {
    public static final long[] a = {-9187201950435737345L, -1};

    static {
        new M(0);
    }

    public static final int a(int i6) {
        if (i6 == 7) {
            return 6;
        }
        return i6 - (i6 / 8);
    }

    public static final int b(int i6) {
        if (i6 == 0) {
            return 6;
        }
        return (i6 * 2) + 1;
    }

    public static final int c(int i6) {
        if (i6 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i6);
        }
        return 0;
    }

    public static final int d(int i6) {
        if (i6 == 7) {
            return 8;
        }
        return ((i6 - 1) / 7) + i6;
    }
}
