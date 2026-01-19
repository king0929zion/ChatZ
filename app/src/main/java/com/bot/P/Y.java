package p;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import m4.AbstractC1276k;
import t.C1682j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Y extends AbstractC0141b0 {
    public final C1682j a;

    public Y(C1682j c1682j) {
        this.a = c1682j;
    }

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new C1424b0(this.a, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Y) {
            return AbstractC1276k.b(this.a, ((Y) obj).a);
        }
        return false;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        ((C1424b0) abstractC1040q).R0(this.a);
    }

    public final int hashCode() {
        C1682j c1682j = this.a;
        if (c1682j != null) {
            return c1682j.hashCode();
        }
        return 0;
    }
}
