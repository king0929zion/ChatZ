package I1;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class D {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2524b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2525c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2526d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2527e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2528f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2529g;

    public D(boolean z5, boolean z6, int i6, boolean z7, boolean z8, int i7, int i8) {
        this.a = z5;
        this.f2524b = z6;
        this.f2525c = i6;
        this.f2526d = z7;
        this.f2527e = z8;
        this.f2528f = i7;
        this.f2529g = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof D)) {
            return false;
        }
        D d6 = (D) obj;
        return this.a == d6.a && this.f2524b == d6.f2524b && this.f2525c == d6.f2525c && this.f2526d == d6.f2526d && this.f2527e == d6.f2527e && this.f2528f == d6.f2528f && this.f2529g == d6.f2529g;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a ? 1 : 0) * 31) + (this.f2524b ? 1 : 0)) * 31) + this.f2525c) * 923521) + (this.f2526d ? 1 : 0)) * 31) + (this.f2527e ? 1 : 0)) * 31) + this.f2528f) * 31) + this.f2529g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.class.getSimpleName());
        sb.append("(");
        if (this.a) {
            sb.append("launchSingleTop ");
        }
        if (this.f2524b) {
            sb.append("restoreState ");
        }
        int i6 = this.f2529g;
        int i7 = this.f2528f;
        if (i7 != -1 || i6 != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i7));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i6));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(")");
        }
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }
}
