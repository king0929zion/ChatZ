package S2;

import b4.InterfaceC0905c;
import n.C1316c;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class A0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7678h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1316c f7679i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1316c f7680j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(C1316c c1316c, C1316c c1316c2, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f7679i = c1316c;
        this.f7680j = c1316c2;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        A0 a02 = (A0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        a02.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        A0 a02 = new A0(this.f7679i, this.f7680j, interfaceC0905c);
        a02.f7678h = obj;
        return a02;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f7678h;
        X3.a.e(obj);
        AbstractC1888A.y(interfaceC1942y, null, new y0(this.f7679i, null), 3);
        AbstractC1888A.y(interfaceC1942y, null, new z0(this.f7680j, null), 3);
        return X3.y.a;
    }
}
