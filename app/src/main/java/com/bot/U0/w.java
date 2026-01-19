package u0;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class w extends AbstractC1738C {

    /* renamed from: c, reason: collision with root package name */
    public final float f15127c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15128d;

    public w(float f6, float f7) {
        super(3);
        this.f15127c = f6;
        this.f15128d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f15127c, wVar.f15127c) == 0 && Float.compare(this.f15128d, wVar.f15128d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15128d) + (Float.hashCode(this.f15127c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f15127c);
        sb.append(", dy=");
        return AbstractC1135a.h(sb, this.f15128d, ')');
    }
}
