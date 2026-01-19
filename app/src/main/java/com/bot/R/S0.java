package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;
import z4.C2057h;

/* loaded from: classes.dex */
public final class S0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14145h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ M1.b f14146i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(M1.b bVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14146i = bVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((S0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new S0(this.f14146i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14145h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return obj;
        }
        X3.a.e(obj);
        C2057h c2057h = (C2057h) this.f14146i.f3237f;
        this.f14145h = 1;
        Object l3 = AbstractC1888A.l(new C1538O0(c2057h, null), this);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        return l3 == enumC0927a ? enumC0927a : l3;
    }
}
