package R;

import D.C0091s;
import H0.InterfaceC0170z;
import e1.C0959a;
import h0.AbstractC1040q;
import m4.AbstractC1276k;
import r.X0;

/* loaded from: classes.dex */
public final class L extends AbstractC1040q implements InterfaceC0170z {

    /* renamed from: r, reason: collision with root package name */
    public C0513s f6705r;

    /* renamed from: s, reason: collision with root package name */
    public l4.e f6706s;

    /* renamed from: t, reason: collision with root package name */
    public X0 f6707t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6708u;

    @Override // h0.AbstractC1040q
    public final void F0() {
        this.f6708u = false;
    }

    @Override // H0.InterfaceC0170z
    public final F0.W d(F0.X x5, F0.U u5, long j3) {
        F0.k0 w5 = u5.w(j3);
        if (!x5.d0() || !this.f6708u) {
            X3.i iVar = (X3.i) this.f6706s.m(new e1.l((w5.f1486e & 4294967295L) | (w5.f1485c << 32)), new C0959a(j3));
            C0513s c0513s = this.f6705r;
            W w6 = (W) iVar.f9393c;
            Object obj = iVar.f9394e;
            if (!AbstractC1276k.b(c0513s.d(), w6)) {
                c0513s.f6836m.setValue(w6);
                H4.c cVar = c0513s.f6828e.f6724b;
                boolean g3 = cVar.g();
                if (g3) {
                    try {
                        r rVar = c0513s.f6837n;
                        float d6 = c0513s.d().d(obj);
                        if (!Float.isNaN(d6)) {
                            r.a(rVar, d6);
                            c0513s.h(null);
                        }
                        c0513s.g(obj);
                    } finally {
                        cVar.c(null);
                    }
                }
                if (!g3) {
                    c0513s.h(obj);
                }
            }
        }
        this.f6708u = x5.d0() || this.f6708u;
        return x5.D(w5.f1485c, w5.f1486e, Y3.w.f9813c, new C0091s(x5, this, w5, 16));
    }
}
