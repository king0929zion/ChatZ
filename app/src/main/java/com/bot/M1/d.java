package M1;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    public static /* synthetic */ int a(int i6) {
        if (i6 != 0) {
            return i6 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] b(int i6) {
        int[] iArr = new int[i6];
        System.arraycopy(a, 0, iArr, 0, i6);
        return iArr;
    }
}
