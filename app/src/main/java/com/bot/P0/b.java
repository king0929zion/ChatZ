package P0;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import h0.InterfaceC1039p;

/* loaded from: classes.dex */
public final class b extends AbstractC0141b0 implements InterfaceC1039p {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.c f4431b;

    public b(l4.c cVar, boolean z5) {
        this.a = z5;
        this.f4431b = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [P0.d, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f4433r = this.a;
        abstractC1040q.f4434s = this.f4431b;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.f4431b == bVar.f4431b;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        d dVar = (d) abstractC1040q;
        dVar.f4433r = this.a;
        dVar.f4434s = this.f4431b;
    }

    public final int hashCode() {
        return this.f4431b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
