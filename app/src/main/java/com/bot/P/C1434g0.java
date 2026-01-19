package p;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import m4.AbstractC1276k;
import t.C1682j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1434g0 extends AbstractC0141b0 {
    public final C1682j a;

    public C1434g0(C1682j c1682j) {
        this.a = c1682j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.l0, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        ?? abstractC1040q = new AbstractC1040q();
        abstractC1040q.f13743r = this.a;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1434g0) && AbstractC1276k.b(((C1434g0) obj).a, this.a);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        C1444l0 c1444l0 = (C1444l0) abstractC1040q;
        C1682j c1682j = c1444l0.f13743r;
        C1682j c1682j2 = this.a;
        if (AbstractC1276k.b(c1682j, c1682j2)) {
            return;
        }
        c1444l0.O0();
        c1444l0.f13743r = c1682j2;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
