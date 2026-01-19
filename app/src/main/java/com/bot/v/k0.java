package v;

import j1.AbstractC1135a;
import w.AbstractC1829a;

/* loaded from: classes.dex */
public final class k0 implements InterfaceC1802i0 {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15318b;

    /* renamed from: c, reason: collision with root package name */
    public final float f15319c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15320d;

    public k0(float f6, float f7, float f8, float f9) {
        this.a = f6;
        this.f15318b = f7;
        this.f15319c = f8;
        this.f15320d = f9;
        if (!((f6 >= S.l.f7374V) & (f7 >= S.l.f7374V) & (f8 >= S.l.f7374V)) || !(f9 >= S.l.f7374V)) {
            AbstractC1829a.a("Padding must be non-negative");
        }
    }

    @Override // v.InterfaceC1802i0
    public final float a() {
        return this.f15320d;
    }

    @Override // v.InterfaceC1802i0
    public final float b(e1.m mVar) {
        return mVar == e1.m.f11576c ? this.a : this.f15319c;
    }

    @Override // v.InterfaceC1802i0
    public final float c() {
        return this.f15318b;
    }

    @Override // v.InterfaceC1802i0
    public final float d(e1.m mVar) {
        return mVar == e1.m.f11576c ? this.f15319c : this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return e1.f.c(this.a, k0Var.a) && e1.f.c(this.f15318b, k0Var.f15318b) && e1.f.c(this.f15319c, k0Var.f15319c) && e1.f.c(this.f15320d, k0Var.f15320d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f15320d) + AbstractC1135a.a(this.f15319c, AbstractC1135a.a(this.f15318b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) e1.f.d(this.a)) + ", top=" + ((Object) e1.f.d(this.f15318b)) + ", end=" + ((Object) e1.f.d(this.f15319c)) + ", bottom=" + ((Object) e1.f.d(this.f15320d)) + ')';
    }
}
