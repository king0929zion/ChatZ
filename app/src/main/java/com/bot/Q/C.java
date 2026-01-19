package Q;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class C {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5153b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5154c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5155d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5156e;

    public C(float f6, float f7, float f8, float f9, float f10, float f11) {
        this.a = f6;
        this.f5153b = f7;
        this.f5154c = f8;
        this.f5155d = f9;
        this.f5156e = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C)) {
            return false;
        }
        C c6 = (C) obj;
        return e1.f.c(this.a, c6.a) && e1.f.c(this.f5153b, c6.f5153b) && e1.f.c(this.f5154c, c6.f5154c) && e1.f.c(this.f5155d, c6.f5155d) && e1.f.c(this.f5156e, c6.f5156e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f5156e) + AbstractC1135a.a(this.f5155d, AbstractC1135a.a(this.f5154c, AbstractC1135a.a(this.f5153b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
