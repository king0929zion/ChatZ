package Z2;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import r.AbstractC1573i;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class Y0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10127h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Z0 f10128i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f10129j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(Z0 z02, float f6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10128i = z02;
        this.f10129j = f6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((Y0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new Y0(this.f10128i, this.f10129j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f10127h;
        if (i6 == 0) {
            X3.a.e(obj);
            x.s sVar = this.f10128i.a;
            this.f10127h = 1;
            Object m3 = AbstractC1573i.m(sVar, this.f10129j, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (m3 == enumC0927a) {
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
