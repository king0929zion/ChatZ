package v;

import H0.AbstractC0141b0;
import H0.AbstractC0157l;
import h0.AbstractC1040q;
import j1.AbstractC1135a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1790c0 extends AbstractC0141b0 {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15291b;

    public C1790c0(float f6, float f7) {
        this.a = f6;
        this.f15291b = f7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v.d0, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        ?? abstractC1040q = new AbstractC1040q();
        abstractC1040q.f15293r = this.a;
        abstractC1040q.f15294s = this.f15291b;
        abstractC1040q.f15295t = true;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C1790c0 c1790c0 = obj instanceof C1790c0 ? (C1790c0) obj : null;
        return c1790c0 != null && e1.f.c(this.a, c1790c0.a) && e1.f.c(this.f15291b, c1790c0.f15291b);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        C1792d0 c1792d0 = (C1792d0) abstractC1040q;
        float f6 = c1792d0.f15293r;
        float f7 = this.a;
        boolean c6 = e1.f.c(f6, f7);
        float f8 = this.f15291b;
        if (!c6 || !e1.f.c(c1792d0.f15294s, f8) || !c1792d0.f15295t) {
            AbstractC0157l.v(c1792d0).W(false);
        }
        c1792d0.f15293r = f7;
        c1792d0.f15294s = f8;
        c1792d0.f15295t = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC1135a.a(this.f15291b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) e1.f.d(this.a)) + ", y=" + ((Object) e1.f.d(this.f15291b)) + ", rtlAware=true)";
    }
}
