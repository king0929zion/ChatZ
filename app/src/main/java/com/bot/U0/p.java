package u0;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class p extends AbstractC1738C {

    /* renamed from: c, reason: collision with root package name */
    public final float f15101c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15102d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15103e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15104f;

    public p(float f6, float f7, float f8, float f9) {
        super(1);
        this.f15101c = f6;
        this.f15102d = f7;
        this.f15103e = f8;
        this.f15104f = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f15101c, pVar.f15101c) == 0 && Float.compare(this.f15102d, pVar.f15102d) == 0 && Float.compare(this.f15103e, pVar.f15103e) == 0 && Float.compare(this.f15104f, pVar.f15104f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15104f) + AbstractC1135a.a(this.f15103e, AbstractC1135a.a(this.f15102d, Float.hashCode(this.f15101c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.f15101c);
        sb.append(", y1=");
        sb.append(this.f15102d);
        sb.append(", x2=");
        sb.append(this.f15103e);
        sb.append(", y2=");
        return AbstractC1135a.h(sb, this.f15104f, ')');
    }
}
