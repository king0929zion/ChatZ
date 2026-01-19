package O;

import n.C1327h0;
import n.C1340o;
import n0.C1353b;

/* renamed from: O.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0317k0 {
    public static final C1340o a = new C1340o(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    public static final n.E0 f4142b = new n.E0(new I2.x(23), new I2.x(24));

    /* renamed from: c, reason: collision with root package name */
    public static final long f4143c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1327h0 f4144d;

    static {
        long floatToRawIntBits = (Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L);
        f4143c = floatToRawIntBits;
        f4144d = new C1327h0(new C1353b(floatToRawIntBits));
    }
}
