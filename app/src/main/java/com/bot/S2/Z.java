package S2;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class Z {
    public final Float a;

    /* renamed from: b, reason: collision with root package name */
    public final o0.s f7728b;

    public Z(Float f6, o0.s sVar) {
        this.a = f6;
        this.f7728b = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z5 = (Z) obj;
        return AbstractC1276k.b(this.a, z5.a) && AbstractC1276k.b(this.f7728b, z5.f7728b);
    }

    public final int hashCode() {
        Float f6 = this.a;
        int hashCode = (f6 == null ? 0 : f6.hashCode()) * 31;
        o0.s sVar = this.f7728b;
        return hashCode + (sVar != null ? Long.hashCode(sVar.a) : 0);
    }

    public final String toString() {
        return "BorderSpec(widthDp=" + this.a + ", color=" + this.f7728b + ")";
    }
}
