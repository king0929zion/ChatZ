package F0;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: F0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0135x extends AbstractC0141b0 {
    public final l4.f a;

    public C0135x(l4.f fVar) {
        this.a = fVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [F0.E, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f1397r = this.a;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0135x) {
            return this.a == ((C0135x) obj).a;
        }
        return false;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        ((E) abstractC1040q).f1397r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
