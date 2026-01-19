package y;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
final class w0 extends AbstractC0141b0 {
    public final b0 a;

    public w0(b0 b0Var) {
        this.a = b0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y.x0, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f15949r = this.a;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && AbstractC1276k.b(this.a, ((w0) obj).a);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        ((x0) abstractC1040q).f15949r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.a + ')';
    }
}
