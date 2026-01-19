package S2;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class C extends X {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7686b;

    public C(String str, int i6) {
        AbstractC1276k.f(str, "text");
        this.a = str;
        this.f7686b = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c6 = (C) obj;
        return AbstractC1276k.b(this.a, c6.a) && this.f7686b == c6.f7686b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7686b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Heading(text=" + this.a + ", level=" + this.f7686b + ")";
    }
}
