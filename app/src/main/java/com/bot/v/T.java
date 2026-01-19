package v;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import m.AbstractC1216X;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class T extends AbstractC0141b0 {
    /* JADX WARN: Type inference failed for: r0v0, types: [m.X, h0.q, v.U] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        ?? abstractC1216X = new AbstractC1216X(1);
        abstractC1216X.f15270s = V.f15272c;
        abstractC1216X.f15271t = true;
        return abstractC1216X;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof T ? (T) obj : null) != null;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        U u5 = (U) abstractC1040q;
        u5.f15270s = V.f15272c;
        u5.f15271t = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (V.f15272c.hashCode() * 31);
    }
}
