package D;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class K0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f806h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ M.m f807i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(M.m mVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f807i = mVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((K0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new K0(this.f807i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f806h;
        X3.y yVar = X3.y.a;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return yVar;
        }
        X3.a.e(obj);
        this.f806h = 1;
        M.m mVar = this.f807i;
        mVar.getClass();
        Object l3 = AbstractC1888A.l(new M.l(mVar, null), this);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (l3 != enumC0927a) {
            l3 = yVar;
        }
        return l3 == enumC0927a ? enumC0927a : yVar;
    }
}
