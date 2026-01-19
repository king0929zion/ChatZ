package n;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class K0 {
    public final AbstractC1343r a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1349x f13014b;

    public K0(AbstractC1343r abstractC1343r, InterfaceC1349x interfaceC1349x) {
        this.a = abstractC1343r;
        this.f13014b = interfaceC1349x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        K0 k02 = (K0) obj;
        return AbstractC1276k.b(this.a, k02.a) && AbstractC1276k.b(this.f13014b, k02.f13014b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f13014b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.f13014b + ", arcMode=ArcMode(value=0))";
    }
}
