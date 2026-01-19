package z3;

import m4.AbstractC1276k;
import w3.InterfaceC1848e;

/* loaded from: classes.dex */
public final class M implements u, InterfaceC1848e {
    @Override // z3.u
    public final Object a(l4.c cVar) {
        K k3 = new K();
        cVar.f(k3);
        return new N(k3.a, k3.f16248b, k3.f16249c);
    }

    @Override // z3.u
    public final void b(Object obj, t3.d dVar) {
        N n3 = (N) obj;
        AbstractC1276k.f(n3, "plugin");
        AbstractC1276k.f(dVar, "scope");
        B3.j jVar = J.f16246b;
        J j3 = (J) v.a(dVar);
        j3.a.add(new B3.m(n3, dVar, null, 5));
    }

    @Override // z3.u
    public final N3.a getKey() {
        return N.f16255e;
    }
}
