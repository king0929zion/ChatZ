package S2;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class L0 {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7723b;

    public L0(String str, boolean z5) {
        AbstractC1276k.f(str, "text");
        this.a = z5;
        this.f7723b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l02 = (L0) obj;
        return this.a == l02.a && AbstractC1276k.b(this.f7723b, l02.f7723b);
    }

    public final int hashCode() {
        return this.f7723b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TaskListInfo(checked=" + this.a + ", text=" + this.f7723b + ")";
    }
}
