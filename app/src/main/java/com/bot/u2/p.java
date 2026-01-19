package U2;

import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class p {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8660b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8661c;

    public p(String str, String str2, Z3.b bVar) {
        AbstractC1276k.f(bVar, "links");
        this.a = str;
        this.f8660b = str2;
        this.f8661c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return AbstractC1276k.b(this.a, pVar.a) && AbstractC1276k.b(this.f8660b, pVar.f8660b) && AbstractC1276k.b(this.f8661c, pVar.f8661c);
    }

    public final int hashCode() {
        return this.f8661c.hashCode() + B3.e.e(this.a.hashCode() * 31, 31, this.f8660b);
    }

    public final String toString() {
        StringBuilder u5 = B3.e.u("WebFetchResult(title=", this.a, ", content=", this.f8660b, ", links=");
        u5.append(this.f8661c);
        u5.append(")");
        return u5.toString();
    }
}
