package S2;

import m4.AbstractC1276k;

/* renamed from: S2.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0568f0 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7752b;

    public C0568f0(String str, String str2) {
        this.a = str;
        this.f7752b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0568f0)) {
            return false;
        }
        C0568f0 c0568f0 = (C0568f0) obj;
        return AbstractC1276k.b(this.a, c0568f0.a) && AbstractC1276k.b(this.f7752b, c0568f0.f7752b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.f7752b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return B3.e.o("ReferenceDefinition(url=", this.a, ", title=", this.f7752b, ")");
    }
}
