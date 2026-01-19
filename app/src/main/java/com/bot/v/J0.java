package v;

import H0.InterfaceC0170z;
import e1.AbstractC0960b;
import e1.C0959a;
import h0.AbstractC1040q;
import i4.AbstractC1117a;

/* loaded from: classes.dex */
public final class J0 extends AbstractC1040q implements InterfaceC0170z {

    /* renamed from: r, reason: collision with root package name */
    public EnumC1817x f15254r;

    /* renamed from: s, reason: collision with root package name */
    public l4.e f15255s;

    @Override // H0.InterfaceC0170z
    public final F0.W d(final F0.X x5, F0.U u5, long j3) {
        final F0.k0 w5 = u5.w(AbstractC0960b.a(this.f15254r != EnumC1817x.f15365c ? 0 : C0959a.j(j3), C0959a.h(j3), this.f15254r == EnumC1817x.f15366e ? C0959a.i(j3) : 0, C0959a.g(j3)));
        final int f6 = AbstractC1117a.f(w5.f1485c, C0959a.j(j3), C0959a.h(j3));
        final int f7 = AbstractC1117a.f(w5.f1486e, C0959a.i(j3), C0959a.g(j3));
        return x5.D(f6, f7, Y3.w.f9813c, new l4.c() { // from class: v.I0
            @Override // l4.c
            public final Object f(Object obj) {
                l4.e eVar = J0.this.f15255s;
                F0.j0.k((F0.j0) obj, w5, ((e1.j) eVar.m(new e1.l(((f6 - r1.f1485c) << 32) | ((f7 - r1.f1486e) & 4294967295L)), x5.getLayoutDirection())).a);
                return X3.y.a;
            }
        });
    }
}
