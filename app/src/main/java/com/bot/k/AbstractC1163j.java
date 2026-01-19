package k;

/* renamed from: k.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1163j {
    public static final float[] a;

    static {
        long[] jArr = V.a;
        int d6 = V.d(0);
        int max = d6 > 0 ? Math.max(7, V.c(d6)) : 0;
        if (max != 0) {
            jArr = new long[((max + 15) & (-8)) >> 3];
            Y3.k.p0(jArr, -9187201950435737472L);
        }
        int i6 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i6] = (jArr[i6] & (~j3)) | j3;
        float[] fArr = new float[max];
        a = new float[0];
    }
}
