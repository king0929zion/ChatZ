package q0;

import e1.InterfaceC0961c;
import e1.m;
import m4.AbstractC1276k;
import n0.C1356e;
import o0.q;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1495a {
    public InterfaceC0961c a;

    /* renamed from: b, reason: collision with root package name */
    public m f13940b;

    /* renamed from: c, reason: collision with root package name */
    public q f13941c;

    /* renamed from: d, reason: collision with root package name */
    public long f13942d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1495a)) {
            return false;
        }
        C1495a c1495a = (C1495a) obj;
        return AbstractC1276k.b(this.a, c1495a.a) && this.f13940b == c1495a.f13940b && AbstractC1276k.b(this.f13941c, c1495a.f13941c) && C1356e.a(this.f13942d, c1495a.f13942d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f13942d) + ((this.f13941c.hashCode() + ((this.f13940b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.f13940b + ", canvas=" + this.f13941c + ", size=" + ((Object) C1356e.f(this.f13942d)) + ')';
    }
}
