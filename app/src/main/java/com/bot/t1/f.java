package T1;

import com.vladsch.flexmark.util.html.Attribute;
import java.util.Locale;
import m4.AbstractC1276k;
import u4.AbstractC1776n;
import u4.o;

/* loaded from: classes.dex */
public final class f {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8353b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8354c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8355d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8356e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8357f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8358g;

    public f(String str, String str2, boolean z5, int i6, String str3, int i7) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        AbstractC1276k.f(str2, "type");
        this.a = str;
        this.f8353b = str2;
        this.f8354c = z5;
        this.f8355d = i6;
        this.f8356e = str3;
        this.f8357f = i7;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        AbstractC1276k.e(upperCase, "toUpperCase(...)");
        this.f8358g = AbstractC1776n.G(upperCase, "INT", false) ? 3 : (AbstractC1776n.G(upperCase, "CHAR", false) || AbstractC1776n.G(upperCase, "CLOB", false) || AbstractC1776n.G(upperCase, "TEXT", false)) ? 2 : AbstractC1776n.G(upperCase, "BLOB", false) ? 5 : (AbstractC1776n.G(upperCase, "REAL", false) || AbstractC1776n.G(upperCase, "FLOA", false) || AbstractC1776n.G(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                boolean z5 = this.f8355d > 0;
                f fVar = (f) obj;
                boolean z6 = fVar.f8355d > 0;
                int i6 = fVar.f8357f;
                if (z5 == z6 && AbstractC1276k.b(this.a, fVar.a) && this.f8354c == fVar.f8354c) {
                    String str = fVar.f8356e;
                    int i7 = this.f8357f;
                    String str2 = this.f8356e;
                    if ((i7 != 1 || i6 != 2 || str2 == null || h5.e.R(str2, str)) && ((i7 != 2 || i6 != 1 || str == null || h5.e.R(str, str2)) && ((i7 == 0 || i7 != i6 || (str2 == null ? str == null : h5.e.R(str2, str))) && this.f8358g == fVar.f8358g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.f8358g) * 31) + (this.f8354c ? 1231 : 1237)) * 31) + this.f8355d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.f8353b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.f8358g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.f8354c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.f8355d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.f8356e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return o.p(o.r(sb.toString()));
    }
}
