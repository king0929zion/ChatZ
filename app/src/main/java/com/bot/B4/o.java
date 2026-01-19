package B4;

import A4.InterfaceC0007h;
import A4.InterfaceC0008i;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import c4.EnumC0927a;
import x4.AbstractC1888A;
import z4.EnumC2050a;

/* loaded from: classes.dex */
public final class o extends i {

    /* renamed from: h, reason: collision with root package name */
    public final d4.i f614h;

    /* JADX WARN: Multi-variable type inference failed */
    public o(l4.f fVar, InterfaceC0007h interfaceC0007h, InterfaceC0910h interfaceC0910h, int i6, EnumC2050a enumC2050a) {
        super(interfaceC0007h, interfaceC0910h, i6, enumC2050a);
        this.f614h = (d4.i) fVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l4.f, d4.i] */
    @Override // B4.AbstractC0054g
    public final AbstractC0054g f(InterfaceC0910h interfaceC0910h, int i6, EnumC2050a enumC2050a) {
        return new o(this.f614h, this.f595g, interfaceC0910h, i6, enumC2050a);
    }

    @Override // B4.i
    public final Object j(InterfaceC0008i interfaceC0008i, InterfaceC0905c interfaceC0905c) {
        Object l3 = AbstractC1888A.l(new n(this, interfaceC0008i, null), interfaceC0905c);
        return l3 == EnumC0927a.f11114c ? l3 : X3.y.a;
    }
}
