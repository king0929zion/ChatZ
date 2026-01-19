package F3;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class d {
    public final R3.a a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1587b;

    public d(R3.a aVar, Object obj) {
        AbstractC1276k.f(aVar, "expectedType");
        AbstractC1276k.f(obj, "response");
        this.a = aVar;
        this.f1587b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC1276k.b(this.a, dVar.a) && AbstractC1276k.b(this.f1587b, dVar.f1587b);
    }

    public final int hashCode() {
        return this.f1587b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HttpResponseContainer(expectedType=" + this.a + ", response=" + this.f1587b + ')';
    }
}
