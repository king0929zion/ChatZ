package m0;

import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import k.I;
import k.N;
import k.W;

/* loaded from: classes.dex */
public final class k {
    public final q a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0216x f12892b;

    /* renamed from: c, reason: collision with root package name */
    public final N f12893c;

    /* renamed from: d, reason: collision with root package name */
    public final N f12894d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12895e;

    public k(q qVar, ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x) {
        this.a = qVar;
        this.f12892b = viewTreeObserverOnGlobalLayoutListenerC0216x;
        N n3 = W.a;
        this.f12893c = new N();
        this.f12894d = new N();
    }

    public final void a() {
        if (this.f12895e) {
            return;
        }
        I.o oVar = new I.o(0, this, k.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 5);
        I i6 = this.f12892b.f2408A0;
        if (i6.g(oVar) < 0) {
            i6.a(oVar);
        }
        this.f12895e = true;
    }
}
