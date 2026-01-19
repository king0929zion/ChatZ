package B;

import H0.AbstractC0141b0;
import H0.AbstractC0157l;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import p.InterfaceC1455r0;
import p.r;
import t.C1682j;

/* loaded from: classes.dex */
final class a extends AbstractC0141b0 {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final C1682j f333b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1455r0 f334c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f335d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f336e;

    /* renamed from: f, reason: collision with root package name */
    public final P0.i f337f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1193a f338g;

    public a(boolean z5, C1682j c1682j, InterfaceC1455r0 interfaceC1455r0, boolean z6, boolean z7, P0.i iVar, InterfaceC1193a interfaceC1193a) {
        this.a = z5;
        this.f333b = c1682j;
        this.f334c = interfaceC1455r0;
        this.f335d = z6;
        this.f336e = z7;
        this.f337f = iVar;
        this.f338g = interfaceC1193a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.r, B.d, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        r rVar = new r(this.f333b, this.f334c, this.f335d, this.f336e, null, this.f337f, this.f338g);
        rVar.f344Q = this.a;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && AbstractC1276k.b(this.f333b, aVar.f333b) && AbstractC1276k.b(this.f334c, aVar.f334c) && this.f335d == aVar.f335d && this.f336e == aVar.f336e && AbstractC1276k.b(this.f337f, aVar.f337f) && this.f338g == aVar.f338g;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        d dVar = (d) abstractC1040q;
        boolean z5 = dVar.f344Q;
        boolean z6 = this.a;
        if (z5 != z6) {
            dVar.f344Q = z6;
            AbstractC0157l.m(dVar);
        }
        dVar.a1(this.f333b, this.f334c, this.f335d, this.f336e, null, this.f337f, this.f338g);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        C1682j c1682j = this.f333b;
        int hashCode2 = (hashCode + (c1682j != null ? c1682j.hashCode() : 0)) * 31;
        InterfaceC1455r0 interfaceC1455r0 = this.f334c;
        int d6 = AbstractC1135a.d(AbstractC1135a.d((hashCode2 + (interfaceC1455r0 != null ? interfaceC1455r0.hashCode() : 0)) * 31, 31, this.f335d), 31, this.f336e);
        P0.i iVar = this.f337f;
        return this.f338g.hashCode() + ((d6 + (iVar != null ? Integer.hashCode(iVar.a) : 0)) * 31);
    }
}
