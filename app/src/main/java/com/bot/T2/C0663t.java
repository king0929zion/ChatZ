package T2;

import j1.AbstractC1135a;
import m4.AbstractC1276k;
import o4.AbstractC1410a;

/* renamed from: T2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0663t extends AbstractC1410a {

    /* renamed from: e, reason: collision with root package name */
    public final int f8478e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8479f;

    /* renamed from: g, reason: collision with root package name */
    public final char f8480g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f8481h;

    public C0663t(int i6, boolean z5, char c6, Integer num) {
        this.f8478e = i6;
        this.f8479f = z5;
        this.f8480g = c6;
        this.f8481h = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0663t)) {
            return false;
        }
        C0663t c0663t = (C0663t) obj;
        return this.f8478e == c0663t.f8478e && this.f8479f == c0663t.f8479f && this.f8480g == c0663t.f8480g && AbstractC1276k.b(this.f8481h, c0663t.f8481h);
    }

    public final int hashCode() {
        int hashCode = (Character.hashCode(this.f8480g) + AbstractC1135a.d(Integer.hashCode(this.f8478e) * 31, 31, this.f8479f)) * 31;
        Integer num = this.f8481h;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ListMarkerDetected(indent=" + this.f8478e + ", isOrdered=" + this.f8479f + ", marker=" + this.f8480g + ", number=" + this.f8481h + ")";
    }
}
