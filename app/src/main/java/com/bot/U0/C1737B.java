package u0;

import j1.AbstractC1135a;

/* renamed from: u0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1737B extends AbstractC1738C {

    /* renamed from: c, reason: collision with root package name */
    public final float f14958c;

    public C1737B(float f6) {
        super(3);
        this.f14958c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1737B) && Float.compare(this.f14958c, ((C1737B) obj).f14958c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14958c);
    }

    public final String toString() {
        return AbstractC1135a.h(new StringBuilder("VerticalTo(y="), this.f14958c, ')');
    }
}
