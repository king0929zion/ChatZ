package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class W0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14175h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E1 f14176i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l4.e f14177j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(E1 e12, l4.e eVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14176i = e12;
        this.f14177j = eVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((W0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new W0(this.f14176i, this.f14177j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14175h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f14175h = 1;
            Object f6 = this.f14176i.f(p.x0.f13824e, this.f14177j, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (f6 == enumC0927a) {
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
