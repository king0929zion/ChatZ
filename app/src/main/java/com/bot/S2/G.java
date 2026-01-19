package S2;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class G extends X {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final C0574i0 f7700b;

    public G(String str, C0574i0 c0574i0) {
        AbstractC1276k.f(str, "text");
        this.a = str;
        this.f7700b = c0574i0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g3 = (G) obj;
        return AbstractC1276k.b(this.a, g3.a) && AbstractC1276k.b(this.f7700b, g3.f7700b);
    }

    public final int hashCode() {
        return this.f7700b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HtmlSpan(text=" + this.a + ", style=" + this.f7700b + ")";
    }
}
