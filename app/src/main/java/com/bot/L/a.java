package L;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import l4.InterfaceC1193a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends AbstractC0141b0 {
    public final InterfaceC1193a a;

    public a(InterfaceC1193a interfaceC1193a) {
        this.a = interfaceC1193a;
    }

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new d(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.a == ((a) obj).a;
        }
        return false;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        ((d) abstractC1040q).f2985t = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
