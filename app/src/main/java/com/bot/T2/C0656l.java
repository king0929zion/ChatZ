package T2;

import j1.AbstractC1135a;
import m4.AbstractC1276k;
import o4.AbstractC1410a;

/* renamed from: T2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0656l extends AbstractC1410a {

    /* renamed from: e, reason: collision with root package name */
    public final String f8461e;

    public C0656l(String str) {
        AbstractC1276k.f(str, "tagName");
        this.f8461e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0656l) && AbstractC1276k.b(this.f8461e, ((C0656l) obj).f8461e);
    }

    public final int hashCode() {
        return this.f8461e.hashCode();
    }

    public final String toString() {
        return AbstractC1135a.s("InHtmlTagAttributes(tagName=", this.f8461e, ")");
    }
}
