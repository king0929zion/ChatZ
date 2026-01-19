package u0;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class r extends AbstractC1738C {

    /* renamed from: c, reason: collision with root package name */
    public final float f15109c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15110d;

    public r(float f6, float f7) {
        super(1);
        this.f15109c = f6;
        this.f15110d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f15109c, rVar.f15109c) == 0 && Float.compare(this.f15110d, rVar.f15110d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15110d) + (Float.hashCode(this.f15109c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f15109c);
        sb.append(", y=");
        return AbstractC1135a.h(sb, this.f15110d, ')');
    }
}
