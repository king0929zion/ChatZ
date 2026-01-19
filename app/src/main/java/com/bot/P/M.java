package p;

import H0.AbstractC0141b0;
import H0.AbstractC0157l;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import t.C1682j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class M extends AbstractC0141b0 {
    public final C1682j a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13599b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13600c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1193a f13601d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1193a f13602e;

    public M(InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, C1682j c1682j, boolean z5, boolean z6) {
        this.a = c1682j;
        this.f13599b = z5;
        this.f13600c = z6;
        this.f13601d = interfaceC1193a;
        this.f13602e = interfaceC1193a2;
    }

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new S(this.f13601d, this.f13602e, this.a, this.f13599b, this.f13600c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || M.class != obj.getClass()) {
            return false;
        }
        M m3 = (M) obj;
        return AbstractC1276k.b(this.a, m3.a) && this.f13599b == m3.f13599b && this.f13600c == m3.f13600c && this.f13601d == m3.f13601d && this.f13602e == m3.f13602e;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        B0.X x5;
        S s5 = (S) abstractC1040q;
        s5.f13646Q = true;
        boolean z5 = false;
        boolean z6 = s5.f13645P == null;
        InterfaceC1193a interfaceC1193a = this.f13602e;
        if (z6 != (interfaceC1193a == null)) {
            s5.S0();
            AbstractC0157l.m(s5);
            z5 = true;
        }
        s5.f13645P = interfaceC1193a;
        boolean z7 = s5.f13786y;
        boolean z8 = this.f13600c;
        boolean z9 = z7 == z8 ? z5 : true;
        s5.a1(this.a, null, this.f13599b, z8, null, null, this.f13601d);
        if (!z9 || (x5 = s5.f13769C) == null) {
            return;
        }
        x5.O0();
    }

    public final int hashCode() {
        C1682j c1682j = this.a;
        int hashCode = (this.f13601d.hashCode() + AbstractC1135a.d(AbstractC1135a.d((c1682j != null ? c1682j.hashCode() : 0) * 961, 31, this.f13599b), 29791, this.f13600c)) * 961;
        InterfaceC1193a interfaceC1193a = this.f13602e;
        return Boolean.hashCode(true) + ((hashCode + (interfaceC1193a != null ? interfaceC1193a.hashCode() : 0)) * 961);
    }
}
