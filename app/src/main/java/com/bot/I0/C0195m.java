package I0;

import B0.C0028d;
import H0.InterfaceC0155j;
import H0.InterfaceC0170z;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import h0.AbstractC1040q;
import m4.AbstractC1276k;
import n0.C1354c;
import z0.AbstractC2013a;
import z0.AbstractC2015c;

/* renamed from: I0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195m extends AbstractC1040q implements M0.a, H0.A0, z0.e, InterfaceC0170z, H0.F0, InterfaceC0155j {

    /* renamed from: r, reason: collision with root package name */
    public final B0.G f2328r = new B0.G(this, 5);

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0216x f2329s;

    public C0195m(ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x) {
        this.f2329s = viewTreeObserverOnGlobalLayoutListenerC0216x;
    }

    @Override // z0.e
    public final boolean F(KeyEvent keyEvent) {
        m0.f fVar;
        int[] iArr = m0.j.a;
        long b5 = AbstractC2015c.b(keyEvent);
        boolean z5 = true;
        if (AbstractC2013a.a(b5, AbstractC2013a.f16192b)) {
            fVar = new m0.f(2);
        } else if (AbstractC2013a.a(b5, AbstractC2013a.f16193c)) {
            fVar = new m0.f(1);
        } else if (AbstractC2013a.a(b5, AbstractC2013a.f16206p)) {
            fVar = new m0.f(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            fVar = AbstractC2013a.a(b5, AbstractC2013a.f16197g) ? new m0.f(4) : AbstractC2013a.a(b5, AbstractC2013a.f16196f) ? new m0.f(3) : (AbstractC2013a.a(b5, AbstractC2013a.f16194d) || AbstractC2013a.a(b5, AbstractC2013a.f16188C)) ? new m0.f(5) : (AbstractC2013a.a(b5, AbstractC2013a.f16195e) || AbstractC2013a.a(b5, AbstractC2013a.f16189D)) ? new m0.f(6) : (AbstractC2013a.a(b5, AbstractC2013a.f16198h) || AbstractC2013a.a(b5, AbstractC2013a.f16208r) || AbstractC2013a.a(b5, AbstractC2013a.f16190E)) ? new m0.f(7) : (AbstractC2013a.a(b5, AbstractC2013a.a) || AbstractC2013a.a(b5, AbstractC2013a.f16211u)) ? new m0.f(8) : null;
        }
        if (fVar != null) {
            int i6 = fVar.a;
            if (AbstractC2015c.c(keyEvent) == 2) {
                ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = this.f2329s;
                m0.C h3 = ((m0.q) viewTreeObserverOnGlobalLayoutListenerC0216x.getFocusOwner()).h();
                if (h3 == null || !h3.f12872r || !viewTreeObserverOnGlobalLayoutListenerC0216x.y(i6)) {
                    Boolean g3 = ((m0.q) viewTreeObserverOnGlobalLayoutListenerC0216x.getFocusOwner()).g(i6, viewTreeObserverOnGlobalLayoutListenerC0216x.getEmbeddedViewFocusRect(), new B0.G(fVar, 4));
                    if (!(g3 != null ? g3.booleanValue() : true)) {
                        if (i6 != 1 && i6 != 2) {
                            z5 = false;
                        }
                        if (z5) {
                            Integer c6 = m0.j.c(i6);
                            int intValue = c6 != null ? c6.intValue() : 2;
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View rootView = viewTreeObserverOnGlobalLayoutListenerC0216x.getRootView();
                            AbstractC1276k.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                            View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewTreeObserverOnGlobalLayoutListenerC0216x.getView(), intValue);
                            if (findNextFocus == null || findNextFocus.equals(viewTreeObserverOnGlobalLayoutListenerC0216x)) {
                                return ((m0.q) viewTreeObserverOnGlobalLayoutListenerC0216x.getFocusOwner()).j(i6);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // H0.A0
    public final void I(P0.x xVar) {
    }

    @Override // M0.a
    public final Object M(H0.i0 i0Var, C0028d c0028d, d4.c cVar) {
        long U5 = i0Var.U(0L);
        C1354c c1354c = (C1354c) c0028d.b();
        C1354c j3 = c1354c != null ? c1354c.j(U5) : null;
        if (j3 != null) {
            this.f2329s.requestRectangleOnScreen(new Rect((int) j3.a, (int) j3.f13295b, (int) j3.f13296c, (int) j3.f13297d), false);
        }
        return X3.y.a;
    }

    @Override // H0.InterfaceC0170z
    public final F0.W d(F0.X x5, F0.U u5, long j3) {
        F0.k0 w5 = u5.w(j3);
        return x5.E(w5.f1485c, w5.f1486e, Y3.w.f9813c, this.f2328r, new F0.n0(w5, 1));
    }

    @Override // z0.e
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }

    @Override // H0.F0
    public final Object m() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }
}
