package N2;

import com.vladsch.flexmark.util.html.Attribute;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class j {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3830b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3831c;

    public j(String str, String str2, String str3) {
        AbstractC1276k.f(str, Attribute.TITLE_ATTR);
        AbstractC1276k.f(str2, "url");
        AbstractC1276k.f(str3, "content");
        this.a = str;
        this.f3830b = str2;
        this.f3831c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return AbstractC1276k.b(this.a, jVar.a) && AbstractC1276k.b(this.f3830b, jVar.f3830b) && AbstractC1276k.b(this.f3831c, jVar.f3831c);
    }

    public final int hashCode() {
        return this.f3831c.hashCode() + B3.e.e(this.a.hashCode() * 31, 31, this.f3830b);
    }

    public final String toString() {
        return B3.e.s(B3.e.u("SearchResultItem(title=", this.a, ", url=", this.f3830b, ", content="), this.f3831c, ")");
    }
}
