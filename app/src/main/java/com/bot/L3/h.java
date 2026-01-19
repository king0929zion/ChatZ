package L3;

import X3.y;
import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class h extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3127h;

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((h) p((InterfaceC0905c) obj2, (J3.d) obj)).r(y.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [L3.h, d4.i, b4.c] */
    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        d4.i iVar = new d4.i(2, interfaceC0905c);
        iVar.f3127h = obj;
        return iVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        return Boolean.valueOf(((J3.d) this.f3127h) != null);
    }
}
