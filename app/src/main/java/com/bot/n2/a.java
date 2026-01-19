package N2;

import com.vladsch.flexmark.util.html.Attribute;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class a {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3805b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3806c;

    public a(String str, String str2, List list) {
        AbstractC1276k.f(str, Attribute.TITLE_ATTR);
        AbstractC1276k.f(str2, "content");
        this.a = str;
        this.f3805b = str2;
        this.f3806c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC1276k.b(this.a, aVar.a) && AbstractC1276k.b(this.f3805b, aVar.f3805b) && AbstractC1276k.b(this.f3806c, aVar.f3806c);
    }

    public final int hashCode() {
        return this.f3806c.hashCode() + B3.e.e(this.a.hashCode() * 31, 31, this.f3805b);
    }

    public final String toString() {
        StringBuilder u5 = B3.e.u("WebFetchResult(title=", this.a, ", content=", this.f3805b, ", links=");
        u5.append(this.f3806c);
        u5.append(")");
        return u5.toString();
    }
}
