package h0;

import H0.AbstractC0141b0;
import j1.AbstractC1135a;

/* renamed from: h0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1045v extends AbstractC0141b0 {
    public final float a;

    public C1045v(float f6) {
        this.a = f6;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h0.w, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f11826r = this.a;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1045v) && Float.compare(this.a, ((C1045v) obj).a) == 0;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        ((C1046w) abstractC1040q).f11826r = this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return AbstractC1135a.h(new StringBuilder("ZIndexElement(zIndex="), this.a, ')');
    }
}
