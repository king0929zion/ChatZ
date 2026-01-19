package A3;

import b4.InterfaceC0905c;
import m4.AbstractC1276k;
import z3.u;

/* loaded from: classes.dex */
public final class g implements u {
    @Override // z3.u
    public final Object a(l4.c cVar) {
        d dVar = new d();
        cVar.f(dVar);
        return new k(dVar.f120b, dVar.a);
    }

    @Override // z3.u
    public final void b(Object obj, t3.d dVar) {
        k kVar = (k) obj;
        AbstractC1276k.f(kVar, "plugin");
        AbstractC1276k.f(dVar, "scope");
        InterfaceC0905c interfaceC0905c = null;
        dVar.f14925h.f(E3.f.f1318i, new e(kVar, interfaceC0905c, 0));
        dVar.f14926i.f(F3.b.f1582l, new f(kVar, interfaceC0905c, 0));
    }

    @Override // z3.u
    public final N3.a getKey() {
        return k.f145d;
    }
}
