package u0;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class l extends AbstractC1738C {

    /* renamed from: c, reason: collision with root package name */
    public final float f15090c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15091d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15092e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15093f;

    /* renamed from: g, reason: collision with root package name */
    public final float f15094g;

    /* renamed from: h, reason: collision with root package name */
    public final float f15095h;

    public l(float f6, float f7, float f8, float f9, float f10, float f11) {
        super(2);
        this.f15090c = f6;
        this.f15091d = f7;
        this.f15092e = f8;
        this.f15093f = f9;
        this.f15094g = f10;
        this.f15095h = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Float.compare(this.f15090c, lVar.f15090c) == 0 && Float.compare(this.f15091d, lVar.f15091d) == 0 && Float.compare(this.f15092e, lVar.f15092e) == 0 && Float.compare(this.f15093f, lVar.f15093f) == 0 && Float.compare(this.f15094g, lVar.f15094g) == 0 && Float.compare(this.f15095h, lVar.f15095h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15095h) + AbstractC1135a.a(this.f15094g, AbstractC1135a.a(this.f15093f, AbstractC1135a.a(this.f15092e, AbstractC1135a.a(this.f15091d, Float.hashCode(this.f15090c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f15090c);
        sb.append(", y1=");
        sb.append(this.f15091d);
        sb.append(", x2=");
        sb.append(this.f15092e);
        sb.append(", y2=");
        sb.append(this.f15093f);
        sb.append(", x3=");
        sb.append(this.f15094g);
        sb.append(", y3=");
        return AbstractC1135a.h(sb, this.f15095h, ')');
    }
}
