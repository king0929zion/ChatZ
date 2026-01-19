package S2;

import m4.AbstractC1276k;
import n.C1316c;

/* renamed from: S2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0559b {
    public final C1316c a;

    /* renamed from: b, reason: collision with root package name */
    public final C1316c f7737b;

    public C0559b(C1316c c1316c, C1316c c1316c2) {
        AbstractC1276k.f(c1316c, "alpha");
        AbstractC1276k.f(c1316c2, "offset");
        this.a = c1316c;
        this.f7737b = c1316c2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0559b)) {
            return false;
        }
        C0559b c0559b = (C0559b) obj;
        return AbstractC1276k.b(this.a, c0559b.a) && AbstractC1276k.b(this.f7737b, c0559b.f7737b);
    }

    public final int hashCode() {
        return this.f7737b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ClusterAnimation(alpha=" + this.a + ", offset=" + this.f7737b + ")";
    }
}
