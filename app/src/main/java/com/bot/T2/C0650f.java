package T2;

import o4.AbstractC1410a;

/* renamed from: T2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0650f extends AbstractC1410a {

    /* renamed from: e, reason: collision with root package name */
    public final char f8441e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8442f;

    public C0650f(char c6, int i6) {
        this.f8441e = c6;
        this.f8442f = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0650f)) {
            return false;
        }
        C0650f c0650f = (C0650f) obj;
        return this.f8441e == c0650f.f8441e && this.f8442f == c0650f.f8442f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8442f) + (Character.hashCode(this.f8441e) * 31);
    }

    public final String toString() {
        return "HorizontalRuleCandidate(char=" + this.f8441e + ", count=" + this.f8442f + ")";
    }
}
