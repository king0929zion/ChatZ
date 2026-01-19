package S2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class K extends X {
    public final ArrayList a;

    public K(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K) && this.a.equals(((K) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InlineGroup(elements=" + this.a + ")";
    }
}
