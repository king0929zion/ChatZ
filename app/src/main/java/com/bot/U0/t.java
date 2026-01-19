package u0;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class t extends AbstractC1738C {

    /* renamed from: c, reason: collision with root package name */
    public final float f15118c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15119d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15120e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15121f;

    /* renamed from: g, reason: collision with root package name */
    public final float f15122g;

    /* renamed from: h, reason: collision with root package name */
    public final float f15123h;

    public t(float f6, float f7, float f8, float f9, float f10, float f11) {
        super(2);
        this.f15118c = f6;
        this.f15119d = f7;
        this.f15120e = f8;
        this.f15121f = f9;
        this.f15122g = f10;
        this.f15123h = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Float.compare(this.f15118c, tVar.f15118c) == 0 && Float.compare(this.f15119d, tVar.f15119d) == 0 && Float.compare(this.f15120e, tVar.f15120e) == 0 && Float.compare(this.f15121f, tVar.f15121f) == 0 && Float.compare(this.f15122g, tVar.f15122g) == 0 && Float.compare(this.f15123h, tVar.f15123h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15123h) + AbstractC1135a.a(this.f15122g, AbstractC1135a.a(this.f15121f, AbstractC1135a.a(this.f15120e, AbstractC1135a.a(this.f15119d, Float.hashCode(this.f15118c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f15118c);
        sb.append(", dy1=");
        sb.append(this.f15119d);
        sb.append(", dx2=");
        sb.append(this.f15120e);
        sb.append(", dy2=");
        sb.append(this.f15121f);
        sb.append(", dx3=");
        sb.append(this.f15122g);
        sb.append(", dy3=");
        return AbstractC1135a.h(sb, this.f15123h, ')');
    }
}
