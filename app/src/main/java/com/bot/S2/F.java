package S2;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class F extends X {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final C0584p f7691b;

    public F(String str, C0584p c0584p) {
        AbstractC1276k.f(str, "content");
        this.a = str;
        this.f7691b = c0584p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f6 = (F) obj;
        return AbstractC1276k.b(this.a, f6.a) && AbstractC1276k.b(this.f7691b, f6.f7691b);
    }

    public final int hashCode() {
        return this.f7691b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HtmlBlock(content=" + this.a + ", style=" + this.f7691b + ")";
    }
}
