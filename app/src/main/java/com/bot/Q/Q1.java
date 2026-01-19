package Q;

import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class Q1 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final P.b f5492b;

    public Q1(P.b bVar, int i6) {
        long j3 = o0.s.f13481h;
        bVar = (i6 & 2) != 0 ? null : bVar;
        this.a = j3;
        this.f5492b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q1)) {
            return false;
        }
        Q1 q12 = (Q1) obj;
        return o0.s.d(this.a, q12.a) && AbstractC1276k.b(this.f5492b, q12.f5492b);
    }

    public final int hashCode() {
        int i6 = o0.s.f13482i;
        int hashCode = Long.hashCode(this.a) * 31;
        P.b bVar = this.f5492b;
        return hashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleConfiguration(color=");
        AbstractC1135a.p(this.a, sb, ", rippleAlpha=");
        sb.append(this.f5492b);
        sb.append(')');
        return sb.toString();
    }
}
