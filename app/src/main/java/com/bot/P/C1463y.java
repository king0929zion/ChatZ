package p;

import H0.AbstractC0141b0;
import H0.AbstractC0157l;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import m4.AbstractC1276k;
import o0.AbstractC1404o;
import o0.C1381C;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1463y extends AbstractC0141b0 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1404o f13827b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13828c;

    /* renamed from: d, reason: collision with root package name */
    public final o0.L f13829d;

    public C1463y(long j3, C1381C c1381c, o0.L l3, int i6) {
        j3 = (i6 & 1) != 0 ? o0.s.f13481h : j3;
        c1381c = (i6 & 2) != 0 ? null : c1381c;
        this.a = j3;
        this.f13827b = c1381c;
        this.f13828c = 1.0f;
        this.f13829d = l3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.A, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        ?? abstractC1040q = new AbstractC1040q();
        abstractC1040q.f13530r = this.a;
        abstractC1040q.f13531s = this.f13827b;
        abstractC1040q.f13532t = this.f13828c;
        abstractC1040q.f13533u = this.f13829d;
        abstractC1040q.f13534v = 9205357640488583168L;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        C1463y c1463y = obj instanceof C1463y ? (C1463y) obj : null;
        return c1463y != null && o0.s.d(this.a, c1463y.a) && AbstractC1276k.b(this.f13827b, c1463y.f13827b) && this.f13828c == c1463y.f13828c && AbstractC1276k.b(this.f13829d, c1463y.f13829d);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        C1411A c1411a = (C1411A) abstractC1040q;
        c1411a.f13530r = this.a;
        c1411a.f13531s = this.f13827b;
        c1411a.f13532t = this.f13828c;
        o0.L l3 = c1411a.f13533u;
        o0.L l5 = this.f13829d;
        if (!AbstractC1276k.b(l3, l5)) {
            c1411a.f13533u = l5;
            AbstractC0157l.m(c1411a);
        }
        AbstractC0157l.k(c1411a);
    }

    public final int hashCode() {
        int i6 = o0.s.f13482i;
        int hashCode = Long.hashCode(this.a) * 31;
        AbstractC1404o abstractC1404o = this.f13827b;
        return this.f13829d.hashCode() + AbstractC1135a.a(this.f13828c, (hashCode + (abstractC1404o != null ? abstractC1404o.hashCode() : 0)) * 31, 31);
    }
}
