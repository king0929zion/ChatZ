package T2;

import m4.AbstractC1276k;
import o4.AbstractC1410a;

/* renamed from: T2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0667x extends AbstractC1410a {

    /* renamed from: e, reason: collision with root package name */
    public final int f8488e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8489f;

    public C0667x(int i6, String str) {
        AbstractC1276k.f(str, "numberStr");
        this.f8488e = i6;
        this.f8489f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0667x)) {
            return false;
        }
        C0667x c0667x = (C0667x) obj;
        return this.f8488e == c0667x.f8488e && AbstractC1276k.b(this.f8489f, c0667x.f8489f);
    }

    public final int hashCode() {
        return this.f8489f.hashCode() + (Integer.hashCode(this.f8488e) * 31);
    }

    public final String toString() {
        return "OrderedListNumber(indent=" + this.f8488e + ", numberStr=" + this.f8489f + ")";
    }
}
