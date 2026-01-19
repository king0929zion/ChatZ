package m2;

import android.graphics.drawable.Drawable;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* renamed from: m2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1255d extends AbstractC1256e {
    public final Drawable a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12928b;

    /* renamed from: c, reason: collision with root package name */
    public final k2.f f12929c;

    public C1255d(Drawable drawable, boolean z5, k2.f fVar) {
        this.a = drawable;
        this.f12928b = z5;
        this.f12929c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1255d)) {
            return false;
        }
        C1255d c1255d = (C1255d) obj;
        return AbstractC1276k.b(this.a, c1255d.a) && this.f12928b == c1255d.f12928b && this.f12929c == c1255d.f12929c;
    }

    public final int hashCode() {
        return this.f12929c.hashCode() + AbstractC1135a.d(this.a.hashCode() * 31, 31, this.f12928b);
    }
}
