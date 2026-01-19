package m;

import j1.AbstractC1135a;
import m4.AbstractC1276k;
import n.InterfaceC1351z;

/* renamed from: m.Y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1217Y {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12767b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1351z f12768c;

    public C1217Y(float f6, long j3, InterfaceC1351z interfaceC1351z) {
        this.a = f6;
        this.f12767b = j3;
        this.f12768c = interfaceC1351z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1217Y)) {
            return false;
        }
        C1217Y c1217y = (C1217Y) obj;
        return Float.compare(this.a, c1217y.a) == 0 && o0.O.a(this.f12767b, c1217y.f12767b) && AbstractC1276k.b(this.f12768c, c1217y.f12768c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.a) * 31;
        int i6 = o0.O.f13455c;
        return this.f12768c.hashCode() + AbstractC1135a.c(hashCode, 31, this.f12767b);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + ((Object) o0.O.d(this.f12767b)) + ", animationSpec=" + this.f12768c + ')';
    }
}
