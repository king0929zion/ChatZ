package M4;

import kotlinx.serialization.descriptors.SerialDescriptor;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* renamed from: M4.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0276x extends C0256c0 {

    /* renamed from: l, reason: collision with root package name */
    public final K4.j f3503l;

    /* renamed from: m, reason: collision with root package name */
    public final X3.n f3504m;

    public C0276x(final String str, final int i6) {
        super(str, null, i6);
        this.f3503l = K4.j.f2975f;
        this.f3504m = X3.a.d(new InterfaceC1193a() { // from class: M4.w
            @Override // l4.InterfaceC1193a
            public final Object b() {
                int i7 = i6;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i7];
                for (int i8 = 0; i8 < i7; i8++) {
                    serialDescriptorArr[i8] = Y4.d.m(str + '.' + this.f3454e[i8], K4.k.f2979h, new SerialDescriptor[0]);
                }
                return serialDescriptorArr;
            }
        });
    }

    @Override // M4.C0256c0, kotlinx.serialization.descriptors.SerialDescriptor
    public final Y4.l e() {
        return this.f3503l;
    }

    @Override // M4.C0256c0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.e() == K4.j.f2975f && this.a.equals(serialDescriptor.a()) && AbstractC1276k.b(AbstractC0252a0.b(this), AbstractC0252a0.b(serialDescriptor));
    }

    @Override // M4.C0256c0
    public final int hashCode() {
        int hashCode = this.a.hashCode();
        K4.h hVar = new K4.h(this);
        int i6 = 1;
        while (hVar.hasNext()) {
            int i7 = i6 * 31;
            String str = (String) hVar.next();
            i6 = i7 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i6;
    }

    @Override // M4.C0256c0, kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i6) {
        return ((SerialDescriptor[]) this.f3504m.getValue())[i6];
    }

    @Override // M4.C0256c0
    public final String toString() {
        return Y3.m.v0(new K4.i(this, 0), ", ", this.a.concat("("), ")", null, 56);
    }
}
