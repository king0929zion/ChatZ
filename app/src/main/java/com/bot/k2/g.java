package k2;

import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes.dex */
public final class g {
    public final BitmapDrawable a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12615b;

    public g(BitmapDrawable bitmapDrawable, boolean z5) {
        this.a = bitmapDrawable;
        this.f12615b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a.equals(gVar.a) && this.f12615b == gVar.f12615b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12615b) + (this.a.hashCode() * 31);
    }
}
