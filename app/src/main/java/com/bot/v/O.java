package v;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import m4.AbstractC1276k;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class O extends AbstractC0141b0 {
    public final F0 a;

    public O(F0 f02) {
        this.a = f02;
    }

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new P(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof O) {
            return AbstractC1276k.b(((O) obj).a, this.a);
        }
        return false;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        P p5 = (P) abstractC1040q;
        F0 f02 = p5.f15265t;
        F0 f03 = this.a;
        if (AbstractC1276k.b(f03, f02)) {
            return;
        }
        p5.f15265t = f03;
        p5.N0();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
