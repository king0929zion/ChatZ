package S2;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class G0 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final H0 f7701b;

    public G0(String str, H0 h02) {
        AbstractC1276k.f(str, "value");
        this.a = str;
        this.f7701b = h02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g02 = (G0) obj;
        return AbstractC1276k.b(this.a, g02.a) && this.f7701b == g02.f7701b;
    }

    public final int hashCode() {
        return this.f7701b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Token(value=" + this.a + ", type=" + this.f7701b + ")";
    }
}
