package v;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import m4.AbstractC1276k;
import p.O0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v0 extends AbstractC0141b0 {
    public final O0 a;

    public v0(O0 o02) {
        this.a = o02;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v.w0, v.P, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        P p5 = new P(AbstractC1787b.f15286c);
        p5.f15363u = this.a;
        return p5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v0) {
            return this.a == ((v0) obj).a;
        }
        return false;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        w0 w0Var = (w0) abstractC1040q;
        O0 o02 = w0Var.f15363u;
        O0 o03 = this.a;
        if (o02 != o03) {
            w0Var.f15363u = o03;
            G0 g02 = w0Var.f15364v;
            if (g02 != null) {
                C1785a c1785a = g02.f15222c;
                if (AbstractC1276k.b(c1785a, w0Var.f15265t)) {
                    return;
                }
                w0Var.f15265t = c1785a;
                w0Var.N0();
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
