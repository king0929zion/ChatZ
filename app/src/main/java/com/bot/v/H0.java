package v;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import j1.AbstractC1135a;

/* loaded from: classes.dex */
final class H0 extends AbstractC0141b0 {
    public final EnumC1817x a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.e f15247b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15248c;

    public H0(EnumC1817x enumC1817x, l4.e eVar, Object obj) {
        this.a = enumC1817x;
        this.f15247b = eVar;
        this.f15248c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v.J0, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f15254r = this.a;
        abstractC1040q.f15255s = this.f15247b;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H0.class != obj.getClass()) {
            return false;
        }
        H0 h02 = (H0) obj;
        return this.a == h02.a && this.f15248c.equals(h02.f15248c);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        J0 j02 = (J0) abstractC1040q;
        j02.f15254r = this.a;
        j02.f15255s = this.f15247b;
    }

    public final int hashCode() {
        return this.f15248c.hashCode() + AbstractC1135a.d(this.a.hashCode() * 31, 31, false);
    }
}
