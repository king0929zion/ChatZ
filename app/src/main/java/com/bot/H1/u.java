package h1;

import B0.C0028d;
import H0.AbstractC0156k;
import H0.AbstractC0157l;
import H0.InterfaceC0154i;
import H0.m0;
import m0.C;
import y.X;

/* loaded from: classes.dex */
public final class u extends AbstractC0156k implements m0, InterfaceC0154i {

    /* renamed from: t, reason: collision with root package name */
    public final C f11901t;

    /* renamed from: u, reason: collision with root package name */
    public X f11902u;

    public u() {
        C c6 = new C(0, new O4.j(2, this, u.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 1), 9);
        M0(c6);
        this.f11901t = c6;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m4.w, java.lang.Object] */
    @Override // H0.m0
    public final void i0() {
        ?? obj = new Object();
        AbstractC0157l.r(this, new C0028d(6, obj, this));
        X x5 = (X) obj.f12973c;
        if (this.f11901t.R0().b()) {
            X x6 = this.f11902u;
            if (x6 != null) {
                x6.b();
            }
            if (x5 != null) {
                x5.a();
            } else {
                x5 = null;
            }
            this.f11902u = x5;
        }
    }
}
