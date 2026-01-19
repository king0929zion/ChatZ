package r;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import m4.AbstractC1276k;
import t.C1682j;

/* renamed from: r.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1595p0 extends AbstractC0141b0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p.O0 f14433i = new p.O0(6);
    public final InterfaceC1616w0 a;

    /* renamed from: b, reason: collision with root package name */
    public final X0 f14434b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14435c;

    /* renamed from: d, reason: collision with root package name */
    public final C1682j f14436d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14437e;

    /* renamed from: f, reason: collision with root package name */
    public final l4.f f14438f;

    /* renamed from: g, reason: collision with root package name */
    public final l4.f f14439g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14440h;

    public C1595p0(InterfaceC1616w0 interfaceC1616w0, X0 x02, boolean z5, C1682j c1682j, boolean z6, C1598q0 c1598q0, l4.f fVar, boolean z7) {
        this.a = interfaceC1616w0;
        this.f14434b = x02;
        this.f14435c = z5;
        this.f14436d = c1682j;
        this.f14437e = z6;
        this.f14438f = c1598q0;
        this.f14439g = fVar;
        this.f14440h = z7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [r.v0, r.o0, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        p.O0 o02 = f14433i;
        boolean z5 = this.f14435c;
        C1682j c1682j = this.f14436d;
        X0 x02 = this.f14434b;
        AbstractC1592o0 abstractC1592o0 = new AbstractC1592o0(o02, z5, c1682j, x02);
        abstractC1592o0.f14491L = this.a;
        abstractC1592o0.f14492M = x02;
        abstractC1592o0.f14493N = this.f14437e;
        abstractC1592o0.f14494O = this.f14438f;
        abstractC1592o0.f14495P = this.f14439g;
        abstractC1592o0.f14496Q = this.f14440h;
        return abstractC1592o0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1595p0.class != obj.getClass()) {
            return false;
        }
        C1595p0 c1595p0 = (C1595p0) obj;
        return AbstractC1276k.b(this.a, c1595p0.a) && this.f14434b == c1595p0.f14434b && this.f14435c == c1595p0.f14435c && AbstractC1276k.b(this.f14436d, c1595p0.f14436d) && this.f14437e == c1595p0.f14437e && AbstractC1276k.b(this.f14438f, c1595p0.f14438f) && AbstractC1276k.b(this.f14439g, c1595p0.f14439g) && this.f14440h == c1595p0.f14440h;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        boolean z5;
        boolean z6;
        C1613v0 c1613v0 = (C1613v0) abstractC1040q;
        InterfaceC1616w0 interfaceC1616w0 = c1613v0.f14491L;
        InterfaceC1616w0 interfaceC1616w02 = this.a;
        if (AbstractC1276k.b(interfaceC1616w0, interfaceC1616w02)) {
            z5 = false;
        } else {
            c1613v0.f14491L = interfaceC1616w02;
            z5 = true;
        }
        X0 x02 = c1613v0.f14492M;
        X0 x03 = this.f14434b;
        if (x02 != x03) {
            c1613v0.f14492M = x03;
            z5 = true;
        }
        boolean z7 = c1613v0.f14496Q;
        boolean z8 = this.f14440h;
        if (z7 != z8) {
            c1613v0.f14496Q = z8;
            z6 = true;
        } else {
            z6 = z5;
        }
        c1613v0.f14494O = this.f14438f;
        c1613v0.f14495P = this.f14439g;
        c1613v0.f14493N = this.f14437e;
        c1613v0.g1(f14433i, this.f14435c, this.f14436d, x03, z6);
    }

    public final int hashCode() {
        int d6 = AbstractC1135a.d((this.f14434b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.f14435c);
        C1682j c1682j = this.f14436d;
        return Boolean.hashCode(this.f14440h) + ((this.f14439g.hashCode() + ((this.f14438f.hashCode() + AbstractC1135a.d((d6 + (c1682j != null ? c1682j.hashCode() : 0)) * 31, 31, this.f14437e)) * 31)) * 31);
    }
}
