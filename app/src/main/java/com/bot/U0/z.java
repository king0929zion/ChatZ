package u0;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class z extends AbstractC1738C {

    /* renamed from: c, reason: collision with root package name */
    public final float f15137c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15138d;

    public z(float f6, float f7) {
        super(1);
        this.f15137c = f6;
        this.f15138d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Float.compare(this.f15137c, zVar.f15137c) == 0 && Float.compare(this.f15138d, zVar.f15138d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15138d) + (Float.hashCode(this.f15137c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f15137c);
        sb.append(", dy=");
        return AbstractC1135a.h(sb, this.f15138d, ')');
    }
}
