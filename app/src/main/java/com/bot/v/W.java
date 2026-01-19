package v;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import m.AbstractC1216X;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class W extends AbstractC0141b0 {
    /* JADX WARN: Type inference failed for: r0v0, types: [v.X, m.X, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1216X abstractC1216X = new AbstractC1216X(1);
        abstractC1216X.f15275s = V.f15273e;
        abstractC1216X.f15276t = true;
        return abstractC1216X;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof W ? (W) obj : null) != null;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        X x5 = (X) abstractC1040q;
        x5.f15275s = V.f15273e;
        x5.f15276t = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (V.f15273e.hashCode() * 31);
    }
}
