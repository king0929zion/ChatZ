package l0;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j extends AbstractC0141b0 {
    public final l4.c a;

    public j(l4.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.k, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        ?? abstractC1040q = new AbstractC1040q();
        abstractC1040q.f12646r = this.a;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.a == ((j) obj).a;
        }
        return false;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        ((k) abstractC1040q).f12646r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
