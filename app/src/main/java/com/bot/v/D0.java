package v;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import h0.C1026c;
import h0.C1032i;

/* loaded from: classes.dex */
public final class D0 extends AbstractC0141b0 {
    /* JADX WARN: Type inference failed for: r0v0, types: [v.E0, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        C1032i c1032i = C1026c.f11796n;
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f15210r = c1032i;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof D0 ? (D0) obj : null) == null) {
            return false;
        }
        C1032i c1032i = C1026c.f11796n;
        return c1032i.equals(c1032i);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        ((E0) abstractC1040q).f15210r = C1026c.f11796n;
    }

    public final int hashCode() {
        return Float.hashCode(S.l.f7374V);
    }
}
