package e1;

import f1.InterfaceC1004a;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class e implements InterfaceC0961c {

    /* renamed from: c, reason: collision with root package name */
    public final float f11568c;

    /* renamed from: e, reason: collision with root package name */
    public final float f11569e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1004a f11570f;

    public e(float f6, float f7, InterfaceC1004a interfaceC1004a) {
        this.f11568c = f6;
        this.f11569e = f7;
        this.f11570f = interfaceC1004a;
    }

    @Override // e1.InterfaceC0961c
    public final float A(long j3) {
        if (p.a(o.b(j3), 4294967296L)) {
            return this.f11570f.b(o.c(j3));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // e1.InterfaceC0961c
    public final float a() {
        return this.f11568c;
    }

    @Override // e1.InterfaceC0961c
    public final float b0() {
        return this.f11569e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f11568c, eVar.f11568c) == 0 && Float.compare(this.f11569e, eVar.f11569e) == 0 && AbstractC1276k.b(this.f11570f, eVar.f11570f);
    }

    public final int hashCode() {
        return this.f11570f.hashCode() + AbstractC1135a.a(this.f11569e, Float.hashCode(this.f11568c) * 31, 31);
    }

    @Override // e1.InterfaceC0961c
    public final long s(float f6) {
        return s4.j.B(this.f11570f.a(f6), 4294967296L);
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f11568c + ", fontScale=" + this.f11569e + ", converter=" + this.f11570f + ')';
    }
}
