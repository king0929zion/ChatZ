package D;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import r.AbstractC1573i;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class A0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f729h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B0.D f730i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ H0 f731j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(B0.D d6, H0 h02, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f730i = d6;
        this.f731j = h02;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((A0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new A0(this.f730i, this.f731j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f729h;
        X3.y yVar = X3.y.a;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return yVar;
        }
        X3.a.e(obj);
        this.f729h = 1;
        Object h3 = AbstractC1573i.h(this.f730i, new D0(this.f731j, null), this);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (h3 != enumC0927a) {
            h3 = yVar;
        }
        return h3 == enumC0927a ? enumC0927a : yVar;
    }
}
