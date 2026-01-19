package e1;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final k f11572e = new k(0, 0, 0, 0);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11573b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11574c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11575d;

    public k(int i6, int i7, int i8, int i9) {
        this.a = i6;
        this.f11573b = i7;
        this.f11574c = i8;
        this.f11575d = i9;
    }

    public final long a() {
        return (((b() / 2) + this.f11573b) & 4294967295L) | (((d() / 2) + this.a) << 32);
    }

    public final int b() {
        return this.f11575d - this.f11573b;
    }

    public final long c() {
        return (this.a << 32) | (this.f11573b & 4294967295L);
    }

    public final int d() {
        return this.f11574c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && this.f11573b == kVar.f11573b && this.f11574c == kVar.f11574c && this.f11575d == kVar.f11575d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11575d) + AbstractC1135a.b(this.f11574c, AbstractC1135a.b(this.f11573b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.f11573b);
        sb.append(", ");
        sb.append(this.f11574c);
        sb.append(", ");
        return B3.e.q(sb, this.f11575d, ')');
    }
}
