package v;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1818y extends AbstractC0141b0 {
    public final EnumC1817x a;

    public C1818y(EnumC1817x enumC1817x) {
        this.a = enumC1817x;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v.z, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f15370r = this.a;
        abstractC1040q.f15371s = 1.0f;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1818y) {
            return this.a == ((C1818y) obj).a;
        }
        return false;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        C1819z c1819z = (C1819z) abstractC1040q;
        c1819z.f15370r = this.a;
        c1819z.f15371s = 1.0f;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (this.a.hashCode() * 31);
    }
}
