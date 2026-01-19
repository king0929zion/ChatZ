package S0;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0540b {
    public final String a;

    public Q(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Q) {
            return AbstractC1276k.b(this.a, ((Q) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return B3.e.r(new StringBuilder("UrlAnnotation(url="), this.a, ')');
    }
}
