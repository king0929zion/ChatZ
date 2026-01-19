package h0;

import j1.AbstractC1135a;

/* renamed from: h0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1033j implements InterfaceC1028e {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11802b;

    public C1033j(float f6, float f7) {
        this.a = f6;
        this.f11802b = f7;
    }

    @Override // h0.InterfaceC1028e
    public final long a(long j3, long j4, e1.m mVar) {
        float f6 = (((int) (j4 >> 32)) - ((int) (j3 >> 32))) / 2.0f;
        float f7 = (((int) (j4 & 4294967295L)) - ((int) (j3 & 4294967295L))) / 2.0f;
        e1.m mVar2 = e1.m.f11576c;
        float f8 = this.a;
        if (mVar != mVar2) {
            f8 *= -1;
        }
        float f9 = 1;
        float f10 = (f8 + f9) * f6;
        float f11 = (f9 + this.f11802b) * f7;
        return (Math.round(f11) & 4294967295L) | (Math.round(f10) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1033j)) {
            return false;
        }
        C1033j c1033j = (C1033j) obj;
        return Float.compare(this.a, c1033j.a) == 0 && Float.compare(this.f11802b, c1033j.f11802b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11802b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.a);
        sb.append(", verticalBias=");
        return AbstractC1135a.h(sb, this.f11802b, ')');
    }
}
