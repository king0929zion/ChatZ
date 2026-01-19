package Y2;

import j1.AbstractC1135a;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class y {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9786b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9787c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9788d;

    public y(List list, boolean z5, String str, long j3) {
        AbstractC1276k.f(list, "vendors");
        this.a = list;
        this.f9786b = z5;
        this.f9787c = str;
        this.f9788d = j3;
    }

    public static y a(y yVar, List list, boolean z5, String str, int i6) {
        if ((i6 & 1) != 0) {
            list = yVar.a;
        }
        List list2 = list;
        if ((i6 & 2) != 0) {
            z5 = yVar.f9786b;
        }
        boolean z6 = z5;
        if ((i6 & 4) != 0) {
            str = yVar.f9787c;
        }
        long j3 = yVar.f9788d;
        yVar.getClass();
        AbstractC1276k.f(list2, "vendors");
        return new y(list2, z6, str, j3);
    }

    public final String b() {
        return this.f9787c;
    }

    public final boolean c() {
        return this.f9786b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return AbstractC1276k.b(this.a, yVar.a) && this.f9786b == yVar.f9786b && AbstractC1276k.b(this.f9787c, yVar.f9787c) && this.f9788d == yVar.f9788d;
    }

    public final int hashCode() {
        int d6 = AbstractC1135a.d(this.a.hashCode() * 31, 31, this.f9786b);
        String str = this.f9787c;
        return Long.hashCode(this.f9788d) + ((d6 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "ModelListState(vendors=" + this.a + ", isLoading=" + this.f9786b + ", errorMessage=" + this.f9787c + ", lastUpdatedAt=" + this.f9788d + ")";
    }
}
