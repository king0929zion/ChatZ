package v;

import h0.C1032i;
import m4.AbstractC1276k;

/* renamed from: v.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1816w extends AbstractC1787b {

    /* renamed from: h, reason: collision with root package name */
    public final C1032i f15362h;

    public C1816w(C1032i c1032i) {
        this.f15362h = c1032i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1816w) && AbstractC1276k.b(this.f15362h, ((C1816w) obj).f15362h);
    }

    public final int hashCode() {
        return Float.hashCode(this.f15362h.a);
    }

    @Override // v.AbstractC1787b
    public final int i(int i6, e1.m mVar, F0.k0 k0Var) {
        return this.f15362h.a(k0Var.f1486e, i6);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.f15362h + ')';
    }
}
