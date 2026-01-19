package I1;

import m4.AbstractC1276k;
import m4.AbstractC1289x;

/* renamed from: I1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229h {
    public final F a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2542b = false;

    public C0229h(F f6) {
        this.a = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0229h.class != obj.getClass()) {
            return false;
        }
        C0229h c0229h = (C0229h) obj;
        return this.f2542b == c0229h.f2542b && this.a.equals(c0229h.a);
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 961) + (this.f2542b ? 1 : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC1289x.a(C0229h.class).c());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: false");
        if (this.f2542b) {
            sb.append(" DefaultValue: null");
        }
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }
}
