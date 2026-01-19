package I3;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final v f2757d = new v("HTTP", 2, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final v f2758e = new v("HTTP", 1, 1);

    /* renamed from: f, reason: collision with root package name */
    public static final v f2759f = new v("HTTP", 1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final v f2760g = new v("SPDY", 3, 0);

    /* renamed from: h, reason: collision with root package name */
    public static final v f2761h = new v("QUIC", 1, 0);
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2762b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2763c;

    public v(String str, int i6, int i7) {
        this.a = str;
        this.f2762b = i6;
        this.f2763c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.a.equals(vVar.a) && this.f2762b == vVar.f2762b && this.f2763c == vVar.f2763c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2763c) + AbstractC1135a.b(this.f2762b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return this.a + '/' + this.f2762b + '.' + this.f2763c;
    }
}
