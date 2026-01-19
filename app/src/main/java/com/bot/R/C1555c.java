package r;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import m4.AbstractC1276k;
import s.C1643g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1555c<T> extends AbstractC0141b0 {
    public final C1606t a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f14253b;

    /* renamed from: c, reason: collision with root package name */
    public final C1643g f14254c;

    public C1555c(C1606t c1606t, Boolean bool, C1643g c1643g) {
        this.a = c1606t;
        this.f14253b = bool;
        this.f14254c = c1643g;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [r.n, r.o0, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        p.O0 o02 = AbstractC1573i.a;
        X0 x02 = X0.f14184e;
        AbstractC1592o0 abstractC1592o0 = new AbstractC1592o0(o02, true, null, x02);
        abstractC1592o0.f14392L = this.a;
        abstractC1592o0.f14393M = x02;
        abstractC1592o0.f14394N = this.f14253b;
        abstractC1592o0.f14395O = this.f14254c;
        return abstractC1592o0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1555c)) {
            return false;
        }
        C1555c c1555c = (C1555c) obj;
        return this.a.equals(c1555c.a) && this.f14253b.equals(c1555c.f14253b) && AbstractC1276k.b(this.f14254c, c1555c.f14254c);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        boolean z5;
        boolean z6;
        C1588n c1588n = (C1588n) abstractC1040q;
        C1643g c1643g = this.f14254c;
        c1588n.f14395O = c1643g;
        C1606t c1606t = c1588n.f14392L;
        C1606t c1606t2 = this.a;
        if (AbstractC1276k.b(c1606t, c1606t2)) {
            z5 = false;
        } else {
            c1588n.f14392L = c1606t2;
            c1588n.j1(c1643g);
            z5 = true;
        }
        X0 x02 = c1588n.f14393M;
        X0 x03 = X0.f14184e;
        if (x02 != x03) {
            c1588n.f14393M = x03;
            z5 = true;
        }
        Boolean bool = c1588n.f14394N;
        Boolean bool2 = this.f14253b;
        if (AbstractC1276k.b(bool, bool2)) {
            z6 = z5;
        } else {
            c1588n.f14394N = bool2;
            z6 = true;
        }
        c1588n.g1(c1588n.f14421u, true, null, x03, z6);
    }

    public final int hashCode() {
        int hashCode = (this.f14253b.hashCode() + AbstractC1135a.d((X0.f14184e.hashCode() + (this.a.hashCode() * 31)) * 31, 31, true)) * 923521;
        C1643g c1643g = this.f14254c;
        return hashCode + (c1643g != null ? c1643g.hashCode() : 0);
    }
}
