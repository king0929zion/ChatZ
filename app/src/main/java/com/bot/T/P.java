package T;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class P {
    public final Integer a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8018b;

    public P(Integer num, Object obj) {
        this.a = num;
        this.f8018b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p5 = (P) obj;
        return this.a.equals(p5.a) && AbstractC1276k.b(this.f8018b, p5.f8018b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.f8018b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.f8018b + ')';
    }
}
