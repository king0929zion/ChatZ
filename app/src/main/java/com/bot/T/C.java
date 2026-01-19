package T;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class C implements g1 {
    public final l4.c a;

    public C(l4.c cVar) {
        this.a = cVar;
    }

    @Override // T.g1
    public final Object a(InterfaceC0617l0 interfaceC0617l0) {
        return this.a.f(interfaceC0617l0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C) && AbstractC1276k.b(this.a, ((C) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
