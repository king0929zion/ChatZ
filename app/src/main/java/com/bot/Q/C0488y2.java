package Q;

import b4.InterfaceC0905c;
import n0.C1353b;

/* renamed from: Q.y2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0488y2 extends d4.i implements l4.f {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ long f6264h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C2 f6265i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0488y2(C2 c22, InterfaceC0905c interfaceC0905c) {
        super(3, interfaceC0905c);
        this.f6265i = c22;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        long j3 = ((C1353b) obj2).a;
        C0488y2 c0488y2 = new C0488y2(this.f6265i, (InterfaceC0905c) obj3);
        c0488y2.f6264h = j3;
        X3.y yVar = X3.y.a;
        c0488y2.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        long j3 = this.f6264h;
        C2 c22 = this.f6265i;
        c22.f5195t.h((c22.f5191p == r.X0.f14183c ? Float.intBitsToFloat((int) (j3 & 4294967295L)) : c22.f5188m ? c22.f5186k.g() - Float.intBitsToFloat((int) (j3 >> 32)) : Float.intBitsToFloat((int) (j3 >> 32))) - c22.f5194s.g());
        return X3.y.a;
    }
}
