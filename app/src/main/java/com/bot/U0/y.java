package u0;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class y extends AbstractC1738C {

    /* renamed from: c, reason: collision with root package name */
    public final float f15133c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15134d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15135e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15136f;

    public y(float f6, float f7, float f8, float f9) {
        super(2);
        this.f15133c = f6;
        this.f15134d = f7;
        this.f15135e = f8;
        this.f15136f = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f15133c, yVar.f15133c) == 0 && Float.compare(this.f15134d, yVar.f15134d) == 0 && Float.compare(this.f15135e, yVar.f15135e) == 0 && Float.compare(this.f15136f, yVar.f15136f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15136f) + AbstractC1135a.a(this.f15135e, AbstractC1135a.a(this.f15134d, Float.hashCode(this.f15133c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f15133c);
        sb.append(", dy1=");
        sb.append(this.f15134d);
        sb.append(", dx2=");
        sb.append(this.f15135e);
        sb.append(", dy2=");
        return AbstractC1135a.h(sb, this.f15136f, ')');
    }
}
