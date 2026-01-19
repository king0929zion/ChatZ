package u0;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class q extends AbstractC1738C {

    /* renamed from: c, reason: collision with root package name */
    public final float f15105c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15106d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15107e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15108f;

    public q(float f6, float f7, float f8, float f9) {
        super(2);
        this.f15105c = f6;
        this.f15106d = f7;
        this.f15107e = f8;
        this.f15108f = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f15105c, qVar.f15105c) == 0 && Float.compare(this.f15106d, qVar.f15106d) == 0 && Float.compare(this.f15107e, qVar.f15107e) == 0 && Float.compare(this.f15108f, qVar.f15108f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15108f) + AbstractC1135a.a(this.f15107e, AbstractC1135a.a(this.f15106d, Float.hashCode(this.f15105c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f15105c);
        sb.append(", y1=");
        sb.append(this.f15106d);
        sb.append(", x2=");
        sb.append(this.f15107e);
        sb.append(", y2=");
        return AbstractC1135a.h(sb, this.f15108f, ')');
    }
}
