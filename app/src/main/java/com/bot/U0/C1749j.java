package u0;

import j1.AbstractC1135a;

/* renamed from: u0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1749j extends AbstractC1738C {

    /* renamed from: c, reason: collision with root package name */
    public final float f15082c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15083d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15084e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15085f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15086g;

    /* renamed from: h, reason: collision with root package name */
    public final float f15087h;

    /* renamed from: i, reason: collision with root package name */
    public final float f15088i;

    public C1749j(float f6, float f7, float f8, boolean z5, boolean z6, float f9, float f10) {
        super(3);
        this.f15082c = f6;
        this.f15083d = f7;
        this.f15084e = f8;
        this.f15085f = z5;
        this.f15086g = z6;
        this.f15087h = f9;
        this.f15088i = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1749j)) {
            return false;
        }
        C1749j c1749j = (C1749j) obj;
        return Float.compare(this.f15082c, c1749j.f15082c) == 0 && Float.compare(this.f15083d, c1749j.f15083d) == 0 && Float.compare(this.f15084e, c1749j.f15084e) == 0 && this.f15085f == c1749j.f15085f && this.f15086g == c1749j.f15086g && Float.compare(this.f15087h, c1749j.f15087h) == 0 && Float.compare(this.f15088i, c1749j.f15088i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15088i) + AbstractC1135a.a(this.f15087h, AbstractC1135a.d(AbstractC1135a.d(AbstractC1135a.a(this.f15084e, AbstractC1135a.a(this.f15083d, Float.hashCode(this.f15082c) * 31, 31), 31), 31, this.f15085f), 31, this.f15086g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f15082c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f15083d);
        sb.append(", theta=");
        sb.append(this.f15084e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f15085f);
        sb.append(", isPositiveArc=");
        sb.append(this.f15086g);
        sb.append(", arcStartX=");
        sb.append(this.f15087h);
        sb.append(", arcStartY=");
        return AbstractC1135a.h(sb, this.f15088i, ')');
    }
}
