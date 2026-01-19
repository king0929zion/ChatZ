package m;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n.r0;
import n.y0;

/* renamed from: m.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1200G extends AbstractC0141b0 {
    public final y0 a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f12718b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f12719c;

    /* renamed from: d, reason: collision with root package name */
    public final r0 f12720d;

    /* renamed from: e, reason: collision with root package name */
    public final C1210Q f12721e;

    /* renamed from: f, reason: collision with root package name */
    public final C1211S f12722f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1193a f12723g;

    /* renamed from: h, reason: collision with root package name */
    public final C1201H f12724h;

    public C1200G(y0 y0Var, r0 r0Var, r0 r0Var2, r0 r0Var3, C1210Q c1210q, C1211S c1211s, InterfaceC1193a interfaceC1193a, C1201H c1201h) {
        this.a = y0Var;
        this.f12718b = r0Var;
        this.f12719c = r0Var2;
        this.f12720d = r0Var3;
        this.f12721e = c1210q;
        this.f12722f = c1211s;
        this.f12723g = interfaceC1193a;
        this.f12724h = c1201h;
    }

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new C1209P(this.a, this.f12718b, this.f12719c, this.f12720d, this.f12721e, this.f12722f, this.f12723g, this.f12724h);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1200G)) {
            return false;
        }
        C1200G c1200g = (C1200G) obj;
        return AbstractC1276k.b(c1200g.a, this.a) && AbstractC1276k.b(c1200g.f12718b, this.f12718b) && AbstractC1276k.b(c1200g.f12719c, this.f12719c) && AbstractC1276k.b(c1200g.f12720d, this.f12720d) && AbstractC1276k.b(c1200g.f12721e, this.f12721e) && AbstractC1276k.b(c1200g.f12722f, this.f12722f) && c1200g.f12723g == this.f12723g && AbstractC1276k.b(c1200g.f12724h, this.f12724h);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        C1209P c1209p = (C1209P) abstractC1040q;
        c1209p.f12752s = this.a;
        c1209p.f12753t = this.f12718b;
        c1209p.f12754u = this.f12719c;
        c1209p.f12755v = this.f12720d;
        c1209p.f12756w = this.f12721e;
        c1209p.f12757x = this.f12722f;
        c1209p.f12758y = this.f12723g;
        c1209p.f12759z = this.f12724h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r0 r0Var = this.f12718b;
        int hashCode2 = (hashCode + (r0Var != null ? r0Var.hashCode() : 0)) * 31;
        r0 r0Var2 = this.f12719c;
        int hashCode3 = (hashCode2 + (r0Var2 != null ? r0Var2.hashCode() : 0)) * 31;
        r0 r0Var3 = this.f12720d;
        return this.f12724h.hashCode() + ((this.f12723g.hashCode() + ((this.f12722f.a.hashCode() + ((this.f12721e.a.hashCode() + ((hashCode3 + (r0Var3 != null ? r0Var3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
