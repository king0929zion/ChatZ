package v;

import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class n0 {
    public float a = S.l.f7374V;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15331b = true;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC1787b f15332c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Float.compare(this.a, n0Var.a) == 0 && this.f15331b == n0Var.f15331b && AbstractC1276k.b(this.f15332c, n0Var.f15332c);
    }

    public final int hashCode() {
        int d6 = AbstractC1135a.d(Float.hashCode(this.a) * 31, 31, this.f15331b);
        AbstractC1787b abstractC1787b = this.f15332c;
        return (d6 + (abstractC1787b == null ? 0 : abstractC1787b.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.f15331b + ", crossAxisAlignment=" + this.f15332c + ", flowLayoutData=null)";
    }
}
