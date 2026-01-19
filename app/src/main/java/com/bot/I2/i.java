package I2;

import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class i extends m {
    public final String a;

    public i(String str) {
        AbstractC1276k.f(str, "message");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && AbstractC1276k.b(this.a, ((i) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1135a.s("Error(message=", this.a, ")");
    }
}
