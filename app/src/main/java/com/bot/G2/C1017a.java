package g2;

import android.graphics.Rect;
import f2.C1007a;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1017a {
    public final C1007a a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11773b;

    public C1017a(C1007a c1007a, float f6) {
        this.a = c1007a;
        this.f11773b = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1017a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC1276k.d(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        C1017a c1017a = (C1017a) obj;
        return AbstractC1276k.b(this.a, c1017a.a) && this.f11773b == c1017a.f11773b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11773b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.a);
        sb.append(", density=");
        return AbstractC1135a.h(sb, this.f11773b, ')');
    }

    public C1017a(Rect rect, float f6) {
        this.a = new C1007a(rect);
        this.f11773b = f6;
    }
}
