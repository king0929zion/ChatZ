package S2;

import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class W extends X {
    public final List a;

    public W(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof W) && AbstractC1276k.b(this.a, ((W) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UnorderedList(items=" + this.a + ")";
    }
}
