package M;

import A4.N;
import A4.V;
import A4.W;
import B0.M;
import D.C0091s;
import D.J0;
import D.Q;
import H0.AbstractC0157l;
import I0.AbstractC0204q0;
import I0.C0207s0;
import I0.S0;
import S0.L;
import S0.O;
import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import m4.AbstractC1276k;
import n0.C1354c;
import o4.AbstractC1410a;
import u.AbstractC1734b;
import x4.AbstractC1888A;
import x4.s0;
import z4.EnumC2050a;

/* loaded from: classes.dex */
public final class e implements X0.q {
    public t a;

    /* renamed from: b, reason: collision with root package name */
    public s0 f3144b;

    /* renamed from: c, reason: collision with root package name */
    public y f3145c;

    /* renamed from: d, reason: collision with root package name */
    public V f3146d;

    @Override // X0.q
    public final void a() {
        j(null);
    }

    @Override // X0.q
    public final void b() {
        S0 s02;
        t tVar = this.a;
        if (tVar == null || (s02 = (S0) AbstractC0157l.h(tVar, AbstractC0204q0.f2366p)) == null) {
            return;
        }
        ((C0207s0) s02).b();
    }

    @Override // X0.q
    public final void c(X0.v vVar, X0.v vVar2) {
        y yVar = this.f3145c;
        if (yVar != null) {
            boolean z5 = (O.b(yVar.f3213h.f9125b, vVar2.f9125b) && AbstractC1276k.b(yVar.f3213h.f9126c, vVar2.f9126c)) ? false : true;
            yVar.f3213h = vVar2;
            int size = yVar.f3215j.size();
            for (int i6 = 0; i6 < size; i6++) {
                z zVar = (z) ((WeakReference) yVar.f3215j.get(i6)).get();
                if (zVar != null) {
                    zVar.f3224g = vVar2;
                }
            }
            v vVar3 = yVar.f3218m;
            synchronized (vVar3.f3191c) {
                vVar3.f3198j = null;
                vVar3.f3200l = null;
                vVar3.f3199k = null;
                vVar3.f3201m = null;
                vVar3.f3202n = null;
            }
            if (AbstractC1276k.b(vVar, vVar2)) {
                if (z5) {
                    q qVar = yVar.f3207b;
                    int f6 = O.f(vVar2.f9125b);
                    int e6 = O.e(vVar2.f9125b);
                    O o5 = yVar.f3213h.f9126c;
                    int f7 = o5 != null ? O.f(o5.a) : -1;
                    O o6 = yVar.f3213h.f9126c;
                    qVar.o().updateSelection((View) qVar.f3179e, f6, e6, f7, o6 != null ? O.e(o6.a) : -1);
                    return;
                }
                return;
            }
            if (vVar != null && (!AbstractC1276k.b(vVar.a.f7630e, vVar2.a.f7630e) || (O.b(vVar.f9125b, vVar2.f9125b) && !AbstractC1276k.b(vVar.f9126c, vVar2.f9126c)))) {
                q qVar2 = yVar.f3207b;
                qVar2.o().restartInput((View) qVar2.f3179e);
                return;
            }
            int size2 = yVar.f3215j.size();
            for (int i7 = 0; i7 < size2; i7++) {
                z zVar2 = (z) ((WeakReference) yVar.f3215j.get(i7)).get();
                if (zVar2 != null) {
                    X0.v vVar4 = yVar.f3213h;
                    q qVar3 = yVar.f3207b;
                    if (zVar2.f3228k) {
                        zVar2.f3224g = vVar4;
                        if (zVar2.f3226i) {
                            qVar3.o().updateExtractedText((View) qVar3.f3179e, zVar2.f3225h, u.d(vVar4));
                        }
                        O o7 = vVar4.f9126c;
                        long j3 = vVar4.f9125b;
                        int f8 = o7 != null ? O.f(o7.a) : -1;
                        O o8 = vVar4.f9126c;
                        qVar3.o().updateSelection((View) qVar3.f3179e, O.f(j3), O.e(j3), f8, o8 != null ? O.e(o8.a) : -1);
                    }
                }
            }
        }
    }

    @Override // X0.q
    public final void d() {
        s0 s0Var = this.f3144b;
        if (s0Var != null) {
            s0Var.f(null);
        }
        this.f3144b = null;
        N i6 = i();
        if (i6 != null) {
            V v5 = (V) i6;
            synchronized (v5) {
                v5.u(v5.p() + v5.f219n, v5.f218m, v5.p() + v5.f219n, v5.p() + v5.f219n + v5.f220o);
            }
        }
    }

    @Override // X0.q
    public final void e(X0.v vVar, X0.k kVar, C0091s c0091s, Q q3) {
        j(new J0(vVar, this, kVar, c0091s, q3));
    }

    @Override // X0.q
    public final void f(C1354c c1354c) {
        Rect rect;
        y yVar = this.f3145c;
        if (yVar != null) {
            yVar.f3217l = new Rect(AbstractC1410a.K(c1354c.a), AbstractC1410a.K(c1354c.f13295b), AbstractC1410a.K(c1354c.f13296c), AbstractC1410a.K(c1354c.f13297d));
            if (!yVar.f3215j.isEmpty() || (rect = yVar.f3217l) == null) {
                return;
            }
            yVar.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // X0.q
    public final void g() {
        S0 s02;
        t tVar = this.a;
        if (tVar == null || (s02 = (S0) AbstractC0157l.h(tVar, AbstractC0204q0.f2366p)) == null) {
            return;
        }
        ((C0207s0) s02).a();
    }

    @Override // X0.q
    public final void h(X0.v vVar, X0.p pVar, L l3, M m3, C1354c c1354c, C1354c c1354c2) {
        y yVar = this.f3145c;
        if (yVar != null) {
            v vVar2 = yVar.f3218m;
            synchronized (vVar2.f3191c) {
                try {
                    vVar2.f3198j = vVar;
                    vVar2.f3200l = pVar;
                    vVar2.f3199k = l3;
                    vVar2.f3201m = c1354c;
                    vVar2.f3202n = c1354c2;
                    if (!vVar2.f3193e) {
                        if (vVar2.f3192d) {
                        }
                    }
                    vVar2.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final N i() {
        V v5 = this.f3146d;
        if (v5 != null) {
            return v5;
        }
        if (!L.e.a) {
            return null;
        }
        V a = W.a(0, 2, EnumC2050a.f16329f);
        this.f3146d = a;
        return a;
    }

    public final void j(J0 j02) {
        t tVar = this.a;
        if (tVar == null) {
            return;
        }
        this.f3144b = tVar.f11819q ? AbstractC1888A.y(tVar.A0(), null, new s(tVar, new d(j02, this, tVar, null), null), 1) : null;
    }

    public final void k(t tVar) {
        if (this.a != tVar) {
            AbstractC1734b.c("Expected textInputModifierNode to be " + tVar + " but was " + this.a);
        }
        this.a = null;
    }
}
