package u0;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class m extends AbstractC1738C {

    /* renamed from: c, reason: collision with root package name */
    public final float f15096c;

    public m(float f6) {
        super(3);
        this.f15096c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Float.compare(this.f15096c, ((m) obj).f15096c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15096c);
    }

    public final String toString() {
        return AbstractC1135a.h(new StringBuilder("HorizontalTo(x="), this.f15096c, ')');
    }
}
