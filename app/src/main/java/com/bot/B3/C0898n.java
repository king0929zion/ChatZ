package b3;

import j1.AbstractC1135a;
import java.util.List;
import m4.AbstractC1276k;

/* renamed from: b3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0898n {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final List f11044b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11045c;

    public C0898n(boolean z5, List list, int i6) {
        AbstractC1276k.f(list, "images");
        this.a = z5;
        this.f11044b = list;
        this.f11045c = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0898n)) {
            return false;
        }
        C0898n c0898n = (C0898n) obj;
        return this.a == c0898n.a && AbstractC1276k.b(this.f11044b, c0898n.f11044b) && this.f11045c == c0898n.f11045c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11045c) + AbstractC1135a.e(this.f11044b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImagePreviewState(isVisible=");
        sb.append(this.a);
        sb.append(", images=");
        sb.append(this.f11044b);
        sb.append(", initialPage=");
        return AbstractC1135a.i(sb, this.f11045c, ")");
    }
}
