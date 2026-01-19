package T1;

import P1.o;
import X3.y;
import b4.InterfaceC0905c;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class c extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f8340h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l4.c f8341i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC0905c interfaceC0905c, l4.c cVar) {
        super(2, interfaceC0905c);
        this.f8341i = cVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((c) p((InterfaceC0905c) obj2, (o) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        c cVar = new c(interfaceC0905c, this.f8341i);
        cVar.f8340h = obj;
        return cVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        o oVar = (o) this.f8340h;
        AbstractC1276k.d(oVar, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
        return this.f8341i.f(oVar.c());
    }
}
