package Q;

import S.AbstractC0537d;
import q0.InterfaceC1498d;

/* loaded from: classes.dex */
public abstract class G1 {
    public static final float a = AbstractC0537d.f7255c;

    /* renamed from: b, reason: collision with root package name */
    public static final int f5258b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5259c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final float f5260d = S.m.f7401b;

    /* renamed from: e, reason: collision with root package name */
    public static final float f5261e = S.m.f7402c;

    /* renamed from: f, reason: collision with root package name */
    public static final float f5262f = AbstractC0537d.f7254b;

    public static final void a(InterfaceC1498d interfaceC1498d, int i6, long j3, float f6, float f7) {
        if (i6 == 1) {
            float f8 = f6 / 2.0f;
            float intBitsToFloat = (Float.intBitsToFloat((int) (interfaceC1498d.c() >> 32)) - f8) - f7;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC1498d.c() & 4294967295L)) / 2.0f;
            InterfaceC1498d.c0(interfaceC1498d, j3, f8, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2)), null, 120);
            return;
        }
        float intBitsToFloat3 = (Float.intBitsToFloat((int) (interfaceC1498d.c() >> 32)) - f6) - f7;
        float intBitsToFloat4 = (Float.intBitsToFloat((int) (interfaceC1498d.c() & 4294967295L)) - f6) / 2.0f;
        InterfaceC1498d.n0(interfaceC1498d, j3, (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L), (Float.floatToRawIntBits(f6) << 32) | (4294967295L & Float.floatToRawIntBits(f6)), S.l.f7374V, 120);
    }
}
