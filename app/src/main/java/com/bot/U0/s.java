package u0;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class s extends AbstractC1738C {

    /* renamed from: c, reason: collision with root package name */
    public final float f15111c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15112d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15113e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15114f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15115g;

    /* renamed from: h, reason: collision with root package name */
    public final float f15116h;

    /* renamed from: i, reason: collision with root package name */
    public final float f15117i;

    public s(float f6, float f7, float f8, boolean z5, boolean z6, float f9, float f10) {
        super(3);
        this.f15111c = f6;
        this.f15112d = f7;
        this.f15113e = f8;
        this.f15114f = z5;
        this.f15115g = z6;
        this.f15116h = f9;
        this.f15117i = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f15111c, sVar.f15111c) == 0 && Float.compare(this.f15112d, sVar.f15112d) == 0 && Float.compare(this.f15113e, sVar.f15113e) == 0 && this.f15114f == sVar.f15114f && this.f15115g == sVar.f15115g && Float.compare(this.f15116h, sVar.f15116h) == 0 && Float.compare(this.f15117i, sVar.f15117i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15117i) + AbstractC1135a.a(this.f15116h, AbstractC1135a.d(AbstractC1135a.d(AbstractC1135a.a(this.f15113e, AbstractC1135a.a(this.f15112d, Float.hashCode(this.f15111c) * 31, 31), 31), 31, this.f15114f), 31, this.f15115g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f15111c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f15112d);
        sb.append(", theta=");
        sb.append(this.f15113e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f15114f);
        sb.append(", isPositiveArc=");
        sb.append(this.f15115g);
        sb.append(", arcStartDx=");
        sb.append(this.f15116h);
        sb.append(", arcStartDy=");
        return AbstractC1135a.h(sb, this.f15117i, ')');
    }
}
