package B4;

import A4.InterfaceC0007h;
import A4.InterfaceC0008i;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import c4.EnumC0927a;
import z4.EnumC2050a;

/* loaded from: classes.dex */
public final class j extends i {
    @Override // B4.AbstractC0054g
    public final AbstractC0054g f(InterfaceC0910h interfaceC0910h, int i6, EnumC2050a enumC2050a) {
        return new i(this.f595g, interfaceC0910h, i6, enumC2050a);
    }

    @Override // B4.AbstractC0054g
    public final InterfaceC0007h g() {
        return this.f595g;
    }

    @Override // B4.i
    public final Object j(InterfaceC0008i interfaceC0008i, InterfaceC0905c interfaceC0905c) {
        Object b5 = this.f595g.b(interfaceC0008i, interfaceC0905c);
        return b5 == EnumC0927a.f11114c ? b5 : X3.y.a;
    }
}
