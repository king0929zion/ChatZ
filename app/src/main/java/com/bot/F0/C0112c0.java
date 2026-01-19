package F0;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: F0.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0112c0 extends AbstractC0141b0 {
    public final l4.c a;

    public C0112c0(l4.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [F0.d0, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f1472r = this.a;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0112c0) {
            return this.a == ((C0112c0) obj).a;
        }
        return false;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        ((C0114d0) abstractC1040q).f1472r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
