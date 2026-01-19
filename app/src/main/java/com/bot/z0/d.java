package z0;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends AbstractC0141b0 {
    public final l4.c a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.c f16217b;

    public d(l4.c cVar, l4.c cVar2) {
        this.a = cVar;
        this.f16217b = cVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z0.f, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f16218r = this.a;
        abstractC1040q.f16219s = this.f16217b;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.f16217b == dVar.f16217b;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        f fVar = (f) abstractC1040q;
        fVar.f16218r = this.a;
        fVar.f16219s = this.f16217b;
    }

    public final int hashCode() {
        l4.c cVar = this.a;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        l4.c cVar2 = this.f16217b;
        return hashCode + (cVar2 != null ? cVar2.hashCode() : 0);
    }
}
