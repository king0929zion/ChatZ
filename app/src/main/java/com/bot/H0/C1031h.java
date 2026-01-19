package h0;

import j1.AbstractC1135a;

/* renamed from: h0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1031h implements InterfaceC1027d {
    public final float a;

    public C1031h(float f6) {
        this.a = f6;
    }

    @Override // h0.InterfaceC1027d
    public final int a(int i6, int i7, e1.m mVar) {
        float f6 = (i7 - i6) / 2.0f;
        e1.m mVar2 = e1.m.f11576c;
        float f7 = this.a;
        if (mVar != mVar2) {
            f7 *= -1;
        }
        return Math.round((1 + f7) * f6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1031h) && Float.compare(this.a, ((C1031h) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return AbstractC1135a.h(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
