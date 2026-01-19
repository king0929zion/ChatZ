package z3;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class K {
    public Long a;

    /* renamed from: b, reason: collision with root package name */
    public Long f16248b;

    /* renamed from: c, reason: collision with root package name */
    public Long f16249c;

    public K() {
        this.a = 0L;
        this.f16248b = 0L;
        this.f16249c = 0L;
        this.a = null;
        this.f16248b = null;
        this.f16249c = null;
    }

    public static void a(Long l3) {
        if (l3 != null && l3.longValue() <= 0) {
            throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K.class != obj.getClass()) {
            return false;
        }
        K k3 = (K) obj;
        return AbstractC1276k.b(this.a, k3.a) && AbstractC1276k.b(this.f16248b, k3.f16248b) && AbstractC1276k.b(this.f16249c, k3.f16249c);
    }

    public final int hashCode() {
        Long l3 = this.a;
        int hashCode = (l3 != null ? l3.hashCode() : 0) * 31;
        Long l5 = this.f16248b;
        int hashCode2 = (hashCode + (l5 != null ? l5.hashCode() : 0)) * 31;
        Long l6 = this.f16249c;
        return hashCode2 + (l6 != null ? l6.hashCode() : 0);
    }
}
