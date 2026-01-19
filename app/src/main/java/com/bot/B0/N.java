package B0;

import D.AbstractC0090r0;
import H0.AbstractC0141b0;
import H0.C0159n;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class N extends AbstractC0141b0 {
    public final C0159n a;

    public N(C0159n c0159n) {
        this.a = c0159n;
    }

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new AbstractC0032h(AbstractC0090r0.f1149b, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n3 = (N) obj;
        C0025a c0025a = AbstractC0090r0.f1149b;
        n3.getClass();
        return c0025a.equals(c0025a) && AbstractC1276k.b(this.a, n3.a);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        O o5 = (O) abstractC1040q;
        C0025a c0025a = AbstractC0090r0.f1149b;
        if (!AbstractC1276k.b(o5.f450s, c0025a)) {
            o5.f450s = c0025a;
            if (o5.f451t) {
                o5.O0();
            }
        }
        o5.f449r = this.a;
    }

    public final int hashCode() {
        int d6 = AbstractC1135a.d(1022 * 31, 31, false);
        C0159n c0159n = this.a;
        return d6 + (c0159n != null ? c0159n.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + AbstractC0090r0.f1149b + ", overrideDescendants=false, touchBoundsExpansion=" + this.a + ')';
    }
}
