package v;

import e1.InterfaceC0961c;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class x0 implements F0 {
    public final F0 a;

    /* renamed from: b, reason: collision with root package name */
    public final F0 f15369b;

    public x0(F0 f02, F0 f03) {
        this.a = f02;
        this.f15369b = f03;
    }

    @Override // v.F0
    public final int a(InterfaceC0961c interfaceC0961c) {
        return Math.max(this.a.a(interfaceC0961c), this.f15369b.a(interfaceC0961c));
    }

    @Override // v.F0
    public final int b(InterfaceC0961c interfaceC0961c, e1.m mVar) {
        return Math.max(this.a.b(interfaceC0961c, mVar), this.f15369b.b(interfaceC0961c, mVar));
    }

    @Override // v.F0
    public final int c(InterfaceC0961c interfaceC0961c, e1.m mVar) {
        return Math.max(this.a.c(interfaceC0961c, mVar), this.f15369b.c(interfaceC0961c, mVar));
    }

    @Override // v.F0
    public final int d(InterfaceC0961c interfaceC0961c) {
        return Math.max(this.a.d(interfaceC0961c), this.f15369b.d(interfaceC0961c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return AbstractC1276k.b(x0Var.a, this.a) && AbstractC1276k.b(x0Var.f15369b, this.f15369b);
    }

    public final int hashCode() {
        return (this.f15369b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.f15369b + ')';
    }
}
