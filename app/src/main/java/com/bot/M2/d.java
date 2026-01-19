package M2;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class d {
    public final f a;

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f3281b;

    public d(f fVar, StringBuilder sb) {
        this.a = fVar;
        this.f3281b = sb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && AbstractC1276k.b(this.f3281b, dVar.f3281b);
    }

    public final int hashCode() {
        return this.f3281b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StreamBlock(type=" + this.a + ", content=" + ((Object) this.f3281b) + ")";
    }
}
