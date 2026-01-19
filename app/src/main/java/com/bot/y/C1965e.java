package y;

import H0.AbstractC0141b0;
import c4.EnumC0927a;
import h0.AbstractC1040q;
import x4.AbstractC1888A;
import x4.C1933p;

/* renamed from: y.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1965e extends AbstractC0141b0 {
    public C1964d a;

    /* renamed from: b, reason: collision with root package name */
    public C1933p f15850b;

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new C1964d(this);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // H0.AbstractC0141b0
    public final /* bridge */ /* synthetic */ void g(AbstractC1040q abstractC1040q) {
    }

    public final Object h(d4.c cVar) {
        C1933p c1933p = this.f15850b;
        if (c1933p == null) {
            c1933p = AbstractC1888A.b();
            this.f15850b = c1933p;
            C1964d c1964d = this.a;
            if (c1964d != null && c1964d.f11819q) {
                c1964d.M0();
            }
        }
        Object A5 = c1933p.A(cVar);
        return A5 == EnumC0927a.f11114c ? A5 : X3.y.a;
    }

    public final int hashCode() {
        return 234;
    }
}
