package S2;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class N extends X {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7724b;

    public N(String str, String str2) {
        AbstractC1276k.f(str, "text");
        AbstractC1276k.f(str2, "url");
        this.a = str;
        this.f7724b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n3 = (N) obj;
        return AbstractC1276k.b(this.a, n3.a) && AbstractC1276k.b(this.f7724b, n3.f7724b);
    }

    public final int hashCode() {
        return this.f7724b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return B3.e.o("Link(text=", this.a, ", url=", this.f7724b, ")");
    }
}
