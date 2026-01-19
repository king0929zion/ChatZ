package p0;

import j1.AbstractC1135a;

/* renamed from: p0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1483s {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13906b;

    public C1483s(float f6, float f7) {
        this.a = f6;
        this.f13906b = f7;
    }

    public final float[] a() {
        float f6 = this.a;
        float f7 = this.f13906b;
        return new float[]{f6 / f7, 1.0f, ((1.0f - f6) - f7) / f7};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1483s)) {
            return false;
        }
        C1483s c1483s = (C1483s) obj;
        return Float.compare(this.a, c1483s.a) == 0 && Float.compare(this.f13906b, c1483s.f13906b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13906b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.a);
        sb.append(", y=");
        return AbstractC1135a.h(sb, this.f13906b, ')');
    }
}
