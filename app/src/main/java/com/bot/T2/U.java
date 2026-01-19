package T2;

import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class U extends s4.j {

    /* renamed from: c, reason: collision with root package name */
    public final String f8419c;

    public U(String str) {
        this.f8419c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof U) && AbstractC1276k.b(this.f8419c, ((U) obj).f8419c);
    }

    public final int hashCode() {
        return this.f8419c.hashCode();
    }

    public final String toString() {
        return AbstractC1135a.s("InHtmlAttributes(tagName=", this.f8419c, ")");
    }
}
