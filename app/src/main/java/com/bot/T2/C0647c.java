package T2;

import j1.AbstractC1135a;
import m4.AbstractC1276k;
import o4.AbstractC1410a;

/* renamed from: T2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0647c extends AbstractC1410a {

    /* renamed from: e, reason: collision with root package name */
    public final char f8430e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8431f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8432g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8433h;

    public C0647c(String str, char c6, int i6, int i7) {
        this.f8430e = c6;
        this.f8431f = i6;
        this.f8432g = str;
        this.f8433h = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0647c)) {
            return false;
        }
        C0647c c0647c = (C0647c) obj;
        return this.f8430e == c0647c.f8430e && this.f8431f == c0647c.f8431f && AbstractC1276k.b(this.f8432g, c0647c.f8432g) && this.f8433h == c0647c.f8433h;
    }

    public final int hashCode() {
        int b5 = AbstractC1135a.b(this.f8431f, Character.hashCode(this.f8430e) * 31, 31);
        String str = this.f8432g;
        return Integer.hashCode(this.f8433h) + ((b5 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "CodeFenceEndCandidate(marker=" + this.f8430e + ", fenceLength=" + this.f8431f + ", language=" + this.f8432g + ", closingCount=" + this.f8433h + ")";
    }
}
