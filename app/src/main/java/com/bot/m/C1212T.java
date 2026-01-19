package m;

import m4.AbstractC1276k;
import n.InterfaceC1351z;

/* renamed from: m.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1212T {
    public final InterfaceC1351z a;

    public C1212T(InterfaceC1351z interfaceC1351z) {
        this.a = interfaceC1351z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1212T)) {
            return false;
        }
        C1212T c1212t = (C1212T) obj;
        c1212t.getClass();
        return Float.compare(S.l.f7374V, S.l.f7374V) == 0 && AbstractC1276k.b(this.a, c1212t.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Float.hashCode(S.l.f7374V) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.a + ')';
    }
}
