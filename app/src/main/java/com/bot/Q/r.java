package Q;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class r {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6064b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6065c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6066d;

    public r(long j3, long j4, long j5, long j6) {
        this.a = j3;
        this.f6064b = j4;
        this.f6065c = j5;
        this.f6066d = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return o0.s.d(this.a, rVar.a) && o0.s.d(this.f6064b, rVar.f6064b) && o0.s.d(this.f6065c, rVar.f6065c) && o0.s.d(this.f6066d, rVar.f6066d);
    }

    public final int hashCode() {
        int i6 = o0.s.f13482i;
        return Long.hashCode(this.f6066d) + AbstractC1135a.c(AbstractC1135a.c(Long.hashCode(this.a) * 31, 31, this.f6064b), 31, this.f6065c);
    }
}
