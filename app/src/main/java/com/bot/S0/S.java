package S0;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class S implements InterfaceC0540b {
    public final String a;

    public S(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof S) {
            return AbstractC1276k.b(this.a, ((S) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return B3.e.r(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.a, ')');
    }
}
