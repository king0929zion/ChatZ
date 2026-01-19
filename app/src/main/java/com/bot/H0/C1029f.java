package h0;

import j1.AbstractC1135a;

/* renamed from: h0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1029f implements InterfaceC1027d {
    public final float a;

    public C1029f(float f6) {
        this.a = f6;
    }

    @Override // h0.InterfaceC1027d
    public final int a(int i6, int i7, e1.m mVar) {
        return Math.round((1 + this.a) * ((i7 - i6) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1029f) && Float.compare(this.a, ((C1029f) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return AbstractC1135a.h(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
