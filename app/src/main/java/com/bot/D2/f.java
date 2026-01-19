package D2;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class f extends i {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1282b;

    public f(String str, int i6) {
        this.a = str;
        this.f1282b = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC1276k.b(this.a, fVar.a) && this.f1282b == fVar.f1282b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1282b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(message=" + this.a + ", code=" + this.f1282b + ")";
    }
}
