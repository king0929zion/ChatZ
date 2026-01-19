package S0;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class I implements InterfaceC0540b {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof I) {
            return AbstractC1276k.b(this.a, ((I) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return B3.e.g(')', "StringAnnotation(value=", this.a);
    }
}
