package Q;

import j1.AbstractC1135a;

/* renamed from: Q.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0474v0 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6159b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6160c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6161d;

    public C0474v0(long j3, long j4, long j5, long j6) {
        this.a = j3;
        this.f6159b = j4;
        this.f6160c = j5;
        this.f6161d = j6;
    }

    public final C0474v0 a(long j3, long j4, long j5, long j6) {
        if (j3 == 16) {
            j3 = this.a;
        }
        return new C0474v0(j3, j4 != 16 ? j4 : this.f6159b, j5 != 16 ? j5 : this.f6160c, j6 != 16 ? j6 : this.f6161d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0474v0)) {
            return false;
        }
        C0474v0 c0474v0 = (C0474v0) obj;
        return o0.s.d(this.a, c0474v0.a) && o0.s.d(this.f6159b, c0474v0.f6159b) && o0.s.d(this.f6160c, c0474v0.f6160c) && o0.s.d(this.f6161d, c0474v0.f6161d);
    }

    public final int hashCode() {
        int i6 = o0.s.f13482i;
        return Long.hashCode(this.f6161d) + AbstractC1135a.c(AbstractC1135a.c(Long.hashCode(this.a) * 31, 31, this.f6159b), 31, this.f6160c);
    }
}
