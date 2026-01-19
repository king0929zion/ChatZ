package S2;

import m4.AbstractC1276k;

/* renamed from: S2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0561c {
    public final S0.L a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7740b;

    public C0561c(S0.L l3, float f6) {
        this.a = l3;
        this.f7740b = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0561c)) {
            return false;
        }
        C0561c c0561c = (C0561c) obj;
        return AbstractC1276k.b(this.a, c0561c.a) && Float.compare(this.f7740b, c0561c.f7740b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7740b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ClusterDrawLayout(layout=" + this.a + ", baseline=" + this.f7740b + ")";
    }
}
