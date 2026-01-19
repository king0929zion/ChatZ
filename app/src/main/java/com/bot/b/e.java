package B;

import H0.AbstractC0141b0;
import H0.AbstractC0157l;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import m4.AbstractC1276k;
import t.C1682j;

/* loaded from: classes.dex */
final class e extends AbstractC0141b0 {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final C1682j f345b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f346c;

    /* renamed from: d, reason: collision with root package name */
    public final P0.i f347d;

    /* renamed from: e, reason: collision with root package name */
    public final l4.c f348e;

    public e(boolean z5, C1682j c1682j, boolean z6, P0.i iVar, l4.c cVar) {
        this.a = z5;
        this.f345b = c1682j;
        this.f346c = z6;
        this.f347d = iVar;
        this.f348e = cVar;
    }

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new i(this.a, this.f345b, this.f346c, this.f347d, this.f348e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && AbstractC1276k.b(this.f345b, eVar.f345b) && this.f346c == eVar.f346c && this.f347d.equals(eVar.f347d) && this.f348e == eVar.f348e;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        i iVar = (i) abstractC1040q;
        boolean z5 = iVar.f359Q;
        boolean z6 = this.a;
        if (z5 != z6) {
            iVar.f359Q = z6;
            AbstractC0157l.m(iVar);
        }
        iVar.f360R = this.f348e;
        iVar.a1(this.f345b, null, false, this.f346c, null, this.f347d, iVar.f361S);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        C1682j c1682j = this.f345b;
        return this.f348e.hashCode() + AbstractC1135a.b(this.f347d.a, AbstractC1135a.d(AbstractC1135a.d((hashCode + (c1682j != null ? c1682j.hashCode() : 0)) * 961, 31, false), 31, this.f346c), 31);
    }
}
