package D;

import b4.InterfaceC0905c;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class C0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f739h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B0.D f740i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ H0 f741j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(B0.D d6, H0 h02, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f740i = d6;
        this.f741j = h02;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C0 c02 = new C0(this.f740i, this.f741j, interfaceC0905c);
        c02.f739h = obj;
        return c02;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f739h;
        B0.D d6 = this.f740i;
        H0 h02 = this.f741j;
        AbstractC1888A.y(interfaceC1942y, null, new A0(d6, h02, null), 1);
        return AbstractC1888A.y(interfaceC1942y, null, new B0(d6, h02, null), 1);
    }
}
