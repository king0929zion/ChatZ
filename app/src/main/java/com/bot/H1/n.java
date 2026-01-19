package h1;

import B0.J;
import H0.AbstractC0141b0;
import h0.AbstractC1040q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n extends AbstractC0141b0 {
    public final J a;

    public n(J j3) {
        this.a = j3;
    }

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new p(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.a == ((n) obj).a;
        }
        return false;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        p pVar = (p) abstractC1040q;
        J j3 = this.a;
        pVar.f11894r = j3;
        if (pVar.f11819q) {
            j3.f(pVar.f11895s);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
