package P;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class b {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4401b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4402c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4403d;

    public b(float f6, float f7, float f8, float f9) {
        this.a = f6;
        this.f4401b = f7;
        this.f4402c = f8;
        this.f4403d = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.f4401b == bVar.f4401b && this.f4402c == bVar.f4402c && this.f4403d == bVar.f4403d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4403d) + AbstractC1135a.a(this.f4402c, AbstractC1135a.a(this.f4401b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.a);
        sb.append(", focusedAlpha=");
        sb.append(this.f4401b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f4402c);
        sb.append(", pressedAlpha=");
        return AbstractC1135a.h(sb, this.f4403d, ')');
    }
}
