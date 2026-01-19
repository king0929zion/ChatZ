package J;

import H0.AbstractC0141b0;
import M.q;
import h0.AbstractC1040q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j extends AbstractC0141b0 {
    public final q a;

    /* renamed from: b, reason: collision with root package name */
    public final d4.i f2792b;

    /* renamed from: c, reason: collision with root package name */
    public final l4.c f2793c;

    /* renamed from: d, reason: collision with root package name */
    public final l4.c f2794d;

    /* JADX WARN: Multi-variable type inference failed */
    public j(q qVar, l4.c cVar, l4.c cVar2, l4.c cVar3) {
        this.a = qVar;
        this.f2792b = (d4.i) cVar;
        this.f2793c = cVar2;
        this.f2794d = cVar3;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [d4.i, l4.c] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new l(this.a, this.f2792b, this.f2793c, this.f2794d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.f2792b == jVar.f2792b && this.f2793c == jVar.f2793c && this.f2794d == jVar.f2794d;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        l lVar = (l) abstractC1040q;
        lVar.f2799t.f3179e = null;
        q qVar = this.a;
        lVar.f2799t = qVar;
        qVar.f3179e = lVar;
        qVar.f3180f = lVar.f11819q ? m.f2808f : m.f2807e;
        lVar.f2800u = this.f2792b;
        lVar.f2801v = this.f2793c;
        lVar.f2802w = this.f2794d;
    }

    public final int hashCode() {
        int hashCode = (this.f2792b.hashCode() + (this.a.hashCode() * 31)) * 31;
        l4.c cVar = this.f2793c;
        return this.f2794d.hashCode() + ((hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }
}
