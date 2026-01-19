package Q;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class V1 {
    public final C.d a;

    /* renamed from: b, reason: collision with root package name */
    public final C.d f5544b;

    /* renamed from: c, reason: collision with root package name */
    public final C.d f5545c;

    /* renamed from: d, reason: collision with root package name */
    public final C.d f5546d;

    /* renamed from: e, reason: collision with root package name */
    public final C.d f5547e;

    /* renamed from: f, reason: collision with root package name */
    public final C.d f5548f;

    /* renamed from: g, reason: collision with root package name */
    public final C.d f5549g;

    /* renamed from: h, reason: collision with root package name */
    public final C.d f5550h;

    public V1() {
        C.d dVar = U1.a;
        C.d dVar2 = U1.f5530b;
        C.d dVar3 = U1.f5531c;
        C.d dVar4 = U1.f5532d;
        C.d dVar5 = U1.f5534f;
        C.d dVar6 = U1.f5533e;
        C.d dVar7 = U1.f5535g;
        C.d dVar8 = U1.f5536h;
        this.a = dVar;
        this.f5544b = dVar2;
        this.f5545c = dVar3;
        this.f5546d = dVar4;
        this.f5547e = dVar5;
        this.f5548f = dVar6;
        this.f5549g = dVar7;
        this.f5550h = dVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V1)) {
            return false;
        }
        V1 v12 = (V1) obj;
        return AbstractC1276k.b(this.a, v12.a) && AbstractC1276k.b(this.f5544b, v12.f5544b) && AbstractC1276k.b(this.f5545c, v12.f5545c) && AbstractC1276k.b(this.f5546d, v12.f5546d) && AbstractC1276k.b(this.f5547e, v12.f5547e) && AbstractC1276k.b(this.f5548f, v12.f5548f) && AbstractC1276k.b(this.f5549g, v12.f5549g) && AbstractC1276k.b(this.f5550h, v12.f5550h);
    }

    public final int hashCode() {
        return this.f5550h.hashCode() + ((this.f5549g.hashCode() + ((this.f5548f.hashCode() + ((this.f5547e.hashCode() + ((this.f5546d.hashCode() + ((this.f5545c.hashCode() + ((this.f5544b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.f5544b + ", medium=" + this.f5545c + ", large=" + this.f5546d + ", largeIncreased=" + this.f5548f + ", extraLarge=" + this.f5547e + ", extralargeIncreased=" + this.f5549g + ", extraExtraLarge=" + this.f5550h + ')';
    }
}
