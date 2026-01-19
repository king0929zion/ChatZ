package J;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends AbstractC0141b0 {
    public final d4.i a;

    /* JADX WARN: Multi-variable type inference failed */
    public e(l4.e eVar) {
        this.a = (d4.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [d4.i, l4.e] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new h(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.a == ((e) obj).a;
        }
        return false;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        ((h) abstractC1040q).f2790t = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
