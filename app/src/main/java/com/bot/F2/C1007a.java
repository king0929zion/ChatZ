package f2;

import B3.e;
import android.graphics.Rect;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1007a {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11756b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11757c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11758d;

    static {
        new C1007a(0, 0, 0, 0);
    }

    public C1007a(int i6, int i7, int i8, int i9) {
        this.a = i6;
        this.f11756b = i7;
        this.f11757c = i8;
        this.f11758d = i9;
        if (i6 > i8) {
            throw new IllegalArgumentException(e.k("Left must be less than or equal to right, left: ", i6, i8, ", right: ").toString());
        }
        if (i7 > i9) {
            throw new IllegalArgumentException(e.k("top must be less than or equal to bottom, top: ", i7, i9, ", bottom: ").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1007a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC1276k.d(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        C1007a c1007a = (C1007a) obj;
        return this.a == c1007a.a && this.f11756b == c1007a.f11756b && this.f11757c == c1007a.f11757c && this.f11758d == c1007a.f11758d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.f11756b) * 31) + this.f11757c) * 31) + this.f11758d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C1007a.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.a);
        sb.append(',');
        sb.append(this.f11756b);
        sb.append(',');
        sb.append(this.f11757c);
        sb.append(',');
        return AbstractC1135a.i(sb, this.f11758d, "] }");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1007a(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        AbstractC1276k.f(rect, "rect");
    }
}
