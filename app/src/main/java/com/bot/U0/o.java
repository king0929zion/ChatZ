package u0;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class o extends AbstractC1738C {

    /* renamed from: c, reason: collision with root package name */
    public final float f15099c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15100d;

    public o(float f6, float f7) {
        super(3);
        this.f15099c = f6;
        this.f15100d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f15099c, oVar.f15099c) == 0 && Float.compare(this.f15100d, oVar.f15100d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15100d) + (Float.hashCode(this.f15099c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f15099c);
        sb.append(", y=");
        return AbstractC1135a.h(sb, this.f15100d, ')');
    }
}
