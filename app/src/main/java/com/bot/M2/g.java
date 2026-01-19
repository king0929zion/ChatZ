package M2;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class g {
    public final f a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3286b;

    public g(f fVar, String str) {
        AbstractC1276k.f(fVar, "type");
        AbstractC1276k.f(str, "content");
        this.a = fVar;
        this.f3286b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && AbstractC1276k.b(this.f3286b, gVar.f3286b);
    }

    public final int hashCode() {
        return this.f3286b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ThinkTagSegment(type=" + this.a + ", content=" + this.f3286b + ")";
    }
}
