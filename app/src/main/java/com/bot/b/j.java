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
final class j extends AbstractC0141b0 {
    public final R0.a a;

    /* renamed from: b, reason: collision with root package name */
    public final C1682j f362b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1455r0 f363c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f364d;

    /* renamed from: e, reason: collision with root package name */
    public final P0.i f365e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1193a f366f;

    public j(R0.a aVar, C1682j c1682j, InterfaceC1455r0 interfaceC1455r0, boolean z5, P0.i iVar, InterfaceC1193a interfaceC1193a) {
        this.a = aVar;
        this.f362b = c1682j;
        this.f363c = interfaceC1455r0;
        this.f364d = z5;
        this.f365e = iVar;
        this.f366f = interfaceC1193a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.r, h0.q, B.k] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        r rVar = new r(this.f362b, this.f363c, false, this.f364d, null, this.f365e, this.f366f);
        rVar.f367Q = this.a;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && AbstractC1276k.b(this.f362b, jVar.f362b) && AbstractC1276k.b(this.f363c, jVar.f363c) && this.f364d == jVar.f364d && this.f365e.equals(jVar.f365e) && this.f366f == jVar.f366f;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        k kVar = (k) abstractC1040q;
        R0.a aVar = kVar.f367Q;
        R0.a aVar2 = this.a;
        if (aVar != aVar2) {
            kVar.f367Q = aVar2;
            AbstractC0157l.m(kVar);
        }
        kVar.a1(this.f362b, this.f363c, false, this.f364d, null, this.f365e, this.f366f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        C1682j c1682j = this.f362b;
        int hashCode2 = (hashCode + (c1682j != null ? c1682j.hashCode() : 0)) * 31;
        InterfaceC1455r0 interfaceC1455r0 = this.f363c;
        return this.f366f.hashCode() + AbstractC1135a.b(this.f365e.a, AbstractC1135a.d(AbstractC1135a.d((hashCode2 + (interfaceC1455r0 != null ? interfaceC1455r0.hashCode() : 0)) * 31, 31, false), 31, this.f364d), 31);
    }
}
