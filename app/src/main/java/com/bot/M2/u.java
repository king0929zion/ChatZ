package M2;

import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class u extends y {
    public final String a;

    public u(String str) {
        AbstractC1276k.f(str, "conversationId");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && AbstractC1276k.b(this.a, ((u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1135a.s("Completed(conversationId=", this.a, ")");
    }
}
