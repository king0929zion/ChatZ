package m0;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: m0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1248c extends AbstractC0141b0 {
    public final l4.c a;

    public C1248c(l4.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m0.e, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        ?? abstractC1040q = new AbstractC1040q();
        abstractC1040q.f12888r = this.a;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1248c) {
            return this.a == ((C1248c) obj).a;
        }
        return false;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        ((C1250e) abstractC1040q).f12888r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
