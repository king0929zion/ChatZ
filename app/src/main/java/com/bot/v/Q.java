package v;

import e1.InterfaceC0961c;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class Q implements InterfaceC1802i0 {
    public final F0 a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0961c f15266b;

    public Q(F0 f02, InterfaceC0961c interfaceC0961c) {
        this.a = f02;
        this.f15266b = interfaceC0961c;
    }

    @Override // v.InterfaceC1802i0
    public final float a() {
        F0 f02 = this.a;
        InterfaceC0961c interfaceC0961c = this.f15266b;
        return interfaceC0961c.T(f02.a(interfaceC0961c));
    }

    @Override // v.InterfaceC1802i0
    public final float b(e1.m mVar) {
        F0 f02 = this.a;
        InterfaceC0961c interfaceC0961c = this.f15266b;
        return interfaceC0961c.T(f02.c(interfaceC0961c, mVar));
    }

    @Override // v.InterfaceC1802i0
    public final float c() {
        F0 f02 = this.a;
        InterfaceC0961c interfaceC0961c = this.f15266b;
        return interfaceC0961c.T(f02.d(interfaceC0961c));
    }

    @Override // v.InterfaceC1802i0
    public final float d(e1.m mVar) {
        F0 f02 = this.a;
        InterfaceC0961c interfaceC0961c = this.f15266b;
        return interfaceC0961c.T(f02.b(interfaceC0961c, mVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q3 = (Q) obj;
        return AbstractC1276k.b(this.a, q3.a) && AbstractC1276k.b(this.f15266b, q3.f15266b);
    }

    public final int hashCode() {
        return this.f15266b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.f15266b + ')';
    }
}
