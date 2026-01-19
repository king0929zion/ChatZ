package s2;

import android.graphics.drawable.Drawable;
import m4.AbstractC1276k;

/* renamed from: s2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1657e extends AbstractC1662j {
    public final Drawable a;

    /* renamed from: b, reason: collision with root package name */
    public final C1661i f14746b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f14747c;

    public C1657e(Drawable drawable, C1661i c1661i, Throwable th) {
        this.a = drawable;
        this.f14746b = c1661i;
        this.f14747c = th;
    }

    @Override // s2.AbstractC1662j
    public final C1661i a() {
        return this.f14746b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1657e)) {
            return false;
        }
        C1657e c1657e = (C1657e) obj;
        return AbstractC1276k.b(this.a, c1657e.a) && AbstractC1276k.b(this.f14746b, c1657e.f14746b) && AbstractC1276k.b(this.f14747c, c1657e.f14747c);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        return this.f14747c.hashCode() + ((this.f14746b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
