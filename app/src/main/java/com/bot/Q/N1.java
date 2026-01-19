package Q;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class N1 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5438b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5439c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5440d;

    public N1(long j3, long j4, long j5, long j6) {
        this.a = j3;
        this.f5438b = j4;
        this.f5439c = j5;
        this.f5440d = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof N1)) {
            return false;
        }
        N1 n12 = (N1) obj;
        return o0.s.d(this.a, n12.a) && o0.s.d(this.f5438b, n12.f5438b) && o0.s.d(this.f5439c, n12.f5439c) && o0.s.d(this.f5440d, n12.f5440d);
    }

    public final int hashCode() {
        int i6 = o0.s.f13482i;
        return Long.hashCode(this.f5440d) + AbstractC1135a.c(AbstractC1135a.c(Long.hashCode(this.a) * 31, 31, this.f5438b), 31, this.f5439c);
    }
}
