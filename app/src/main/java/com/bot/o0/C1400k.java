package o0;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import j1.AbstractC1135a;

/* renamed from: o0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1400k {
    public final ColorFilter a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13468b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13469c;

    public C1400k(long j3, int i6) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1390a.d();
            porterDuffColorFilter = AbstractC1390a.c(y.B(j3), y.x(i6));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(y.B(j3), y.F(i6));
        }
        this.a = porterDuffColorFilter;
        this.f13468b = j3;
        this.f13469c = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1400k)) {
            return false;
        }
        C1400k c1400k = (C1400k) obj;
        return s.d(this.f13468b, c1400k.f13468b) && this.f13469c == c1400k.f13469c;
    }

    public final int hashCode() {
        int i6 = s.f13482i;
        return Integer.hashCode(this.f13469c) + (Long.hashCode(this.f13468b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        AbstractC1135a.p(this.f13468b, sb, ", blendMode=");
        sb.append((Object) y.G(this.f13469c));
        sb.append(')');
        return sb.toString();
    }
}
