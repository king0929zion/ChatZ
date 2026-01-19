package Z2;

import b4.InterfaceC0905c;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* renamed from: Z2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0744c extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a3.w f10167h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0744c(a3.w wVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10167h = wVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0744c c0744c = (C0744c) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        c0744c.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0744c(this.f10167h, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        a3.w wVar = this.f10167h;
        wVar.getClass();
        AbstractC1888A.y(androidx.lifecycle.O.i(wVar), null, new a3.q(wVar, null), 3);
        return X3.y.a;
    }
}
