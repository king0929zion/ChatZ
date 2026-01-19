package S2;

import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class P extends X {
    public final List a;

    public P(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof P) && AbstractC1276k.b(this.a, ((P) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OrderedList(items=" + this.a + ")";
    }
}
