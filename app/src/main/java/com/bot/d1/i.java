package d1;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final i f11387d = new i(f.f11385c, 17, 0);
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11388b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11389c;

    public i(float f6, int i6, int i7) {
        this.a = f6;
        this.f11388b = i6;
        this.f11389c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        float f6 = iVar.a;
        float f7 = f.f11384b;
        return Float.compare(this.a, f6) == 0 && this.f11388b == iVar.f11388b && this.f11389c == iVar.f11389c;
    }

    public final int hashCode() {
        float f6 = f.f11384b;
        return Integer.hashCode(this.f11389c) + AbstractC1135a.b(this.f11388b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) f.b(this.a));
        sb.append(", trim=");
        String str = "Invalid";
        int i6 = this.f11388b;
        sb.append((Object) (i6 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i6 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i6 == 17 ? "LineHeightStyle.Trim.Both" : i6 == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=");
        int i7 = this.f11389c;
        if (i7 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i7 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i7 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
