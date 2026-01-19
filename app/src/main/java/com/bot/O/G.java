package O;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class G {
    public final F a;

    /* renamed from: b, reason: collision with root package name */
    public final F f3945b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3946c;

    public G(F f6, F f7, boolean z5) {
        this.a = f6;
        this.f3945b = f7;
        this.f3946c = z5;
    }

    public static G a(G g3, F f6, F f7, boolean z5, int i6) {
        if ((i6 & 1) != 0) {
            f6 = g3.a;
        }
        if ((i6 & 2) != 0) {
            f7 = g3.f3945b;
        }
        if ((i6 & 4) != 0) {
            z5 = g3.f3946c;
        }
        g3.getClass();
        return new G(f6, f7, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g3 = (G) obj;
        return AbstractC1276k.b(this.a, g3.a) && AbstractC1276k.b(this.f3945b, g3.f3945b) && this.f3946c == g3.f3946c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3946c) + ((this.f3945b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.a + ", end=" + this.f3945b + ", handlesCrossed=" + this.f3946c + ')';
    }
}
