package S2;

import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* renamed from: S2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0575j {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7799b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7800c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7801d;

    public C0575j(int i6, int i7, int i8, String str) {
        this.a = i6;
        this.f7799b = str;
        this.f7800c = i7;
        this.f7801d = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0575j)) {
            return false;
        }
        C0575j c0575j = (C0575j) obj;
        return this.a == c0575j.a && AbstractC1276k.b(this.f7799b, c0575j.f7799b) && this.f7800c == c0575j.f7800c && this.f7801d == c0575j.f7801d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7801d) + AbstractC1135a.b(this.f7800c, B3.e.e(Integer.hashCode(this.a) * 31, 31, this.f7799b), 31);
    }

    public final String toString() {
        return "GraphemeCluster(index=" + this.a + ", text=" + this.f7799b + ", start=" + this.f7800c + ", end=" + this.f7801d + ")";
    }
}
