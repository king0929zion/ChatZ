package T2;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class V extends s4.j {

    /* renamed from: c, reason: collision with root package name */
    public final String f8420c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8421d;

    public V(String str, String str2) {
        this.f8420c = str;
        this.f8421d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v5 = (V) obj;
        return AbstractC1276k.b(this.f8420c, v5.f8420c) && AbstractC1276k.b(this.f8421d, v5.f8421d);
    }

    public final int hashCode() {
        return this.f8421d.hashCode() + (this.f8420c.hashCode() * 31);
    }

    public final String toString() {
        return B3.e.o("InHtmlSpan(tagName=", this.f8420c, ", attributes=", this.f8421d, ")");
    }
}
