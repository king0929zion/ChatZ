package J;

import D.C0056a;
import H0.AbstractC0141b0;
import H0.AbstractC0156k;
import h0.AbstractC1040q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends AbstractC0141b0 {
    public final l4.e a;

    public b(l4.e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [H0.k, java.lang.Object, h0.q, J.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [H0.j, h0.q, J.a] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        ?? abstractC0156k = new AbstractC0156k();
        abstractC0156k.f2782t = this.a;
        C0056a c0056a = new C0056a(abstractC0156k, 6);
        ?? abstractC1040q = new AbstractC1040q();
        abstractC1040q.f2781r = c0056a;
        abstractC0156k.M0(abstractC1040q);
        return abstractC0156k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.a == ((b) obj).a;
        }
        return false;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        ((c) abstractC1040q).f2782t = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
