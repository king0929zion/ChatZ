package m;

import j1.AbstractC1135a;

/* renamed from: m.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1213U {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12763b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12764c;

    public C1213U(float f6, float f7, long j3) {
        this.a = f6;
        this.f12763b = f7;
        this.f12764c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1213U)) {
            return false;
        }
        C1213U c1213u = (C1213U) obj;
        return Float.compare(this.a, c1213u.a) == 0 && Float.compare(this.f12763b, c1213u.f12763b) == 0 && this.f12764c == c1213u.f12764c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12764c) + AbstractC1135a.a(this.f12763b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.f12763b + ", duration=" + this.f12764c + ')';
    }
}
