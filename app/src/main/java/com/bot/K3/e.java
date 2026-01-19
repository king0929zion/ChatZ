package K3;

import b4.InterfaceC0905c;
import d4.i;
import io.ktor.utils.io.t;
import io.ktor.utils.io.y;

/* loaded from: classes.dex */
public final class e extends i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2939h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y f2940i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(y yVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f2940i = yVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((e) p((InterfaceC0905c) obj2, obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        e eVar = new e(this.f2940i, interfaceC0905c);
        eVar.f2939h = obj;
        return eVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        return Boolean.valueOf(this.f2939h != null || ((t) this.f2940i).p());
    }
}
