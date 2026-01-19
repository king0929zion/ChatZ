package p;

import j1.AbstractC1135a;
import m4.AbstractC1276k;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final class D0 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final v.k0 f13573b;

    public D0() {
        long d6 = o0.y.d(4284900966L);
        v.k0 e6 = AbstractC1787b.e(S.l.f7374V, 3);
        this.a = d6;
        this.f13573b = e6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!D0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC1276k.d(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        D0 d02 = (D0) obj;
        return o0.s.d(this.a, d02.a) && AbstractC1276k.b(this.f13573b, d02.f13573b);
    }

    public final int hashCode() {
        int i6 = o0.s.f13482i;
        return this.f13573b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        AbstractC1135a.p(this.a, sb, ", drawPadding=");
        sb.append(this.f13573b);
        sb.append(')');
        return sb.toString();
    }
}
