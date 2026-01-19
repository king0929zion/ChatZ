package S2;

import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class O extends X {
    public final String a;

    public O(String str) {
        AbstractC1276k.f(str, "formula");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof O) && AbstractC1276k.b(this.a, ((O) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1135a.s("MathBlock(formula=", this.a, ")");
    }
}
