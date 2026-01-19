package v;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import h0.C1031h;

/* loaded from: classes.dex */
public final class J extends AbstractC0141b0 {
    public final C1031h a;

    public J(C1031h c1031h) {
        this.a = c1031h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v.K, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        ?? abstractC1040q = new AbstractC1040q();
        abstractC1040q.f15256r = this.a;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        J j3 = obj instanceof J ? (J) obj : null;
        if (j3 == null) {
            return false;
        }
        return this.a.equals(j3.a);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        ((K) abstractC1040q).f15256r = this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }
}
