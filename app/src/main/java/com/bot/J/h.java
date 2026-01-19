package J;

import B0.C0040p;
import B0.Q;
import B0.X;
import D.C0057a0;
import H0.AbstractC0156k;
import H0.InterfaceC0154i;
import H0.InterfaceC0161p;
import H0.i0;
import T.C0602e;
import T.C0607g0;

/* loaded from: classes.dex */
public final class h extends AbstractC0156k implements InterfaceC0154i, InterfaceC0161p {

    /* renamed from: t, reason: collision with root package name */
    public d4.i f2790t;

    /* renamed from: u, reason: collision with root package name */
    public final C0607g0 f2791u = new C0607g0(null, C0602e.f8080g);

    /* JADX WARN: Multi-variable type inference failed */
    public h(l4.e eVar) {
        this.f2790t = (d4.i) eVar;
        C0057a0 c0057a0 = new C0057a0(this, 1);
        C0040p c0040p = Q.a;
        M0(new X(null, null, c0057a0));
    }

    @Override // H0.InterfaceC0161p
    public final void j0(i0 i0Var) {
        this.f2791u.setValue(i0Var);
    }
}
