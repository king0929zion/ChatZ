package R;

import D.C0091s;
import H0.AbstractC0141b0;
import H0.AbstractC0157l;
import h0.AbstractC1040q;

/* loaded from: classes.dex */
public final class a0 extends AbstractC0141b0 {
    public final C0091s a;

    public a0(C0091s c0091s) {
        this.a = c0091s;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h0.q, R.Z] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f6732r = this.a;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            return this.a == ((a0) obj).a;
        }
        return false;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        Z z5 = (Z) abstractC1040q;
        z5.f6732r = this.a;
        AbstractC0157l.m(z5);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
