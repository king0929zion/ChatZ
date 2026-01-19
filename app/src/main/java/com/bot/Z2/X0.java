package Z2;

import I0.C0207s0;
import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class X0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m0.w f10122h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ I0.S0 f10123i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(m0.w wVar, I0.S0 s02, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10122h = wVar;
        this.f10123i = s02;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        X0 x02 = (X0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        x02.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new X0(this.f10122h, this.f10123i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        m0.w.a(this.f10122h);
        I0.S0 s02 = this.f10123i;
        if (s02 != null) {
            ((C0207s0) s02).b();
        }
        return X3.y.a;
    }
}
