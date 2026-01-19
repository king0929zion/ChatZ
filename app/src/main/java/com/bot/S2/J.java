package S2;

import S0.C0545g;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class J extends X {
    public final C0545g a;

    public J(C0545g c0545g) {
        this.a = c0545g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J) && AbstractC1276k.b(this.a, ((J) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InlineContent(annotatedString=" + ((Object) this.a) + ")";
    }
}
