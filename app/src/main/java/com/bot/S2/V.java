package S2;

import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class V extends X {
    public final String a;

    public V(String str) {
        AbstractC1276k.f(str, "content");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof V) && AbstractC1276k.b(this.a, ((V) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1135a.s("Text(content=", this.a, ")");
    }
}
