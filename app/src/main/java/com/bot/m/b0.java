package m;

import m4.AbstractC1277l;
import n.InterfaceC1351z;

/* loaded from: classes.dex */
public final class b0 {
    public final AbstractC1277l a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1351z f12770b;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(l4.c cVar, InterfaceC1351z interfaceC1351z) {
        this.a = (AbstractC1277l) cVar;
        this.f12770b = interfaceC1351z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.a.equals(b0Var.a) && this.f12770b.equals(b0Var.f12770b);
    }

    public final int hashCode() {
        return this.f12770b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.f12770b + ')';
    }
}
