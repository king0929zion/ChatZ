package h0;

import B0.C0028d;
import H0.AbstractC0157l;
import H0.InterfaceC0155j;
import H0.i0;
import H0.n0;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import p.C1411A;
import x4.AbstractC1888A;
import x4.C1940w;
import x4.InterfaceC1922e0;
import x4.InterfaceC1942y;
import x4.g0;

/* renamed from: h0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1040q implements InterfaceC0155j {

    /* renamed from: e, reason: collision with root package name */
    public C4.c f11807e;

    /* renamed from: f, reason: collision with root package name */
    public int f11808f;

    /* renamed from: h, reason: collision with root package name */
    public AbstractC1040q f11810h;

    /* renamed from: i, reason: collision with root package name */
    public AbstractC1040q f11811i;

    /* renamed from: j, reason: collision with root package name */
    public n0 f11812j;

    /* renamed from: k, reason: collision with root package name */
    public i0 f11813k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11814l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11815m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11816n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11817o;

    /* renamed from: p, reason: collision with root package name */
    public C0028d f11818p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11819q;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC1040q f11806c = this;

    /* renamed from: g, reason: collision with root package name */
    public int f11809g = -1;

    public final InterfaceC1942y A0() {
        C4.c cVar = this.f11807e;
        if (cVar != null) {
            return cVar;
        }
        C4.c c6 = AbstractC1888A.c(((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(this)).getCoroutineContext().Y(new g0((InterfaceC1922e0) ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(this)).getCoroutineContext().r(C1940w.f15731e))));
        this.f11807e = c6;
        return c6;
    }

    public boolean B0() {
        return !(this instanceof C1411A);
    }

    public void C0() {
        if (this.f11819q) {
            E0.a.b("node attached multiple times");
        }
        if (this.f11813k == null) {
            E0.a.b("attach invoked on a node without a coordinator");
        }
        this.f11819q = true;
        this.f11816n = true;
    }

    public void D0() {
        if (!this.f11819q) {
            E0.a.b("Cannot detach a node that is not attached");
        }
        if (this.f11816n) {
            E0.a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f11817o) {
            E0.a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f11819q = false;
        C4.c cVar = this.f11807e;
        if (cVar != null) {
            AbstractC1888A.j(cVar, new E0.b("The Modifier.Node was detached", 0));
            this.f11807e = null;
        }
    }

    public void E0() {
    }

    public void F0() {
    }

    public void G0() {
    }

    public void H0() {
        if (!this.f11819q) {
            E0.a.b("reset() called on an unattached node");
        }
        G0();
    }

    public void I0() {
        if (!this.f11819q) {
            E0.a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f11816n) {
            E0.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f11816n = false;
        E0();
        this.f11817o = true;
    }

    public void J0() {
        if (!this.f11819q) {
            E0.a.b("node detached multiple times");
        }
        if (this.f11813k == null) {
            E0.a.b("detach invoked on a node without a coordinator");
        }
        if (!this.f11817o) {
            E0.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f11817o = false;
        C0028d c0028d = this.f11818p;
        if (c0028d != null) {
            c0028d.b();
        }
        F0();
    }

    public void K0(AbstractC1040q abstractC1040q) {
        this.f11806c = abstractC1040q;
    }

    public void L0(i0 i0Var) {
        this.f11813k = i0Var;
    }
}
