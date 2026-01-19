package j2;

import F0.InterfaceC0121i;
import H0.AbstractC0141b0;
import H0.AbstractC0157l;
import h0.AbstractC1040q;
import h0.InterfaceC1028e;
import j1.AbstractC1135a;
import m4.AbstractC1276k;
import n0.C1356e;
import t0.AbstractC1688b;

/* loaded from: classes.dex */
public final class r extends AbstractC0141b0 {
    public final AbstractC1688b a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1028e f12399b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0121i f12400c;

    /* renamed from: d, reason: collision with root package name */
    public final float f12401d;

    public r(AbstractC1688b abstractC1688b, InterfaceC1028e interfaceC1028e, InterfaceC0121i interfaceC0121i, float f6) {
        this.a = abstractC1688b;
        this.f12399b = interfaceC1028e;
        this.f12400c = interfaceC0121i;
        this.f12401d = f6;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h0.q, j2.s] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f12402r = this.a;
        abstractC1040q.f12403s = this.f12399b;
        abstractC1040q.f12404t = this.f12400c;
        abstractC1040q.f12405u = this.f12401d;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return AbstractC1276k.b(this.a, rVar.a) && AbstractC1276k.b(this.f12399b, rVar.f12399b) && AbstractC1276k.b(this.f12400c, rVar.f12400c) && Float.compare(this.f12401d, rVar.f12401d) == 0;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        s sVar = (s) abstractC1040q;
        long h3 = sVar.f12402r.h();
        AbstractC1688b abstractC1688b = this.a;
        boolean a = C1356e.a(h3, abstractC1688b.h());
        sVar.f12402r = abstractC1688b;
        sVar.f12403s = this.f12399b;
        sVar.f12404t = this.f12400c;
        sVar.f12405u = this.f12401d;
        if (!a) {
            AbstractC0157l.l(sVar);
        }
        AbstractC0157l.k(sVar);
    }

    public final int hashCode() {
        return AbstractC1135a.a(this.f12401d, (this.f12400c.hashCode() + ((this.f12399b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.a + ", alignment=" + this.f12399b + ", contentScale=" + this.f12400c + ", alpha=" + this.f12401d + ", colorFilter=null)";
    }
}
