package h1;

import H0.AbstractC0156k;
import H0.AbstractC0157l;
import H0.r0;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1040q;
import m0.AbstractC1249d;
import m0.C;

/* loaded from: classes.dex */
public final class s extends AbstractC1040q implements m0.v, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: r, reason: collision with root package name */
    public ViewTreeObserver f11898r;

    /* renamed from: s, reason: collision with root package name */
    public final r f11899s = new r(this, 0);

    /* renamed from: t, reason: collision with root package name */
    public final r f11900t = new r(this, 1);

    @Override // h0.AbstractC1040q
    public final void E0() {
        ViewTreeObserver viewTreeObserver = AbstractC0157l.x(this).getViewTreeObserver();
        this.f11898r = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // h0.AbstractC1040q
    public final void F0() {
        ViewTreeObserver viewTreeObserver = this.f11898r;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f11898r = null;
        AbstractC0157l.x(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    public final C M0() {
        if (!this.f11806c.f11819q) {
            E0.a.b("visitLocalDescendants called on an unattached node");
        }
        AbstractC1040q abstractC1040q = this.f11806c;
        if ((abstractC1040q.f11809g & PegdownExtensions.ANCHORLINKS) != 0) {
            boolean z5 = false;
            for (AbstractC1040q abstractC1040q2 = abstractC1040q.f11811i; abstractC1040q2 != null; abstractC1040q2 = abstractC1040q2.f11811i) {
                if ((abstractC1040q2.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                    AbstractC1040q abstractC1040q3 = abstractC1040q2;
                    V.e eVar = null;
                    while (abstractC1040q3 != null) {
                        if (abstractC1040q3 instanceof C) {
                            C c6 = (C) abstractC1040q3;
                            if (z5) {
                                return c6;
                            }
                            z5 = true;
                        } else if ((abstractC1040q3.f11808f & PegdownExtensions.ANCHORLINKS) != 0 && (abstractC1040q3 instanceof AbstractC0156k)) {
                            int i6 = 0;
                            for (AbstractC1040q abstractC1040q4 = ((AbstractC0156k) abstractC1040q3).f1964s; abstractC1040q4 != null; abstractC1040q4 = abstractC1040q4.f11811i) {
                                if ((abstractC1040q4.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                                    i6++;
                                    if (i6 == 1) {
                                        abstractC1040q3 = abstractC1040q4;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new V.e(new AbstractC1040q[16]);
                                        }
                                        if (abstractC1040q3 != null) {
                                            eVar.b(abstractC1040q3);
                                            abstractC1040q3 = null;
                                        }
                                        eVar.b(abstractC1040q4);
                                    }
                                }
                            }
                            if (i6 == 1) {
                            }
                        }
                        abstractC1040q3 = AbstractC0157l.e(eVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // m0.v
    public final void e(m0.s sVar) {
        sVar.e(false);
        sVar.a(this.f11899s);
        sVar.d(this.f11900t);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z5;
        if (AbstractC0157l.v(this).f1747r == null) {
            return;
        }
        View c6 = k.c(this);
        m0.n focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(this)).getFocusOwner();
        r0 w5 = AbstractC0157l.w(this);
        boolean z6 = true;
        if (view != null && !view.equals(w5)) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == c6.getParent()) {
                    z5 = true;
                    break;
                }
            }
        }
        z5 = false;
        if (view2 != null && !view2.equals(w5)) {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == c6.getParent()) {
                    break;
                }
            }
        }
        z6 = false;
        if (z5 && z6) {
            return;
        }
        if (z6) {
            C M02 = M0();
            if (M02.R0().a()) {
                return;
            }
            AbstractC1249d.x(M02);
            return;
        }
        if (z5 && M0().R0().b()) {
            ((m0.q) focusOwner).d(8, false, false);
        }
    }
}
