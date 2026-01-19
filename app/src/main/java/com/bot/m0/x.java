package m0;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import m4.AbstractC1276k;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x extends AbstractC0141b0 {
    public final w a;

    public x(w wVar) {
        this.a = wVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h0.q, m0.z] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f12923r = this.a;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && AbstractC1276k.b(this.a, ((x) obj).a);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        z zVar = (z) abstractC1040q;
        zVar.f12923r.a.j(zVar);
        w wVar = this.a;
        zVar.f12923r = wVar;
        wVar.a.b(zVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ')';
    }
}
