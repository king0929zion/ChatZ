package B4;

import A4.C0024z;
import A4.InterfaceC0007h;
import A4.InterfaceC0008i;
import Z2.C0789z;
import b4.C0906d;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import c4.EnumC0927a;
import m4.AbstractC1276k;
import x4.AbstractC1888A;
import z4.EnumC2050a;

/* loaded from: classes.dex */
public abstract class i implements AbstractC0054g,   {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0007h f595g;

    public i(InterfaceC0007h interfaceC0007h, InterfaceC0910h interfaceC0910h, int i6, EnumC2050a enumC2050a) {
        super(interfaceC0910h, i6, enumC2050a);
        this.f595g = interfaceC0007h;
    }

    @Override // B4.AbstractC0054g, A4.InterfaceC0007h
    public final Object b(InterfaceC0008i interfaceC0008i, InterfaceC0905c interfaceC0905c) {
        int i6 = this.f590e;
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (i6 == -3) {
            InterfaceC0910h o5 = interfaceC0905c.o();
            Boolean bool = Boolean.FALSE;
            C0789z c0789z = new C0789z(23);
            InterfaceC0910h interfaceC0910h = this.f589c;
            InterfaceC0910h Y5 = !((Boolean) interfaceC0910h.q(bool, c0789z)).booleanValue() ? o5.Y(interfaceC0910h) : AbstractC1888A.o(o5, interfaceC0910h, false);
            if (AbstractC1276k.b(Y5, o5)) {
                Object j3 = j(interfaceC0008i, interfaceC0905c);
                if (j3 == enumC0927a) {
                    return j3;
                }
            } else {
                C0906d c0906d = C0906d.f11056c;
                if (AbstractC1276k.b(Y5.r(c0906d), o5.r(c0906d))) {
                    InterfaceC0910h o6 = interfaceC0905c.o();
                    if (!(interfaceC0008i instanceof E) && !(interfaceC0008i instanceof y)) {
                        interfaceC0008i = new C0024z(interfaceC0008i, o6);
                    }
                    Object c6 = AbstractC0050c.c(Y5, interfaceC0008i, C4.a.k(Y5), new C0055h(this, null), interfaceC0905c);
                    if (c6 == enumC0927a) {
                        return c6;
                    }
                }
            }
            return X3.y.a;
        }
        Object b5 = super.b(interfaceC0008i, interfaceC0905c);
        if (b5 == enumC0927a) {
            return b5;
        }
        return X3.y.a;
    }

    @Override // B4.AbstractC0054g
    public final Object e(z4.u uVar, InterfaceC0905c interfaceC0905c) {
        Object j3 = j(new E(uVar), interfaceC0905c);
        return j3 == EnumC0927a.f11114c ? j3 : X3.y.a;
    }

    public abstract Object j(InterfaceC0008i interfaceC0008i, InterfaceC0905c interfaceC0905c);

    @Override // B4.AbstractC0054g
    public final String toString() {
        return this.f595g + " -> " + super.toString();
    }
}
