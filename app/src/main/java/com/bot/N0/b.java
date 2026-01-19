package N0;

import android.content.res.Resources;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class b {
    public final Resources.Theme a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3639b;

    public b(Resources.Theme theme, int i6) {
        this.a = theme;
        this.f3639b = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC1276k.b(this.a, bVar.a) && this.f3639b == bVar.f3639b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3639b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.a);
        sb.append(", id=");
        return B3.e.q(sb, this.f3639b, ')');
    }
}
