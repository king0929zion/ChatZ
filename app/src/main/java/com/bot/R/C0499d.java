package R;

import h0.C1032i;
import j1.AbstractC1135a;

/* renamed from: R.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0499d implements Y {
    public final C1032i a;

    /* renamed from: b, reason: collision with root package name */
    public final C1032i f6746b;

    public C0499d(C1032i c1032i, C1032i c1032i2) {
        this.a = c1032i;
        this.f6746b = c1032i2;
    }

    @Override // R.Y
    public final int a(e1.k kVar, long j3, int i6) {
        int a = this.f6746b.a(0, kVar.b());
        return kVar.f11573b + a + (-this.a.a(0, i6));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0499d)) {
            return false;
        }
        C0499d c0499d = (C0499d) obj;
        return this.a.equals(c0499d.a) && this.f6746b.equals(c0499d.f6746b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC1135a.a(this.f6746b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        return "Vertical(menuAlignment=" + this.a + ", anchorAlignment=" + this.f6746b + ", offset=0)";
    }
}
