package Z2;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class J0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10022h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A.d f10023i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(A.d dVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10023i = dVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((J0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new J0(this.f10023i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f10022h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f10022h = 1;
            Object a = this.f10023i.a(null, this);
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
