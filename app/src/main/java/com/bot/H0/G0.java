package H0;

import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import T.InterfaceC0598c;
import android.view.View;
import f0.C0987j;
import h0.AbstractC1040q;
import i0.C1064c;
import java.util.ArrayList;
import k.C1148B;

/* loaded from: classes.dex */
public final class G0 implements InterfaceC0598c {

    /* renamed from: c, reason: collision with root package name */
    public final Object f1702c;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1703e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public Object f1704f;

    public G0(J j3) {
        this.f1702c = j3;
        this.f1704f = j3;
    }

    public final void a() {
        this.f1703e.clear();
        this.f1704f = this.f1702c;
        ((J) this.f1702c).R();
    }

    @Override // T.InterfaceC0598c
    public final void c(int i6, Object obj) {
        ((J) this.f1704f).B(i6, (J) obj);
    }

    @Override // T.InterfaceC0598c
    public final void d(Object obj) {
        this.f1703e.add(this.f1704f);
        this.f1704f = obj;
    }

    @Override // T.InterfaceC0598c
    public final void e() {
        Q0.b rectManager;
        C1064c c1064c;
        Q0.b rectManager2;
        J j3 = (J) this.f1704f;
        C0149f0 c0149f0 = j3.f1721J;
        if (!j3.H()) {
            E0.a.a("onReuse is only expected on attached node");
        }
        h1.x xVar = j3.f1748s;
        if (xVar != null) {
            View view = xVar.f11855e;
            if (view.getParent() != xVar) {
                xVar.addView(view);
            } else {
                xVar.f11859i.b();
            }
        }
        F0.Q q3 = j3.f1723L;
        if (q3 != null) {
            q3.i(false);
        }
        j3.f1753x = false;
        if (j3.f1732U) {
            j3.f1732U = false;
        } else {
            AbstractC1040q abstractC1040q = j3.f1721J.f1918e;
            for (AbstractC1040q abstractC1040q2 = abstractC1040q; abstractC1040q2 != null; abstractC1040q2 = abstractC1040q2.f11810h) {
                if (abstractC1040q2.f11819q) {
                    abstractC1040q2.H0();
                }
            }
            for (AbstractC1040q abstractC1040q3 = abstractC1040q; abstractC1040q3 != null; abstractC1040q3 = abstractC1040q3.f11810h) {
                if (abstractC1040q3.f11819q) {
                    abstractC1040q3.J0();
                }
            }
            while (abstractC1040q != null) {
                if (abstractC1040q.f11819q) {
                    abstractC1040q.D0();
                }
                abstractC1040q = abstractC1040q.f11810h;
            }
        }
        int i6 = j3.f1734e;
        r0 r0Var = j3.f1747r;
        if (r0Var != null && (rectManager2 = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var).getRectManager()) != null) {
            rectManager2.g(j3);
        }
        j3.f1734e = P0.n.a.addAndGet(1);
        r0 r0Var2 = j3.f1747r;
        if (r0Var2 != null) {
            ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = (ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var2;
            viewTreeObserverOnGlobalLayoutListenerC0216x.m9getLayoutNodes().g(i6);
            viewTreeObserverOnGlobalLayoutListenerC0216x.m9getLayoutNodes().i(j3.f1734e, j3);
        }
        for (AbstractC1040q abstractC1040q4 = c0149f0.f1919f; abstractC1040q4 != null; abstractC1040q4 = abstractC1040q4.f11811i) {
            abstractC1040q4.C0();
        }
        c0149f0.e();
        if (c0149f0.d(8)) {
            j3.F();
        }
        J.Y(j3);
        r0 r0Var3 = j3.f1747r;
        if (r0Var3 != null && (c1064c = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var3).f2431O) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x2 = c1064c.f11942f;
            C0987j c0987j = c1064c.f11940c;
            C1148B c1148b = c1064c.f11947k;
            if (c1148b.e(i6)) {
                c0987j.z(viewTreeObserverOnGlobalLayoutListenerC0216x2, i6, false);
            }
            P0.m x5 = j3.x();
            if (x5 != null && x5.f4492c.b(P0.t.f4538q)) {
                c1148b.a(j3.f1734e);
                c0987j.z(viewTreeObserverOnGlobalLayoutListenerC0216x2, j3.f1734e, true);
            }
        }
        r0 r0Var4 = j3.f1747r;
        if (r0Var4 == null || (rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var4).getRectManager()) == null) {
            return;
        }
        rectManager.e(j3, true);
    }

    @Override // T.InterfaceC0598c
    public final void f(int i6, int i7, int i8) {
        ((J) this.f1704f).L(i6, i7, i8);
    }

    @Override // T.InterfaceC0598c
    public final void g(int i6, int i7) {
        ((J) this.f1704f).S(i6, i7);
    }

    @Override // T.InterfaceC0598c
    public final void j() {
        this.f1704f = this.f1703e.remove(r0.size() - 1);
    }

    @Override // T.InterfaceC0598c
    public final /* bridge */ /* synthetic */ void m(int i6, Object obj) {
    }

    @Override // T.InterfaceC0598c
    public final void n() {
        r0 r0Var = ((J) this.f1702c).f1747r;
        if (r0Var != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var).A();
        }
    }

    @Override // T.InterfaceC0598c
    public final Object o() {
        return this.f1704f;
    }
}
