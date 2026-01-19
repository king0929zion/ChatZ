package v;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import m4.AbstractC1276k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1804j0 extends AbstractC0141b0 {
    public final InterfaceC1802i0 a;

    public C1804j0(InterfaceC1802i0 interfaceC1802i0) {
        this.a = interfaceC1802i0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v.l0, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f15323r = this.a;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        C1804j0 c1804j0 = obj instanceof C1804j0 ? (C1804j0) obj : null;
        if (c1804j0 == null) {
            return false;
        }
        return AbstractC1276k.b(this.a, c1804j0.a);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        ((l0) abstractC1040q).f15323r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
