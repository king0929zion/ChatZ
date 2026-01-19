package v;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import j1.AbstractC1135a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s0 extends AbstractC0141b0 {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15343b;

    /* renamed from: c, reason: collision with root package name */
    public final float f15344c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15345d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15346e;

    public s0(float f6, float f7, float f8, float f9, boolean z5) {
        this.a = f6;
        this.f15343b = f7;
        this.f15344c = f8;
        this.f15345d = f9;
        this.f15346e = z5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v.u0, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f15356r = this.a;
        abstractC1040q.f15357s = this.f15343b;
        abstractC1040q.f15358t = this.f15344c;
        abstractC1040q.f15359u = this.f15345d;
        abstractC1040q.f15360v = this.f15346e;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return e1.f.c(this.a, s0Var.a) && e1.f.c(this.f15343b, s0Var.f15343b) && e1.f.c(this.f15344c, s0Var.f15344c) && e1.f.c(this.f15345d, s0Var.f15345d) && this.f15346e == s0Var.f15346e;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        u0 u0Var = (u0) abstractC1040q;
        u0Var.f15356r = this.a;
        u0Var.f15357s = this.f15343b;
        u0Var.f15358t = this.f15344c;
        u0Var.f15359u = this.f15345d;
        u0Var.f15360v = this.f15346e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15346e) + AbstractC1135a.a(this.f15345d, AbstractC1135a.a(this.f15344c, AbstractC1135a.a(this.f15343b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public /* synthetic */ s0(float f6, float f7, float f8, float f9, int i6) {
        this((i6 & 1) != 0 ? Float.NaN : f6, (i6 & 2) != 0 ? Float.NaN : f7, (i6 & 4) != 0 ? Float.NaN : f8, (i6 & 8) != 0 ? Float.NaN : f9, true);
    }
}
