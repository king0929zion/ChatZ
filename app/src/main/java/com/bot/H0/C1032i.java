package h0;

import j1.AbstractC1135a;

/* renamed from: h0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1032i {
    public final float a;

    public C1032i(float f6) {
        this.a = f6;
    }

    public final int a(int i6, int i7) {
        return Math.round((1 + this.a) * ((i7 - i6) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1032i) && Float.compare(this.a, ((C1032i) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return AbstractC1135a.h(new StringBuilder("Vertical(bias="), this.a, ')');
    }
}
