package r4;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class c extends AbstractC1635a {
    static {
        new AbstractC1635a((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        char c6 = this.f14671c;
        char c7 = this.f14672e;
        if (AbstractC1276k.g(c6, c7) > 0) {
            c cVar = (c) obj;
            if (AbstractC1276k.g(cVar.f14671c, cVar.f14672e) > 0) {
                return true;
            }
        }
        c cVar2 = (c) obj;
        return c6 == cVar2.f14671c && c7 == cVar2.f14672e;
    }

    public final int hashCode() {
        char c6 = this.f14671c;
        char c7 = this.f14672e;
        if (AbstractC1276k.g(c6, c7) > 0) {
            return -1;
        }
        return (c6 * 31) + c7;
    }

    public final String toString() {
        return this.f14671c + ".." + this.f14672e;
    }
}
