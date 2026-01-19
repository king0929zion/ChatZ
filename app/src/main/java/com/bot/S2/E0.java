package S2;

import java.util.Set;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class E0 {
    public final Set a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f7689b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7690c;

    public E0(Set set, Set set2, boolean z5) {
        this.a = set;
        this.f7689b = set2;
        this.f7690c = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        return AbstractC1276k.b(this.a, e02.a) && AbstractC1276k.b(this.f7689b, e02.f7689b) && this.f7690c == e02.f7690c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7690c) + ((this.f7689b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LanguageConfig(keywords=" + this.a + ", types=" + this.f7689b + ", ignoreCase=" + this.f7690c + ")";
    }
}
