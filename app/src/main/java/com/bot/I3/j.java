package I3;

import com.vladsch.flexmark.util.html.Attribute;
import java.util.Locale;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class j {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2748b;

    public j(String str, String str2) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        AbstractC1276k.f(str2, "value");
        this.a = str;
        this.f2748b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return u4.u.x(jVar.a, this.a, true) && u4.u.x(jVar.f2748b, this.f2748b, true);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.a.toLowerCase(locale);
        AbstractC1276k.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.f2748b.toLowerCase(locale);
        AbstractC1276k.e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase2.hashCode() + (hashCode * 31) + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderValueParam(name=");
        sb.append(this.a);
        sb.append(", value=");
        return B3.e.s(sb, this.f2748b, ", escapeValue=false)");
    }
}
