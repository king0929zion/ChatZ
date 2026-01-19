package S2;

import j1.AbstractC1135a;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class U extends X {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7725b;

    /* renamed from: c, reason: collision with root package name */
    public final List f7726c;

    public U(List list, List list2, List list3) {
        AbstractC1276k.f(list, "headers");
        AbstractC1276k.f(list3, "alignments");
        this.a = list;
        this.f7725b = list2;
        this.f7726c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u5 = (U) obj;
        return AbstractC1276k.b(this.a, u5.a) && AbstractC1276k.b(this.f7725b, u5.f7725b) && AbstractC1276k.b(this.f7726c, u5.f7726c);
    }

    public final int hashCode() {
        return this.f7726c.hashCode() + AbstractC1135a.e(this.f7725b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Table(headers=" + this.a + ", rows=" + this.f7725b + ", alignments=" + this.f7726c + ")";
    }
}
