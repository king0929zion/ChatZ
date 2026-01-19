package N0;

import m4.AbstractC1276k;
import u0.C1746g;

/* loaded from: classes.dex */
public final class a {
    public final C1746g a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3638b;

    public a(C1746g c1746g, int i6) {
        this.a = c1746g;
        this.f3638b = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC1276k.b(this.a, aVar.a) && this.f3638b == aVar.f3638b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3638b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.a);
        sb.append(", configFlags=");
        return B3.e.q(sb, this.f3638b, ')');
    }
}
