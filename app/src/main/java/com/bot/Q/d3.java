package Q;

import h0.C1026c;
import h0.C1031h;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class d3 {
    public final C1031h a;

    /* renamed from: b, reason: collision with root package name */
    public final C1031h f5770b;

    public d3() {
        C1031h c1031h = C1026c.f11798p;
        this.a = c1031h;
        this.f5770b = c1031h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        d3Var.getClass();
        return AbstractC1276k.b(this.a, d3Var.a) && AbstractC1276k.b(this.f5770b, d3Var.f5770b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f5770b.a) + AbstractC1135a.a(this.a.a, Boolean.hashCode(false) * 31, 31);
    }

    public final String toString() {
        return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.a + ", expandedAlignment=" + this.f5770b + ')';
    }
}
