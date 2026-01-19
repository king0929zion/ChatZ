package P2;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n.AbstractC1350y;
import n.C1302K;
import n.C1303L;
import n.C1316c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class N extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f4766h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1316c f4767i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(C1316c c1316c, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4767i = c1316c;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((N) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new N(this.f4767i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f4766h;
        if (i6 == 0) {
            X3.a.e(obj);
            Float f6 = new Float(1.0f);
            C1302K c1302k = new C1302K();
            c1302k.a = 360;
            c1302k.a(Float.valueOf(1.12f), 140).f13008b = AbstractC1350y.a;
            c1302k.a(Float.valueOf(0.97f), 260);
            c1302k.a(Float.valueOf(1.0f), 360);
            C1303L c1303l = new C1303L(c1302k);
            this.f4766h = 1;
            Object c6 = C1316c.c(this.f4767i, f6, c1303l, null, this, 12);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (c6 == enumC0927a) {
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
