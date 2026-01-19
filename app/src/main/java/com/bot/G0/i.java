package g0;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class i {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f11772b;

    public i(Integer num, int i6) {
        this.a = i6;
        this.f11772b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && AbstractC1276k.b(this.f11772b, iVar.f11772b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.f11772b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.a + ", dataOffset=" + this.f11772b + ')';
    }
}
