package l0;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;

/* loaded from: classes.dex */
final class i extends AbstractC0141b0 {
    public final l4.c a;

    public i(l4.c cVar) {
        this.a = cVar;
    }

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new C1183c(new d(), this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return this.a == ((i) obj).a;
        }
        return false;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        C1183c c1183c = (C1183c) abstractC1040q;
        c1183c.f12642t = this.a;
        c1183c.M0();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
