package o0;

import H0.AbstractC0141b0;
import H0.AbstractC0157l;
import H0.i0;
import h0.AbstractC1040q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1401l extends AbstractC0141b0 {
    public final l4.c a;

    public C1401l(l4.c cVar) {
        this.a = cVar;
    }

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new C1402m(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1401l) {
            return this.a == ((C1401l) obj).a;
        }
        return false;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        i0 i0Var;
        C1402m c1402m = (C1402m) abstractC1040q;
        l4.c cVar = this.a;
        c1402m.f13470r = cVar;
        if (c1402m.f11806c.f11819q && (i0Var = AbstractC0157l.t(c1402m, 2).f1955s) != null) {
            i0Var.u1(cVar, true);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
