package m0;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;

/* loaded from: classes.dex */
final class g extends AbstractC0141b0 {
    public final l4.c a;

    public g(l4.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h0.q, m0.i] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        ?? abstractC1040q = new AbstractC1040q();
        abstractC1040q.f12890r = this.a;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.a == ((g) obj).a;
        }
        return false;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        ((i) abstractC1040q).f12890r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
