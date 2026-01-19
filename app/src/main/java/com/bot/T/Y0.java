package T;

import A4.InterfaceC0007h;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class Y0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f8051h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0007h f8052i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0621n0 f8053j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(InterfaceC0007h interfaceC0007h, C0621n0 c0621n0, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f8052i = interfaceC0007h;
        this.f8053j = c0621n0;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((Y0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new Y0(this.f8052i, this.f8053j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f8051h;
        if (i6 == 0) {
            X3.a.e(obj);
            D1.a aVar = new D1.a(this.f8053j, 3);
            this.f8051h = 1;
            Object b5 = this.f8052i.b(aVar, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (b5 == enumC0927a) {
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
