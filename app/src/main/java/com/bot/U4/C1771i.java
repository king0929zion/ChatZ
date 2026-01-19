package u4;

import m4.AbstractC1276k;

/* renamed from: u4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1771i {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final r4.g f15188b;

    public C1771i(String str, r4.g gVar) {
        this.a = str;
        this.f15188b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1771i)) {
            return false;
        }
        C1771i c1771i = (C1771i) obj;
        return AbstractC1276k.b(this.a, c1771i.a) && AbstractC1276k.b(this.f15188b, c1771i.f15188b);
    }

    public final int hashCode() {
        return this.f15188b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.f15188b + ')';
    }
}
