package T0;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class d {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8302b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8303c;

    public d(int i6, int i7, boolean z5) {
        this.a = i6;
        this.f8302b = i7;
        this.f8303c = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.f8302b == dVar.f8302b && this.f8303c == dVar.f8303c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8303c) + AbstractC1135a.b(this.f8302b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.a + ", end=" + this.f8302b + ", isRtl=" + this.f8303c + ')';
    }
}
