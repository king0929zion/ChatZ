package Q;

import m4.AbstractC1276k;
import x4.C1928k;

/* loaded from: classes.dex */
public final class I2 {
    public final J2 a;

    /* renamed from: b, reason: collision with root package name */
    public final C1928k f5297b;

    public I2(J2 j22, C1928k c1928k) {
        this.a = j22;
        this.f5297b = c1928k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || I2.class != obj.getClass()) {
            return false;
        }
        I2 i22 = (I2) obj;
        return AbstractC1276k.b(this.a, i22.a) && this.f5297b.equals(i22.f5297b);
    }

    public final int hashCode() {
        return this.f5297b.hashCode() + (this.a.hashCode() * 31);
    }
}
