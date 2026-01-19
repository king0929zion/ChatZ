package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* renamed from: r.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1614v1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14497h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1620x1 f14498i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f14499j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f14500k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1614v1(C1620x1 c1620x1, float f6, float f7, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14498i = c1620x1;
        this.f14499j = f6;
        this.f14500k = f7;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1614v1) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1614v1(this.f14498i, this.f14499j, this.f14500k, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14497h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f14497h = 1;
            Object a = AbstractC1587m1.a(this.f14498i.f14511Q, (Float.floatToRawIntBits(this.f14499j) << 32) | (Float.floatToRawIntBits(this.f14500k) & 4294967295L), this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (a == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        return X3.y.a;
    }
}
