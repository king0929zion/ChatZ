package T2;

import j1.AbstractC1135a;
import m4.AbstractC1276k;
import o4.AbstractC1410a;

/* renamed from: T2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0655k extends AbstractC1410a {

    /* renamed from: e, reason: collision with root package name */
    public final String f8456e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8457f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8458g;

    public C0655k(String str, int i6, String str2) {
        AbstractC1276k.f(str, "tagName");
        this.f8456e = str;
        this.f8457f = str2;
        this.f8458g = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0655k)) {
            return false;
        }
        C0655k c0655k = (C0655k) obj;
        return AbstractC1276k.b(this.f8456e, c0655k.f8456e) && AbstractC1276k.b(this.f8457f, c0655k.f8457f) && this.f8458g == c0655k.f8458g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8458g) + B3.e.e(this.f8456e.hashCode() * 31, 31, this.f8457f);
    }

    public final String toString() {
        return AbstractC1135a.i(B3.e.u("InHtmlBlock(tagName=", this.f8456e, ", attributes=", this.f8457f, ", depth="), this.f8458g, ")");
    }
}
