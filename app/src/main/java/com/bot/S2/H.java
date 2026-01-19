package S2;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class H extends X {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7702b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7703c;

    public H(String str, String str2, String str3) {
        AbstractC1276k.f(str, "altText");
        AbstractC1276k.f(str2, "url");
        this.a = str;
        this.f7702b = str2;
        this.f7703c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h3 = (H) obj;
        return AbstractC1276k.b(this.a, h3.a) && AbstractC1276k.b(this.f7702b, h3.f7702b) && AbstractC1276k.b(this.f7703c, h3.f7703c);
    }

    public final int hashCode() {
        int e6 = B3.e.e(this.a.hashCode() * 31, 31, this.f7702b);
        String str = this.f7703c;
        return e6 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return B3.e.s(B3.e.u("Image(altText=", this.a, ", url=", this.f7702b, ", title="), this.f7703c, ")");
    }
}
