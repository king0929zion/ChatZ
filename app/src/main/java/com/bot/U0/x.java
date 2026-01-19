package u0;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class x extends AbstractC1738C {

    /* renamed from: c, reason: collision with root package name */
    public final float f15129c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15130d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15131e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15132f;

    public x(float f6, float f7, float f8, float f9) {
        super(1);
        this.f15129c = f6;
        this.f15130d = f7;
        this.f15131e = f8;
        this.f15132f = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f15129c, xVar.f15129c) == 0 && Float.compare(this.f15130d, xVar.f15130d) == 0 && Float.compare(this.f15131e, xVar.f15131e) == 0 && Float.compare(this.f15132f, xVar.f15132f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15132f) + AbstractC1135a.a(this.f15131e, AbstractC1135a.a(this.f15130d, Float.hashCode(this.f15129c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f15129c);
        sb.append(", dy1=");
        sb.append(this.f15130d);
        sb.append(", dx2=");
        sb.append(this.f15131e);
        sb.append(", dy2=");
        return AbstractC1135a.h(sb, this.f15132f, ')');
    }
}
