package A;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
final class a extends AbstractC0141b0 {
    public final d a;

    public a(d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A.f, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f9r = this.a;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return AbstractC1276k.b(this.a, ((a) obj).a);
        }
        return false;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        f fVar = (f) abstractC1040q;
        d dVar = fVar.f9r;
        if (dVar != null) {
            dVar.a.j(fVar);
        }
        d dVar2 = this.a;
        if (dVar2 != null) {
            dVar2.a.b(fVar);
        }
        fVar.f9r = dVar2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
