package u0;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class u extends AbstractC1738C {

    /* renamed from: c, reason: collision with root package name */
    public final float f15124c;

    public u(float f6) {
        super(3);
        this.f15124c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Float.compare(this.f15124c, ((u) obj).f15124c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15124c);
    }

    public final String toString() {
        return AbstractC1135a.h(new StringBuilder("RelativeHorizontalTo(dx="), this.f15124c, ')');
    }
}
