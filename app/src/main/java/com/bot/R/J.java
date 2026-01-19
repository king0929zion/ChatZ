package R;

import H0.AbstractC0141b0;
import H0.AbstractC0157l;
import P2.D0;
import h0.AbstractC1040q;

/* loaded from: classes.dex */
public final class J extends AbstractC0141b0 {
    public final D0 a;

    public J(D0 d02) {
        this.a = d02;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h0.q, R.I] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        ?? abstractC1040q = new AbstractC1040q();
        abstractC1040q.f6703r = this.a;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof J) {
            return this.a == ((J) obj).a;
        }
        return false;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        I i6 = (I) abstractC1040q;
        i6.f6703r = this.a;
        AbstractC0157l.m(i6);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
