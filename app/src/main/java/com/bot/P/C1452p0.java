package p;

import H0.AbstractC0141b0;
import H0.AbstractC0156k;
import H0.InterfaceC0155j;
import h0.AbstractC1040q;
import m4.AbstractC1276k;
import t.C1682j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1452p0 extends AbstractC0141b0 {
    public final C1682j a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1455r0 f13763b;

    public C1452p0(C1682j c1682j, InterfaceC1455r0 interfaceC1455r0) {
        this.a = c1682j;
        this.f13763b = interfaceC1455r0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [H0.k, h0.q, p.q0] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        InterfaceC0155j a = this.f13763b.a(this.a);
        ?? abstractC0156k = new AbstractC0156k();
        abstractC0156k.f13765t = a;
        abstractC0156k.M0(a);
        return abstractC0156k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1452p0)) {
            return false;
        }
        C1452p0 c1452p0 = (C1452p0) obj;
        return AbstractC1276k.b(this.a, c1452p0.a) && AbstractC1276k.b(this.f13763b, c1452p0.f13763b);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        C1454q0 c1454q0 = (C1454q0) abstractC1040q;
        InterfaceC0155j a = this.f13763b.a(this.a);
        c1454q0.N0(c1454q0.f13765t);
        c1454q0.f13765t = a;
        c1454q0.M0(a);
    }

    public final int hashCode() {
        return this.f13763b.hashCode() + (this.a.hashCode() * 31);
    }
}
