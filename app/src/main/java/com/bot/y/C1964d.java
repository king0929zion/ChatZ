package y;

import H0.AbstractC0157l;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import h0.AbstractC1040q;
import k.C1147A;

/* renamed from: y.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1964d extends AbstractC1040q {

    /* renamed from: r, reason: collision with root package name */
    public Q0.d f15846r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1965e f15847s;

    public C1964d(C1965e c1965e) {
        this.f15847s = c1965e;
    }

    @Override // h0.AbstractC1040q
    public final void E0() {
        C1965e c1965e = this.f15847s;
        c1965e.a = this;
        if (c1965e.f15850b != null) {
            M0();
        }
    }

    @Override // h0.AbstractC1040q
    public final void F0() {
        C1965e c1965e = this.f15847s;
        if (c1965e.a == this) {
            c1965e.a = null;
        }
        Q0.d dVar = this.f15846r;
        if (dVar != null) {
            dVar.b();
        }
        this.f15846r = null;
    }

    public final void M0() {
        Z2.X x5 = new Z2.X(22, this, this.f15847s);
        H0.J v5 = AbstractC0157l.v(this);
        int i6 = v5.f1734e;
        Q0.b rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) H0.M.a(v5)).getRectManager();
        Q0.e eVar = rectManager.f6315b;
        eVar.getClass();
        C1147A c1147a = eVar.a;
        Q0.d dVar = new Q0.d(eVar, i6, this, x5);
        Object b5 = c1147a.b(i6);
        if (b5 == null) {
            c1147a.i(i6, dVar);
            b5 = dVar;
        }
        Q0.d dVar2 = (Q0.d) b5;
        if (dVar2 != dVar) {
            while (true) {
                Q0.d dVar3 = dVar2.f6332d;
                if (dVar3 == null) {
                    break;
                } else {
                    dVar2 = dVar3;
                }
            }
            dVar2.f6332d = dVar;
        }
        if (AbstractC0157l.v(this.f11806c).f1740k) {
            rectManager.a.g(i6, true);
        }
        rectManager.f6317d = true;
        rectManager.i();
        this.f15846r = dVar;
    }
}
