package B0;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import m4.AbstractC1276k;

/* renamed from: B0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042s extends AbstractC0141b0 {
    public final C0025a a;

    public C0042s(C0025a c0025a) {
        this.a = c0025a;
    }

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new AbstractC0032h(this.a, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0042s) && this.a.equals(((C0042s) obj).a);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        C0043t c0043t = (C0043t) abstractC1040q;
        C0025a c0025a = c0043t.f450s;
        C0025a c0025a2 = this.a;
        if (AbstractC1276k.b(c0025a, c0025a2)) {
            return;
        }
        c0043t.f450s = c0025a2;
        if (c0043t.f451t) {
            c0043t.O0();
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.f432b * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false)";
    }
}
