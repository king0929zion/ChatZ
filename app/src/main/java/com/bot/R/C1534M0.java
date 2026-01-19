package r;

import j1.AbstractC1135a;
import n0.C1353b;

/* renamed from: r.M0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1534M0 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14085b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14086c;

    public C1534M0(long j3, long j4, boolean z5) {
        this.a = j3;
        this.f14085b = j4;
        this.f14086c = z5;
    }

    public final C1534M0 a(C1534M0 c1534m0) {
        return new C1534M0(C1353b.f(this.a, c1534m0.a), Math.max(this.f14085b, c1534m0.f14085b), this.f14086c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1534M0)) {
            return false;
        }
        C1534M0 c1534m0 = (C1534M0) obj;
        return C1353b.c(this.a, c1534m0.a) && this.f14085b == c1534m0.f14085b && this.f14086c == c1534m0.f14086c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14086c) + AbstractC1135a.c(Long.hashCode(this.a) * 31, 31, this.f14085b);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) C1353b.h(this.a)) + ", timeMillis=" + this.f14085b + ", shouldApplyImmediately=" + this.f14086c + ')';
    }
}
