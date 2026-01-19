package Q;

import j1.AbstractC1135a;

/* renamed from: Q.f2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0413f2 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5805b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5806c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5807d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5808e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5809f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5810g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5811h;

    /* renamed from: i, reason: collision with root package name */
    public final long f5812i;

    /* renamed from: j, reason: collision with root package name */
    public final long f5813j;

    public C0413f2(long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.a = j3;
        this.f5805b = j4;
        this.f5806c = j5;
        this.f5807d = j6;
        this.f5808e = j7;
        this.f5809f = j8;
        this.f5810g = j9;
        this.f5811h = j10;
        this.f5812i = j11;
        this.f5813j = j12;
    }

    public final long a(boolean z5, boolean z6) {
        return z5 ? z6 ? this.f5805b : this.f5807d : z6 ? this.f5810g : this.f5812i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0413f2)) {
            return false;
        }
        C0413f2 c0413f2 = (C0413f2) obj;
        return o0.s.d(this.a, c0413f2.a) && o0.s.d(this.f5805b, c0413f2.f5805b) && o0.s.d(this.f5806c, c0413f2.f5806c) && o0.s.d(this.f5807d, c0413f2.f5807d) && o0.s.d(this.f5808e, c0413f2.f5808e) && o0.s.d(this.f5809f, c0413f2.f5809f) && o0.s.d(this.f5810g, c0413f2.f5810g) && o0.s.d(this.f5811h, c0413f2.f5811h) && o0.s.d(this.f5812i, c0413f2.f5812i) && o0.s.d(this.f5813j, c0413f2.f5813j);
    }

    public final int hashCode() {
        int i6 = o0.s.f13482i;
        return Long.hashCode(this.f5813j) + AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(Long.hashCode(this.a) * 31, 31, this.f5805b), 31, this.f5806c), 31, this.f5807d), 31, this.f5808e), 31, this.f5809f), 31, this.f5810g), 31, this.f5811h), 31, this.f5812i);
    }
}
