package Q;

import T.C0626q;
import j1.AbstractC1135a;
import n.C1327h0;

/* loaded from: classes.dex */
public final class G {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5242b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5243c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5244d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5245e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5246f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5247g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5248h;

    /* renamed from: i, reason: collision with root package name */
    public final long f5249i;

    /* renamed from: j, reason: collision with root package name */
    public final long f5250j;

    /* renamed from: k, reason: collision with root package name */
    public final long f5251k;

    /* renamed from: l, reason: collision with root package name */
    public final long f5252l;

    public G(long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.a = j3;
        this.f5242b = j4;
        this.f5243c = j5;
        this.f5244d = j6;
        this.f5245e = j7;
        this.f5246f = j8;
        this.f5247g = j9;
        this.f5248h = j10;
        this.f5249i = j11;
        this.f5250j = j12;
        this.f5251k = j13;
        this.f5252l = j14;
    }

    public static C1327h0 a(R0.a aVar, C0626q c0626q) {
        if (aVar == R0.a.f6851e) {
            c0626q.b0(1539262271);
            C1327h0 u5 = R1.u(S.p.f7416g, c0626q);
            c0626q.p(false);
            return u5;
        }
        c0626q.b0(1539355581);
        C1327h0 u6 = R1.u(S.p.f7415f, c0626q);
        c0626q.p(false);
        return u6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof G)) {
            return false;
        }
        G g3 = (G) obj;
        return o0.s.d(this.a, g3.a) && o0.s.d(this.f5242b, g3.f5242b) && o0.s.d(this.f5243c, g3.f5243c) && o0.s.d(this.f5244d, g3.f5244d) && o0.s.d(this.f5245e, g3.f5245e) && o0.s.d(this.f5246f, g3.f5246f) && o0.s.d(this.f5247g, g3.f5247g) && o0.s.d(this.f5248h, g3.f5248h) && o0.s.d(this.f5249i, g3.f5249i) && o0.s.d(this.f5250j, g3.f5250j) && o0.s.d(this.f5251k, g3.f5251k) && o0.s.d(this.f5252l, g3.f5252l);
    }

    public final int hashCode() {
        int i6 = o0.s.f13482i;
        return Long.hashCode(this.f5252l) + AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(Long.hashCode(this.a) * 31, 31, this.f5242b), 31, this.f5243c), 31, this.f5244d), 31, this.f5245e), 31, this.f5246f), 31, this.f5247g), 31, this.f5248h), 31, this.f5249i), 31, this.f5250j), 31, this.f5251k);
    }
}
