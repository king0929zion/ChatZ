package v;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y0 extends AbstractC0141b0 {
    public final C1777A a;

    public y0(C1777A c1777a) {
        this.a = c1777a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v.M, v.z0, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        M m3 = new M();
        m3.f15372t = this.a;
        return m3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y0) {
            return ((y0) obj).a.equals(this.a);
        }
        return false;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        z0 z0Var = (z0) abstractC1040q;
        C1777A c1777a = z0Var.f15372t;
        C1777A c1777a2 = this.a;
        if (c1777a2.equals(c1777a)) {
            return;
        }
        z0Var.f15372t = c1777a2;
        z0Var.N0();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
