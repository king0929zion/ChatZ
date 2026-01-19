package F0;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: F0.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116e0 extends AbstractC0141b0 {
    public final l4.c a;

    public C0116e0(l4.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h0.q, F0.f0] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f1474r = this.a;
        long j3 = Integer.MIN_VALUE;
        abstractC1040q.f1475s = (j3 & 4294967295L) | (j3 << 32);
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0116e0) {
            return this.a == ((C0116e0) obj).a;
        }
        return false;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        C0118f0 c0118f0 = (C0118f0) abstractC1040q;
        c0118f0.f1474r = this.a;
        long j3 = Integer.MIN_VALUE;
        c0118f0.f1475s = (j3 & 4294967295L) | (j3 << 32);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
