package r;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import m4.AbstractC1276k;
import t.C1682j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1569g1 extends AbstractC0141b0 {
    public final InterfaceC1623y1 a;

    /* renamed from: b, reason: collision with root package name */
    public final X0 f14328b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14329c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14330d;

    /* renamed from: e, reason: collision with root package name */
    public final C1682j f14331e;

    public C1569g1(InterfaceC1623y1 interfaceC1623y1, X0 x02, boolean z5, boolean z6, C1682j c1682j) {
        this.a = interfaceC1623y1;
        this.f14328b = x02;
        this.f14329c = z5;
        this.f14330d = z6;
        this.f14331e = c1682j;
    }

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new C1620x1(null, null, null, this.f14328b, this.a, this.f14331e, this.f14329c, this.f14330d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1569g1)) {
            return false;
        }
        C1569g1 c1569g1 = (C1569g1) obj;
        return AbstractC1276k.b(this.a, c1569g1.a) && this.f14328b == c1569g1.f14328b && this.f14329c == c1569g1.f14329c && this.f14330d == c1569g1.f14330d && AbstractC1276k.b(this.f14331e, c1569g1.f14331e);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        ((C1620x1) abstractC1040q).h1(null, null, null, this.f14328b, this.a, this.f14331e, this.f14329c, this.f14330d);
    }

    public final int hashCode() {
        int d6 = AbstractC1135a.d(AbstractC1135a.d((this.f14328b.hashCode() + (this.a.hashCode() * 31)) * 961, 31, this.f14329c), 961, this.f14330d);
        C1682j c1682j = this.f14331e;
        return (d6 + (c1682j != null ? c1682j.hashCode() : 0)) * 31;
    }
}
