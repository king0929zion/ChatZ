package q0;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class h extends AbstractC1499e {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13947b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13948c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13949d;

    public h(float f6, float f7, int i6, int i7, int i8) {
        f7 = (i8 & 2) != 0 ? 4.0f : f7;
        i6 = (i8 & 4) != 0 ? 0 : i6;
        i7 = (i8 & 8) != 0 ? 0 : i7;
        this.a = f6;
        this.f13947b = f7;
        this.f13948c = i6;
        this.f13949d = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.a != hVar.a || this.f13947b != hVar.f13947b || this.f13948c != hVar.f13948c || this.f13949d != hVar.f13949d) {
            return false;
        }
        hVar.getClass();
        return true;
    }

    public final int hashCode() {
        return AbstractC1135a.b(this.f13949d, AbstractC1135a.b(this.f13948c, AbstractC1135a.a(this.f13947b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.a);
        sb.append(", miter=");
        sb.append(this.f13947b);
        sb.append(", cap=");
        String str = "Unknown";
        int i6 = this.f13948c;
        sb.append((Object) (i6 == 0 ? "Butt" : i6 == 1 ? "Round" : i6 == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i7 = this.f13949d;
        if (i7 == 0) {
            str = "Miter";
        } else if (i7 == 1) {
            str = "Round";
        } else if (i7 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
