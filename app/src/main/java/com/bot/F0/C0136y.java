package F0;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import m4.AbstractC1276k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: F0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136y extends AbstractC0141b0 {
    public final Object a;

    public C0136y(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h0.q, F0.A] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f1378r = this.a;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0136y) && AbstractC1276k.b(this.a, ((C0136y) obj).a);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        ((A) abstractC1040q).f1378r = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.a + ')';
    }
}
