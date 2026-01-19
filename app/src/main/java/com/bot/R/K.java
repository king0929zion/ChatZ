package R;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import m4.AbstractC1276k;
import r.X0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class K<T> extends AbstractC0141b0 {
    public final C0513s a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.e f6704b;

    public K(C0513s c0513s, l4.e eVar) {
        this.a = c0513s;
        this.f6704b = eVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R.L, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f6705r = this.a;
        abstractC1040q.f6706s = this.f6704b;
        abstractC1040q.f6707t = X0.f14183c;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k3 = (K) obj;
        return AbstractC1276k.b(this.a, k3.a) && this.f6704b == k3.f6704b;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        L l3 = (L) abstractC1040q;
        l3.f6705r = this.a;
        l3.f6706s = this.f6704b;
        l3.f6707t = X0.f14183c;
    }

    public final int hashCode() {
        return X0.f14183c.hashCode() + ((this.f6704b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
