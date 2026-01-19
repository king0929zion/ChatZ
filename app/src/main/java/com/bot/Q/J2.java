package Q;

import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class J2 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final D2 f5317b;

    public J2(String str, D2 d22) {
        this.a = str;
        this.f5317b = d22;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J2.class != obj.getClass()) {
            return false;
        }
        J2 j22 = (J2) obj;
        return AbstractC1276k.b(this.a, j22.a) && this.f5317b == j22.f5317b;
    }

    public final int hashCode() {
        return this.f5317b.hashCode() + AbstractC1135a.d(this.a.hashCode() * 961, 31, false);
    }
}
