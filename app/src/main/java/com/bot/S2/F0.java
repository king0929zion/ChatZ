package S2;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class F0 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7692b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7693c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7694d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7695e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7696f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7697g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7698h;

    /* renamed from: i, reason: collision with root package name */
    public final long f7699i;

    public F0(long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.a = j3;
        this.f7692b = j4;
        this.f7693c = j5;
        this.f7694d = j6;
        this.f7695e = j7;
        this.f7696f = j8;
        this.f7697g = j9;
        this.f7698h = j10;
        this.f7699i = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        return o0.s.d(this.a, f02.a) && o0.s.d(this.f7692b, f02.f7692b) && o0.s.d(this.f7693c, f02.f7693c) && o0.s.d(this.f7694d, f02.f7694d) && o0.s.d(this.f7695e, f02.f7695e) && o0.s.d(this.f7696f, f02.f7696f) && o0.s.d(this.f7697g, f02.f7697g) && o0.s.d(this.f7698h, f02.f7698h) && o0.s.d(this.f7699i, f02.f7699i);
    }

    public final int hashCode() {
        int i6 = o0.s.f13482i;
        return Long.hashCode(this.f7699i) + AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(Long.hashCode(this.a) * 31, 31, this.f7692b), 31, this.f7693c), 31, this.f7694d), 31, this.f7695e), 31, this.f7696f), 31, this.f7697g), 31, this.f7698h);
    }

    public final String toString() {
        String j3 = o0.s.j(this.a);
        String j4 = o0.s.j(this.f7692b);
        String j5 = o0.s.j(this.f7693c);
        String j6 = o0.s.j(this.f7694d);
        String j7 = o0.s.j(this.f7695e);
        String j8 = o0.s.j(this.f7696f);
        String j9 = o0.s.j(this.f7697g);
        String j10 = o0.s.j(this.f7698h);
        String j11 = o0.s.j(this.f7699i);
        StringBuilder u5 = B3.e.u("SyntaxColors(keyword=", j3, ", type=", j4, ", string=");
        B3.e.z(u5, j5, ", comment=", j6, ", number=");
        B3.e.z(u5, j7, ", tag=", j8, ", attrName=");
        B3.e.z(u5, j9, ", attrValue=", j10, ", punctuation=");
        return B3.e.s(u5, j11, ")");
    }
}
