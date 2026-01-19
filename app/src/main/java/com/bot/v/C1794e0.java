package v;

import H0.AbstractC0141b0;
import H0.AbstractC0157l;
import h0.AbstractC1040q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1794e0 extends AbstractC0141b0 {
    public final l4.c a;

    public C1794e0(l4.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v.f0, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        ?? abstractC1040q = new AbstractC1040q();
        abstractC1040q.f15299r = this.a;
        abstractC1040q.f15300s = true;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C1794e0 c1794e0 = obj instanceof C1794e0 ? (C1794e0) obj : null;
        return c1794e0 != null && this.a == c1794e0.a;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        C1796f0 c1796f0 = (C1796f0) abstractC1040q;
        l4.c cVar = c1796f0.f15299r;
        l4.c cVar2 = this.a;
        if (cVar != cVar2 || !c1796f0.f15300s) {
            AbstractC0157l.v(c1796f0).W(false);
        }
        c1796f0.f15299r = cVar2;
        c1796f0.f15300s = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.a + ", rtlAware=true)";
    }
}
