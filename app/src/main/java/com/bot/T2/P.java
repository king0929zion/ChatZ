package T2;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class P extends s4.j {

    /* renamed from: c, reason: collision with root package name */
    public final String f8413c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8414d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8415e;

    public P(String str, String str2, String str3) {
        this.f8413c = str;
        this.f8414d = str2;
        this.f8415e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p5 = (P) obj;
        return AbstractC1276k.b(this.f8413c, p5.f8413c) && AbstractC1276k.b(this.f8414d, p5.f8414d) && AbstractC1276k.b(this.f8415e, p5.f8415e);
    }

    public final int hashCode() {
        return this.f8415e.hashCode() + B3.e.e(this.f8413c.hashCode() * 31, 31, this.f8414d);
    }

    public final String toString() {
        return B3.e.s(B3.e.u("HtmlClosingTag(tagName=", this.f8413c, ", attributes=", this.f8414d, ", content="), this.f8415e, ")");
    }
}
