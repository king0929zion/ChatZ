package m;

import j1.AbstractC1135a;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1219a {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12769b;

    public C1219a(float f6, float f7) {
        this.a = f6;
        this.f12769b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1219a)) {
            return false;
        }
        C1219a c1219a = (C1219a) obj;
        return Float.compare(this.a, c1219a.a) == 0 && Float.compare(this.f12769b, c1219a.f12769b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12769b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.a);
        sb.append(", velocityCoefficient=");
        return AbstractC1135a.h(sb, this.f12769b, ')');
    }
}
