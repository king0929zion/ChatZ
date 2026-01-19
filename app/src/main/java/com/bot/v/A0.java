package v;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;

/* loaded from: classes.dex */
final class A0 extends AbstractC0141b0 {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15197b;

    public A0(float f6, float f7) {
        this.a = f6;
        this.f15197b = f7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v.B0, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f15199r = this.a;
        abstractC1040q.f15200s = this.f15197b;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a02 = (A0) obj;
        return e1.f.c(this.a, a02.a) && e1.f.c(this.f15197b, a02.f15197b);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        B0 b02 = (B0) abstractC1040q;
        b02.f15199r = this.a;
        b02.f15200s = this.f15197b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15197b) + (Float.hashCode(this.a) * 31);
    }
}
