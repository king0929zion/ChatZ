package A;

import B0.C0028d;
import H0.i0;
import X3.y;
import b4.InterfaceC0905c;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class k extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f24h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f25i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0 f26j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0028d f27k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f28l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, i0 i0Var, C0028d c0028d, g gVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f25i = lVar;
        this.f26j = i0Var;
        this.f27k = c0028d;
        this.f28l = gVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((k) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        k kVar = new k(this.f25i, this.f26j, this.f27k, this.f28l, interfaceC0905c);
        kVar.f24h = obj;
        return kVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f24h;
        i0 i0Var = this.f26j;
        C0028d c0028d = this.f27k;
        l lVar = this.f25i;
        AbstractC1888A.y(interfaceC1942y, null, new i(lVar, i0Var, c0028d, null), 3);
        return AbstractC1888A.y(interfaceC1942y, null, new j(lVar, this.f28l, null), 3);
    }
}
