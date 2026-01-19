package v;

import D.c1;
import H0.InterfaceC0170z;
import e1.AbstractC0960b;
import e1.C0959a;
import h0.AbstractC1040q;

/* renamed from: v.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1819z extends AbstractC1040q implements InterfaceC0170z {

    /* renamed from: r, reason: collision with root package name */
    public EnumC1817x f15370r;

    /* renamed from: s, reason: collision with root package name */
    public float f15371s;

    @Override // H0.InterfaceC0170z
    public final F0.W d(F0.X x5, F0.U u5, long j3) {
        int j4;
        int h3;
        int g3;
        int i6;
        if (!C0959a.d(j3) || this.f15370r == EnumC1817x.f15365c) {
            j4 = C0959a.j(j3);
            h3 = C0959a.h(j3);
        } else {
            int round = Math.round(C0959a.h(j3) * this.f15371s);
            int j5 = C0959a.j(j3);
            j4 = C0959a.h(j3);
            if (round < j5) {
                round = j5;
            }
            if (round <= j4) {
                j4 = round;
            }
            h3 = j4;
        }
        if (!C0959a.c(j3) || this.f15370r == EnumC1817x.f15366e) {
            int i7 = C0959a.i(j3);
            g3 = C0959a.g(j3);
            i6 = i7;
        } else {
            int round2 = Math.round(C0959a.g(j3) * this.f15371s);
            int i8 = C0959a.i(j3);
            i6 = C0959a.g(j3);
            if (round2 < i8) {
                round2 = i8;
            }
            if (round2 <= i6) {
                i6 = round2;
            }
            g3 = i6;
        }
        F0.k0 w5 = u5.w(AbstractC0960b.a(j4, h3, i6, g3));
        return x5.D(w5.f1485c, w5.f1486e, Y3.w.f9813c, new c1(w5, 8));
    }
}
