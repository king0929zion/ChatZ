package n;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class Z extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f13067h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1321e0 f13068i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(C1321e0 c1321e0, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13068i = c1321e0;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((Z) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new Z(this.f13068i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f13067h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f13067h = 1;
            Object u5 = C1321e0.u(this.f13068i, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (u5 == enumC0927a) {
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
