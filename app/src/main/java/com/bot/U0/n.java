package u0;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class n extends AbstractC1738C {

    /* renamed from: c, reason: collision with root package name */
    public final float f15097c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15098d;

    public n(float f6, float f7) {
        super(3);
        this.f15097c = f6;
        this.f15098d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f15097c, nVar.f15097c) == 0 && Float.compare(this.f15098d, nVar.f15098d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15098d) + (Float.hashCode(this.f15097c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f15097c);
        sb.append(", y=");
        return AbstractC1135a.h(sb, this.f15098d, ')');
    }
}
