package u0;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class v extends AbstractC1738C {

    /* renamed from: c, reason: collision with root package name */
    public final float f15125c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15126d;

    public v(float f6, float f7) {
        super(3);
        this.f15125c = f6;
        this.f15126d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f15125c, vVar.f15125c) == 0 && Float.compare(this.f15126d, vVar.f15126d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15126d) + (Float.hashCode(this.f15125c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f15125c);
        sb.append(", dy=");
        return AbstractC1135a.h(sb, this.f15126d, ')');
    }
}
