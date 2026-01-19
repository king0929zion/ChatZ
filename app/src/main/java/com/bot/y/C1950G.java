package y;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import m4.AbstractC1276k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1950G extends AbstractC0141b0 {
    public final C1954K a;

    public C1950G(C1954K c1954k) {
        this.a = c1954k;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y.H, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        ?? abstractC1040q = new AbstractC1040q();
        abstractC1040q.f15774r = this.a;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1950G) && AbstractC1276k.b(this.a, ((C1950G) obj).a);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        C1951H c1951h = (C1951H) abstractC1040q;
        C1954K c1954k = c1951h.f15774r;
        C1954K c1954k2 = this.a;
        if (AbstractC1276k.b(c1954k, c1954k2) || !c1951h.f11806c.f11819q) {
            return;
        }
        C1954K c1954k3 = c1951h.f15774r;
        c1954k3.d();
        c1954k3.f15783b = null;
        c1954k3.f15784c = -1;
        c1954k2.f15791j = c1951h;
        c1951h.f15774r = c1954k2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.a + ')';
    }
}
