package Q;

import m4.AbstractC1276k;
import q0.InterfaceC1498d;

/* renamed from: Q.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0395b0 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5666c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f5667e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f5668f;

    public /* synthetic */ C0395b0(float f6, int i6, long j3) {
        this.f5666c = i6;
        this.f5667e = f6;
        this.f5668f = j3;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f5666c) {
            case 0:
                InterfaceC1498d interfaceC1498d = (InterfaceC1498d) obj;
                float f6 = this.f5667e;
                float e02 = interfaceC1498d.e0(f6);
                float f7 = 2;
                float e03 = interfaceC1498d.e0(f6) / f7;
                float intBitsToFloat = Float.intBitsToFloat((int) (interfaceC1498d.c() >> 32));
                float e04 = interfaceC1498d.e0(f6) / f7;
                interfaceC1498d.G(this.f5668f, (Float.floatToRawIntBits(S.l.f7374V) << 32) | (Float.floatToRawIntBits(e03) & 4294967295L), (Float.floatToRawIntBits(e04) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), e02, (r19 & 16) != 0 ? 0 : 0);
                break;
            default:
                InterfaceC1498d interfaceC1498d2 = (InterfaceC1498d) obj;
                AbstractC1276k.f(interfaceC1498d2, "$this$drawBehind");
                float e05 = interfaceC1498d2.e0(this.f5667e);
                float intBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC1498d2.c() & 4294967295L)) - (e05 / 2.0f);
                interfaceC1498d2.G(this.f5668f, (Float.floatToRawIntBits(S.l.f7374V) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC1498d2.c() >> 32))) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2)), e05, (r19 & 16) != 0 ? 0 : 0);
                break;
        }
        return X3.y.a;
    }
}
