package e1;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class d implements InterfaceC0961c {

    /* renamed from: c, reason: collision with root package name */
    public final float f11566c;

    /* renamed from: e, reason: collision with root package name */
    public final float f11567e;

    public d(float f6, float f7) {
        this.f11566c = f6;
        this.f11567e = f7;
    }

    @Override // e1.InterfaceC0961c
    public final float a() {
        return this.f11566c;
    }

    @Override // e1.InterfaceC0961c
    public final float b0() {
        return this.f11567e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f11566c, dVar.f11566c) == 0 && Float.compare(this.f11567e, dVar.f11567e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11567e) + (Float.hashCode(this.f11566c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f11566c);
        sb.append(", fontScale=");
        return AbstractC1135a.h(sb, this.f11567e, ')');
    }
}
