package r;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class Y1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1551a1 f14199h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y1(C1551a1 c1551a1, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14199h = c1551a1;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        Y1 y12 = (Y1) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        y12.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new Y1(this.f14199h, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        this.f14199h.d();
        return X3.y.a;
    }
}
