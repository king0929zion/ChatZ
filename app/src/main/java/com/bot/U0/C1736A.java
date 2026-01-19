package u0;

import j1.AbstractC1135a;

/* renamed from: u0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1736A extends AbstractC1738C {

    /* renamed from: c, reason: collision with root package name */
    public final float f14957c;

    public C1736A(float f6) {
        super(3);
        this.f14957c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1736A) && Float.compare(this.f14957c, ((C1736A) obj).f14957c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14957c);
    }

    public final String toString() {
        return AbstractC1135a.h(new StringBuilder("RelativeVerticalTo(dy="), this.f14957c, ')');
    }
}
