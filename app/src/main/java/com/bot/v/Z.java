package v;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;

/* loaded from: classes.dex */
public final class Z extends AbstractC0141b0 {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15279b;

    public Z(float f6, boolean z5) {
        this.a = f6;
        this.f15279b = z5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v.a0, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f15283r = this.a;
        abstractC1040q.f15284s = this.f15279b;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Z z5 = obj instanceof Z ? (Z) obj : null;
        return z5 != null && this.a == z5.a && this.f15279b == z5.f15279b;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        C1786a0 c1786a0 = (C1786a0) abstractC1040q;
        c1786a0.f15283r = this.a;
        c1786a0.f15284s = this.f15279b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15279b) + (Float.hashCode(this.a) * 31);
    }
}
