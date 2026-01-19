package Q;

import i1.InterfaceC1078B;

/* loaded from: classes.dex */
public final class p3 implements InterfaceC1078B {

    /* renamed from: c, reason: collision with root package name */
    public final int f6038c;

    public p3(int i6) {
        this.f6038c = i6;
    }

    @Override // i1.InterfaceC1078B
    public final long g(e1.k kVar, long j3, e1.m mVar, long j4) {
        int i6 = (int) (j4 >> 32);
        int d6 = ((kVar.d() - i6) / 2) + kVar.a;
        if (d6 < 0) {
            d6 = kVar.a;
        } else if (d6 + i6 > ((int) (j3 >> 32))) {
            d6 = kVar.f11574c - i6;
        }
        int i7 = kVar.f11573b - ((int) (j4 & 4294967295L));
        int i8 = this.f6038c;
        int i9 = i7 - i8;
        if (i9 < 0) {
            i9 = kVar.f11575d + i8;
        }
        return (i9 & 4294967295L) | (d6 << 32);
    }
}
