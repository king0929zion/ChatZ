package o0;

import j1.AbstractC1135a;
import n0.C1353b;

/* renamed from: o0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1389K {

    /* renamed from: d, reason: collision with root package name */
    public static final C1389K f13435d = new C1389K();
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13436b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13437c;

    public C1389K(long j3, long j4, float f6) {
        this.a = j3;
        this.f13436b = j4;
        this.f13437c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1389K)) {
            return false;
        }
        C1389K c1389k = (C1389K) obj;
        return s.d(this.a, c1389k.a) && C1353b.c(this.f13436b, c1389k.f13436b) && this.f13437c == c1389k.f13437c;
    }

    public final int hashCode() {
        int i6 = s.f13482i;
        return Float.hashCode(this.f13437c) + AbstractC1135a.c(Long.hashCode(this.a) * 31, 31, this.f13436b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        AbstractC1135a.p(this.a, sb, ", offset=");
        sb.append((Object) C1353b.h(this.f13436b));
        sb.append(", blurRadius=");
        return AbstractC1135a.h(sb, this.f13437c, ')');
    }

    public /* synthetic */ C1389K() {
        this(y.d(4278190080L), 0L, S.l.f7374V);
    }
}
