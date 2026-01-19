package N3;

import java.util.Locale;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class i {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3864b;

    public i(String str) {
        AbstractC1276k.f(str, "content");
        this.a = str;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC1276k.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        this.f3864b = lowerCase.hashCode();
    }

    public final boolean equals(Object obj) {
        String str;
        i iVar = obj instanceof i ? (i) obj : null;
        return (iVar == null || (str = iVar.a) == null || !str.equalsIgnoreCase(this.a)) ? false : true;
    }

    public final int hashCode() {
        return this.f3864b;
    }

    public final String toString() {
        return this.a;
    }
}
