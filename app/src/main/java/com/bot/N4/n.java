package N4;

import O4.y;
import java.io.Serializable;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class n extends kotlinx.serialization.json.d {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3908c;

    /* renamed from: e, reason: collision with root package name */
    public final String f3909e;

    public n(Serializable serializable, boolean z5) {
        AbstractC1276k.f(serializable, "body");
        this.f3908c = z5;
        this.f3909e = serializable.toString();
    }

    @Override // kotlinx.serialization.json.d
    public final String a() {
        return this.f3909e;
    }

    @Override // kotlinx.serialization.json.d
    public final boolean b() {
        return this.f3908c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f3908c == nVar.f3908c && AbstractC1276k.b(this.f3909e, nVar.f3909e);
    }

    public final int hashCode() {
        return this.f3909e.hashCode() + (Boolean.hashCode(this.f3908c) * 31);
    }

    @Override // kotlinx.serialization.json.d
    public final String toString() {
        boolean z5 = this.f3908c;
        String str = this.f3909e;
        if (!z5) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        y.a(str, sb);
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }
}
