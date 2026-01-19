package y;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import m4.AbstractC1276k;
import r.C1609u;
import r.X0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1974n extends AbstractC0141b0 {
    public final InterfaceC1978s a;

    /* renamed from: b, reason: collision with root package name */
    public final C1609u f15896b;

    /* renamed from: c, reason: collision with root package name */
    public final X0 f15897c;

    public C1974n(InterfaceC1978s interfaceC1978s, C1609u c1609u, X0 x02) {
        this.a = interfaceC1978s;
        this.f15896b = c1609u;
        this.f15897c = x02;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h0.q, y.r] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        ?? abstractC1040q = new AbstractC1040q();
        abstractC1040q.f15934r = this.a;
        abstractC1040q.f15935s = this.f15896b;
        abstractC1040q.f15936t = this.f15897c;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1974n)) {
            return false;
        }
        C1974n c1974n = (C1974n) obj;
        return AbstractC1276k.b(this.a, c1974n.a) && AbstractC1276k.b(this.f15896b, c1974n.f15896b) && this.f15897c == c1974n.f15897c;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        r rVar = (r) abstractC1040q;
        rVar.f15934r = this.a;
        rVar.f15935s = this.f15896b;
        rVar.f15936t = this.f15897c;
    }

    public final int hashCode() {
        return this.f15897c.hashCode() + AbstractC1135a.d((this.f15896b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false);
    }
}
