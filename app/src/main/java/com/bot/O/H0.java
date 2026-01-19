package O;

import D.C0098v0;
import D.EnumC0073i0;
import D.d1;
import m4.AbstractC1276k;
import n0.C1353b;
import w0.InterfaceC1830a;

/* loaded from: classes.dex */
public final class H0 implements D.H0 {
    public final /* synthetic */ N0 a;

    public H0(N0 n02) {
        this.a = n02;
    }

    @Override // D.H0
    public final void a(long j3, H h3) {
        d1 d6;
        N0 n02 = this.a;
        long a = AbstractC0305e0.a(n02.l(true));
        C0098v0 c0098v0 = n02.f3995d;
        if (c0098v0 == null || (d6 = c0098v0.d()) == null) {
            return;
        }
        long e6 = d6.e(a);
        n02.f4005n = e6;
        n02.f4009r.setValue(new C1353b(e6));
        n02.f4007p = 0L;
        n02.f4008q.setValue(EnumC0073i0.f1034c);
        n02.t(false);
    }

    @Override // D.H0
    public final void b() {
        N0 n02 = this.a;
        n02.f4008q.setValue(null);
        n02.f4009r.setValue(null);
    }

    @Override // D.H0
    public final void c() {
        N0 n02 = this.a;
        n02.f4008q.setValue(null);
        n02.f4009r.setValue(null);
    }

    @Override // D.H0
    public final void d() {
    }

    @Override // D.H0
    public final void e(long j3) {
        d1 d6;
        InterfaceC1830a interfaceC1830a;
        N0 n02 = this.a;
        n02.f4007p = C1353b.f(n02.f4007p, j3);
        C0098v0 c0098v0 = n02.f3995d;
        if (c0098v0 == null || (d6 = c0098v0.d()) == null) {
            return;
        }
        n02.f4009r.setValue(new C1353b(C1353b.f(n02.f4005n, n02.f4007p)));
        X0.p pVar = n02.f3993b;
        C1353b i6 = n02.i();
        AbstractC1276k.c(i6);
        int a = pVar.a(d6.b(i6.a, true));
        long b5 = S0.F.b(a, a);
        if (S0.O.b(b5, n02.n().f9125b)) {
            return;
        }
        C0098v0 c0098v02 = n02.f3995d;
        if ((c0098v02 == null || ((Boolean) c0098v02.f1198q.getValue()).booleanValue()) && (interfaceC1830a = n02.f4001j) != null) {
            interfaceC1830a.a(9);
        }
        n02.f3994c.f(N0.e(n02.n().a, b5));
        n02.f4013v = new S0.O(b5);
    }

    @Override // D.H0
    public final void onCancel() {
    }
}
