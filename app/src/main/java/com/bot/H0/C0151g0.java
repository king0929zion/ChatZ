package H0;

/* renamed from: H0.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0151g0 {
    public final /* synthetic */ int a;

    public static final int a(long j3, int i6) {
        int i7 = D0.f1691b;
        return ((int) (j3 >> (i6 * 15))) & 32767;
    }

    public static long c(int i6, int i7, int i8, int i9) {
        return ((i7 & 32767) << 15) | (i6 & 32767) | ((i8 & 32767) << 30) | ((i9 & 32767) << 45) | Long.MIN_VALUE;
    }

    public int b() {
        switch (this.a) {
            case 0:
                return 16;
            default:
                return 8;
        }
    }
}
