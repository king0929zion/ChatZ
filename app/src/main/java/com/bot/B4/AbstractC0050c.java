package B4;

import A4.InterfaceC0007h;
import A4.InterfaceC0008i;
import b4.C0911i;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import c4.EnumC0927a;
import m4.AbstractC1276k;
import m4.AbstractC1291z;
import z4.EnumC2050a;

/* renamed from: B4.c */
/* loaded from: classes.dex */
public abstract class AbstractC0050c {
    public static final InterfaceC0905c[] a = new InterfaceC0905c[0];

    /* renamed from: b */
    public static final C4.u f579b = new C4.u("NULL", 0);

    /* renamed from: c */
    public static final C4.u f580c = new C4.u("UNINITIALIZED", 0);

    /* renamed from: d */
    public static final C4.u f581d = new C4.u("DONE", 0);

    public static final Object a(InterfaceC0008i interfaceC0008i, InterfaceC0905c interfaceC0905c, l4.f fVar, InterfaceC0007h[] interfaceC0007hArr) {
        s sVar = new s(interfaceC0008i, null, fVar, interfaceC0007hArr);
        u uVar = new u(interfaceC0905c.o(), interfaceC0905c, 0);
        Object T5 = Y3.C.T(uVar, uVar, sVar);
        return T5 == EnumC0927a.f11114c ? T5 : X3.y.a;
    }

    public static /* synthetic */ InterfaceC0007h b(w wVar, InterfaceC0910h interfaceC0910h, int i6, EnumC2050a enumC2050a, int i7) {
        if ((i7 & 1) != 0) {
            interfaceC0910h = C0911i.f11057c;
        }
        if ((i7 & 2) != 0) {
            i6 = -3;
        }
        if ((i7 & 4) != 0) {
            enumC2050a = EnumC2050a.f16327c;
        }
        return wVar.c(interfaceC0910h, i6, enumC2050a);
    }

    public static final Object c(InterfaceC0910h interfaceC0910h, Object obj, Object obj2, l4.e eVar, InterfaceC0905c interfaceC0905c) {
        Object m3;
        Object l3 = C4.a.l(interfaceC0910h, obj2);
        try {
            F f6 = new F(interfaceC0905c, interfaceC0910h);
            if (eVar == null) {
                m3 = Y4.d.Y(eVar, obj, f6);
            } else {
                AbstractC1291z.b(2, eVar);
                m3 = eVar.m(obj, f6);
            }
            C4.a.g(interfaceC0910h, l3);
            if (m3 == EnumC0927a.f11114c) {
                AbstractC1276k.f(interfaceC0905c, "frame");
            }
            return m3;
        } catch (Throwable th) {
            C4.a.g(interfaceC0910h, l3);
            throw th;
        }
    }
}
