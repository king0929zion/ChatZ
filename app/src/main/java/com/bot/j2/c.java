package j2;

import m4.AbstractC1276k;
import t0.AbstractC1688b;

/* loaded from: classes.dex */
public final class c extends e {
    public final AbstractC1688b a;

    public c(AbstractC1688b abstractC1688b) {
        this.a = abstractC1688b;
    }

    @Override // j2.e
    public final AbstractC1688b a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && AbstractC1276k.b(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        AbstractC1688b abstractC1688b = this.a;
        if (abstractC1688b == null) {
            return 0;
        }
        return abstractC1688b.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.a + ')';
    }
}
