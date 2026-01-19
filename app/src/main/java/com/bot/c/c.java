package C;

import S.l;
import e1.InterfaceC0961c;
import n0.C1356e;
import u.AbstractC1734b;

/* loaded from: classes.dex */
public final class c implements a {
    public final float a;

    public c(float f6) {
        this.a = f6;
        if (f6 < l.f7374V || f6 > 100.0f) {
            AbstractC1734b.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // C.a
    public final float a(long j3, InterfaceC0961c interfaceC0961c) {
        return (this.a / 100.0f) * C1356e.c(j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.a, ((c) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
