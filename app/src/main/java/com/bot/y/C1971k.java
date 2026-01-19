package y;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import n.C1327h0;

/* renamed from: y.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1971k extends AbstractC0141b0 {
    public final C1327h0 a;

    /* renamed from: b, reason: collision with root package name */
    public final C1327h0 f15883b;

    /* renamed from: c, reason: collision with root package name */
    public final C1327h0 f15884c;

    public C1971k(C1327h0 c1327h0, C1327h0 c1327h02, C1327h0 c1327h03) {
        this.a = c1327h0;
        this.f15883b = c1327h02;
        this.f15884c = c1327h03;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y.l, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        ?? abstractC1040q = new AbstractC1040q();
        abstractC1040q.f15887r = this.a;
        abstractC1040q.f15888s = this.f15883b;
        abstractC1040q.f15889t = this.f15884c;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1971k)) {
            return false;
        }
        C1971k c1971k = (C1971k) obj;
        return this.a.equals(c1971k.a) && this.f15883b.equals(c1971k.f15883b) && this.f15884c.equals(c1971k.f15884c);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        C1972l c1972l = (C1972l) abstractC1040q;
        c1972l.f15887r = this.a;
        c1972l.f15888s = this.f15883b;
        c1972l.f15889t = this.f15884c;
    }

    public final int hashCode() {
        return this.f15884c.hashCode() + ((this.f15883b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.a + ", placementSpec=" + this.f15883b + ", fadeOutSpec=" + this.f15884c + ')';
    }
}
