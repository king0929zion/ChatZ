package y;

import u.AbstractC1734b;

/* renamed from: y.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1973m {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15892b;

    public C1973m(int i6, int i7) {
        this.a = i6;
        this.f15892b = i7;
        if (!(i6 >= 0)) {
            AbstractC1734b.a("negative start index");
        }
        if (i7 >= i6) {
            return;
        }
        AbstractC1734b.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1973m)) {
            return false;
        }
        C1973m c1973m = (C1973m) obj;
        return this.a == c1973m.a && this.f15892b == c1973m.f15892b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15892b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.a);
        sb.append(", end=");
        return B3.e.q(sb, this.f15892b, ')');
    }
}
