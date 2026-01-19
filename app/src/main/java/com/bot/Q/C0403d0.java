package Q;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;

/* renamed from: Q.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0403d0 extends AbstractC0141b0 {
    public final D.C a;

    public C0403d0(D.C c6) {
        this.a = c6;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h0.q, Q.e0] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        ?? abstractC1040q = new AbstractC1040q();
        abstractC1040q.f5773r = this.a;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0403d0) {
            return this.a == ((C0403d0) obj).a;
        }
        return false;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        ((C0407e0) abstractC1040q).f5773r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
