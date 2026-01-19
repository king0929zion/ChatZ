package P2;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class x0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ T.X f5100h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(T.X x5, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f5100h = x5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        x0 x0Var = (x0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        x0Var.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new x0(this.f5100h, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        this.f5100h.setValue(EnumC0356h.f4933c);
        return X3.y.a;
    }
}
