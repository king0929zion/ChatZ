package v;

import h0.C1031h;
import h0.InterfaceC1027d;
import m4.AbstractC1276k;

/* renamed from: v.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1815v extends AbstractC1787b {

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1027d f15361h;

    public C1815v(C1031h c1031h) {
        this.f15361h = c1031h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1815v) && AbstractC1276k.b(this.f15361h, ((C1815v) obj).f15361h);
    }

    public final int hashCode() {
        return this.f15361h.hashCode();
    }

    @Override // v.AbstractC1787b
    public final int i(int i6, e1.m mVar, F0.k0 k0Var) {
        return this.f15361h.a(k0Var.f1485c, i6, mVar);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f15361h + ')';
    }
}
