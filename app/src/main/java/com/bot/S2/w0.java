package S2;

import b4.InterfaceC0905c;
import n.C1316c;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class w0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7904h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1316c f7905i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1316c f7906j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(C1316c c1316c, C1316c c1316c2, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f7905i = c1316c;
        this.f7906j = c1316c2;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        w0 w0Var = (w0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        w0Var.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        w0 w0Var = new w0(this.f7905i, this.f7906j, interfaceC0905c);
        w0Var.f7904h = obj;
        return w0Var;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f7904h;
        X3.a.e(obj);
        AbstractC1888A.y(interfaceC1942y, null, new u0(this.f7905i, null), 3);
        AbstractC1888A.y(interfaceC1942y, null, new v0(this.f7906j, null), 3);
        return X3.y.a;
    }
}
