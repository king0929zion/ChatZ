package S2;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class C0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ T.X f7687h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f7688i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(T.X x5, InterfaceC0905c interfaceC0905c, String str) {
        super(2, interfaceC0905c);
        this.f7687h = x5;
        this.f7688i = str;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0 c02 = (C0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        c02.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0(this.f7687h, interfaceC0905c, this.f7688i);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        this.f7687h.setValue(this.f7688i);
        return X3.y.a;
    }
}
