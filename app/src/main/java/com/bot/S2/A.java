package S2;

import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class A extends X {
    public final String a;

    public A(String str) {
        AbstractC1276k.f(str, "text");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A) && AbstractC1276k.b(this.a, ((A) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1135a.s("BoldText(text=", this.a, ")");
    }
}
