package Q;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class B {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5135b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5136c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5137d;

    public B(long j3, long j4, long j5, long j6) {
        this.a = j3;
        this.f5135b = j4;
        this.f5136c = j5;
        this.f5137d = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof B)) {
            return false;
        }
        B b5 = (B) obj;
        return o0.s.d(this.a, b5.a) && o0.s.d(this.f5135b, b5.f5135b) && o0.s.d(this.f5136c, b5.f5136c) && o0.s.d(this.f5137d, b5.f5137d);
    }

    public final int hashCode() {
        int i6 = o0.s.f13482i;
        return Long.hashCode(this.f5137d) + AbstractC1135a.c(AbstractC1135a.c(Long.hashCode(this.a) * 31, 31, this.f5135b), 31, this.f5136c);
    }
}
