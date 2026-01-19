package Q;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class G0 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5253b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5254c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5255d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5256e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5257f;

    public G0(long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j3;
        this.f5253b = j4;
        this.f5254c = j5;
        this.f5255d = j6;
        this.f5256e = j7;
        this.f5257f = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof G0)) {
            return false;
        }
        G0 g02 = (G0) obj;
        return o0.s.d(this.a, g02.a) && o0.s.d(this.f5253b, g02.f5253b) && o0.s.d(this.f5254c, g02.f5254c) && o0.s.d(this.f5255d, g02.f5255d) && o0.s.d(this.f5256e, g02.f5256e) && o0.s.d(this.f5257f, g02.f5257f);
    }

    public final int hashCode() {
        int i6 = o0.s.f13482i;
        return Long.hashCode(this.f5257f) + AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(Long.hashCode(this.a) * 31, 31, this.f5253b), 31, this.f5254c), 31, this.f5255d), 31, this.f5256e);
    }
}
