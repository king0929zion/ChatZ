package v;

import android.os.Build;
import android.view.View;
import java.util.List;
import t1.InterfaceC1702e;

/* loaded from: classes.dex */
public final class N extends O4.d implements Runnable, InterfaceC1702e, View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final G0 f15261f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15262g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15263h;

    /* renamed from: i, reason: collision with root package name */
    public t1.P f15264i;

    public N(G0 g02) {
        super(!g02.f15239t ? 1 : 0);
        this.f15261f = g02;
    }

    @Override // t1.InterfaceC1702e
    public final t1.P a(View view, t1.P p5) {
        this.f15264i = p5;
        G0 g02 = this.f15261f;
        C0 c02 = g02.f15237r;
        t1.L l3 = p5.a;
        c02.f(AbstractC1787b.E(l3.g(8)));
        if (this.f15262g) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f15263h) {
            g02.f15238s.f(AbstractC1787b.E(l3.g(8)));
            G0.b(g02, p5);
        }
        return g02.f15239t ? t1.P.f14862b : p5;
    }

    @Override // O4.d
    public final void b(t1.z zVar) {
        this.f15262g = false;
        this.f15263h = false;
        t1.P p5 = this.f15264i;
        if (zVar.a.b() > 0 && p5 != null) {
            t1.L l3 = p5.a;
            G0 g02 = this.f15261f;
            g02.f15238s.f(AbstractC1787b.E(l3.g(8)));
            g02.f15237r.f(AbstractC1787b.E(l3.g(8)));
            G0.b(g02, p5);
        }
        this.f15264i = null;
    }

    @Override // O4.d
    public final void c() {
        this.f15262g = true;
        this.f15263h = true;
    }

    @Override // O4.d
    public final t1.P d(t1.P p5, List list) {
        G0 g02 = this.f15261f;
        G0.b(g02, p5);
        return g02.f15239t ? t1.P.f14862b : p5;
    }

    @Override // O4.d
    public final e0.k e(t1.z zVar, e0.k kVar) {
        this.f15262g = false;
        return kVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f15262g) {
            this.f15262g = false;
            this.f15263h = false;
            t1.P p5 = this.f15264i;
            if (p5 != null) {
                G0 g02 = this.f15261f;
                g02.f15238s.f(AbstractC1787b.E(p5.a.g(8)));
                G0.b(g02, p5);
                this.f15264i = null;
            }
        }
    }
}
