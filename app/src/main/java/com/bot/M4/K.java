package M4;

import i4.AbstractC1117a;
import java.util.List;
import m4.AbstractC1276k;
import s4.InterfaceC1672b;

/* loaded from: classes.dex */
public final class K implements s4.f {
    public final s4.f a;

    public K(s4.f fVar) {
        AbstractC1276k.f(fVar, "origin");
        this.a = fVar;
    }

    @Override // s4.f
    public final boolean a() {
        return this.a.a();
    }

    @Override // s4.f
    public final List b() {
        return this.a.b();
    }

    @Override // s4.f
    public final InterfaceC1672b c() {
        return this.a.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        K k3 = obj instanceof K ? (K) obj : null;
        s4.f fVar = k3 != null ? k3.a : null;
        s4.f fVar2 = this.a;
        if (!AbstractC1276k.b(fVar2, fVar)) {
            return false;
        }
        InterfaceC1672b c6 = fVar2.c();
        if (!(c6 instanceof InterfaceC1672b)) {
            return false;
        }
        s4.f fVar3 = obj instanceof s4.f ? (s4.f) obj : null;
        InterfaceC1672b c7 = fVar3 != null ? fVar3.c() : null;
        if (c7 == null || !(c7 instanceof InterfaceC1672b)) {
            return false;
        }
        return AbstractC1117a.o(c6).equals(AbstractC1117a.o(c7));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.a;
    }
}
