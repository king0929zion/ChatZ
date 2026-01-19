package S2;

import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* renamed from: S2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0593z extends X {
    public final String a;

    public C0593z(String str) {
        AbstractC1276k.f(str, "content");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0593z) && AbstractC1276k.b(this.a, ((C0593z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1135a.s("Blockquote(content=", this.a, ")");
    }
}
