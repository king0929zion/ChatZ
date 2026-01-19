package H0;

import F0.C0122j;
import F0.C0133v;
import e1.AbstractC0960b;

/* renamed from: H0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0170z extends InterfaceC0155j {
    default int P(S s5, F0.U u5, int i6) {
        return d(new C0133v(s5, s5.getLayoutDirection()), new C0122j(u5, k0.f1965c, l0.f1969e, 2), AbstractC0960b.b(i6, 0, 13)).d();
    }

    F0.W d(F0.X x5, F0.U u5, long j3);

    default int j(S s5, F0.U u5, int i6) {
        return d(new C0133v(s5, s5.getLayoutDirection()), new C0122j(u5, k0.f1965c, l0.f1968c, 2), AbstractC0960b.b(0, i6, 7)).e();
    }

    default int m0(S s5, F0.U u5, int i6) {
        return d(new C0133v(s5, s5.getLayoutDirection()), new C0122j(u5, k0.f1966e, l0.f1969e, 2), AbstractC0960b.b(i6, 0, 13)).d();
    }

    default int z0(S s5, F0.U u5, int i6) {
        return d(new C0133v(s5, s5.getLayoutDirection()), new C0122j(u5, k0.f1966e, l0.f1968c, 2), AbstractC0960b.b(0, i6, 7)).e();
    }
}
