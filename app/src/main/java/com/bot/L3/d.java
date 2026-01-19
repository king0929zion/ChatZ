package L3;

import b4.InterfaceC0905c;
import io.ktor.utils.io.t;
import io.ktor.utils.io.y;

/* loaded from: classes.dex */
public final class d extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3108h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y f3109i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(y yVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3109i = yVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((d) p((InterfaceC0905c) obj2, obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        d dVar = new d(this.f3109i, interfaceC0905c);
        dVar.f3108h = obj;
        return dVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        return Boolean.valueOf(this.f3108h != null || ((t) this.f3109i).p());
    }
}
