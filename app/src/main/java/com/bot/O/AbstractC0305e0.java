package O;

/* renamed from: O.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0305e0 {
    public static final float a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f4105b;

    /* renamed from: c, reason: collision with root package name */
    public static final P0.w f4106c = new P0.w("SelectionHandleInfo");

    static {
        float f6 = 25;
        a = f6;
        f4105b = f6;
    }

    public static final long a(long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - 1.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
