package p;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class S0 extends AbstractC0141b0 {
    public final P0 a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13649b;

    public S0(P0 p02, boolean z5) {
        this.a = p02;
        this.f13649b = z5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.N0, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        ?? abstractC1040q = new AbstractC1040q();
        abstractC1040q.f13605r = this.a;
        abstractC1040q.f13606s = this.f13649b;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof S0)) {
            return false;
        }
        S0 s02 = (S0) obj;
        return AbstractC1276k.b(this.a, s02.a) && this.f13649b == s02.f13649b;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        N0 n02 = (N0) abstractC1040q;
        n02.f13605r = this.a;
        n02.f13606s = this.f13649b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13649b) + AbstractC1135a.d(this.a.hashCode() * 31, 31, false);
    }
}
