package Z2;

import b4.InterfaceC0905c;
import l4.InterfaceC1193a;

/* renamed from: Z2.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0753g0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f10212h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0753g0(InterfaceC1193a interfaceC1193a, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10212h = interfaceC1193a;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0753g0 c0753g0 = (C0753g0) p((InterfaceC0905c) obj2, (X3.y) obj);
        X3.y yVar = X3.y.a;
        c0753g0.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0753g0(this.f10212h, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        this.f10212h.b();
        return X3.y.a;
    }
}
